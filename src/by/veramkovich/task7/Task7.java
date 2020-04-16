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

        if (e > (a + c) & f > max(b, d)) {
            System.out.println("yeah");
        } else if (e>max(a,c) & f> (b+d)){
            System.out.println("yeah");
        } else{
            System.out.println("bruh");
        }
    }
}
