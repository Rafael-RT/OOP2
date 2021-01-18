public class Cylinder1 {
    private Circle base;
    private double height;

    public Cylinder1(){
        base = new Circle();
        height = 1.0;
    }

    public Cylinder1(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder1{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
