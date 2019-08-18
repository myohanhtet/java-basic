package fairway.javabasic.abscraction;

public class WMPlayer extends MusicPlayer {

    @Override
    void play() {
        System.out.println("Play");
    }

    @Override
    void paush() {
        System.out.println("push");
    }

    @Override
    void stop() {
        System.out.println("Stop");
    }
}
