public class Line {
    private Point1 begin;
    private Point1 end;

    public Line(Point1 begin, Point1 end) {
        this.begin = begin;
        this.end = end;
    }

    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point1(beginX, beginY); // construct the Points here
        end = new Point1(endX,endY);
    }

    public Point1 getBegin() {
        return begin;
    }

    public void setBegin(Point1 begin) {
        this.begin = begin;
    }

    public Point1 getEnd() {
        return end;
    }

    public void setEnd(Point1 end) {
        this.end = end;
    }

    public int getBeginX(){
        return (int) begin.getX();
    }

    public int getBeginY(){
        return (int) begin.getY();
    }

    public int getEndX(){
        return (int) end.getX();
    }

    public int getEndY(){
        return (int) end.getY();
    }

    public void setBeginX(int x){
        begin.setX(x);
    }

    public void setBeginY(int y){
        begin.setY(y);
    }

    public void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }

    public void setEndX(int x){
        end.setX(x);
    }

    public void setEndY(int y){
        end.setY(y);
    }

    public void setEndXY(int x, int y){
        end.setXY(x,y);
    }

    public int getLength(){
        return (int) Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }

    public double getGradient(){
        return Math.atan2(end.getY() - begin.getY(), end.getX() - begin.getX());
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
