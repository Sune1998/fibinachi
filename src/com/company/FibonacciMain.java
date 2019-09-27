package com.company;

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PLease input a number to calculate for Fibbonaccil!");
        int x = input.nextInt();

        System.out.println("This is your fibbonacci number "+fibUdregner(x));


    }


    public static int fibUdregner(int fact) {
        if (fact == 0)
            return 1;
        else if (fact <= 0)
            return fact + fibUdregner(fact + 1);
        else
            return fact + fibUdregner(fact - 1);

    }
}