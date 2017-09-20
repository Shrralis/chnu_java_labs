/*
Lab #1 basics of Java
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

public class Task3_3 {

    public static void main(String[] args) {
        int k = 1;
        double eps = 0.000000013;
        double sum = 0;
        double current;

        while (Math.abs(current = Math.exp(-k) / (Math.pow(2, 2 * k) + fact(k))) >= eps) {
            sum += current;
            k++;
        }
        System.out.println(sum);
    }

    private static int fact(int num) {
        if (num == 1) {
            return num;
        } else {
            return num * fact(num - 1);
        }
    }
}
