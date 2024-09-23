class personnage {
    private String nom;
    private String typePersonnage;

    // Constructeur sans paramètres
    public personnage() {
        this.nom = getNom();
        this.typePersonnage = getTypePersonnage();

    }

    // Constructeur avec nom et type
    public personnage(String nom, String typePersonnage) {
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
    public void setTypePersonnageWarrior (String typePersonnage) {
        this.typePersonnage = ("Warrior");
    }

    public void setTypePersonnageMagician (String typePersonnage) {
        this.typePersonnage = ("Mage");
    }

    // Méthode toString pour afficher les informations du personnage
    @Override
    public String toString() {
        return "" + this.nom + "" + this.typePersonnage;
    }
}
