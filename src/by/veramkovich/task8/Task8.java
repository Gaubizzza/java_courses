package by.veramkovich.task8;

public class Task8 {
    public static void main(String[] args) {
        double pr = 1;
        int n = 0;
        int x = (int)(Math.random()*20);
        while (x != 0){
            pr = pr*x;
            n ++;
            x = (int)(Math.random()*20);
        } if (n != 0){
            System.out.println("Среднее произведения: " + pr);
        } else {
            pr = 0;
            System.out.println("Среднее произведения: " + pr);
        }
    }
}
