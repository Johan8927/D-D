package Character;


public class Magician extends Character {

    private String name = "Magician";
    private int attack = (8 - 15);
    private double health = (3 - 6);


    public Magician(String nom, int health) {


    }

    @Override
    public void afficherInfos() {

    }

    @Override
    public void attaquer() {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
