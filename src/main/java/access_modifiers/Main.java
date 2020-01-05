package access_modifiers;

import template_method.Chess;

import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        int x = 12;
        Parent parent = new Parent();


        Chess chess = new Chess();
        chess.start();
    }
}
