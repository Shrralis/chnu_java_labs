package com.shrralis.lab3.interfaces;

public interface IRectangle extends IShape {
    double getSideA();

    void setSideA(double length);

    double getSideB();

    void setSideB(double length);

    double getDiagonalLength();

    double getOuterCircleRadius();
}
