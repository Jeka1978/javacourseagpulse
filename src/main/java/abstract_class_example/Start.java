package abstract_class_example;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {
        Shape shape = new Shape(){
            @Override
            public double calcArea() {
                return 0;
            }
        } ;
        Shape shape2 = new Shape(){
            @Override
            public double calcArea() {
                return 1;
            }
        } ;
        System.out.println("shape = " + shape.getClass().getName());
        System.out.println("shape = " + shape2.getClass().getName());


    }
}
