package polymorphism;

import enums.MaritalStatus;
import lombok.NonNull;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {


    public void bringStick() {
        System.out.println("Take it by yourself");

    }

    @Override
    public void makeVoice() {
        System.out.println("Gav gav");
    }
}
