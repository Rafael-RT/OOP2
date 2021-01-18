public class CircleAbs extends Shape1{
    protected double radius = 1.0;

    public CircleAbs() {
    }

    public CircleAbs(double radius) {
        this.radius = radius;
    }

    public CircleAbs(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "CircleAbs{" +
                "radius=" + radius +
                super.toString() +
                '}';
    }
}
