package fairway.javabasic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        ArrayList<String> alT= new ArrayList<String>();

        al.add(100);
        al.add(200);
        al.add(300);

        Iterator itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        alT.add("Hi");
        alT.add("Hello");
        alT.add("There");
        Iterator ite=alT.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

        for (String saa:alT){
            System.out.println(saa);
        }

        for(Object ase:al){
            System.out.println("AHAHA "+ase);
        }

    }
}