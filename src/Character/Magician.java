package Character;


public class Magician extends Character {
    private static String name = "Magician";
    private int attack = (8-15);
    private double heal = (3 - 6);

    public Magician(String name) {
        super(name, "Magician", 3-6, 6); // Un magicien pourrait avoir moins de vie par défaut
    }

    @Override
    public void afficherInfos() {
        System.out.println(toString() + " - Classe: Magicien");
    }

    @Override
    public void attaquer() {
        System.out.println(name + " lance un sort magique !");
    }


    public int getheal() {
        return (int) heal;
    }

    public void setheal(double heal) {
        this.heal = (int) heal;
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
