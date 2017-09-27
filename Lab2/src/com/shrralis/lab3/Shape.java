package com.shrralis.lab3;

import com.shrralis.lab3.interfaces.IShape;

public abstract class Shape implements IShape {
    private double[] lengthOfSides;

    @Override
    public final double[] getLengthOfSides() {
        return this.lengthOfSides;
    }

    @Override
    public final void setLengthOfSides(double[] lengthOfSides) {
        this.lengthOfSides = lengthOfSides;
    }

    @Override
    public double getPerimeter() {
        if (this.lengthOfSides == null) {
            return -1;
        }

        double perimeter = 0;

        for (double sideLength : this.lengthOfSides) {
            perimeter += sideLength;
        }
        return perimeter;
    }

    @Override
    public boolean isValid() {
        return this.lengthOfSides != null && this.lengthOfSides.length > 0;
    }
}
