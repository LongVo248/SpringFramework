package DependencyInversion_InversionOfControl;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);

        ShapeManager manager = new ShapeManager();
        manager.setShape(circle);
        System.out.println("Perimeter :" + manager.calculatePerimeter() + " ,Area : " + manager.calculateArea());
        manager.setShape(square);
        System.out.println("Perimeter :" + manager.calculatePerimeter() + " ,Area : " + manager.calculateArea());
    }
}
