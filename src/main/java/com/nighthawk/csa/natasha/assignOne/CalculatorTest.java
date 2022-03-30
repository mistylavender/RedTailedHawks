package com.nighthawk.csa.natasha.assignOne;

import java.util.Scanner;

/**
 * Driver Class
 * Tests queue with string, integers, and mixes of Classes and types
 */
class CalculatorTest {
    public static void main(String[] args)
    {
        System.out.println();
        Scanner scan = new Scanner(System.in);

        String express = scan.nextLine();
        Calculator expression = new Calculator(express);
        System.out.println("\nSimple Math\n" + expression);

        scan.close();

    }
}

