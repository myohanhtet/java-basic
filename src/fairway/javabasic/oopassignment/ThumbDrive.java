package fairway.javabasic.oopassignment;

public class ThumbDrive extends DigitalDevice implements Formattable {
    private int classLevel;

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public static void safeRemove(){
        System.out.println("ThumbDrive: saferemove");
    }

    @Override
    public void format() {
        System.out.println("ThumbDrive: format");
    }
}
