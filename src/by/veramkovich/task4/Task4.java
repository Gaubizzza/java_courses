package by.veramkovich.task4;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();

        double d = sqrt(a*a+b*b);
        if (2*r >= d)
            System.out.println("yeah");
        else
            System.out.println("bruh");
    }
}