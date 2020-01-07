package polymorphism;

import lombok.NonNull;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal, Radio {
    private int age;

    @Override
    public void makeVoice() {

    }
}
