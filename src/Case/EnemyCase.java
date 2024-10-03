package Case;

import Enemies.Dragon;
import Enemies.Enemy;
import Enemies.Goblins;
import Enemies.Wizard;

public class EnemyCase extends Case {

    private Enemy currentEnemy;

    public EnemyCase() {
        super();

        int random = (int) (Math.random() * 3) + 1;
        Enemy currentEnemy;
        if (random == 1) {
            currentEnemy = new Goblins("Gollum", 1, 6);
        } else if (random == 2) {
            currentEnemy = new Wizard("Wizard", 2, 9);
        } else {
            currentEnemy = new Dragon("Dragon", 4, 15);
        }
    }
}
