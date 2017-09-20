/*
Lab #1 basics of Java
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

public class Task1_4 {
    /*Get a sum of the first 20 members of the arithmetic progression
    with the first item A = 1 and the difference  d = 1.5*/
    public static void main(String[] args) {
        int A = 1;
        double d = 1.5;

        System.out.println(aProgression(A, d, 20));
    }

    private static double aProgression(double first, double difference, int steps) {
        double sum = first;

        if (steps == 1) {
            return first;
        } else {
            return sum + aProgression(first + difference, difference, steps - 1);
        }
    }
}
