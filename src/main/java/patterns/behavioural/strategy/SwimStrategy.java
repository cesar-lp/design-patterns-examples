package patterns.behavioural.strategy;

public class SwimStrategy implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("Swimming...");
    }

}
