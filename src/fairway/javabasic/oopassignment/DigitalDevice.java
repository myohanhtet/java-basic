package fairway.javabasic.oopassignment;

public class DigitalDevice extends StorageDevice {

    @Override
    void store() {
        System.out.println("DigitalDevice: store");
    }

    @Override
    void delete() {
        System.out.println("DigitalDevice: delete");
    }

    @Override
    void mount() {
        System.out.println("DigitalDevice: mount");
    }

    private String flashChip;
    private int pageSize;

    public String getFlashChip() {
        return flashChip;
    }

    public void setFlashChip(String flashChip) {
        this.flashChip = flashChip;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
