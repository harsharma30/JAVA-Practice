public class Triangle extends GeometricFigure {

    public Triangle(double height, double base) {
        super(height, base, "Triangle");
    }

    @Override
    public double calculateArea() {
        return 0.5 * getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureType() + ", Height: " + getHeight() + ", Base: " + getWidth() + ", Area: " + calculateArea();
    }
}
