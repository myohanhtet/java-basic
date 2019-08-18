package fairway.javabasic.inheritance;

import fairway.javabasic.encapsulation.Animal;

public class Manmmal extends Animal {

    private int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void feedmilk(){
        System.out.println("Feeding Milk");
    }

    public void move(){
        System.out.println("Over in mammal");
    }

    public String getInfo(){
        String info = super.getInfo();
        info += " This is mammal"+ legs + "Leafs";
        return info;
    }
}
