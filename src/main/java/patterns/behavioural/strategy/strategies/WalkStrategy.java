package patterns.behavioural.strategy.strategies;

public class WalkStrategy implements  MoveStrategy {

    @Override
    public void move() {
        System.out.println("Walking...");
    }

}
