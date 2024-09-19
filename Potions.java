public class Potions toString(){

public String type;
public int health;

public SmallPotions extends

Potions((String type, int health) {
    this.type = "potions";
    this.health = +2;
    this.name = "Small Potions";
}

public BigPotions extends

Potions(String type, int health) {
    this.type = "potions";
    this.health = +5;
    this.name = "Big Potions";
}
}
