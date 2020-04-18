package by.veramkovich.task9;

public class Task9 {
    public static void main(String[] args) {
        int x = 1;
        int max = x;
        while (x != 0) {
            x =(int) (Math.random()*20);
            System.out.print(x + " ");
            if (x >= max){
                max = x;
            }
        }
        System.out.println("max: " + max);
    }

}

