package DependencyInversion_InversionOfControl;

public class Square implements Shape {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public float getPerimeter() {
        return 4 * size;
    }

    @Override
    public float getArea() {
        return (float) (Math.pow(size, 2));
    }
}
