package by.veramkovich.task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        int rub = scanner.nextInt();
        if (rub % 10 == 1){
            System.out.println(rub + " рубль");
        }
        else if (1 < rub && rub < 5) {
            System.out.println(rub + " рубля");
        }
        else if (rub % 10 == 2) {
            System.out.println(rub + " рубля");
        }
        else if (rub % 10 == 3) {
            System.out.println(rub + " рубля");
        }
        else if (rub % 10 == 4) {
            System.out.println(rub + " рубля");
        }
        else if (rub > 4) {
            System.out.println(rub + " рублей");
        }
    }
}
