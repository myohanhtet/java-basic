package fairway.javabasic.basicclass;

public class Run {

    public static void main(String[] args){

        Animal al = new Animal();
        al.size = 100;
        al.lifeSpan = 80;
        al.eat();
        al.move();

        String output = al.getInfo();

        show(output);

        Animal newAl = new Animal();
        newAl.size = 7000;
        newAl.lifeSpan = 10;
        newAl.eat();
        newAl.move();

        String newOut = newAl.getInfo();

        show(newOut);

    }

    public static void show(String p){

        System.out.println(p);

    }
}
