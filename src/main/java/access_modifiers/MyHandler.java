package access_modifiers;

/**
 * @author Evgeny Borisov
 */
public class MyHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("handling....");
    }

    @Override
    public String getMyType() {
        return "something";
    }
}
