package patterns.structural.decorator;

public class FireEnemy extends EnemyDecorator {

    public FireEnemy(Enemy enemy) {
        super(enemy, EnemyAttribute.FIRE, 10);
    }

    @Override
    public Integer getDamage() {
        return super.getDamage() + 10;
    }

    @Override
    public void attack() {
        System.out.printf("Attacking - Total damage: %d\n", getDamage());

        // here we could enhance the attack with fire damage

        super.displayAttributes();
    }
}
