package Case;


import StuffAttack.Club;
import StuffAttack.Fire;
import StuffAttack.Storm;
import StuffAttack.Sword;
import StuffDef.BigPotion;
import StuffDef.Potions;
import StuffDef.SmallPotion;
import SurpriseBox.Item;

public class ItemCase extends Case {
    private Item currentItem;
    private Potions currentPotions;
    public ItemCase() {
        super();

        int random = (int) (Math.random() * 6) + 1;
        if (random == 1) {
            currentItem = new Club();
        } else if (random == 2) {
            currentItem = new Sword();
        } else if (random == 3) {
            currentItem = new Fire();
        } else if (random == 4) {
            currentItem = new Storm();
        }
        else if (random == 5) {
            currentPotions = new BigPotion();
        }
        else if (random == 6) {
            currentPotions = new SmallPotion();
        }
    }

    @Override
    public void interagir() {
        if (currentItem!= null) {
            System.out.println("La case contient : " + currentItem.toString());
        } else if (currentPotions!= null) {
            System.out.println("La case contient : " + currentPotions.toString());
        } else {
            System.out.println("La case est vide.");
        }


    }
}
