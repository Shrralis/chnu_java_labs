package com.shrralis.lab3;

public abstract class Shape {
    private double[] lengthOfSides;

    public final double[] getLengthOfSides() {
        return this.lengthOfSides;
    }

    public final void setLengthOfSides(double[] lengthOfSides) {
        this.lengthOfSides = lengthOfSides;
    }

    public final double getPerimeter() {
        if (this.lengthOfSides == null) {
            return -1;
        }

        double perimeter = 0;

        for (double sideLength : this.lengthOfSides) {
            perimeter += sideLength;
        }
        return perimeter;
    }

    public boolean isValid() {
        return this.lengthOfSides != null && this.lengthOfSides.length > 0;
    }

    public abstract double getArea();
}
