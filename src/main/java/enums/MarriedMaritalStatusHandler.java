package enums;

/**
 * @author Evgeny Borisov
 */
public class MarriedMaritalStatusHandler implements MaritalStatusHandler {
    @Override
    public void handle() {
        System.out.println("searching for a good lawyer");
    }
}
