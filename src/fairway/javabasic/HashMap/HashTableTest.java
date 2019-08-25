package fairway.javabasic.HashMap;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

    public static void main(String[] args) {

        Hashtable<Integer,String > ht = new Hashtable<Integer, String>();

        ht.put(1,"One");
        ht.put(2,"Two");
        ht.put(3,"Three");

        for (Map.Entry<Integer,String> m:ht.entrySet()){
            System.out.println(m.getKey() + m.getValue());
        }

    }
}
