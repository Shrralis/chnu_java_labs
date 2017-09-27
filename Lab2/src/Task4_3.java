/*
Lab #2 basics of Java
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

import java.util.Random;

public class Task4_3 {

    public static void main(String[] args) {
        int num = 16;
        double[] arr = new double[num];
        double sum = 0;
        Random r = new Random();

        for (int i = 0; i < num; i++) {
            arr[i] = r.nextDouble();
            sum += arr[i];

            System.out.printf("a[%d] = %f\n", i + 1, arr[i]);
        }
        System.out.println("Sum = " + sum);
    }
}
