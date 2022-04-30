package patterns.behavioural.strategy;

public class FlyStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("Flying...");
    }

}
