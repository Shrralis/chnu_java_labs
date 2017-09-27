package com.shrralis.lab3.interfaces;

/*
Lab #3 shape operations
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

public interface IShape {
    double[] getLengthOfSides();

    void setLengthOfSides(double[] lengthOfSides);

    double getPerimeter();

    double getArea();

    boolean isValid();
}
