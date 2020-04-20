package by.veramkovich.task8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int f = 1;
        int n = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int x = scanner.nextInt();
        while (n != x){
            n ++;
            f = f * n;
        } if (n != 0){
            System.out.println("Факториал: " + f);
        } else {
            f = 0;
            System.out.println("Факториал: " + f);
        }
    }
}
