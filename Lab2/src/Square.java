public class Square {
    private double side;

    private Square() {
    }

    private Square(double side) {
        this.side = side;
    }

    public static Square createBySide(double s) {
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
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }

    public double getDiagonalLength() {
        return side * Math.sqrt(2);
    }

    public double getInCircleRadius() {
        return side / 2;
    }

    public double getOutCircleRadius() {
        return (Math.sqrt(2) / 2) * side;
    }
}
