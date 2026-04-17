import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class AudioPlayer {

    public void play(String path) {
        new Thread(() -> {
            try {
                FileInputStream fis = new FileInputStream(path);
                Player player = new Player(fis);
                player.play();
            } catch (Exception e) {
                System.out.println("Playback failed.");
            }
        }).start();

        System.out.println("Playing: " + path);
    }
}