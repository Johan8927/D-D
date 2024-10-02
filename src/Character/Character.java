package Character;

// Classe abstraite pour tous les personnages
public abstract class Character {

    // Attributs
    protected int attack;
    protected String name; // Supprimer 'static' pour rendre 'name' propre à chaque instance
    protected String typeCharacter;
    protected int health; // Correction du nom de l'attribut (au lieu de 'heal')
    protected int maxheal;
    protected int level;

    // Constructeur avec paramètres
    public Character(String name, String typeCharacter, int health, int maxheal, int attack, int level) {
        this.name = name;
        this.typeCharacter = typeCharacter;
        this.health = health; // Correction ici aussi
        this.maxheal = maxheal;
        this.attack = attack;
        this.level = level;
    }

    // Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeCharacter() {
        return typeCharacter;
    }

    public void setTypeCharacter(String typeCharacter) {
        this.typeCharacter = typeCharacter;
    }

    public int getHealth() { // Correction : 'health' au lieu de 'heal'
        return health;
    }

    public void setHealth(int health) { // Correction : 'health' au lieu de 'heal'
        this.health = health;
    }

    public int getMaxheal() {
        return maxheal;
    }

    public void setMaxheal(int maxheal) {
        this.maxheal = maxheal;
    }

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Nom: " + this.name + ", Type: " + this.typeCharacter + ", Vie: " + this.health + "/" + this.maxheal;
    }

    // Méthodes abstraites à implémenter dans les sous-classes
    public abstract void afficherInfos();
    public abstract int attaquer();

    public int getAttack() {
        return attaquer();
    }


}
