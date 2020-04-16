package by.veramkovich.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();

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
