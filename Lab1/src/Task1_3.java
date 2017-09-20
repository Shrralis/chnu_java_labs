/*
Lab #1 basics of Java
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

public class Task1_3 {
    /*Coils of the rectangular triangle are given.
    Find its hypotenuse and area.*/
    public static void main(String[] args) {
        double firstCoil = 3;
        double secondCoil = 4;
        double hypotenuse = Math.sqrt(firstCoil * firstCoil + secondCoil * secondCoil);
        double halfOfPerimeter = (firstCoil + secondCoil + hypotenuse) / 2;

        System.out.println("Hypotenuse is " + hypotenuse);
        System.out.println("Area is " + Math.sqrt(halfOfPerimeter * (halfOfPerimeter - firstCoil)
                * (halfOfPerimeter - secondCoil) * (halfOfPerimeter - hypotenuse)));
    }
}
