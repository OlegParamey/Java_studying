void main() {

    Point p1 = new Point(-2, 3);
    Point p2 = new Point(4, 6);
    Line o1 = new Line(p1, p2);
    System.out.print("Length: " + o1.length() + "\n");
    Line o2 = new Line(-5, 2, 1, 6);
    System.out.print("Length: " + o2.length() + "\n");
    o2.setP2(0,10);
    System.out.print("Length: " + o2.length() + "\n");
    o1.setP1(-2, 3); o1.setP2(4,-9);
    Point center = o1.center();
    center.display();

}
