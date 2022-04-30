package patterns.structural.decorator;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Boss ---");
        Enemy enemy = new BasicEnemy();
        enemy.attack();

        System.out.println("\n--- Phase I ---");
        enemy = new LightingEnemy(enemy);
        enemy.attack();

        System.out.println("\n--- Phase II ---");
        enemy = new FireEnemy(enemy);
        enemy.attack();

        System.out.println("\n--- Phase III ---");
        enemy = new DarkEnergyEnemy(enemy);
        enemy.attack();
    }
}
