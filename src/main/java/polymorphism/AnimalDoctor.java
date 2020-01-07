package polymorphism;

/**
 * @author Evgeny Borisov
 */
public class AnimalDoctor {
    public void treat(Animal animal) {
        animal.makeVoice();
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bringStick();
        }
    }
}
