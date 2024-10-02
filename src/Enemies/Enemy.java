package Enemies;


import Case.EnemyCase;

public class Enemy extends EnemyCase {



    // méthode pour random un Enemy
    public static Enemy getRandomEnemy() {
        Enemy[] enemies = {new Goblins("Golum",1,6 ), new Dragon("Dragon", 4,15), new Wizard("Wizard", 2,9)};
        return enemies[(int) (Math.random() * enemies.length)];
    }
}
