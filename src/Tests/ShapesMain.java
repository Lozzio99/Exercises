package Tests;

import SolutionsShapes.*;

public class ShapesMain {
    public static void main(String[] args) {
        Square square = new Square(0,0,10);
        Rectangle rectangle = new Rectangle(0,0,20,10);
        Circle circle = new Circle(0,0,10);
        Quadrilateral quadrilateral = new Quadrilateral(0,0,10,10);

        System.out.println(square.getX());
        System.out.println(square.getY());
        System.out.println(square.getWidth());
        System.out.println(square.getHeight());
        System.out.println(square.getArea());

        System.out.println(square.numberOfSides() == 4);
        System.out.println(quadrilateral.numberOfSides() == 4);
        System.out.println(square.numberOfSides() == rectangle.numberOfSides());
        System.out.println(circle.numberOfSides() == 0);
        System.out.println(quadrilateral.getArea());
        System.out.println(circle.getArea());


    }

}
