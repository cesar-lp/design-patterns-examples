package patterns.behavioural.strategy.character;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import patterns.behavioural.strategy.strategies.FlyStrategy;
import patterns.behavioural.strategy.strategies.MoveStrategy;
import patterns.behavioural.strategy.strategies.SwimStrategy;
import patterns.behavioural.strategy.strategies.WalkStrategy;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Character {

    MoveStrategy moveStrategy;

    public void collectWings() {
        System.out.println("\nWings! Not sponsored by red bull btw");
        moveStrategy = new FlyStrategy();
    }

    public void dive() {
        System.out.println("\nI wonder if I could find a leviathan down there...");
        moveStrategy = new SwimStrategy();
    }

    public void getOutOfWater() {
        System.out.println("\nOk, enough H20 for today!");
        moveStrategy = new WalkStrategy();
    }

    public void move() {
        moveStrategy.move();
    }

}
