package StuffAttack;


public class Weapon extends StuffAttak {


    public Weapon(String type, int lvlAAttack, String name) {
        super("Weapon", 10, name);
        System.out.println("Armes " + name + " est crée");
    }

}