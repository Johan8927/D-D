package Enemies;



public class Goblins extends Enemy  {
    private String name;
    private int attack ;
    private int heal;

    public Goblins(String name, int attack, int heal) {
        super( "Goblins", 1,6);
    }

    public int getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

    public int getHeal() {
        return heal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }
}