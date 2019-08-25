package fairway.javabasic.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {


//    ArrayList<Lan> db;
    HashMap<String,String> db;

    public Dictionary() {

        this.db.put("apple","pantee");
        this.db.put("Foo","Bar");
        this.db.put("guu","ger");

    }


    public String lookup(String keyword){

        for (Map.Entry<String,String> m:this.db.entrySet()){
            if (m.getKey() == keyword){

                return m.getValue();
            }

        }

        return "not found";

    }

}
