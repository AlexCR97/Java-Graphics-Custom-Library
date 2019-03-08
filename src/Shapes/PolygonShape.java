package Shapes;

import java.util.ArrayList;

public class PolygonShape extends Shape {
    
    private PolygonShape() {
        this.points = new ArrayList<>();
    }
    
    public static PolygonShape createPolygon(ArrayList<Point> vertices) {
        PolygonShape polygon = new PolygonShape();
        
        for (int i = 0; i < vertices.size(); i++) {
            int j = wrap(i + 1, 0, vertices.size() - 1);
            
            Point p1 = vertices.get(i);
            Point p2 = vertices.get(j);
            
            LineShape line = LineShape.DDA(p1, p2);
            polygon.addPoints(line.getPoints());
        }
        
        return polygon;
    }
    
    private static int wrap(int value, int min, int max) {
        if (value > max)
            return min;
        if (value < min)
            return max;
        return value;
    }
    
}
