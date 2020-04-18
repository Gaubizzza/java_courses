package by.veramkovich.task10;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите х: ");
        int x = scanner.nextInt();
        while(x != 0){
            sum += (x % 10);
            x /= 10;
        }
        System.out.println("сумма: " + sum);

    }
}
