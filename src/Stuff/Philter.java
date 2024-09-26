package Stuff;

// Sous-classe Philter
public class Philter extends StuffDefense {

    public Philter(String nom, int niveauDefense) {
        super(nom, niveauDefense);
    }

    @Override
    public int calculerProtection() {
        // Par exemple, la fiole offre une protection fixe
        return 4;
    }

    @Override
    public void attaquer(Character cible) {
        // La fiole n'attaque pas
        System.out.println("La fiole ne peut pas attaquer !");
    }
}
