package fairway.javabasic.HashMap;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptTest {
    public static void main(String[] args) {
        try {

            int[] a = new int[2];
            System.out.println(a[0]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("In Error" + e);
        }

        try{
            String fileName = "/home/myohanhtet/file.txt";
            InputStream file = new FileInputStream(fileName);

            int[] arr = new int[2];
            System.out.println(arr[2]);

        } catch (IOException e1)
        {
            e1.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e2){
            e2.printStackTrace();
        } finally {
            System.out.println("This is finally");
        }
    }
}
