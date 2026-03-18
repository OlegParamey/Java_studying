public class Line {
    private Point p1, p2;

    public Line (Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line (int x1, int y1, int x2, int y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public void setP1(double x, double y){
        this.p1 = new Point(x,y);
    }
    public void setP2(double x, double y){
        this.p2 = new Point(x,y);
    }

    public double length(){
        if (p1 == null || p2 == null) {
            return 0;
        }
        double d = Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));
        return d;

    }

    public Point center() {
        double cx = (p1.getX() + p2.getX()) / 2.0;
        double cy = (p1.getY() + p2.getY()) / 2.0;
        return new Point(cx, cy);
    }
}
