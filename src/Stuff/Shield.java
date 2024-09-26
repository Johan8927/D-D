package Stuff;

// Sous-classe Shield
public class Shield extends StuffDefense {

    public Shield(String nom, int niveauDefense) {
        super(nom, niveauDefense);
    }

    @Override
    public int calculerProtection() {
        // Calcul spécifique à un bouclier
        return this.niveauDefense + 5;
    }

    @Override
    public void attaquer(Character cible) {
        // Un bouclier n'attaque pas, donc on peut soit laisser cette méthode vide, soit la faire afficher un message
        System.out.println("Le bouclier ne peut pas attaquer !");
    }
}
