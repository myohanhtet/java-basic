package fairway.javabasic.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer,String>  hm = new HashMap<Integer, String>();

        hm.put(1,"he");
        hm.put(2,"her");
        hm.put(3,"she");

        for (Map.Entry<Integer,String> m:hm.entrySet()){
            System.out.println(m.getKey() + m.getValue());
        }

    }

}
