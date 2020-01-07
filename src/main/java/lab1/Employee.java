package lab1;

import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@ToString
public class Employee {

    private final String name;
    private final int age;
    private final int salary;
    private final int bonus;
    private final int debt;
    private final String family;


    public static Builder builder(){
        return new Builder();
    }

    private Employee(String name, int age, int salary, int bonus, int debt, String family) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
        this.debt = debt;
        this.family = family;
    }

    public static class Builder {

        private String name;
        private Integer age;
        private Integer salary;
        private Integer bonus;
        private Integer debt;
        private String family;


        public Builder family(String family) {
            this.family = family;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Builder debt(int debt) {
            this.debt = debt;
            return this;
        }


        public Employee build() {
            validate();
            Employee employee = new Employee(name, age, salary, bonus, debt,family);
            cleanBuilder();
            return employee;

        }

        private void cleanBuilder() {
            age = null;
            salary = null;
        }

        private void validate() {
            if (name == null) {
                throw new IllegalStateException("name can't be null");
            }
            if (bonus == null) {
                throw new IllegalStateException("bonus not initialized");
            }
            if (family == null) {

                throw new IllegalStateException("family not initialized");
            }

        }


    }


}




