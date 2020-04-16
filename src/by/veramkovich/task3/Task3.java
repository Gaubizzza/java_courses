package by.veramkovich.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 10 == 7)
            System.out.println("yeah");
        else
            System.out.println("bruh");

    }
}
