package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
    // Informations de connexion à la base de données
    private static final String DB_URL = "jdbc:mysql://localhost:3306/D_D";
    private static final String USER = "votre_utilisateur";
    private static final String PASSWORD = "votre_mot_de_passe";

    // Méthode pour se connecter à la base de données
    public Connection connect() {
        Connection connection = null;
        try {
            // Charger le driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Établir la connexion
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connexion réussie à la base de données.");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Erreur lors de la connexion : " + e.getMessage());
        }
        return connection;
    }

    // Méthode pour exécuter une requête SELECT * sur une table
    public void selectAllFromTable(String tableName) {
        String query = "SELECT * FROM " + tableName;
        try (Connection connection = connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Parcourir les résultats de la requête
            while (resultSet.next()) {
                int id = resultSet.getInt("id"); // Par exemple, récupère une colonne "id"
                String nom = resultSet.getString("nom"); // Par exemple, récupère une colonne "nom"
                System.out.println("ID: " + id + ", Nom: " + nom);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'exécution de la requête : " + e.getMessage());
        }
    }

    // Méthode de déconnexion
    public void disconnect(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Déconnexion réussie.");
            } catch (SQLException e) {
                System.out.println("Erreur lors de la déconnexion : " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        DBManager dbManager = new DBManager();
        dbManager.selectAllFromTable("nom_de_votre_table");
    }
}
