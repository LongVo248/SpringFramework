package DependencyInjection;

import DependencyInversion_InversionOfControl.Circle;
import DependencyInversion_InversionOfControl.Shape;
import DependencyInversion_InversionOfControl.ShapeManager;
import DependencyInversion_InversionOfControl.Square;

public class Main {
    public static void main(String[] args) {
        DependencyInversion_InversionOfControl.Shape circle= new Circle(5);
        Shape square= new Square(5);

        DependencyInversion_InversionOfControl.ShapeManager manager= new ShapeManager();
        manager.setShape(circle);
        System.out.println("Perimeter :"+manager.calculatePerimeter()+" ,Area : "+manager.calculateArea());
        manager.setShape(square);
        System.out.println("Perimeter :"+manager.calculatePerimeter()+" ,Area : "+manager.calculateArea());
    }
}
