package lab_heroes.heroes;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public abstract class Hero {
    protected int power;
    protected int hp;


    public void fight(Hero enemy){
        System.out.println(this.getClass().getSimpleName() + " kicks " + enemy.getClass().getSimpleName());
        kick(enemy);
    }

    protected abstract void kick(Hero enemy) ;

    public boolean isAlive() {
        return hp > 0;
    }
}
