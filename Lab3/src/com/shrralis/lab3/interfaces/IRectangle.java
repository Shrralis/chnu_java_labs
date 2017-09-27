package com.shrralis.lab3.interfaces;

/*
Lab #3 shape operations
by Yaroslav Zhyravov aka Shrralis
Group: 343sk
Chair: Software Engineering
Date: 12.09.2017
 */

public interface IRectangle extends IShape {
    double getSideA();

    void setSideA(double length);

    double getSideB();

    void setSideB(double length);

    double getDiagonalLength();

    double getOuterCircleRadius();
}
