package lab_heroes.business;

import lab_heroes.utils.RandomUtil;
import lab_heroes.heroes.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class HeroFactoryImpl implements HeroFactory {




    private List<Supplier<Hero>> herosSuppliers = asList(
            () -> new Elf(),
            Hobbit::new,
            King::new,
            Knight::new);


    public static void main(String[] args) {


        Stream.generate(() -> 1).forEach(System.out::println);












    }

    @Override
    public Hero generateRandom() {






        int i = RandomUtil.intBetween(0,herosSuppliers.size());
        return herosSuppliers.get(i).get();
    }
}



