package BoardGame;

import StuffDef.Potions;

public class UsePotion {

    public void usePotion(Character hero, Potions potion) throws InterruptedException {
        hero.wait(potion.getheal());
    }
}
