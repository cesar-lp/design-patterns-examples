package patterns.behavioural.strategy.strategies;

public class FlyStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("Flying...");
    }

}
