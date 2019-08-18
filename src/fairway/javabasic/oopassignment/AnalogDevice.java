package fairway.javabasic.oopassignment;

public class AnalogDevice extends StorageDevice {


    @Override
    void store() {
        System.out.println("AnlogDevice: store");
    }

    @Override
    void delete() {
        System.out.println("AnlogDevice: delete");
    }

    @Override
    void mount() {
        System.out.println("AnlogDevice: mount");
    }

    public void spin(){

        System.out.println("AnlogDevice: Spin");

    }
}
