package Character;



public class Warrior extends Character {
    private String name = "Warrior";
    private int attack = (5 - 10);
    private double health = (5 - 10);

    public Warrior(String nom, String health){
        super(nom, health);
    }
    @Override
    public void afficherInfos() {

    }

    @Override
    public void attaquer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

