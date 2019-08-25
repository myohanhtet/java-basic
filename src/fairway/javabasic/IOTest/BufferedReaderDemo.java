package fairway.javabasic.IOTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("input.txt");

        BufferedReader br = new BufferedReader(fr);

        String line="";

        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();

    }

}
