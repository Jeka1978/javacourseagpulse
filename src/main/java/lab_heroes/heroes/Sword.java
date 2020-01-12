package lab_heroes.heroes;

import lab_heroes.utils.RandomUtil;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {

    @Override
    public void kick(Hero attacker, Hero defender) {
        int damage = RandomUtil.intBetween(0,attacker.getPower());
        defender.setHp(defender.getHp()-damage);
    }
}










