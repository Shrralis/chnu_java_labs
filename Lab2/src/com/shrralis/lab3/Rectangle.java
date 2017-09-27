package com.shrralis.lab3;

import com.shrralis.lab3.interfaces.IRectangle;

@SuppressWarnings("unused")
public class Rectangle extends Shape implements IRectangle {

    public Rectangle() {
    }

    private Rectangle(double sideA, double sideB) {
        this.setLengthOfSides(new double[]{sideA, sideB});
    }

    public static Rectangle createByLengthOfSides(double sideA, double sideB) {
        return new Rectangle(sideA, sideB);
    }

    public static Rectangle createBySideLengthAndPerimeter(double side, double perimeter) {
        return new Rectangle(side, (perimeter - 2 * side) / 2);
    }

    public static Rectangle createBySideLengthAndArea(double side, double area) {
        return new Rectangle(side, area / side);
    }

    public static Rectangle createBySideAndDiagonalLength(double side, double diagonal) {
        return new Rectangle(side, Math.sqrt(diagonal * diagonal - side * side));
    }

    public static Rectangle createBySideLengthAndOutCircleRadius(double side, double radius) {
        return createBySideAndDiagonalLength(side, radius * 2);
    }

    @Override
    public double getSideA() {
        if (getLengthOfSides() == null) {
            return -1;
        }
        return getLengthOfSides()[0];
    }

    @Override
    public void setSideA(double length) {
        if (getLengthOfSides() == null || getLengthOfSides().length < 2) {
            double[] temp = new double[2];
            temp[0] = length;

            setLengthOfSides(temp);
        } else {
            double[] temp = getLengthOfSides();
            temp[0] = length;

            setLengthOfSides(temp);
        }
    }

    @Override
    public double getSideB() {
        if (getLengthOfSides() == null || getLengthOfSides().length < 2) {
            return -1;
        }
        return getLengthOfSides()[1];
    }

    @Override
    public void setSideB(double length) {
        if (getLengthOfSides() == null) {
            double[] temp = new double[2];
            temp[1] = length;

            setLengthOfSides(temp);
        } else if (getLengthOfSides().length < 2) {
            double[] temp = new double[2];
            temp[0] = getLengthOfSides()[0];
            temp[1] = length;

            setLengthOfSides(temp);
        } else {
            double[] temp = getLengthOfSides();
            temp[1] = length;

            setLengthOfSides(temp);
        }
    }

    @Override
    public double getDiagonalLength() {
        if (getLengthOfSides() == null || getLengthOfSides().length < 2) {
            return -1;
        }
        return Math.sqrt(getSideA() * getSideA() + getSideB() * getSideB());
    }

    @Override
    public double getOuterCircleRadius() {
        return getDiagonalLength() / 2;
    }

    @Override
    public double getPerimeter() {
        return getSideA() * 2 + getSideB() * 2;
    }

    @Override
    public double getArea() {
        return getSideA() * getSideB();
    }

    @Override
    public boolean isValid() {
        return getSideA() > 0 && getSideB() > 0;
    }
}
