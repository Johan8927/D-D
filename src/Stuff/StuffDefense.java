package Stuff;

public abstract class StuffDefense {

    // Attributs protégés (communs à tous les équipements de défense)
    protected String nom;
    protected int niveauDefense;
    protected int health;

    // Constructeur
    public StuffDefense(String nom, int niveauDefense) {
        this.nom = nom;
        this.niveauDefense = niveauDefense;
        this.health = 10; // Valeur par défaut des points de vie
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getNiveauDefense() {
        return niveauDefense;
    }

    public int getHealth() {
        return health;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveauDefense(int niveauDefense) {
        this.niveauDefense = niveauDefense;
    }

    // Méthode abstraite pour attaquer (chaque sous-classe a sa propre façon d'attaquer)
    public abstract void attaquer(Character cible);

    // Méthode pour recevoir des dégâts
    public void recevoirDegats(int degats) {
        this.health -= degats;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    // Méthode abstraite que chaque sous-classe doit implémenter pour calculer la protection
    public abstract int calculerProtection();

    // Méthode toString pour afficher les détails de l'équipement
    @Override
    public String toString() {
        return "Nom: " + this.nom + ", Niveau de défense: " + this.niveauDefense + ", PV: " + this.health;
    }
}

