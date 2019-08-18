package fairway.javabasic.ganeric;


public class Run {

    public static void main(String[] args) {
        Box<Integer> b = new Box<Integer>();

        b.setContent(100);
        System.out.println("This is int"+ b);

        Box<String> bs = new Box<String>();

        bs.setContent("hi there");
        System.out.println("Hi this is sting type" + bs);

        Animal<Integer,Double> a = new Animal<Integer, Double>();
        a.setLifeSpan(100);
        System.out.println("This is integer for lifespan"+ a);
        a.setSize(1.1);
        System.out.println("This is size"+ a);


    }

}
