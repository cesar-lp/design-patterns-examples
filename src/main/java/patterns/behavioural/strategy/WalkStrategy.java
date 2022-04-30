package patterns.behavioural.strategy;

public class WalkStrategy implements  MoveStrategy {

    @Override
    public void move() {
        System.out.println("Walking...");
    }

}
