package com.shrralis.lab3;

import com.shrralis.lab3.interfaces.ISquare;

@SuppressWarnings("unused")
public class Square extends Rectangle implements ISquare {

    public Square() {
    }

    private Square(double side) {
        this.setLengthOfSides(new double[]{side});
    }

    public static Square createByLengthOfSide(double s) {
        return new Square(s);
    }

    public static Square createByPerimeter(double p) {
        return new Square(p / 4);
    }

    public static Square createByArea(double a) {
        return new Square(Math.sqrt(a));
    }

    public static Square createByDiagonalLength(double d) {
        return new Square(d / Math.sqrt(2));
    }

    public static Square createByInCircleRadius(double r) {
        return new Square(r * 2);
    }

    public static Square createByOutCircleRadius(double r) {
        return new Square(r / Math.sqrt(2) / 2);
    }

    public double getSide() {
        if (getLengthOfSides() == null) {
            return -1;
        }
        return getLengthOfSides()[0];
    }

    public void setSide(double side) {
        double[] temp = new double[1];
        temp[0] = side;

        setLengthOfSides(temp);
    }

    @Override
    public double getInCircleRadius() {
        return isValid() ? getSide() / 2 : -1;
    }

    @Override
    public double getSideA() {
        return getSide();
    }

    @Override
    public void setSideA(double length) {
        setSide(length);
    }

    @Override
    public double getSideB() {
        return getSide();
    }

    @Override
    public void setSideB(double length) {
        setSide(length);
    }

    @Override
    public double getDiagonalLength() {
        return isValid() ? getSide() * Math.sqrt(2) : -1;
    }

    @Override
    public double getOuterCircleRadius() {
        return isValid() ? Math.sqrt(2) / 2 * getSide() : -1;
    }

    @Override
    public double getArea() {
        return isValid() ? getSide() * 4 : -1;
    }

    @Override
    public boolean isValid() {
        return getSide() > 0;
    }
}
