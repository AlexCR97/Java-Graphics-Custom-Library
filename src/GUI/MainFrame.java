package GUI;

import Shapes.LineShape;
import Shapes.Point;
import Shapes.Shape;
import Shapes.PolygonShape;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    private final String ALGORITHM_LINE_EQUATION = "Line Equation";
    private final String ALGORITHM_DDA = "DDA";
    private final String ALGORITHM_BRESENHAM = "Bresenham";
    
    public MainFrame() {
        initComponents();
        
        this.jComboBoxAlgorithm.removeAllItems();
        this.jComboBoxAlgorithm.addItem(ALGORITHM_LINE_EQUATION);
        this.jComboBoxAlgorithm.addItem(ALGORITHM_DDA);
        this.jComboBoxAlgorithm.addItem(ALGORITHM_BRESENHAM);
        
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gridPanel = new GUI.GridPanel();
        jTextFieldX1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldY1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldY2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldX2 = new javax.swing.JTextField();
        jComboBoxAlgorithm = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePoints = new javax.swing.JTable();
        jButtonCalculate = new javax.swing.JButton();
        jSliderScale = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDx = new javax.swing.JTextField();
        jTextFieldDy = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonReadFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 800));
        setMinimumSize(new java.awt.Dimension(1100, 800));

        javax.swing.GroupLayout gridPanelLayout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(gridPanelLayout);
        gridPanelLayout.setHorizontalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        gridPanelLayout.setVerticalGroup(
            gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTextFieldX1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("x1");

        jTextFieldY1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("y1");

        jTextFieldY2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("y2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("x2");

        jTextFieldX2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jComboBoxAlgorithm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxAlgorithm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTablePoints.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTablePoints.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x", "y", "x", "y"
            }
        ));
        jScrollPane1.setViewportView(jTablePoints);

        jButtonCalculate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCalculate.setText("Calculate");
        jButtonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculateActionPerformed(evt);
            }
        });

        jSliderScale.setMajorTickSpacing(1);
        jSliderScale.setMaximum(10);
        jSliderScale.setMinimum(1);
        jSliderScale.setMinorTickSpacing(1);
        jSliderScale.setPaintLabels(true);
        jSliderScale.setPaintTicks(true);
        jSliderScale.setSnapToTicks(true);
        jSliderScale.setValue(5);
        jSliderScale.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderScaleStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Point 1");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Point 2");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Algorithm");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Scale");

        jTextFieldM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldM.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("m");

        jTextFieldDx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldDx.setEnabled(false);

        jTextFieldDy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldDy.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("dx");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("dy");

        jButtonReadFile.setText("Read File");
        jButtonReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jComboBoxAlgorithm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSliderScale, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(jButtonCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldX1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(jTextFieldX2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldY1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldY2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldDx, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDy, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jButtonReadFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSliderScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCalculate)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldDx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonReadFile)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculateActionPerformed
        this.gridPanel.clearShapes();
        this.clearTable();
        
        float x1;
        float y1;
        float x2;
        float y2;
        
        try {
            x1 =  Float.parseFloat(this.jTextFieldX1.getText());
            y1 =  Float.parseFloat(this.jTextFieldY1.getText());
            x2 =  Float.parseFloat(this.jTextFieldX2.getText());
            y2 =  Float.parseFloat(this.jTextFieldY2.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "You must enter all the data!", "Calculation error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        LineShape line = null;
        
        String algorithm = (String) this.jComboBoxAlgorithm.getSelectedItem();
        switch (algorithm) {
            case ALGORITHM_LINE_EQUATION:
                line = LineShape.lineEquation(p1, p2);
                break;
                
            case ALGORITHM_DDA:
                line = LineShape.DDA(p1, p2);
                break;

            case ALGORITHM_BRESENHAM:
                line = LineShape.bresenham(p1, p2);
                break;
                
            default:
                return;
        }
        
        float dx = Math.abs(x2 - x1);
        float dy = Math.abs(y2 - y1);
        float m = dy / dx;
        
        this.jTextFieldDx.setText(String.valueOf(dx));
        this.jTextFieldDy.setText(String.valueOf(dy));
        this.jTextFieldM.setText(String.valueOf(m));
        
        this.gridPanel.addShape(line);
        this.gridPanel.repaint();
        this.fillTable(line);
    }//GEN-LAST:event_jButtonCalculateActionPerformed

    private void jSliderScaleStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderScaleStateChanged
        int scale = this.jSliderScale.getValue();
        this.gridPanel.setScale(scale);
        this.gridPanel.repaint();
    }//GEN-LAST:event_jSliderScaleStateChanged

    private void jButtonReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadFileActionPerformed
        String path = getFilePath();
        ArrayList<String> lines = readFile(path);
        
        HashMap<Float, ArrayList<Point>> verticesMap = new HashMap<>();
        for (String s : lines) {
            String[] data = s.split(" ");
            
            float x = Float.parseFloat(data[0]);
            float y = Float.parseFloat(data[1]);
            float i = Float.parseFloat(data[2]);
            
            if (!verticesMap.containsKey(i))
                verticesMap.put(i, new ArrayList<>());
                
            verticesMap.get(i).add(new Point(x, y));
        }
        
        for (HashMap.Entry<Float, ArrayList<Point>> entry : verticesMap.entrySet()) {
            ArrayList<Point> points = entry.getValue();
            PolygonShape p = PolygonShape.createPolygon(points);
            this.gridPanel.addShape(p);
        }
        this.gridPanel.repaint();
    }//GEN-LAST:event_jButtonReadFileActionPerformed
    
    private void clearFields() {
        this.jTextFieldX1.setText("");
        this.jTextFieldY1.setText("");
        this.jTextFieldX2.setText("");
        this.jTextFieldY2.setText("");
    }
    
    private void clearTable() {
        JTable table = this.jTablePoints;
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
    }
    
    private void fillTable(Shape s) {
        JTable table = this.jTablePoints;
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        
        for (Point p : s.getPoints()) {
            float x = p.x;
            float y = p.y;
            int xRounded = Math.round(x);
            int yRounded = Math.round(y);
            
            tableModel.addRow(new Object[] {x, y, xRounded, yRounded});
        }
    }
    
    public String getFilePath() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
        chooser.setFileFilter(filter);
        
        int returnValue = chooser.showOpenDialog(this);
        if (returnValue != JFileChooser.APPROVE_OPTION)
            return null;
        
        return chooser.getSelectedFile().getAbsolutePath();
    }
    
    public ArrayList<String> readFile(String path) {
        ArrayList<String> lines = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line;
            while ((line = br.readLine()) != null)
                lines.add(line);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        return lines;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.GridPanel gridPanel;
    private javax.swing.JButton jButtonCalculate;
    private javax.swing.JButton jButtonReadFile;
    private javax.swing.JComboBox<String> jComboBoxAlgorithm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSliderScale;
    private javax.swing.JTable jTablePoints;
    private javax.swing.JTextField jTextFieldDx;
    private javax.swing.JTextField jTextFieldDy;
    private javax.swing.JTextField jTextFieldM;
    private javax.swing.JTextField jTextFieldX1;
    private javax.swing.JTextField jTextFieldX2;
    private javax.swing.JTextField jTextFieldY1;
    private javax.swing.JTextField jTextFieldY2;
    // End of variables declaration//GEN-END:variables
}
