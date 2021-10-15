package hira;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyCalculator myCalculator = new MyCalculator();
        System.out.println("Enter the number you want the sum of the number of divisor: ");
        int n1 = input.nextInt();
        System.out.println("Sum of divisor: "+myCalculator.divisorSum(n1));


        System.out.println("Enter the number you want the factorial of: ");
        int n2 = input.nextInt();
        System.out.println("Factorial: "+myCalculator.findFactorial(n2));

    }
}

/**
 * Name: Md. Mahdi Hossain Hira
 * ID: 2012020106
 * Section: C
 * Email: cse_2012020106@lus.ac.bd
 * Date: 15/10/2021
 */