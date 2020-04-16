package by.veramkovich.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        Scanner scanner1 = new Scanner(System.in);
        double b = scanner1.nextDouble();
        System.out.print("Enter radius: ");
        Scanner scanner2 = new Scanner(System.in);
        double r = scanner2.nextDouble();

        int d = sqrt(a*a+b*b);
        if (r >= d)
            System.out.println("yeah");
        else
            System.out.println("bruh");
    }

    private static int sqrt(double v) {
        return 0;
    }
}
