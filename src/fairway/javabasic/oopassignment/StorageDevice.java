package fairway.javabasic.oopassignment;

public abstract class StorageDevice {

    private int capacity;

    abstract void store();
    abstract void delete();
    abstract void mount();

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
