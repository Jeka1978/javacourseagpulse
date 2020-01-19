package java8_examples;

import lombok_examples.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilTest {


    @Test
    public void testForEachWithDelay() {


        List<Integer> list = List.of(1, 2, 3, 4);


        ListUtil.forEachWithDelay(list,500,
                (Action<Integer>)  integer -> System.out.println(integer));
    }


    @Test
    public void name() {
        List<Integer> list2 = new ArrayList<>(List.of(12, 1, 2, 5));
        list2.sort((o1, o2) -> o2 - o1);
        System.out.println(list2);
    }

    @Test
    public void countDuplicates() {
//        Thread.sleep();

        List<String> list = List.of("java", "JAVA", "JaVa", "java","scala");
        int countDuplicates = ListUtil.countDuplicates(list, "java",(t1, t2) -> t1.equalsIgnoreCase(t2));
        Assert.assertEquals(4,countDuplicates);
    }



}