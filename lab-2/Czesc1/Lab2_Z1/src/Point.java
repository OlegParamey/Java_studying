public class Point {
    private double x, y;

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.println("X = " + this.x + "; Y = " + this.y + ";");
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}
