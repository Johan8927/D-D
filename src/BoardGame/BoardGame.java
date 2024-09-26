package BoardGame;

import java.util.Random;

public class BoardGame {
    private static final String[] board = new String[64]; // Tableau représentant les 64 cases

    public BoardGame() {
        initializeBoard(); // Initialiser le plateau
        displayBoard();    // Afficher le plateau
    }

    // Méthode pour initialiser le plateau de jeu
    static void initializeBoard() {
        Random random = new Random();

        // Boucle pour parcourir chaque case du plateau
        for (int i = 0; i < board.length; i++) {
            if (random.nextDouble() < 0.33) {
                board[i] = "Enemy"; // 33% de chances d'avoir un ennemi
            } else if (random.nextDouble() < 0.33) {
                board[i] = "Prize"; // 33% de chances d'avoir une caisse surprise
            } else {
                board[i] = "Empty"; // Sinon, la case est vide
            }
        }
    }

    // Méthode pour afficher l'état du plateau
    static void displayBoard() {
        System.out.println("État du plateau de jeu :");
        for (int i = 0; i < board.length; i++) {
            System.out.println("Case " + (i + 1) + ": " + board[i]);
        }
    }

    // Vérifier si une case est vide
    private boolean isCaseEmpty(int index) {
        return "Empty".equals(board[index]);
    }

    // Ajouter un ennemi dans une case
    private void addEnemy(int index) {
        if (isCaseEmpty(index)) {
            board[index] = "Enemy";
            System.out.println("Ennemi ajouté à la case " + (index + 1));
        }
    }

    // Ajouter une caisse surprise dans une case
    private void addPrize(int index) {
        if (isCaseEmpty(index)) {
            board[index] = "Prize";
            System.out.println("Caisse surprise ajoutée à la case " + (index + 1));
        }
    }

    public static void main(String[] args) {
        new BoardGame(); // Créer une nouvelle instance de BoardGame et initialiser le plateau
    }
}
