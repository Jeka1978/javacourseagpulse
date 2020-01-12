package enums;

/**
 * @author Evgeny Borisov
 */
public class DivorcedMaritalStatusHandler implements MaritalStatusHandler {
    @Override
    public void handle() {
        System.out.println("enjoy your beer!");
    }
}
