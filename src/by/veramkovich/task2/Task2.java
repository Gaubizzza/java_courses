package by.veramkovich.task2;

public class Task2 {
    public static void main(String[] args) {
        int s = 1*7*24*60*60+24*60*60+60*60+60+1;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day) / 7;
        int week = w % 7;
        System.out.println(week + " недель " + day + " суток " + hour + " часов " + min + " минут " + sec + " секунд ");
    }

}

