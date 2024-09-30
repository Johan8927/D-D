package StuffDef;

import SurpriseBox.Item;

// Classe parent Potions
public abstract class Potions extends Item {

    // Attributs de la classe Potions
    public String type;
    public int heal;
    public String name;

    // Constructeur de la classe Potions
    public Potions(String type, int heal, String name) {

        this.type = type;
        this.heal = heal;
        this.name = name;
    }
     // Getters et setters pour les attributs de la classe Potions
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getHeal() {
        return heal;
    }
    public void setHeal(int heal) {
        this.heal = heal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    // Redéfinir la méthode toString pour afficher les informations sur la potion
    @Override
    public String toString() {
        return "Potion: " + this.name + ", Type: " + this.type + ", heal: " + this.heal;
    }

    public long getheal() {
        return this.heal;
    }
}

