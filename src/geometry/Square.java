package geometry;

import run.Colorable;
public class Square extends Shape {
    private double side = 1.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square: "
                + "side = " + side
                + ", Perimeter = " + getPerimeter()
                + ", Area = " + getArea()
                + ", color = " + getColor()
                + ", filled = " + filled;
    }

    @Override
    public void howToColor() {
        super.howToColor();
    }

}
