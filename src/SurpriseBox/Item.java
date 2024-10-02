package SurpriseBox;

public class Item {
    public String type;
    public int lvlAAttack;
    public String name;
    public int heal;


    public Item(String type, int lvlAAttack, String name, int heal) {
        this.type = type;
        this.lvlAAttack = lvlAAttack;
        this.name = name;
        this.heal = heal;
    }

    public String getType() {
        return type;
    }

    public int getLvlAAttack() {
        return lvlAAttack;
    }

    public String getName() {
        return name;
    }

    public int getheal() {
        return heal;
    }

    public void setheal(int heal) {
        this.heal = heal;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLvlAAttack(int lvlAAttack) {
        this.lvlAAttack = lvlAAttack;
    }

    public void setName(String name) {
        this.name = name;
    }
}
