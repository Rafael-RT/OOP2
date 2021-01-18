public class SquareAbs extends RectangleAbs{

    public SquareAbs(){

    }

    public SquareAbs(double side) {
        super(side, side);
    }

    public SquareAbs(String color, boolean filled, double side) {
        super( side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side){
        setWidth(side);
    }

    public void setLength(double side){
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }

}
