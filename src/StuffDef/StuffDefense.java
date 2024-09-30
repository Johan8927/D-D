package StuffDef;

import SurpriseBox.Item;

public abstract class StuffDefense extends Item {


    // Attribut propre à StuffDefense
    private int niveauDefense;


    public StuffDefense(String type, int lvlAAttack, String name, int heal) {
        super(type, lvlAAttack, name, heal);
    }

    // Getters
    public int getNiveauDefense() {
        return niveauDefense;
    }

    // Le getter pour 'name' et 'heal' sont hérités de la classe Item
}
