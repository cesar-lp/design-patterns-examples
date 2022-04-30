package patterns.behavioural.strategy;

import lombok.val;

public class Main {

    public static void main(String[] args) {
        val character = new Character(new WalkStrategy());

        System.out.println("--- Level started ---");
        character.move();

        character.collectWings();
        character.move();

        character.dive();
        character.move();

        character.getOutOfWater();
        character.move();
    }
}
