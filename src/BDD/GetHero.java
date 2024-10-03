package BDD;

import java.util.List;

import static java.lang.Character.getName;

public class GetHero {
    // méthode getHeroes(), permettant d’afficher la liste de tous les personnages. L’affichage des résultats se fera en mode console.
    public void getHeroes() {
        // Appel à la méthode getAllHero() de la classe Hero pour récupérer la liste des personnages
        List<Hero> heros = Hero.getAllHero();
        for (Hero hero : heros) {
            System.out.println("Hero : " + getHeroName(hero));
        }
    }

    private String getHeroName(Hero hero) {
        return hero.getName(); // Assuming Hero class has a getName() method to retrieve the hero's name
    }
}
