package BoardGame;

import Character.Character;

public class Attack {

    // Méthode pour attaquer un adversaire
    public void attack(Character attacker, Character defender) {
        int damage = generateRandomAttack(attacker);
        defender.setHealth(defender.getHealth() - damage); // Utiliser setHealth et getHealth
        System.out.println(attacker.getName() + " inflige " + damage + " points de dégâts à " + defender.getName());
    }

    // Générer une attaque avec des dégâts aléatoires basés sur l'attaque de l'attaquant
    private int generateRandomAttack(Character attacker) {
        return (int) (Math.random() * (attacker.getAttack() - 5 + 1)) + 5; // Exemple : minimum de 5 dégâts
    }
}
