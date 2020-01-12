package lab_heroes.heroes;

import lab_heroes.utils.RandomUtil;
import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class Knight extends Hero {

    public Knight() {
        power = RandomUtil.intBetween(2, 12);
        hp = RandomUtil.intBetween(2, 12);
    }

    @Setter
    private Weapon weapon = new Sword();
    @Override
    protected void kick(Hero enemy) {
        weapon.kick(this,enemy);
    }
}
