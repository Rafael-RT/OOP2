public class RectangleAbs extends Shape1{
    protected double width = 1.0;
    protected double length = 1.0;

    public RectangleAbs() {
    }

    public RectangleAbs(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public RectangleAbs(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "RectangleAbs{" +
                "width=" + width +
                ", length=" + length +
                super.toString() +
                '}';
    }
}
