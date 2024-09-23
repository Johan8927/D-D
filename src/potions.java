// Classe parent Potions
public class potions {
    public String type;
    public int health;
    public String name;

    // Constructeur de la classe Potions
    public potions(String type, int health, String name) {
        this.type = type;
        this.health = health;
        this.name = name;
    }

    // Redéfinir la méthode toString pour afficher les informations sur la potion
    @Override
    public String toString() {
        return "Potion: " + this.name + ", Type: " + this.type + ", Health: " + this.health;
    }
}

// Classe enfant SmallPotions qui hérite de Potions
class smallPotions extends potions {
    public smallPotions() {
        super("potions", 2, "Small Potions");
    }
}

// Classe enfant BigPotions qui hérite de Potions
class bigPotions extends potions {
    public bigPotions() {
        super("potions", 5, "Big Potions");
    }
}

