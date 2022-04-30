package patterns.structural.decorator;

public class DarkEnergyEnemy extends EnemyDecorator {

    public DarkEnergyEnemy(Enemy enemy) {
        super(enemy, EnemyAttribute.DARK_ENERGY, 10);
    }

    @Override
    public Integer getDamage() {
        return super.getDamage() + 10;
    }

    @Override
    public void attack() {
        System.out.printf("Attacking - Total damage: %d\n", getDamage());

        // here we could enhance the attack with dark energy damage

        super.displayAttributes();
    }

}
