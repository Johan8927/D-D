package BDD;

import Character.Character;
public class ChangeLifePoints {

    // méthode changeLifePoints(Personnage) qui enregistre la nouvelle valeur du niveau de vie du personnage après un changement durant le jeu
    public void changeLifePoints(Character character, int newLifePoints) {
        character.setHealth(newLifePoints);
    }

}
