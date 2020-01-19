package java8_examples.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public class Superman implements Father, Mother {

    @Override
    public void talkToChildren() {
        Mother.super.talkToChildren();
        Mother.super.talkToChildren();
        Father.super.talkToChildren();
    }
}
