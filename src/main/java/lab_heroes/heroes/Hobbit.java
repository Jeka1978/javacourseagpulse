package lab_heroes.heroes;

import lab_heroes.heroes.Hero;

/**
 * @author Evgeny Borisov
 */
public class Hobbit extends Hero {

    public Hobbit() {
        hp=3;
        power=0;
    }

    @Override
    protected void kick(Hero enemy) {
        cry();
    }

    private void cry() {
        System.out.println("I'm a hobbit, don't kill me!!! aaaaaaaaa!");
    }
}
