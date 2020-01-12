package lab_heroes.heroes;

/**
 * @author Evgeny Borisov
 */
public class Elf extends Hero {

    public Elf() {
        power=10;
        hp=10;
    }

    @Override
    protected void kick(Hero enemy) {
        if (getPower() > enemy.getPower()) {
            enemy.setHp(0);
        }else {
            enemy.setPower(enemy.getPower()-1);
        }
    }
}
