package Template;

public class SoccerGame extends Game{
    @Override
    public void initGame() {
        System.out.println("this is SoccerGame Init");
    }

    @Override
    public void startGame() {
        System.out.println("this is Soccer Start");
    }

    @Override
    public void endGame() {
        System.out.println("this is SoccerGame End");
    }
}
