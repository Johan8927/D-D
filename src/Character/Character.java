package Character;

public abstract class Character {


    // Attributs
    protected String nom;
    protected String typeCharacter;

    // Constructeur sans paramètres
    public Character() {
        this.nom = "";
        this.typeCharacter = "";
    }

    // Constructeur avec nom et type
    public Character(String nom, String typeCharacter) {
        this.nom = nom;
        this.typeCharacter = typeCharacter;
    }

    // Getter pour nom
    public String getNom() {
        return nom;
    }

    // Setter pour nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour typeCharacter
    public String getTypeCharacter() {
        return typeCharacter;
    }

    // Setter pour typeCharacter
    public void setTypeCharacter(String typeCharacter) {
        this.typeCharacter = typeCharacter;
    }

    // Getter pour health
    public int getHealth(String health) {;
        return Integer.parseInt(health);
    }

    // sous classe type "Magician"
    public static class Magician extends Character {
        public Magician(String nom) {
            super(nom, "Magician");
        }


        public void afficherInfos() {

        }


        public void attaquer() {

        }
    }

    // sous classe type "Warrior"
    public static class Warrior extends Character {
        public Warrior(String nom) {
            super(nom, "Warrior");
        }

        @Override
        public void afficherInfos() {

        }

        @Override
        public void attaquer() {

        }
    }

    // Méthode pour afficher les informations du Character (à implémenter dans les sous-classes)
    public abstract void afficherInfos();

    // Méthode abstraite pour attaquer (à implémenter dans les sous-classes)
    // La méthode attaquer() est définie comme abstraite, ce qui force les sous-classes à la redéfinir, par exemple un guerrier ou un mage aura une manière différente d'attaquer.
    public abstract void attaquer();

    // Méthode toString pour afficher les informations du Character
    @Override
    public String toString() {
        return "Nom: " + this.nom + ", Type: " + this.typeCharacter;
    }

}
