package lab_heroes.heroes;

import lab_heroes.utils.RandomUtil;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class King extends Hero {

    public King() {
        power = RandomUtil.intBetween(5, 15);
        hp = RandomUtil.intBetween(5, 15);
    }

    @Setter
    private Weapon weapon = new Sword();

    @Override
    protected void kick(Hero enemy) {
        weapon.kick(this,enemy);
    }
}




