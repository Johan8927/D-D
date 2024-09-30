package Enemies;

public class Wizard extends Enemy{
    private String name = "Wizard";
    private int attack = 2;
    private int heal = 9;

    public Wizard(String name, int attack) {
        super(name, attack);
    }
}
