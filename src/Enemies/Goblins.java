package Enemies;



public class Goblins  {
    public String name;
    public int attack ;
    public int heal;

    public Goblins(String name, int attack, int heal) {
        super();
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