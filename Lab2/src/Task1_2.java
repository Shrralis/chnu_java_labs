/*
Lab #2 basics of Java
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

public class Task1_2 {
    /*Calculate the perimeter and area of rectangular triangle
    along the length of two coils.*/
    public static void main(String[] args) {
        double firstCoil = 3;
        double secondCoil = 4;
        double hypotenuse = Math.sqrt(firstCoil * firstCoil + secondCoil * secondCoil);
        double perimeter = firstCoil + secondCoil + hypotenuse;
        double p = perimeter / 2;

        System.out.println("P = " + perimeter);
        System.out.println("S = " + Math.sqrt(p * (p - firstCoil) * (p - secondCoil) * (p - hypotenuse)));
    }
}
