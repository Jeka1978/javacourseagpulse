package lab_heroes;

import lab_heroes.business.GameManager;
import lab_heroes.business.GameManagerImpl;
import lab_heroes.heroes.King;
import lab_heroes.heroes.Knight;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManagerImpl();
        gameManager.fight(new King(), new Knight());

    }
}
