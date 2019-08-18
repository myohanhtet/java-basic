package fairway.javabasic.oopassignment;

public class OpticalDevice extends AnalogDevice {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void eject(){
        System.out.println("OpticalDevice: Eject");
    }

    public void burn(){
        System.out.println("OpticalDevice: Burn");
    }

}
