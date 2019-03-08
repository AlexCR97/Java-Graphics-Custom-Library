package Shapes;

import java.util.ArrayList;

public class Shape {
    
    protected ArrayList<Point> points;
    
    protected Shape() {
        points = new ArrayList<>();
    }
    
    public void addPoint(Point p) {
        this.points.add(p);
    }
    
    public void addPoints(ArrayList<Point> points) {
        for (Point p : points)
            addPoint(p);
    }
    
    public void clearPoints() {
        this.points.clear();
    }
    
    public ArrayList<Point> getPoints() {
        return this.points;
    }
    
    @Override
    public String toString() {
        String s = "";
        
        for (Point p : this.points)
            s += p.toString() + "\n";
        
        return s;
    }
    
}
