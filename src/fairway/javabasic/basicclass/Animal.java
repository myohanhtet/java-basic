package fairway.javabasic.basicclass;

public class Animal {

    public int lifeSpan;
    public int size;

    public void move(){
        System.out.println("Moving");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public String getInfo(){
        return "This is"+ lifeSpan +" "+ "Sice :" + size;
    }

}
