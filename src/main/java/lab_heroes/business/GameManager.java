package lab_heroes.business;

import lab_heroes.heroes.Hero;

/**
 * @author Evgeny Borisov
 */
public interface GameManager {
    void fight(Hero hero1, Hero hero2);

    void fightRandom();
}
