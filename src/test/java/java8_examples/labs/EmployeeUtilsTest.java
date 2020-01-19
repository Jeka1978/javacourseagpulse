package java8_examples.labs;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class EmployeeUtilsTest {

    @Test
    public void totalPriceForAllBeer() {

        Beer leff = Beer.builder().name("Leff").price(10).build();
        Beer tuborg = Beer.builder().name("tuborg").price(5).build();
        Beer makabi = Beer.builder().name("makabi").price(2).build();
        Beer baltika = Beer.builder().name("baltika").price(1).build();


        List<Developer> list = List.of(
                Developer.builder().beer(leff).beer(tuborg).build(),
                Developer.builder().beer(makabi).beer(leff).build(),
                Developer.builder().beer(baltika).beer(tuborg).build());

        int total = DeveloperUtils.totalBeerCost(list);
        Assert.assertEquals(33,total);

    }

    @Test
    public void totalSalary() {

        List<Developer> list = List.of(
                Developer.builder().salary(100).build(),
                Developer.builder().salary(200).build(),
                Developer.builder().salary(300).build());

        int total = DeveloperUtils.totalSalary(list);
        Assert.assertEquals(600, total);

    }
}




