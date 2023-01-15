package geometry;

import run.Colorable;
import geometry.Shape;

public class Shape implements Colorable {
    private String color = "green";
    public boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A geometry: "
                + "color = " + color
                + (isFilled() ? " filled" : " not filled");
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}