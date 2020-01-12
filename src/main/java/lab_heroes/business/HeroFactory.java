package lab_heroes.business;

import lab_heroes.heroes.Hero;

/**
 * @author Evgeny Borisov
 */
public interface HeroFactory {
    Hero generateRandom();
}
