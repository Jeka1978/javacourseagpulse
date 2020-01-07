package lab1;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = Employee.builder().family("Kohen").age(30).bonus(20).salary(30).name("Moshe").debt(0).build();
        System.out.println("employee = " + employee);


        double[] doubles = {1.2, 3.2, 5.2};

        int[] nums = new int[3];

        for (int i = 0; i < doubles.length; i++) {
            nums[i]= (int) doubles[i];

        }



    }
}
