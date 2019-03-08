package Shapes;

public class Point {
    
    public float x;
    public float y;
    
    public Point() {}
    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }
    
}
