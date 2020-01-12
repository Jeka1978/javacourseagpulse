package java8_examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ListUtilTest {

    @Test
    public void countDuplicates() {

//        Thread.sleep();

        List<String> list = List.of("java", "JAVA", "JaVa", "java","scala");
        int countDuplicates = ListUtil.countDuplicates(list, "java",(t1, t2) -> t1.equalsIgnoreCase(t2));
        Assert.assertEquals(4,countDuplicates);
    }



}