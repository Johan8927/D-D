package Stuff;

// Classe parent Potions
public abstract class Potions {
    public String type;
    public int health;
    public String name;

    // Constructeur de la classe Potions
    public Potions(String type, int health, String name) {
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

