package com.franktran.optional;

import java.util.Optional;

public class After {
    public static void main(String[] args) {
        String name = "Frank";
        Optional.ofNullable(name).ifPresent(System.out::println);
    }
}
