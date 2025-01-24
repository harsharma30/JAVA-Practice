
public class Square extends GeometricFigure {

    public Square(double side) {
        super(side, side, "Square");
    }

    @Override
    public double calculateArea() {
        return getHeight() * getWidth();
    }

    @Override
    public String toString() {
        return "Figure: " + getFigureType() + ", Side: " + getHeight() + ", Area: " + calculateArea();
    }
}
