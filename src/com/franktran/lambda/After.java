package com.franktran.lambda;

public class After {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello World");
        runnable.run();
    }
}
