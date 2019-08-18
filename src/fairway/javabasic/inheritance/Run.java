package fairway.javabasic.inheritance;

import fairway.javabasic.encapsulation.Animal;

public class Run {

    public static void main(String[] args){

        String info="";

        Manmmal m = new Manmmal();
        m.setLegs(4);
        m.setLifeSpan(100);
        m.setSize(3);
        m.move();
        m.eat();
        m.feedmilk();

        info = m.getInfo();
        show(m);

        Bird b = new Bird();
        b.setCanFly(false);
        b.setLifeSpan(50);
        b.setSize(10);
        b.move();
        b.eat();
        b.fly();
        show(b);


    }

    public static void show(Animal a){
        System.out.println(a.getInfo()+ '\n');
    }

}
