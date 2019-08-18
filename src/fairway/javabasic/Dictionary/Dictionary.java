package fairway.javabasic.Dictionary;

import java.util.ArrayList;

public class Dictionary {


    ArrayList<Lan> db;

    public Dictionary() {

        this.db.add(new Lan("apple","panthee"));
        this.db.add(new Lan("orange","lainMawThee"));
        this.db.add(new Lan("bool","sarOak"));

    }


    public String lookup(String keyword){

        for (Lan aa:this.db){
            if(aa.getGetEng() == keyword) return aa.getGetMm();
        }

        return "not found";

    }

}
