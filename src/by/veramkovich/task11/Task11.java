package by.veramkovich.task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int x = scanner.nextInt();
        boolean s = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                s = false;
                break;
            }
        }
        if (s) {
            System.out.println("yeah");
        } else {
            System.out.println("bruh");
        }
    }
}
