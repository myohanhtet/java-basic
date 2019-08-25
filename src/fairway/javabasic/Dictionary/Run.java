package fairway.javabasic.Dictionary;

import javax.imageio.IIOException;
import java.io.IOException;

public class Run {

    public static void main(String[] args) throws IOException {

        try {

            Dictionary dic = new Dictionary();

            System.out.println(dic.lookup("book"));

        } catch (IIOException e){
            e.printStackTrace();
        }

    }

}
