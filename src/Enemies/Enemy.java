package Enemies;

public abstract class Enemy {
    private String name;
    private int attack;
    private int heal;

    // Constructeur
    public Enemy(String name, int attack, int heal) {
        this.name = name;
        this.attack = attack;
        this.heal = heal;
    }

    // Getters et setters pour les attributs
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    // Méthode d'attaque
    public void performAttack() {
        System.out.println(name + " attaque avec une puissance de " + attack);
    }

    // Méthode de guérison
    public void performHeal() {
        System.out.println(name + " récupère " + heal + " points de vie.");
    }
}
