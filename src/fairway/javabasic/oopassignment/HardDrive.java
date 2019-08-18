package fairway.javabasic.oopassignment;

public class HardDrive extends AnalogDevice implements Formattable {
    private int rpm;

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public void defrag(){
        System.out.println("HardDrive: Defrag");
    }

    @Override
    public void format() {
        System.out.println("HardDrive: Format");
    }
}
