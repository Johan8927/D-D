public class Personnage {
    private String nom;
    private String typePersonnage;

    // Constructeur sans paramètres
    public Personnage() {
        this.nom = "Inconnu";
        this.typePersonnage = "Humain";
    }

    // Constructeur avec nom uniquement
    public Personnage(String nom) {
        this.nom = nom;
        this.typePersonnage = "Humain";  // Par défaut, le type est "Humain"
    }

    // Constructeur avec nom et type
    public Personnage(String nom, String typePersonnage) {
        this.nom = nom;
        this.typePersonnage = typePersonnage;
    }

    // Getter pour nom
    public String getNom() {
        return nom;
    }

    // Setter pour nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour typePersonnage
    public String getTypePersonnage() {
        return typePersonnage;
    }

    // Setter pour typePersonnage
    public void setTypePersonnageString typePersonnage) {
        this.typePersonnage = typePersonnage;
    }

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Nom: " + this.nom + ", Type: " + this.typePersonnage;
    }
}
