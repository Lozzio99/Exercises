package SolutionsShapes;


//you can think of a circle as being inscribed inside a square/rect
public class Circle extends Quadrilateral {

    public Circle(double x, double y, double size) {
        super(x, y, size,size);
    }

    @Override
    public double getArea() {
        double radius = getWidth()/2.;
        double squared_radius = radius * radius;
        return 2 * Math.PI * (squared_radius);
    }

    @Override
    public int numberOfSides() {
        return 0;
    }


}
