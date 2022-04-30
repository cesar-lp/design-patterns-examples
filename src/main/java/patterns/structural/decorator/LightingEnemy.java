package patterns.structural.decorator;

public class LightingEnemy extends EnemyDecorator {

    public LightingEnemy(Enemy enemy) {
        super(enemy, EnemyAttribute.LIGHTING, 10);
    }

    @Override
    public Integer getDamage() {
        return super.getDamage() + 10;
    }

    @Override
    public void attack() {
        System.out.printf("Attacking - Total damage: %d\n", getDamage());

        // here we could enhance the attack with lighting damage

        super.displayAttributes();
    }

}
