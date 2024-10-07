package Enemies;

import Case.Case;
import StuffDef.Potions;

public class EnemyCase extends Case {

    Enemy currentEnemy;
    public EnemyCase() {
        super();

        int random = (int) (Math.random() * 3)+1 ;

        if (random == 1){
            currentEnemy = new Goblins("Dragon", 4, 15 );
        } else if (random == 2){
            currentEnemy = new Wizard("Wizard", 2,9);
        } else {
            currentEnemy = new Dragon("Dragon", 4, 15);
        }
    }


    @Override
    public void interagir() {
        System.out.println("Case avec ennemi : " + currentEnemy.toString());
    }
}
