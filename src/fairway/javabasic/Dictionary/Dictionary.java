package fairway.javabasic.Dictionary;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {


//    ArrayList<Lan> db;
    HashMap<String,String> db;

    public Dictionary() {

        db = new HashMap<String, String>();

        db.put("apple","pantee");
        db.put("Foo","Bar");
        db.put("guu","ger");

    }


    public String lookup(String keyword){

        String mm="";

        for (Map.Entry<String,String> m:db.entrySet()){
            if (m.getKey() == keyword){
                mm = m.getValue().toString();
                return mm;
            }

        }

        return "not found";

    }

}
