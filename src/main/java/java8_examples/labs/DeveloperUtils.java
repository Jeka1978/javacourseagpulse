package java8_examples.labs;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class DeveloperUtils {




    public static int totalSalary(List<Developer> developers) {
        return developers.stream().mapToInt(Developer::getSalary).sum();
    }

    public static int totalBeerCost(List<Developer> list) {
        return list.stream()
//                .parallel()
                .map(Developer::getBeers)
                .flatMap(List::stream)
//                .sequential()
                .mapToInt(Beer::getPrice)
                .sum();

//                .flatMap((Developer developer) -> developer.getBeers().stream())
    }
}



