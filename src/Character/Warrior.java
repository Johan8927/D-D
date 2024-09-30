package Character;


public class Warrior extends Character {
    private int attack;
    private double heal;

    // Constructeur pour la classe Warrior
    public Warrior(String name) {
        super(name, "Warrior"); // Appelle le constructeur de Character
        this.attack = generateRandomAttack(); // Génère une valeur d'attaque aléatoire entre 5 et 10
        this.heal = generateRandomheal(); // Génère une valeur de vie aléatoire entre 5 et 10
    }

    // Méthode pour générer une valeur d'attaque entre 5 et 10
    private int generateRandomAttack() {
        return (int) (Math.random() * (10 - 5 + 1)) + 5;
    }

    // Méthode pour générer une valeur de santé entre 5 et 10
    private double generateRandomheal() {
        return Math.random() * (10 - 5) + 5;
    }

    @Override
    public void afficherInfos() {
        System.out.println(this + " - Classe: Guerrier");
    }

    @Override
    public void attaquer() {
        System.out.println(name + " frappe avec son épée !");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getheal() {
        return (int) heal;
    }

    public void setheal(double heal) {
        this.heal = heal;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

