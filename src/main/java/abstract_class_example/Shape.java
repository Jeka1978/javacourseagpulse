package abstract_class_example;

import lombok.Data;
import lombok_examples.Person;

/**
 * @author Evgeny Borisov
 */
@Data
public abstract class Shape {
    private int x;
    private int y;

    public abstract double calcArea();


    public void abc(){
        Person person = new Person();
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
