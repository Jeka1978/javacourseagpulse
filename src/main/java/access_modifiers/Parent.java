package access_modifiers;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Parent {


    private String name = "Jeka";
    private String family;

    public void doX() {





        Parent p1 = new Parent();
        Parent p2 = new Parent();
        p1.equals(p2);

        String s ="";

        System.out.println(p1==p2);


        System.out.println("XXXXXXXx");
        printX();
        System.out.println("XXXXXXXx");
    }

    private void printX() {
        System.out.println("XXXXXXXx");
        System.out.println("XXXXXXXx");
        System.out.println("XXXXXXXx");
    }

    protected void doY() {
        System.out.println("XXXXXXXx");
    }

    private void doZ() {
        System.out.println("XXXXXXXx");
    }

    void do123() {
        System.out.println(123);
    }


}
