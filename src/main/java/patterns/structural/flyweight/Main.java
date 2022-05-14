package patterns.structural.flyweight;

import patterns.structural.flyweight.enemy.EnemyName;
import patterns.structural.flyweight.level.Level;

public class Main {

    static int CANVAS_SIZE = 500;
    static double ENEMIES = 1000000;

    public static void main(String[] args) {
        var level = new Level();
        var enemyTypes = new EnemyName[]{EnemyName.SKELETON, EnemyName.VAMPIRE, EnemyName.CHIMERA};

        for (int i = 0; i < Math.floor(ENEMIES / enemyTypes.length); i++) {
            for (var enemyType : enemyTypes) {
                level.spawnEnemy(random(CANVAS_SIZE), random(CANVAS_SIZE), enemyType);
            }
        }

        level.setSize(CANVAS_SIZE, CANVAS_SIZE);
        level.setVisible(true);

        System.out.println(ENEMIES + " enemies drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Enemy size (8 bytes) * " + ENEMIES);
        System.out.println("+ EnemyType size (~30 bytes) * " + enemyTypes.length + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((ENEMIES * 8 + enemyTypes.length * 30) / 1024 / 1024) +
                "MB (instead of " + ((ENEMIES * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int max) {
        return (int) (Math.random() * (max + 1));
    }

}
