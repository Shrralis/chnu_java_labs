/*
Lab #2 basics of Java
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

public class Task2_3 {
    /*X and Y are given. Find out if the point with coordinates (X, Y) is
    in a ring with a center at the origin with outer radius 3
    and internal 2.5.*/
    public static void main(String[] args) {
        double X = 1.2;
        double Y = 2.3;
        double distance = Math.sqrt(X * X + Y * Y);

        System.out.printf("The point (%.3f, %.3f) %s in the ring.",
                X, Y, (distance <= 3 && distance >= 2.5 ? "is" : "isn't"));
    }
}
