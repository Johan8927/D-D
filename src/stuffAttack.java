// Classe parent StuffAttack

public class stuffAttack {
    private final String type;  // Arme ou Sort
    private final int lvlAttack;
    private final String name;

    // Constructeur de la classe StuffAttack
    public stuffAttack(String type, int lvlAttack, String name) {
        this.type = type;
        this.lvlAttack = lvlAttack;
        this.name = name;
    }


    public String getTypeMage() {

        if (this.type.equals("Armes")) {
            return "Mage";
        } else {
            return "Warrior";
        }
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Nom: " + name + ", Type: " + type + ", Niveau d'attaque: " + lvlAttack;
    }
}

// Classe Sword qui hérite de StuffAttack
class sword extends stuffAttack {
    public sword() {
        super("Armes", 5, "Sword");
    }
}

// Classe Club qui hérite de StuffAttack
class club extends stuffAttack {
    public club() {
        super("Armes", 3, "Club");
    }
}

// Classe Fire qui hérite de StuffAttack
class fire extends stuffAttack {
    public fire() {
        super("Spell", 7, "Fire");
    }
}

// Classe Storm qui hérite de StuffAttack
class storm extends stuffAttack {
    public storm() {
        super("Spell", 2, "Storm");
    }
}


class spell {
    public spell() {
        System.out.println("Vos sorts :");
        new fire();
        new storm();
    }
}
class weapon {
    public weapon() {
        System.out.println("Vos armes :");
        new sword();
        new club();
    }
}