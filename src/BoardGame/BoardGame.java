package BoardGame;

import Case.Case;
import Case.ItemCase;
import Case.EmptyCase;
import Enemies.EnemyCase;
import Interface.GameInterface;
import java.util.ArrayList;
import java.util.Random;

public class BoardGame implements GameInterface {
    private final ArrayList<Case> board = new ArrayList<>(64); // Plateau de 64 cases
    private final int taille = 64;  // Taille du plateau
    private int joueurPosition = 0;  // Position initiale du joueur (index unique)

    // Constructeur
    public BoardGame() {
        initializeBoard(); // Initialiser le plateau

    }

    // Méthode pour initialiser le plateau de jeu
    @Override
    public void initializeBoard() {
        Random random = new Random();

        // Boucle pour initialiser chaque case du plateau
        for (int i = 0; i < taille; i++) {
            double chance = random.nextDouble(); // Génère un nombre entre 0 et 1
            if (chance < 0.33) {
                board.add(new EnemyCase()); // Ajoute une case avec un ennemi
            } else if (chance < 0.66) {
                board.add(new ItemCase());
            } else {
                board.add(new EmptyCase() {  // Ajoute une case vide
                    @Override
                    public void interagir() {
                        System.out.println("Case vide, rien ne se passe.");
                    }
                });
            }
        }
    }


    @Override
    public void moveCharacter(int fromIndex, int toIndex) {
        // Logique pour déplacer un personnage (à implémenter si nécessaire)
    }

    @Override
    public void attackOnCase(int index) {
        // Logique pour gérer une attaque sur une case (à implémenter si nécessaire)
    }

    @Override
    public void addCharacter(int index, Character character) {
        // Logique pour ajouter un personnage à une case spécifique (à implémenter si nécessaire)
    }

    @Override
    public void addEnemy(int index) {
        // Logique pour ajouter un ennemi sur une case spécifique (à implémenter si nécessaire)
    }

    @Override
    public void addItem(int index) {
        // Logique pour ajouter un item sur une case spécifique (à implémenter si nécessaire)
    }

    @Override
    public void pickUpItem(int index) {
        // Logique pour ramasser un item (à implémenter si nécessaire)
    }

    // Méthode pour déplacer le joueur après avoir jeté les dés
    public void deplacerJoueur(int resultDes) {
        // Met à jour la position du joueur
        joueurPosition += resultDes;

        // Si le joueur dépasse le nombre de cases, il revient au début
        if (joueurPosition >= taille) {
            joueurPosition = taille - 1; // Reste sur la dernière case
        }

        System.out.println("Le joueur se déplace à la position " + joueurPosition);
        interagirAvecCase(joueurPosition);  // Interaction avec la nouvelle case
    }

    // Méthode pour interagir avec la case actuelle
    public void interagirAvecCase(int index) {
        board.get(index).interagir();
    }

    // Classe Dice pour gérer les jets de dés
    public static class Dice {
        private final int sides;

        // Constructeur
        public Dice() {
            this.sides = 6;
        }

        // Méthode pour jeter le dé
        public int roll() {
            return (int) (Math.random() * sides) + 1;
        }
    }

    // Méthode principale
    public static void main(String[] args) {
        BoardGame game = new BoardGame();  // Créer une nouvelle instance de BoardGame
        Dice d6 = new Dice();  // Dé pour un jeu classique (6 faces)
        int resultDes = d6.roll();   // Le joueur jette les dés
        System.out.println("Résultat des dés : " + resultDes);
        game.deplacerJoueur(resultDes);    // Le joueur se déplace en fonction du jet de dés

    }
}
