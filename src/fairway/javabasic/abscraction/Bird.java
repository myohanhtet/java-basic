package fairway.javabasic.abscraction;

import fairway.javabasic.encapsulation.Animal;

public class Bird extends Animal implements Egglayer{


    @Override
    public void layEgg() {
        System.out.println("At Interface");
    }
}
