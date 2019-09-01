package fairway.javabasic.Json;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TextReader {

    public static String readText(InputStream in){
        String txt = "";

        try{

            InputStreamReader  reader = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(reader);

            String line = "";

            while ((line = br.readLine()) != null){
                txt += line + "\n";
            }
            br.close();

        } catch (IOException e){
            e.printStackTrace();
        }

        return txt;

    }

}
