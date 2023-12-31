package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        double average = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Average of even numbers: " + average);
    }
}