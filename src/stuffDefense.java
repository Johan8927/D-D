// Classe parent StuffDef
public class stuffDefense {
    private final String type;
    private final int lvlDef;
    private final String name;

    // Constructeur de la classe StuffDef
    public stuffDefense(String type, int lvlDef, String name) {
        this.type = type;
        this.lvlDef = lvlDef;
        this.name = name;
    }

    // Redéfinir la méthode toString pour afficher les informations de l'objet
    @Override
    public String toString() {
        return "Nom: " + name + ", Type: " + type + ", Niveau de défense: " + lvlDef;
    }
}

// Classe Shield qui hérite de StuffDef
class shield extends stuffDefense {
    public shield() {
        super("Def", 10, "Shield");
    }
}

// Classe Philter qui hérite de StuffDef
class philter extends stuffDefense {
    public philter() {
        super("Def", 10, "Philter");
    }
}

