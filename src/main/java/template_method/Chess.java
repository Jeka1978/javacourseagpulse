package template_method;

/**
 * @author Evgeny Borisov
 */
public class Chess extends Game {
    @Override
    protected void calcScore() {
        System.out.println(123);
    }

    @Override
    protected void play() {
//todo
    }

    @Override
    protected boolean endOfGame() {
        return false;
    }

    @Override
    protected void prepareBoard() {

    }
}
