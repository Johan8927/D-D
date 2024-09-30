package Enemies;


public class Enemy extends Character{



    // méthode pour random un Enemy
    public static Enemy getRandomEnemy() {
        Enemy[] enemies = {new Goblins("Goblins", 1), new Dragon("Dragon", 4), new Wizard("Wizard", 2)};
        return enemies[(int) (Math.random() * enemies.length)];
    }
}
