package StuffAttack;


public class Weapon extends StuffAttak {


    public Weapon(String type, int lvlAAttack, String name, int heal) {
        super(type, lvlAAttack, name , heal);
        System.out.println("Armes " + name + " est crée");
    }

}