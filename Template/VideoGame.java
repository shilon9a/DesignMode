package Template;

public class VideoGame extends Game{
    @Override
    public void initGame() {
        System.out.println("this is VideoGame Init");
    }

    @Override
    public void startGame() {
        System.out.println("this is VideoGame Start");
    }

    @Override
    public void endGame() {
        System.out.println("this is VideoGame End");
    }
}
