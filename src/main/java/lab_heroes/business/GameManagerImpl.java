package lab_heroes.business;

import lab_heroes.heroes.Hero;

/**
 * @author Evgeny Borisov
 */
public class GameManagerImpl implements GameManager {

    private HeroFactory heroFactory = new HeroFactoryImpl();

    @Override
    public void fight(Hero hero1, Hero hero2) {
        while (hero1.isAlive() && hero2.isAlive()) {
            hero1.fight(hero2);
            hero2.fight(hero1);
        }
        if (hero1.isAlive()) {
            System.out.println("Winner is " + hero1.getClass().getSimpleName());
        } else {
            System.out.println("Winner is " + hero2.getClass().getSimpleName());
        }
    }

    @Override
    public void fightRandom() {
        fight(heroFactory.generateRandom(), heroFactory.generateRandom());
    }
}
