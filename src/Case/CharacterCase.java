package Case;

// Classe pour représenter une case contenant un personnage
public class CharacterCase extends Case {
    private Character currentCharacter;

    // Constructeur pour initialiser la case avec un personnage
    public CharacterCase(Character character) {
        this.currentCharacter = character;
    }

    // Getter pour récupérer le personnage sur la case
    public Character getCurrentCharacter() {
        return currentCharacter;
    }

    // Setter pour modifier le personnage sur la case
    public void setCurrentCharacter(Character character) {
        this.currentCharacter = character;
    }

    // Méthode toString pour afficher les informations de la case
    @Override
    public String toString() {
        if (currentCharacter != null) {
            return "Case avec personnage : " + currentCharacter.toString();
        } else {
            return "Case vide (aucun personnage)";
        }
    }

    @Override
    public void interagir() {

    }
}
