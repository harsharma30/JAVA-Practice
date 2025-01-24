/*
Create an abstract class called GeometricFigure. Each figure includes a height, a width, a figure type, include an abstract method to determine the area of the figure. 
Create two subclasses called Square and Triangle. 
Create an application that demonstrates creating objects of both subclasses, and store them in an array. 
Save the files as GeometricFigure.java, Square.java, Triangle.java, and UseGeometric.java.
 */
public abstract class GeometricFigure {
    private double height;
    private double width;
    private String figureType;

    public GeometricFigure(double height, double width, String figureType) {
        this.height = height;
        this.width = width;
        this.figureType = figureType;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getFigureType() {
        return figureType;
    }

    public void setFigureType(String figureType) {
        this.figureType = figureType;
    }

    public abstract double calculateArea();
}
