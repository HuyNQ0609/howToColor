package geometry;

import run.Colorable;
public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: "
                + "radius = " + radius
                + ", color = " + getColor()
                + ", Perimeter = " + getPerimeter()
                + ", Area = " + getArea()
                + ", filled = " + filled;
    }
}