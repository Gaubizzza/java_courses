package by.veramkovich.task6;

public class Task6 {
    public static void main(String[] args) {
        int d = 31;
        int m =12;
        int y = 2019;
        System.out.println("сегодня: " + d + "." + m + "." + y);
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10){
            if (d < 31){
                d++;
                System.out.println("завтра: " + d + "." + m + "." + y);
            } else if (d == 31){
                d = 1;
                m++;
                System.out.println("завтра: " + d + "." + m + "." + y);
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11){
            if (d < 30){
                d++;
                System.out.println("завтра: " + d + "." + m + "." + y);
            } else if (d == 30){
                d = 1;
                m++;
                System.out.println("завтра: " + d + "." + m + "." + y);
            }
        }
        else if (m == 2){
            if (y%4 != 0){
                if (d < 28){
                    d++;
                    System.out.println("завтра: " + d + "." + m + "." + y);
                } else if (d == 28){
                    d = 1;
                    m++;
                    System.out.println("завтра: " + d + "." + m + "." + y);
                }
            } else if (y%4 == 0){
                if (d < 29){
                    d++;
                    System.out.println("завтра: " + d + "." + m + "." + y);
                } else if (d == 29){
                    d = 1;
                    m++;
                    System.out.println("завтра: " + d + "." + m + "." + y);
                }
            }
        } else if (m == 12){
            if (d<31){
                d++;
                System.out.println("завтра: " + d + "." + m + "." + y);
            } else if (d == 31){
                d = 1;
                m = 1;
                y++;
                System.out.println("завтра: " + d + "." + m + "." + y);
            }
        }
    }
}
