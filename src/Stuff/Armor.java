package Stuff;

// Sous-classe Armor
public class Armor extends StuffDefense {

    public Armor(String nom, int niveauDefense) {
        super(nom, niveauDefense);
    }

    @Override
    public int calculerProtection() {
        // Calcul spécifique à une armure
        return this.niveauDefense;
    }

    @Override
    public void attaquer(Character cible) {
        // Une armure non plus n'attaque pas
        System.out.println("L'armure ne peut pas attaquer !");
    }
}
