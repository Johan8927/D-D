package Enemies;

import Case.Case;

public class EnemyCase extends Case {


    public EnemyCase() {
        super();

        int random = (int) (Math.random() * 3)+1 ;
        Enemy currentEnemy;
        if (random == 1){
            currentEnemy = new Enemy("Goblins", 1,6);
        } else if (random == 2){
            currentEnemy = new Enemy("Wizard", 2,9);
        } else {
            currentEnemy = new Enemy("Dragon", 4, 15);
        }
    }

    @Override
    public void interagir() {
        Enemy currentEnemy = null;
        System.out.println("Case avec un ennemi : " + currentEnemy.toString());

    }
}