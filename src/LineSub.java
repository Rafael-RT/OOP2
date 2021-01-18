public class LineSub extends Point1{
    Point1 end;

    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // construct the begin Point
        this.end = new Point1(endX, endY); // construct the end Point
    }

    public LineSub(Point1 begin, Point1 end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point1 getBegin(){
        return new Point1(getX(),getY());
    }

    public void setBegin(Point1 begin){
        begin = new Point1(getX(),getY());
    }

    public Point1 getEnd() {
        return end;
    }

    public void setEnd(Point1 end) {
        this.end = end;
    }

    public int getBeginX(){
        return super.getX();
    }

    public int getBeginY(){
        return super.getY();
    }

    public int getEndX(){
        return end.getX();
    }

    public int getEndY(){
        return end.getY();
    }

    public void setBeginX(int x){
        super.setX(x);
    }

    public void setBeginY(int y){
        super.setY(y);
    }

    public void setBeginXY(int x, int y){
        super.setXY(x,y);
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
        return (int) Math.sqrt(Math.pow(end.getX() - super.getX(), 2) + Math.pow(end.getY() - super.getY(), 2));
    }

    public double getGradient(){
        return Math.atan2(end.getY() - super.getY(), end.getX() - super.getX());
    }

}
