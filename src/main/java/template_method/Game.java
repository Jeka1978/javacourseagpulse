package template_method;

import reflections_example.TestRunner;

/**
 * @author Evgeny Borisov
 */
public abstract class Game {
    public final void start(){
        prepareBoard();
        while (!endOfGame()) {
            play();
        }
        calcScore();
    }

    protected abstract void calcScore();

    protected abstract void play();

    protected abstract boolean endOfGame();

    protected abstract void prepareBoard();
}






