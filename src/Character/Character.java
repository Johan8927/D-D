package Character;

// Classe abstraite pour tous les personnages
public abstract class Character {

    // Attributs
    protected int attack;
    protected String name;
    protected String typeCharacter;
    protected int defense;
    protected int health;
    protected int level;

    // Constructeur avec paramètres
    public Character(String name, String typeCharacter,int defense, int health, int attack, int level) {
        this.name = name;
        this.typeCharacter = typeCharacter;
        this.health = health;
        this.defense = defense;
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
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Méthode getHero pour afficher tous les Personnages
    public Character getHero(Character[] characters) {
        for (Character character : characters) {
            if (character.getTypeCharacter().equals("Hero")) {
                return character;
            }
        }
        return null;
    }

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Nom: " + this.name + ", Type: " + this.typeCharacter + ", Vie: " + this.health;
    }

    // Méthodes abstraites à implémenter dans les sous-classes
    public abstract void afficherInfos();
    public abstract int attaquer();

    public int getAttack() {
        return attaquer();
    }


}
