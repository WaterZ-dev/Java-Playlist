import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class AudioPlayer {

    public void play(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            Player player = new Player(fis);

            System.out.println("Playing: " + path);
            player.play(); // blocks until song finishes

        } catch (Exception e) {
            System.out.println("Playback failed, " + e);
        }
    }
}
