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
    private final int taille = 64;  // Taille du plateau (8x8)
    private int joueurX = 0;  // Position X initiale du joueur
    private int joueurY = 0;  // Position Y initiale du joueur

    // Constructeur
    public BoardGame() {
        initializeBoard(); // Initialiser le plateau
        displayBoard();    // Afficher l'état initial du plateau
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
    // Méthode pour ajouter un personnage au plateau


    @Override
    public void addEnemy(int index) {

    }

    @Override
    public void addItem(int index) {

    }

    // Méthode pour afficher l'état du plateau
    @Override
    public void displayBoard() {
        System.out.println("État du plateau de jeu :");
        for (int i = 0; i < board.size(); i++) {
            System.out.print("Case " + (i + 1) + ": ");
            board.get(i).interagir(); // Appelle la méthode interagir pour chaque case
        }
    }

    @Override
    public void moveCharacter(int fromIndex, int toIndex) {

    }

    @Override
    public void attackOnCase(int index) {

    }

    @Override
    public void addCharacter(int index, Character character) {

    }

    @Override
    public void pickUpItem(int index) {

    }

    // Méthode pour déplacer le joueur après avoir jeté les dés
    public void deplacerJoueur(int resultDes) {
        // Déplacement simple du joueur selon le résultat du jeté de dés
        joueurY += resultDes;

        // Si le joueur dépasse les bords du plateau, on le fait "tourner"
        while (joueurY >= taille) {
            joueurY -= taille;
            joueurX += 1;
        }

        if (joueurX >= taille) {
            joueurX = taille - 1;  // Le joueur reste sur la dernière ligne
            joueurY = taille - 1;  // Le joueur reste dans la dernière case
        }

        System.out.println("Le joueur se déplace en position (" + joueurX + ", " + joueurY + ")");
        interagirAvecCase(joueurX * taille + joueurY);  // Interaction avec la nouvelle case
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
        game.displayBoard();               // Affiche le plateau après le déplacement
    }
}
