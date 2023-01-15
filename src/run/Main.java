package run;

import geometry.Shape;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Square;
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("orange",shape.isFilled(),4 );
        shapes[1] = new Rectangle("blue", shape.isFilled(), 5, 6);
        shapes[2] = new Square("yellow", shape.isFilled(), 7);
        shapes[3] = new Square("brown", shape.isFilled(), 8);
        shapes[4] = new Circle("green", shape.isFilled(), 9);
        System.out.println("Geometry: ");
        for (Shape i: shapes) {
            System.out.println(i);
        }
        System.out.println(" ");
        Main main = new Main();
        main.Test(shapes);
    }
    public void Test(Shape[] array) {
        System.out.println("Colorable Square: ");
        for (Shape i: array) {
            if (i instanceof Square) {
                System.out.println(i);
                i.howToColor();
            }
        }
    }
}