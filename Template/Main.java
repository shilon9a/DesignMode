package Template;

import java.io.RandomAccessFile;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Game videoGame=new VideoGame();
        videoGame.play();

        Game soccerGame=new SoccerGame();
        soccerGame.play();
    }
}
