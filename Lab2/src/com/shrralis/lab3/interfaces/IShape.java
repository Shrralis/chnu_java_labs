package com.shrralis.lab3.interfaces;

public interface IShape {
    double[] getLengthOfSides();

    void setLengthOfSides(double[] lengthOfSides);

    double getPerimeter();

    double getArea();

    boolean isValid();
}
