package fairway.javabasic.Dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    HashMap<String,String> db;


    public Dictionary() throws IOException {

        InputStream in = new FileInputStream("ornagai.tsv");
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        db = new HashMap<String, String>();

        String line ="";

        while ((line = br.readLine())!= null){
            String splitted[] = line.split("\t");
            if(splitted.length > 2){
                db.put(splitted[0],splitted[2]);
            }
        }

    }


    public String lookup(String keyword){

        String mm="";

        for (Map.Entry<String,String> m:db.entrySet()){

            if (m.getKey().equals(keyword)){

                mm = m.getValue();

                return mm;

            }

        }

        return "not found";

    }

}
