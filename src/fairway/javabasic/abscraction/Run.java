package fairway.javabasic.abscraction;

public class Run {

    public static void main(String[] args) {
        WMPlayer player = new WMPlayer();
        player.play();
        player.paush();
        player.stop();

        Bird newBird = new Bird();
        newBird.layEgg();
    }

}
