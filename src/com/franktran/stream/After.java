package com.franktran.stream;

import java.util.Arrays;
import java.util.List;

public class After {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
        names
                .stream()
                .filter(name -> name.startsWith("f"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
