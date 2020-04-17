package by.veramkovich.task7;

import java.util.Scanner;

import static java.lang.Integer.max;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.print("Enter d: ");
        int d = scanner.nextInt();
        System.out.print("Enter e: ");
        int e = scanner.nextInt();
        System.out.print("Enter f: ");
        int f = scanner.nextInt();

        if ((e >= (a + c)) && (f >= b && f >= d))
        {
            System.out.println("yeah");
        }
        else if ((e >= (a + d))&& (f >= b && f >= c))
        {
            System.out.println("yeah");
        }
        else if ((e >= (b + c))&& (f >= a && f >= d))
        {
            System.out.println("yeah");
        }
        else if ((e >= (b + d))&& (f >= a && f >= c))
        {
            System.out.println("yeah");
        }
        else
            System.out.println("bruh");
    }
}



