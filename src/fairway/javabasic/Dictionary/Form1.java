package fairway.javabasic.Dictionary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Form1 {
    private JTextField textField1;
    private JButton lookupButton;
    private JTextPane textPane1;
    private JPanel rootPane;
    private Dictionary dic;


    public Form1() {

        try {

            dic = new Dictionary();

        } catch (IOException ie){

            ie.printStackTrace();

        }

        lookupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String src = textField1.getText();
                String result = dic.lookup(src);
                textPane1.setText(result);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dictionary");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.add(new Form1().rootPane);
        frame.setVisible(true);
        frame.setSize(500,300);
    }


}
