package DependencyInjection;

public class ShapeManager implements ShapeSetter{
    private Shape shape;

    @Override
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public float calculatePerimeter() {
        return this.shape.getPerimeter();
    }

    public float calculateArea() {
        return this.shape.getArea();
    }
}
