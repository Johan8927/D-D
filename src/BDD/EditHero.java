package BDD;

import Character.Character;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EditHero {

    public void editHero(Character character, String newName, String newType) {
        character.setName(newName);
        character.setTypeCharacter(newType);
    }
}
