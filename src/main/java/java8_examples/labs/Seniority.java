package java8_examples.labs;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Seniority {
    JUNIOR(0,10), MIDDLE(11,20), SENIOR(21,Integer.MAX_VALUE);

    private final int min;
    private final int max;


    public static Seniority findBySalary(Developer developer) {
       return Arrays.stream(values())
                .filter(seniority -> seniority.min<=developer.getSalary())
                .filter(seniority -> seniority.max>=developer.getSalary())
                .findAny()
                .orElseThrow(() -> new IllegalStateException(developer.getSalary()+" is negative"));

    }














}
