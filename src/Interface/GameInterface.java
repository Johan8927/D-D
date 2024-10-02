package Interface;

public interface
GameInterface {

    void initializeBoard();
    // Méthode pour ajouter un ennemi dans une case spécifique

    void addEnemy(int index);

    // Méthode pour ajouter un item dans une case spécifique
    void addItem(int index);

    // Méthode pour afficher l'état du plateau
    void displayBoard();

    // Méthode pour déplacer un personnage sur le plateau
    void moveCharacter(int fromIndex, int toIndex);

    // Méthode pour gérer une attaque sur une case spécifique
    void attackOnCase(int index);

    // Méthode pour ajouter un personnage sur le plateau
    void addCharacter(int index, Character character);

    // Méthode pour ramasser un item sur une case spécifique
    void pickUpItem(int index);
}
