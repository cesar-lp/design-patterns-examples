package patterns.structural.flyweight.enemy;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class EnemyTypeFactory {

    final Map<EnemyName, EnemyType> enemyTypes = new HashMap<>();

    public EnemyType getEnemyType(EnemyName name) {
        var enemy = enemyTypes.get(name);

        if (enemy == null) {
            enemy = new EnemyType(name, getEnemyColor(name), getEnemyLife(name));
            enemyTypes.put(name, enemy);
        }

        return enemy;
    }

    private Color getEnemyColor(EnemyName enemyName) {
        switch (enemyName) {
            case SKELETON:
                return Color.DARK_GRAY;
            case VAMPIRE:
                return Color.RED;
            case CHIMERA:
                return Color.ORANGE;
            default:
                return Color.WHITE;
        }
    }

    private Integer getEnemyLife(EnemyName enemyName) {
        switch (enemyName) {
            case SKELETON:
                return 100;
            case VAMPIRE:
                return 90;
            case CHIMERA:
                return 110;
            default:
                return 50;
        }
    }

}
