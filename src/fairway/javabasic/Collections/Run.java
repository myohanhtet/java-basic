package fairway.javabasic.Collections;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {

        Student st = new Student("myo",1,20);
        Student st1 = new Student("phyo",2,25);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st);
        students.add(st1);

        for (Student s:students){
            System.out.println("Name "+s.getName()+"Age: "+ s.getAge()+ "RN "+ s.getRollno() );
        }


    }

}
