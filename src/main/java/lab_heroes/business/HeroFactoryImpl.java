package lab_heroes.business;

import lab_heroes.utils.RandomUtil;
import lab_heroes.heroes.*;

import java.util.List;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class HeroFactoryImpl implements HeroFactory {


    private List<Supplier<Hero>> herosSuppliers = asList(
            () -> new Elf(), Hobbit::new, ()->new King(),()->new Knight());



    @Override
    public Hero generateRandom() {
        int i = RandomUtil.intBetween(0,herosSuppliers.size());
        return herosSuppliers.get(i).get();
    }
}



