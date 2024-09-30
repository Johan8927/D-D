package SurpriseBox;

import java.util.Random;

// La classe SurpriseItem hérite de Item
public class SurpriseItem extends Item {

    // Constructeur pour SurpriseItem
    public SurpriseItem(String type, int lvlAttack, String name, int heal) {
        super(type, lvlAttack, name, heal);
    }

    // Méthode pour ouvrir la surprise box et obtenir un item aléatoire
    public static SurpriseItem open() {
        SurpriseItem item = getRandomItem();
        System.out.println("You found: " + item.getName());
        return item;
    }

    // Méthode pour obtenir un item aléatoire
    public static SurpriseItem getRandomItem() {
        // Liste des items possibles
        SurpriseItem[] items = {
                new SurpriseItem("Fire", 10, "Fire Attack", 0),
                new SurpriseItem("Storm", 15, "Storm Attack", 0),
                new SurpriseItem("Club", 5, "Club Weapon", 0),
                new SurpriseItem("Sword", 20, "Sword Weapon", 0),
                new SurpriseItem("Big Potions", 0, "Big Healing Potion", 50),
                new SurpriseItem("Small Potions", 0, "Small Healing Potion", 20)
        };
        Random random = new Random();
        return items[random.nextInt(items.length)];
    }

    // Méthode pour consommer l'item surprise
    public void consume() {
        switch (this.getType()) {
            case "Fire":
                System.out.println("You used a Fire attack!");
                break;
            case "Storm":
                System.out.println("You used a Storm attack!");
                break;
            case "Club":
                System.out.println("You used a Club as a weapon!");
                break;
            case "Sword":
                System.out.println("You used a Sword as a weapon!");
                break;
            case "Big Potions":
                System.out.println("You drank a Big Healing Potion!");
                break;
            case "Small Potions":
                System.out.println("You drank a Small Healing Potion!");
                break;
            default:
                System.out.println("Unknown item");
        }
    }
}
