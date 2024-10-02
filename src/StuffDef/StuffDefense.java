package StuffDef;

import SurpriseBox.Item;

public abstract class StuffDefense extends Item {


    // Attribut propre à StuffDefense
    private int niveauDefense;


    public StuffDefense(String type, int lvlAAttack, String name, int niveauDefense) {
        super(type, lvlAAttack, name, niveauDefense);
    }

    // Getters
    public int getNiveauDefense() {
        return niveauDefense;
    }


}
