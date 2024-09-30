package BoardGame;

public class Attack {
// code pour l'attaque
    // Méthode pour attaquer un adversaire
    public void attack(Character attacker, Character defender) {
        int damage = generateRandomAttack(attacker);
        defender.setheal(defender.getheal() - damage);
        System.out.println(attacker.getName() + " inflige " + damage + " points de dégâts à " + defender.getName());
    }

    private int generateRandomAttack(Character attacker) {
        return (int) (Math.random() * (attacker.getAttack() - 5 + 1)) + 5;
    }
}
