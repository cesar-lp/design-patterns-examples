package patterns.behavioural.strategy.strategies;

public class SwimStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("Swimming...");
    }

}
