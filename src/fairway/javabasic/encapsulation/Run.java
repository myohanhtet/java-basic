package fairway.javabasic.encapsulation;

public class Run {

    public static void main(String[] args){

        System.out.println("***** Geeter & Seeter*****");

        Animal am1 = new Animal();
        am1.setLifeSpan(50);
        am1.setSize(1);
        String output = am1.getInfo();
        show(output);

        System.out.println("***** Arg one to *****");
        Animal am2 = new Animal(60);
        am2.setSize(2);
        System.out.println(am2.lastAction);
        String output2 = am2.getInfo();
        show(output2);

        System.out.println("***** Two arg const");
        Animal am3 = new Animal(10,3);
        System.out.println(am3.lastAction);
        String output3 = am3.getInfo();
        show(output3);



    }

    public static void show(String p){
        System.out.println(p);
    }

}
