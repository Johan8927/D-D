package Character;

// Classe abstraite pour tous les personnages
public abstract class Character {

    // Attributs
    protected int attack;
    protected static String name;
    protected String typeCharacter;
    protected int health;
    protected int maxheal;
    protected int level;

    // Constructeur avec paramètres
    public Character(String name, String typeCharacter, int heal, int maxheal, int attack,int level) {
        this.name = name;
        this.typeCharacter = typeCharacter;
        this.health = heal;
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

    public int getheal() {
        return heal;
    }

    public void setheal(int heal) {
        this.heal = heal;
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
        return "Nom: " + this.name + ", Type: " + this.typeCharacter + ", Vie: " + this.heal + "/" + this.maxheal;
    }

    // Méthodes abstraites à implémenter dans les sous-classes
    public abstract void afficherInfos();
    public abstract void attaquer();
}