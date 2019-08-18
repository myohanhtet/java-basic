package fairway.javabasic.encapsulation;

public class Animal {

    private int lifeSpan;
    private int size;
    public String lastAction;

    public int getLifeSpan() {
        return lifeSpan;
    }

    public int getSize() {
        return size;
    }


    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //Default constructor
    public Animal(){
        this.lifeSpan = 100;
        this.lastAction = "Default constructor";
    }

    public Animal(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public Animal(int lifeSpan, int size) {
        this.lifeSpan = lifeSpan;
        this.size = size;
    }

    public void move(){
        System.out.println("This is Move method");
    }
    public void eat(){
        System.out.println("This is Eat Method");
    }

    public String getInfo(){
        String info = "This animal has avarage lifespan: " + this.lifeSpan + ", Size :" + this.size;
        return info;
    }


}
