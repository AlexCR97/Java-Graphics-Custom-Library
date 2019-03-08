package Shapes;

public class Transform {
    
    public static void translate(Shape s, Point factors) {
        for (Point p : s.getPoints()) {
            p.x += factors.x;
            p.y += factors.y;
        }
    }
    
    public static void scale(Shape s, Point factors) {
        for (Point p : s.getPoints()) {
            p.x *= factors.x;
            p.y *= factors.y;
        }
    }
    
    public static void rotate(Shape s, float degrees) {
        float radians = (float) Math.toRadians(degrees);
        float xFactor = (float) Math.cos(radians);
        float yFactor = (float) Math.sin(radians);
        
        for (Point p : s.getPoints()) {
            p.x += Math.toDegrees(xFactor);
            p.y += Math.toDegrees(yFactor);
        }
    }
    
}
