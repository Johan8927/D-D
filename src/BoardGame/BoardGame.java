package BoardGame;

import Case.Case;
import Case.ItemCase;
import Case.EnemyCase;
import Interface.GameInterface;
import Character.Character;
import Case.CharacterCase;
import java.util.ArrayList;
import java.util.Random;



public class BoardGame extends Game implements GameInterface {
    private final ArrayList<Case> board = new ArrayList<>(64); // Plateau de 64 cases

    public BoardGame() {
        initializeBoard(); // Initialiser le plateau
        displayBoard();    // Afficher le plateau
    }

    // Méthode pour initialiser le plateau de jeu
    @Override
    public void initializeBoard() {
        Random random = new Random();

        // Boucle pour initialiser chaque case du plateau
        for (int i = 0; i < 64; i++) {
            double chance = random.nextDouble(); // Génère un nombre entre 0 et 1
            if (chance < 0.33) {
                board.add(new EnemyCase()); // 33% de chances d'avoir un ennemi
            } else if (chance < 0.66) {
                board.add(new ItemCase()); // 33% de chances d'avoir une caisse surprise (item)
            } else {
                board.add(new Case()); // Sinon, la case est vide
            }
        }
    }

    // Méthode pour afficher l'état du plateau
    @Override
    public void displayBoard() {
        System.out.println("État du plateau de jeu :");
        for (int i = 0; i < board.size(); i++) {
            System.out.println("Case " + (i + 1) + ": " + board.get(i).toString());
        }
    }

    // Déplacement d'un personnage d'une case à une autre
    @Override
    public void moveCharacter(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex < 0 || fromIndex >= board.size() || toIndex >= board.size()) {
            System.out.println("Indices hors limites");
            return;
        }

        Case fromCase = board.get(fromIndex);
        Case toCase = board.get(toIndex);

        // Déplace le contenu de la case d'origine vers la nouvelle case
        board.set(toIndex, fromCase);
        board.set(fromIndex, new Case()); // Réinitialise l'ancienne case

        System.out.println("Le personnage bouge de la case " + (fromIndex + 1) + " à la case " + (toIndex + 1));
    }

    // Gestion de l'attaque sur une case
    @Override
    public void attackOnCase(int index) {
        if (index < 0 || index >= board.size()) {
            System.out.println("Indice hors limites");
            return;
        }

        System.out.println("Le personnage attaque sur la case " + (index + 1));
        // Logique d'attaque à implémenter selon les règles du jeu
    }


    // Ajouter un personnage à une case
    @Override
    public void addCharacter(int index, java.lang.Character character) {
        if (index < 0 || index >= board.size()) {
            System.out.println("Indice hors limites");
            return;
        }

        board.set(index, new CharacterCase(character)); // Suppose que tu as une `CharacterCase`

    }

    // Ramasser un objet sur une case
    @Override
    public void pickUpItem(int index) {
        if (index < 0 || index >= board.size()) {
            System.out.println("Indice hors limites");
            return;
        }

        Case caseAtIndex = board.get(index);
        if (caseAtIndex instanceof ItemCase) {
            System.out.println("Le personnage ramasse l'item sur la case " + (index + 1));
            board.set(index, new Case()); // Retire l'objet en réinitialisant la case
        } else {
            System.out.println("Aucun objet à ramasser sur la case " + (index + 1));
        }
    }

    // Méthode pour vérifier si une case est vide
    private boolean isCaseEmpty(int index) {
        return board.get(index) instanceof Case && !(board.get(index) instanceof EnemyCase || board.get(index) instanceof ItemCase);
    }

    // Méthode pour ajouter un ennemi dans une case spécifique
    public void addEnemy(int index) {
        if (isCaseEmpty(index)) {
            board.set(index, new EnemyCase());
            System.out.println("Ennemi ajouté à la case " + (index + 1));
        } else {
            System.out.println("La case " + (index + 1) + " n'est pas vide.");
        }
    }

    // Méthode pour ajouter un item dans une case spécifique
    public void addItem(int index) {
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
