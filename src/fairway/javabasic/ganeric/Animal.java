package fairway.javabasic.ganeric;

public class Animal<T,U> {

    private T lifeSpan;
    private U size;

    public T getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(T lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public U getSize() {
        return size;
    }

    public void setSize(U size) {
        this.size = size;
    }
}
