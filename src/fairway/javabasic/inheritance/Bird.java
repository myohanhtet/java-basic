package fairway.javabasic.inheritance;

import fairway.javabasic.encapsulation.Animal;

public class Bird extends Animal {

    private boolean canFly;

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public void fly() {

        if(this.canFly){
            System.out.println("Bird can FLY");
        } else {
            System.out.println("!Bird cannot FLY");
        }

    }

    public void move(){
        System.out.println("Overlload in move on !!Bird");
    }

    public String getInfo(){
        String info = super.getInfo();

        info += " This is bird";

        if (this.canFly){
            info += "Also bird can fly :)";
        } else {
            info += "But bird cannot fly :(";
        }

        return info;
    }



}
