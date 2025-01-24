public class UseGeometric {
    public static void main(String[] args) {
        GeometricFigure square = new Square(5.0);
        GeometricFigure triangle = new Triangle(4.0, 6.0);

        GeometricFigure[] figures = {square, triangle};

        for (GeometricFigure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}
