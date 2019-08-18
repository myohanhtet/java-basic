package fairway.javabasic.oopassignment;

public class SolidStateDrive extends DigitalDevice implements Formattable{

    public void grabageCollect(){
        System.out.println("SolidStateDrive: grabaseCollect");
    }

    @Override
    public void format() {
        System.out.println("SolidStateDrive: format");
    }
}
