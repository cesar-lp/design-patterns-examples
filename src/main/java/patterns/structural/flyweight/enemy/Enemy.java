package patterns.structural.flyweight.enemy;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.awt.Graphics;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Enemy {

    final EnemyType enemyType;
    final int x, y;

    public void draw(Graphics g) {
        enemyType.draw(g, x, y);
    }

}
