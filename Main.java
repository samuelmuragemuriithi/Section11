package com.awesam;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.sum(i));
        }
        System.out.println("===========");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("===========");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Series.fibonacchi(i));
        }
    }
}
