public class Point1 {
    private int x;
    private int y;

    public Point1(){}

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
