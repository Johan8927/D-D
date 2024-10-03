package Enemies;

public class Dragon extends Enemy {
    private String name;
    private int attack;
    private int heal;

    public Dragon(String name, int attack,int heal
    ) {
        super();
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
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

