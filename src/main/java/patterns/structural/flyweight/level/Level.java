package patterns.structural.flyweight.level;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import patterns.structural.flyweight.enemy.Enemy;
import patterns.structural.flyweight.enemy.EnemyName;
import patterns.structural.flyweight.enemy.EnemyTypeFactory;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Level extends JFrame {

    final List<Enemy> enemies = new ArrayList<>();
    final EnemyTypeFactory enemyTypeFactory = new EnemyTypeFactory();

    public void spawnEnemy(int x, int y, EnemyName name) {
        var enemyType = enemyTypeFactory.getEnemyType(name);
        enemies.add(new Enemy(enemyType, x, y));
    }

    @Override
    public void paint(Graphics graphics) {
        enemies.forEach(enemy -> enemy.draw(graphics));
    }
}
