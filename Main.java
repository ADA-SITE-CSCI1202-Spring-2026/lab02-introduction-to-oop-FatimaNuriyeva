import week04.geometry.Segment;

public class Main {
    public static void main(String[] args) {
        Segment s = new Segment(3.14f, 1.1f, 2.0f, 3.0f);
        System.out.println("x1(p1_x)=" + s.getP1().getX());
        System.out.println("y1(p1_y)=" + s.getP1().getY());
        System.out.println("x2(p2_x)=" + s.getP2().getX());
        System.out.println("y2(p2_y)=" + s.getP2().getY());
    }
    
}

