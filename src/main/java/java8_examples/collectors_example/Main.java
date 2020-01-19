package java8_examples.collectors_example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java", "scala");
        Map<String, Integer> map = stream.collect(toMap(s -> s, String::length));

        Stream<String> stream1 = Stream.of("java", "c++", "c#", "scala", "pascal", "python", "html", "js");


//        Map<Integer, List<String>> map1 = stream1.collect(Collectors.groupingBy(String::length));
        Map<Integer, Long> map1 = stream1.collect(
                Collectors.groupingBy(String::length, Collectors.counting()));


        System.out.println("map1 = " + map1);

//        List<Integer> list = stream.collect(Collectors.toList());
//        stream.collect(Collectors.toSet())

    }
}
