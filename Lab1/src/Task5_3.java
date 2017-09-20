/*
Lab #1 basics of Java
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

public class Task5_3 {

    public static void main(String[] args) {
        double max = Double.MIN_VALUE;

        for (int i = -3; i < 5; i++) {
            max = max(max, func(i));
        }
        System.out.println(max);
    }

    private static double func(double x) {
        return x * x * x - 2 * x * x + x - 1;
    }

    private static double max(double first, double second) {
        return first > second ? first : second;
    }
}
