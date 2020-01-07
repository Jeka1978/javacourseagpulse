package lab1;

import lombok_examples.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        for (String arg : args) {
            str.append(arg);
        }


        List<String> list = new LinkedList<>();



        String line = str.toString();


        System.out.println("str = " + line.toUpperCase());


        Employee employee = Employee.builder().family("Kohen").age(30).bonus(20).salary(30).name("Moshe").debt(0).build();
        System.out.println("employee = " + employee);


        double[] doubles = {1.2, 3.2, 5.2};

        int[] nums = new int[3];



        for (int i = 0; i < doubles.length; i++) {
            nums[i]= (int) doubles[i];

        }



    }
}
