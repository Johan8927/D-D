package BDD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Hero {


    private String name;
    private String type;
    private int attack;
    private int defense;
    private int health;
    private int level;

    // Méthode pour enregistrer un personnage en base de données
    public void createHero(Character character) {
        // URL de la base de données (ajuste en fonction de ta configuration)
        String url = "jdbc:mysql://localhost:3306/D_D";  // Nom de ta base
        String user = "root";  // Ton utilisateur MySQL
        String password = "password";  // Ton mot de passe MySQL

        // Requête SQL pour insérer un personnage dans la table heros
        String sql = "INSERT INTO heros (name,type,attack,defense,health,level) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Remplacer les ? par les attributs du personnage
            pstmt.setString(1, character.getName(character));  // Nom du personnage
            pstmt.setString(2, String.valueOf(character.getType(character)));  // Type du personnage

            // Exécute l'insertion
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Le personnage a été enregistré avec succès !");
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'enregistrement du personnage en base de données.");
            e.printStackTrace();
        }
    }
    public static List<Hero> getAllHero() {
        List<Hero> heros = new ArrayList<>();

        // URL de la base de données (ajuste en fonction de ta configuration)
        String url = "jdbc:mysql://localhost:3306/D_D";  // Nom de ta base
        String user = "root";  // Ton utilisateur MySQL
        String password = "password";  // Ton mot de passe MySQL

        // Requête SQL pour récupérer tous les personnages de la table heros
        String sql = "SELECT * FROM heros";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Parcourt les résultats et crée les objets Hero correspondants
            while (rs.next()) {
                Hero hero = new Hero();
                hero.setId(rs.getInt("id"));
                hero.setName(rs.getString("name"));
            }


} catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return heros;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setId(int id) {
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

