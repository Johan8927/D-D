package BoardGame;

import Case.Case;
import Case.EnemyCase;
import Case.ItemCase;
import Enemies.Enemy;
import Enemies.Goblins;

import java.util.ArrayList;
import java.util.Random;

public class BoardGame {
    private final ArrayList<Case> board = new ArrayList<>(64); // Plateau de 64 cases

    public BoardGame() {
        initializeBoard(); // Initialiser le plateau
        displayBoard(); // Afficher le plateau
    }

    // Méthode pour initialiser le plateau de jeu
    private void initializeBoard() {
        Random random = new Random();

        // Boucle pour initialiser chaque case du plateau
        for (int i = 0; i < 64; i++) {
            double chance = random.nextDouble(); // Génère un nombre entre 0 et 1
            if (chance < 0.33) {
                board.add(new Enemy()); // 33% de chances d'avoir un ennemi
            } else if (chance < 0.66) {
                board.add(new ItemCase()); // 33% de chances d'avoir une caisse surprise (item)
            } else {
                board.add(new Case()); // Sinon, la case est vide
            }
        }
    }

    // Méthode pour afficher l'état du plateau
    private void displayBoard() {
        System.out.println("État du plateau de jeu :");
        for (int i = 0; i < board.size(); i++) {
            System.out.println("Case " + (i + 1) + ": " + board.get(i).toString());
        }
    }

    // Méthode pour vérifier si une case est vide
    private boolean isCaseEmpty(int index) {
        return board.get(index) instanceof Case && !(board.get(index) instanceof Enemy || board.get(index) instanceof ItemCase);
    }

    // Méthode pour ajouter un ennemi dans une case spécifique
    private void addEnemy(int index) {
        if (isCaseEmpty(index)) {
            board.set(index, new Enemy());
            System.out.println("Ennemi ajouté à la case " + (index + 1));
        } else {
            System.out.println("La case " + (index + 1) + " n'est pas vide.");
        }
    }

    // Méthode pour ajouter un item dans une case spécifique
    private void addItem(int index) {
        if (isCaseEmpty(index)) {
            board.set(index, new ItemCase());
            System.out.println("Caisse surprise ajoutée à la case " + (index + 1));
        } else {
            System.out.println("La case " + (index + 1) + " n'est pas vide.");
        }
    }

    public static void main(String[] args) {
        new BoardGame(); // Créer une nouvelle instance de BoardGame
    }
}
