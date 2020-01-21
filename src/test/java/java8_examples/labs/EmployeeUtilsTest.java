package java8_examples.labs;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

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
    public void testGroupBySeniority() {

        List<Developer> developers = List.of(
                Developer.builder().name("Jeka").salary(9).build(),
                Developer.builder().name("Moshe").salary(7).build(),
                Developer.builder().name("Haim").salary(3).build(),
                Developer.builder().name("Natali").salary(90).build(),
                Developer.builder().name("Paz").salary(24).build(),
                Developer.builder().name("Oren").salary(17).build()
        );

       Map<Seniority,Long> map =  DeveloperUtils.groupBySeniority(developers);
        Assert.assertEquals(3, (long) map.get(Seniority.JUNIOR));
        Assert.assertEquals(1, (long) map.get(Seniority.MIDDLE));
        Assert.assertEquals(2, (long) map.get(Seniority.SENIOR));
    }

    @Test
    public void totalSalary() {

        List<Developer> list = List.of(
                Developer.builder().salary(10).build(),
                Developer.builder().salary(20).build(),
                Developer.builder().salary(30).build());

        int total = DeveloperUtils.totalSalary(list);
        Assert.assertEquals(60, total);

    }
}




