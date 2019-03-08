package Shapes;

public class LineShape extends Shape {
    
    protected LineShape() {
        super();
    }
    
    public static LineShape lineEquation(Point p1, Point p2) {
        LineShape line = new LineShape();
        
        float dx = p2.x - p1.x;
        float dy = p2.y - p1.y;
        
        line.addPoint(new Point(p1.x, p1.y));
        
        if (Math.abs(dx) > Math.abs(dy)) {
            float m = dy / dx;
            float b = p1.y - (m * p1.x);
            
            dx = Math.signum(dx);
            
            while (p1.x != p2.x) {
                p1.x += dx;
                p1.y = (m * p1.x) + b;
                line.addPoint(new Point(p1.x, p1.y));
            }
        } else if (dy != 0) {
            float m = dx / dy;
            float b = p1.x - (m * p1.y);
            
            dy = Math.signum(dy);
            
            while (p1.y != p2.y) {
                p1.y += dy;
                p1.x = (m * p1.y) + b;
                line.addPoint(new Point(p1.x, p1.y));
            }
        }
        return line;
    }
    
    public static LineShape DDA(Point p1, Point p2) {
        LineShape line = new LineShape();
        
        float dx = p2.x - p1.x;
        float dy = p2.y - p1.y;
        
        float x = p1.x;
        float y = p1.y;
        
        float step = (Math.abs(dx) > Math.abs(dy))? Math.abs(dx) : Math.abs(dy);
        
        float xStep = dx / step;
        float yStep = dy / step;
        
        for (int i = 0; i <= step; i++) {
            line.addPoint(new Point(x, y));
            x += xStep;
            y += yStep;
        }
        return line;
    }
    
    public static LineShape bresenham(Point p1, Point p2) {
        LineShape line = new LineShape();
        
        float dx = p2.x - p1.x;
        float dy = p2.y - p1.y;
        
        float xStep;
        float yStep;
        
        if (dx < 0) {
            dx = -dx;
            xStep = -1;
        } else
            xStep = 1;
        
        if (dy < 0) {
            dy = -dy;
            yStep = -1;
        } else
            yStep = 1;
        
        float x = p1.x;
        float y = p1.y;
        
        line.addPoint(new Point(x, y));
        
        if (dx > dy) {
            float p = (2 * dy) - dx;
            float stepE = 2 * dy;
            float stepNE = 2 * (dy - dx);
            
            while (x != p2.x) {
                x += xStep;
                if (p < 0)
                    p += stepE;
                else {
                    y += yStep;
                    p += stepNE;
                }
                line.addPoint(new Point(x, y));
            }
        } else {
            float p = (2 * dx) - dy;
            float stepE = 2 * dx;
            float stepNE = 2 * (dx - dy);
            
            while (y != p2.y) {
                y += yStep;
                if (p < 0)
                    p += stepE;
                else {
                    x += xStep;
                    p += stepNE;
                }
                line.addPoint(new Point(x, y));
            }
        }
        return line;
    }
}
