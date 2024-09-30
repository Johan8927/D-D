package Enemies;

public class Goblins extends Enemy {
    private String name = "Goblins";
    private int attack = 1;
    private int heal = 6;

    public Goblins(String name, int attack) {
        super(name, attack);
    }
}