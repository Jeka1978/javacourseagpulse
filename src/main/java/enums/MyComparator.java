package enums;

import lombok.SneakyThrows;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class MyComparator implements Comparator {
    @Override
    @SneakyThrows
    public int compare(Object o1, Object o2) {


      /*  Stream.of(1, 2, 3).forEach((var integer) -> {
            System.out.println(integer);
            MaritalStatus.findByDbCode(12);
        });*/
        return 0;
    }
}
