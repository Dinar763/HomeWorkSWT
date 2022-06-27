package FirstHW;

public class ClassTestHelper {
    public static void main(String[] args) {
        Point point1 = new Point(3.0, 4.0);
        Point point2 = new Point(5.0, 6.0);

        System.out.println(distance(point1,point2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() -p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}
