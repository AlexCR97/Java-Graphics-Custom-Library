package GUI;

import Shapes.Point;
import Shapes.PolygonShape;
import Shapes.Shape;
import Shapes.Transform;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class GridPanel extends javax.swing.JPanel {

    private final Color COLOR_AXIS = Color.GRAY;
    private final Color COLOR_GRID = Color.LIGHT_GRAY;
    private final Color COLOR_SHAPE = new Color(200, 0, 0); // Dark red
    
    private float width;
    private float height;
    
    private int pixelSize = 5;
    private float scale = 5;
    
    private ArrayList<Shape> shapes = new ArrayList<>();
    
    public GridPanel() {
        initComponents();
        
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(0, 0));
        points.add(new Point(10, 0));
        points.add(new Point(10, 10));
        points.add(new Point(0, 10));
        
        PolygonShape s = PolygonShape.createPolygon(points);
        
        //Transform.translate(s, new Point(-10, 5));
        //Transform.scale(s, new Point(0.5f, 0.5f));
        //Transform.rotate(s, -45);
        
        addShape(s);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void addShape(Shape s) {
        this.shapes.add(s);
    }
    
    public void clearShapes() {
        this.shapes.clear();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        this.width = this.getSize().width;
        this.height = this.getSize().height;
        
        //this.drawAxisWithoutOrigin(g);
        this.drawAxisWithOrigin(g);
        this.drawGrid(g);
        this.drawShapes(g);
    }
    
    private void drawAxisWithoutOrigin(Graphics g) {
        g.setColor(COLOR_AXIS);
        
        Point origin = this.getOrigin();
        
        int x1 = 0;
        int y1 = (int) (origin.y * pixelSize * scale);
        int x2 = (int) this.width;
        int y2 = y1;
        g.drawLine(x1, y1, x2, y2);
        
        x1 = (int) (origin.x * pixelSize * scale);
        y1 = 0;
        x2 = x1;
        y2 = (int) this.height;
        g.drawLine(x1, y1, x2, y2);
    }
    
    private void drawAxisWithOrigin(Graphics g) {
        g.setColor(COLOR_AXIS);
        
        Point origin = this.getOrigin();
        
        int x = 0;
        int y = (int) (origin.y * pixelSize * scale);
        int w = (int) (width);
        int h = (int) (pixelSize * scale);

        g.fillRect(x, y, w, h);
        
        x = (int) (origin.x * pixelSize * scale);
        y = 0;
        w = (int) (pixelSize * scale);
        h = (int) height;

        g.fillRect(x, y, w, h);
    }
    
    private void drawGrid(Graphics g) {
        g.setColor(COLOR_GRID);
        
        for (int i = 0; i < width; i++) {
            int x1 = (int) (pixelSize * i * scale);
            int y1 = 0;
            int x2 = x1;
            int y2 = (int) (height);
            g.drawLine(x1, y1, x2, y2);
        }
        
        for (int i = 0; i < height; i++) {
            int x1 = 0;
            int y1 = (int) (pixelSize * i * scale);
            int x2 = (int) width;
            int y2 = y1;
            g.drawLine(x1, y1, x2, y2);
        }
    }
    
    private void drawShape(Graphics g, Shape s) {
        g.setColor(COLOR_SHAPE);
        
        Point origin = this.getOrigin();
        
        for (Point p : s.getPoints()) {
            int w = (int) (pixelSize * scale);
            int h = (int) (pixelSize * scale);
            
            int x = (int) (Math.round(p.x) * w);
            int y = (int) (Math.round(p.y) * h);
            
            int xOffset = (int) (origin.x * w);
            int yOffset = (int) (origin.y * h);
            
            g.fillRect(x + xOffset, -y + yOffset, w, h);
        }
    }
    
    private void drawShapes(Graphics g) {
        for (Shape s : this.shapes)
            drawShape(g, s);
    }
    
    private Point getOrigin() {
        float x = (width  / (pixelSize * scale)) / 2;
        float y = (height / (pixelSize * scale)) / 2;
        
        return new Point((int) x, (int) y);
    }
    
    public void setScale(int scale) {
        this.scale = scale;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
