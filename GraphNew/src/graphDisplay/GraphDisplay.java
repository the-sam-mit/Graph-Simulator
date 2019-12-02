/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphDisplay;

import java.awt.BasicStroke;
import java.awt.Color;
import static java.awt.Color.blue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;



/**
 *
 * @author sam_mit
 */
public class GraphDisplay extends javax.swing.JFrame implements ActionListener{

    ArrayList<Vertex> vertices = new ArrayList<>();
    ArrayList<Edge> edges = new ArrayList<>();
    HashMap<Edge, Integer> col = new HashMap<Edge, Integer>();
    Vertex chosenV;
    Edge chosenE;
    Vertex curr, temp = null;
    Vertex v1 = null;
    Vertex v2 = null;
    int factor = 10;
    int mode = -1;
    Boolean drag = false;
    Boolean dragE = false;
    Boolean yes = false;
    ArrayList<Edge> pathP = new ArrayList<>();
    private Ellipse2D.Float ellipse = new Ellipse2D.Float();
    Timer t;
    int xc, xi, xf, yi, yf;
    int index=0, shapeM=-1;
    public GraphDisplay() {
        initComponents();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Modes = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        delVertex = new javax.swing.JTextField();
        butDelVertex = new javax.swing.JButton();
        addVertex = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        verY = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        verName = new javax.swing.JTextField();
        butAddVertex = new javax.swing.JButton();
        butModVertex = new javax.swing.JButton();
        addEdge = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        edgSource = new javax.swing.JTextField();
        butAddEdge = new javax.swing.JButton();
        edgDest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edgWt = new javax.swing.JTextField();
        butModifyEdge = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        seaName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        xVertex = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        butSearchVertex = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        srcEdge = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        destEdge = new javax.swing.JTextField();
        butSearchEdge = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        wtEdge = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        FileNameExport = new javax.swing.JTextField();
        butExport = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        FileName = new javax.swing.JTextField();
        Import = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        srcDelete = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        destDelete = new javax.swing.JTextField();
        butDeleteEdge = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tVertex = new javax.swing.JTextField();
        fVertex = new javax.swing.JTextField();
        butDijkstra = new javax.swing.JButton();
        textPath = new javax.swing.JTextField();
        butClear = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        DeleteV = new javax.swing.JButton();
        butVertexMode = new javax.swing.JRadioButton();
        butEdgeMode = new javax.swing.JRadioButton();
        DeleteE = new javax.swing.JButton();
        butModifyEdgeGUI = new javax.swing.JButton();
        varWt = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graph Simulation");
        setSize(new java.awt.Dimension(1327, 745));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        getContentPane().setLayout(flowLayout1);

        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.SystemColor.activeCaption));
        jPanel9.setForeground(java.awt.SystemColor.activeCaption);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Delete Vertex"));

        jLabel7.setText("Name");

        butDelVertex.setText("Delete Vertex");
        butDelVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDelVertexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(2, 2, 2)
                .addComponent(delVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butDelVertex)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delVertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDelVertex)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addVertex.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Vertex"));

        jLabel1.setText("x");

        jLabel2.setText("y");

        jLabel3.setText("Name");

        butAddVertex.setText("Add Vertex");
        butAddVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddVertexActionPerformed(evt);
            }
        });

        butModVertex.setText("Modify");
        butModVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butModVertexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addVertexLayout = new javax.swing.GroupLayout(addVertex);
        addVertex.setLayout(addVertexLayout);
        addVertexLayout.setHorizontalGroup(
            addVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addVertexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(verName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(verX, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addVertexLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(butModVertex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butAddVertex))
                    .addGroup(addVertexLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verY, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        addVertexLayout.setVerticalGroup(
            addVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addVertexLayout.createSequentialGroup()
                .addGroup(addVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(verName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(verX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(verY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addVertexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butAddVertex)
                    .addComponent(butModVertex)))
        );

        addEdge.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Edge"));

        jLabel4.setText("Source");

        butAddEdge.setText("Add Edge");
        butAddEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddEdgeActionPerformed(evt);
            }
        });

        jLabel6.setText("Weight");

        butModifyEdge.setText("Modify Edge");
        butModifyEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butModifyEdgeActionPerformed(evt);
            }
        });

        jLabel5.setText("Destination");

        javax.swing.GroupLayout addEdgeLayout = new javax.swing.GroupLayout(addEdge);
        addEdge.setLayout(addEdgeLayout);
        addEdgeLayout.setHorizontalGroup(
            addEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEdgeLayout.createSequentialGroup()
                .addGroup(addEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEdgeLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edgSource, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(edgDest, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edgWt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addEdgeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butModifyEdge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butAddEdge)))
                .addContainerGap())
        );
        addEdgeLayout.setVerticalGroup(
            addEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEdgeLayout.createSequentialGroup()
                .addGroup(addEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edgSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edgDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(edgWt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addEdgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butModifyEdge)
                    .addComponent(butAddEdge))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Vertex"));

        jLabel8.setText("Name");

        jLabel9.setText("Result :");

        jLabel10.setText("x :");

        jLabel11.setText("y :");

        xVertex.setFocusable(false);

        jTextField2.setFocusable(false);

        butSearchVertex.setText("Search Vertex");
        butSearchVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSearchVertexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(seaName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butSearchVertex)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(seaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(xVertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSearchVertex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Edge"));

        jLabel12.setText("Source");

        jLabel13.setText("Destination");

        butSearchEdge.setText("Search Edge");
        butSearchEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSearchEdgeActionPerformed(evt);
            }
        });

        jLabel14.setText("Weight");

        wtEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtEdgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(srcEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wtEdge)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addComponent(destEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(butSearchEdge)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(srcEdge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(destEdge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butSearchEdge)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(wtEdge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Export"));

        butExport.setText("Export");
        butExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(FileNameExport, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butExport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FileNameExport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butExport))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Import"));
        jPanel5.setToolTipText("");

        FileName.setToolTipText("");

        Import.setText("Import");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(FileName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Import)
                .addGap(94, 94, 94))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(FileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Import))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Delete Edge"));

        jLabel15.setText("Source");

        srcDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcDeleteActionPerformed(evt);
            }
        });

        jLabel16.setText("Dest");

        butDeleteEdge.setText("Delete Edge");
        butDeleteEdge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteEdgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srcDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(1, 1, 1)
                .addComponent(destDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butDeleteEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(srcDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(destDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDeleteEdge))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Dijkstra"));

        jLabel17.setText("Source");

        jLabel18.setText("Destination");

        tVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tVertexActionPerformed(evt);
            }
        });

        fVertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fVertexActionPerformed(evt);
            }
        });

        butDijkstra.setText("Dijkstra ");
        butDijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDijkstraActionPerformed(evt);
            }
        });

        butClear.setText("Clear");
        butClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textPath, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addGap(4, 4, 4)
                        .addComponent(fVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(2, 2, 2)
                        .addComponent(tVertex, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butDijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butClear)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(fVertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(tVertex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butDijkstra)
                    .addComponent(butClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textPath, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("GUI"));

        DeleteV.setText("Delete Vertex");
        DeleteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteVActionPerformed(evt);
            }
        });

        Modes.add(butVertexMode);
        butVertexMode.setText("Vertex Mode");
        butVertexMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVertexModeActionPerformed(evt);
            }
        });

        Modes.add(butEdgeMode);
        butEdgeMode.setText("Edge Mode");
        butEdgeMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEdgeModeActionPerformed(evt);
            }
        });

        DeleteE.setText("Delete Edge");
        DeleteE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEActionPerformed(evt);
            }
        });

        butModifyEdgeGUI.setText("Modify Edge");
        butModifyEdgeGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butModifyEdgeGUIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteV, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butVertexMode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(butModifyEdgeGUI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varWt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(butEdgeMode, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteV)
                    .addComponent(butVertexMode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butEdgeMode)
                    .addComponent(varWt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butModifyEdgeGUI)
                    .addComponent(DeleteE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addVertex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEdge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addVertex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addEdge, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butAddVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddVertexActionPerformed
        String name=verName.getText();
        int x,y;
        try{
            x=Integer.parseInt(verX.getText());
            y=Integer.parseInt(verY.getText());
        
        Vertex v1 = new Vertex(name, x, y);
        vertices.add(v1);
        } 
        catch(NumberFormatException e){   
            String msg1 = "Input must be whole numbers and not even decimal numbers.\n ";
            JOptionPane.showMessageDialog(this, msg1,"Input Error", JOptionPane.ERROR_MESSAGE);
        }
        repaint();
        System.out.println("Vertex added");
    }//GEN-LAST:event_butAddVertexActionPerformed

    private void butAddEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddEdgeActionPerformed
        String src=edgSource.getText();
        String dest=edgDest.getText();
        double wt=Double.parseDouble(edgWt.getText());
        Vertex s1, d1;
        int s2=-1, d2=-1, k=0;
        for(Vertex j : vertices){
            if(j.getName().compareTo(src)==0){
                s2 = k;
            }
            if(j.getName().compareTo(dest)==0){
                d2 = k;
            }
            k++;
        }
        if(s2==-1 || d2==-1){
          JOptionPane.showMessageDialog(this, "Entered vertices does not exist.\n","Input Error", JOptionPane.ERROR_MESSAGE);  
          return;
        }
        s1 = vertices.get(s2);
        d1 = vertices.get(d2);
        Edge e1 = new Edge(s1, d1, wt);
        col.put(e1, 0);
        edges.add(e1);
        repaint();
        System.out.println("Edge added");
    }//GEN-LAST:event_butAddEdgeActionPerformed

    private void butDelVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDelVertexActionPerformed
        String name = delVertex.getText();
        int d1=-1,k=0;
        for(Vertex itr:vertices){ 
            String s1 = (itr).getName(); 
            if(s1.compareTo(name)==0){
                d1=k;
            }
            k++;
        } 
        if(d1==-1){
            JOptionPane.showMessageDialog(this, "Entered vertex does not exist.\n","Input Error", JOptionPane.ERROR_MESSAGE);  
            return;
        }
        vertices.remove(d1);
        ArrayList <Edge> temp = new ArrayList<>();
        for(Edge ite:edges)
        { 
            String s1 = ite.getSource().getName();
            String s2 = ite.getDestination().getName();
            if(s1.compareTo(name)!=0 && s2.compareTo(name)!=0){
                temp.add(ite);
            }
        }
        edges = temp;
        repaint();
        System.out.println(vertices);
        System.out.println("Vertex deleted " + name);
    }//GEN-LAST:event_butDelVertexActionPerformed

    private void butSearchVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSearchVertexActionPerformed
        String name = seaName.getText();
        Boolean flag = false;
        for(Vertex i:vertices){
            if(i.getName().compareTo(name)==0){
                xVertex.setText(String.valueOf(i.getX()));
                jTextField2.setText(String.valueOf(i.getY()));
                flag = true;
                break;
            }
        }
        if(flag == false){
            JOptionPane.showMessageDialog(this, "Vertex does not exist.\n","Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("Vertex searched");
    }//GEN-LAST:event_butSearchVertexActionPerformed

    private void butModVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butModVertexActionPerformed
        String name=verName.getText();
        int x,y;
        try{
            x=Integer.parseInt(verX.getText());
            y=Integer.parseInt(verY.getText());
        } 
        catch(NumberFormatException e){   
            String msg1 = "Input must be whole numbers.\n ";
            String msg2 = "Your decimal value " + verX.getText() + " and "+ verY.getText() + " will be truncated.\n ";
            JOptionPane.showMessageDialog(this, msg1+msg2,"Input Error", JOptionPane.ERROR_MESSAGE);
            x= (int)Double.parseDouble(verX.getText());
            verX.setText(Integer.toString(x));      
            y= (int)Double.parseDouble(verY.getText());
            verY.setText(Integer.toString(y));
        }
        Boolean flag = false;
        for(Vertex i:vertices){
            if(i.getName().compareTo(name)==0){
                i.setX(x);
                i.setY(y);
                flag = true;
                break;
            }
        }
        if(flag==false){
            String msg1 = "No such vertex exists\n";
            JOptionPane.showMessageDialog(this, msg1, "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList <Edge> temp = new ArrayList<>();
        for(Edge ite:edges)
        { 
            String s1 = ite.getSource().getName();
            String s2 = ite.getDestination().getName();
            if(s1.compareTo(name)!=0 && s2.compareTo(name)!=0){
                temp.add(ite);
            }
            else{
                if(s1.compareTo(name)==0){
                    temp.add(new Edge(new Vertex(name,x,y),ite.getDestination(),ite.getWeight()));
                }
                else{
                    temp.add(new Edge(ite.getSource(),new Vertex(name,x,y),ite.getWeight()));
                }
            }
        }
        edges = temp;
        repaint();
        System.out.println("Vertex modified");
    }//GEN-LAST:event_butModVertexActionPerformed

    private void butSearchEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSearchEdgeActionPerformed
        String src = srcEdge.getText();
        String dest = destEdge.getText();
        Boolean flag = false;
        for(Edge i:edges){
            if(i.getSource().getName().compareTo(src)==0 && i.getDestination().getName().compareTo(dest)==0){
                wtEdge.setText(String.valueOf((int)i.getWeight()));
                flag = true;
                break;
            }
        }
        if(flag==false){
            JOptionPane.showMessageDialog(this, "Edge does not exist.\n","Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.println("Edge searched");
    }//GEN-LAST:event_butSearchEdgeActionPerformed

    private void butDeleteEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteEdgeActionPerformed
        String src = srcDelete.getText();
        String dest = destDelete.getText();
        ArrayList <Edge> temp = new ArrayList<>();
        for(Edge ite:edges)
        { 
            String s1 = ite.getSource().getName();
            String s2 = ite.getDestination().getName();
            if(s1.compareTo(src)==0 && s2.compareTo(dest)==0){
                continue;
            }
            temp.add(ite);
        }
        edges = temp;
        repaint();
        System.out.println("Edge deleted");
    }//GEN-LAST:event_butDeleteEdgeActionPerformed

    private void butModifyEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butModifyEdgeActionPerformed
        String src=edgSource.getText();
        String dest=edgDest.getText();
        int wt=Integer.parseInt(edgWt.getText());
        Boolean flag = false;
        for(Edge ite:edges)
        { 
            String s1 = ite.getSource().getName();
            String s2 = ite.getDestination().getName();
            if(s1.compareTo(src)==0 && s2.compareTo(dest)==0){
                ite.setWeight(wt);
                flag = true;
                break;
            }
        }
        if(flag == false){
            JOptionPane.showMessageDialog(this, "Entered edge does not exist.\n","Input Error", JOptionPane.ERROR_MESSAGE);  
            return;
        }
        repaint();
        System.out.println("Edge modified");
    }//GEN-LAST:event_butModifyEdgeActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
        Scanner scanner = null;
        try{
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            FileName.setText(filename);
            Path path = Paths.get(filename);
            
            try {
                scanner = new Scanner(path);
            } catch (IOException ex) {
                Logger.getLogger(GraphDisplay.class.getName()).log(Level.SEVERE, null, ex);
            }
            ArrayList<String> lines = new ArrayList<>();
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                lines.add(line);
            }
            int i;
            int n1 = Integer.parseInt(lines.get(0));
            for(i=1;i<=n1;i++){
                String[] strArray = lines.get(i).split(" ");
                String name=strArray[0];
                int x=Integer.parseInt(strArray[1]);
                int y=Integer.parseInt(strArray[2]);
                Vertex v1 = new Vertex(name, x, y);
                vertices.add(v1);
            }
            int n2 = Integer.parseInt(lines.get(n1+1));
            for(i=n1+2;i<=n1+n2+1;i++){
                String[] strArray = lines.get(i).split(" ");
                String src=strArray[0];
                String dest=strArray[1];
                double wt=Double.parseDouble(strArray[2]);
                Vertex s1, d1;
                int s2=0, d2=0, k=0;
                for(Vertex j : vertices){
                    if(j.getName().compareTo(src)==0){
                        s2 = k;
                    }
                    if(j.getName().compareTo(dest)==0){
                        d2 = k;
                    }
                    k++;
                }
                s1 = vertices.get(s2);
                d1 = vertices.get(d2);
                Edge e1 = new Edge(s1, d1, wt);
                edges.add(e1);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error in input file.\n","Input File Error", JOptionPane.ERROR_MESSAGE);
            scanner.close();
            return;
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "Select an appropriate text file.\n","Input File Error", JOptionPane.ERROR_MESSAGE);
            scanner.close();
            return;
        }
        System.out.println(edges);

        repaint();
        System.out.println("File Imported");
        scanner.close();
    }//GEN-LAST:event_ImportActionPerformed

    class SortingVertex implements Comparator<Vertex>{
        public int compare(Vertex v1, Vertex v2){
            int vertexCompare = v1.getName().compareTo(v2.getName());
            return vertexCompare;
        }
    }
    
    class SortingEdge implements Comparator<Edge>{
        public int compare(Edge edg1, Edge edg2){
            int vertexCompare = edg1.getSource().compareTo(edg2.getSource());
            int destCompare = edg1.getDestination().compareTo(edg2.getDestination());
            if(vertexCompare == 0){
                return destCompare;
            }
            return vertexCompare;
        }
    }
    
    private void butExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExportActionPerformed
        try{
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            FileNameExport.setText(filename);
            Collections.sort(vertices, new SortingVertex());
            Collections.sort(edges, new SortingEdge());
            try (FileWriter writer = new FileWriter(filename);
                BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(vertices.size() + "\n");
                for(Vertex i: vertices){
                    bw.write(i.getName() + " " + i.getX() + " " + i.getY() + "\n");
                }
                bw.write(edges.size() + "\n");
                for(Edge i: edges){
                    bw.write(i.getSource() + " " + i.getDestination() + " " + (int)i.getWeight() + "\n");
                }
            } 
            catch (IOException e) {
                System.err.format("IOException: %s%n", e);
            }
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "Select an appropriate text file.\n","Output File Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_butExportActionPerformed

    private void butDijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDijkstraActionPerformed
        String src=fVertex.getText();
        String dest=tVertex.getText();
        Vertex from_vertex = null, to_vertex = null;
        for(Vertex i: vertices){
            if(i.getName().compareTo(src)==0){
                from_vertex = i;
                System.out.println("Src found: "+from_vertex.getName());
            }
            if(i.getName().compareTo(dest)==0){
                to_vertex = i;
                System.out.println("Dest found: "+to_vertex.getName());
            }
        }
        Dijkstra(from_vertex, to_vertex);
    }//GEN-LAST:event_butDijkstraActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
//          showStatus("mouse Dragged to " + p);
        if(mode==0){
            curr = null;
            int x = evt.getX()/factor, y = evt.getY()/factor;
            if(x>=1000 || y>=1000){
                System.out.println("Halt");
                System.exit(0);
            }
            drag = true; 
            if (drag) {
                for(Vertex i: vertices){

                    if(i.getName().compareTo(chosenV.getName())==0){
                        i.setX(x);
                        i.setY(y);
                        break;
                    }    
                }
                System.out.println("Dragging");
                repaint();
            }
            System.out.println("Dragged");
        }
        else{
            chosenE = null;
            int x = evt.getX()/factor, y = evt.getY()/factor;
            if(x>=1000 || y>=1000){
                System.out.println("Halt");
                System.exit(0);
            }
            dragE = true; 
            if (dragE) {
                System.out.println("Dragging");
                temp.setX(x);
                temp.setY(y);
                repaint();
            }
            System.out.println("Dragged"); 
        }
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       int x = evt.getX(), y = evt.getY();
       chosenV = null;
       for(Vertex i: vertices){
            if(i.getX()*factor-30<=x && i.getX()*factor+30>=x && i.getY()*factor-30<=y && i.getY()*factor+30>=y ){
                chosenV = i;
                System.out.println("Found");
                break;
            }
        }
       if(mode == 1){
            temp = new Vertex("Sample",x,y);
            edges.add(new Edge(chosenV, temp, 0));
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        if(mode == 0){
            drag = false;
            System.out.println("Released");
            curr = null;
        }
        else{
            Boolean ok = false;
            int x = evt.getX()/factor, y = evt.getY()/factor;
            if(x>=1000 || y>=1000){
                System.out.println("Halt");
                System.exit(0);
            }
            for(Vertex i: vertices){
                if(Math.abs(i.getX()-x)<=3 && Math.abs(i.getY()-y)<=3){
                    edges.get(edges.size()-1).setDestination(i);
                    ok = true;
                    break;
                }    
            }
            if(ok==false){
                edges.remove(edges.size()-1);
            }
            else if(dragE){
                String t2 = JOptionPane.showInputDialog("Edge Weight");
                try{
                    edges.get(edges.size()-1).setWeight(Integer.parseInt(t2));
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(this, "Input Error.","Error", JOptionPane.ERROR_MESSAGE);  
            }
                dragE = false;
            }
            dragE = false;
            repaint();
        }
    }//GEN-LAST:event_formMouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       if(mode == 0){
           int x = evt.getX(), y = evt.getY();
            curr = null; 
            for(Vertex i: vertices){
                 if(i.getX()*factor-30<=x && i.getX()*factor+30>=x && i.getY()*factor-30<=y && i.getY()*factor+30>=y ){
                     chosenV = i;
                     curr=i;
                    System.out.println("Chosen");
                    break;
                 }
            }
            if(curr==null){
                String name;
                name = JOptionPane.showInputDialog("Vertex Name");
                vertices.add(new Vertex(name, x/factor, y/factor));
                repaint();
                return;
            }
       }
       else{
            chosenE=null;
            int x = evt.getX(), y = evt.getY();
            for(Vertex i: vertices){
                 if(i.getX()*factor-10<=x && i.getX()*factor+10>=x && i.getY()*factor-10<=y && i.getY()*factor+10>=y ){
                    if(v1==null) v1 = i;
                    else if(v2 == null) v2 = i;
                    System.out.println("Chosen first:"+i.getName());
                    break;
                 }
            }
            if(v1!=null && v2!=null){
//                System.out.println(v1.getName()+" BHI "+v2.getName());
                for(Edge i: edges){
                    if(i.getSource()==v1 && i.getDestination()==v2) {chosenE=i;break;}
                }
            }
       }
    }//GEN-LAST:event_formMouseClicked

    private void DeleteVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteVActionPerformed
        if(curr==null){
            JOptionPane.showMessageDialog(this, "Select a vertex first.\n","Error", JOptionPane.ERROR_MESSAGE);  
            return;
        }
        String name = curr.getName();
        int d1=-1,k=0;
        for(Vertex itr:vertices){ 
            String s1 = (itr).getName(); 
            if(s1.compareTo(name)==0){
                d1=k;
            }
            k++;
        } 
        if(d1==-1){
            JOptionPane.showMessageDialog(this, "Entered vertex does not exist.\n","Input Error", JOptionPane.ERROR_MESSAGE);  
            return;
        }
        vertices.remove(d1);
        ArrayList <Edge> temp = new ArrayList<>();
        for(Edge ite:edges)
        { 
            String s1 = ite.getSource().getName();
            String s2 = ite.getDestination().getName();
            if(s1.compareTo(name)!=0 && s2.compareTo(name)!=0){
                temp.add(ite);
            }
        }
        edges = temp;
        repaint();
        System.out.println(vertices);
        System.out.println("Vertex deleted " + name);
    }//GEN-LAST:event_DeleteVActionPerformed

    private void butVertexModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVertexModeActionPerformed
        mode = 0;
    }//GEN-LAST:event_butVertexModeActionPerformed

    private void butEdgeModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEdgeModeActionPerformed
        mode = 1;
    }//GEN-LAST:event_butEdgeModeActionPerformed

    private void DeleteEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEActionPerformed
        if(chosenE==null){
            v1=null;
            v2=null;
            JOptionPane.showMessageDialog(this, "Select a edge first by selecting connecting vertices.\n","Error", JOptionPane.ERROR_MESSAGE);  
            return;
        }
        String src = chosenE.getSource().getName();
        String dest = chosenE.getDestination().getName();
        ArrayList <Edge> temp = new ArrayList<>();
        for(Edge ite:edges)
        { 
            String s1 = ite.getSource().getName();
            String s2 = ite.getDestination().getName();
            if(s1.compareTo(src)==0 && s2.compareTo(dest)==0){
                continue;
            }
            temp.add(ite);
        }
        edges = temp;
        repaint();
        System.out.println("Edge deleted");
    }//GEN-LAST:event_DeleteEActionPerformed

    private void butModifyEdgeGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butModifyEdgeGUIActionPerformed
        if(chosenE==null){
            v1=null;
            v2=null;
            JOptionPane.showMessageDialog(this, "Select a edge first by selecting connecting vertices.\n","Error", JOptionPane.ERROR_MESSAGE);  
            return;
        }
        int wt=Integer.parseInt(varWt.getText());
        String src = chosenE.getSource().getName();
        String dest = chosenE.getDestination().getName();
        System.out.println(edges);
        for(Edge ite:edges)
        { 
            String s1 = ite.getSource().getName();
            String s2 = ite.getDestination().getName();
            if(s1.compareTo(src)==0 && s2.compareTo(dest)==0){
                ite.setWeight(wt);
                break;
            }
        }
        repaint();
        System.out.println("Edge modified");
    }//GEN-LAST:event_butModifyEdgeGUIActionPerformed

    private void butClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearActionPerformed
        index=0;
        yes=false;
        textPath.setText(" ");
        fVertex.setText(" ");
        tVertex.setText(" ");

        for(Edge i:pathP){
            col.put(i, 0);
            i.getSource().setVisited(false);
            i.getDestination().setVisited(false);
        }
        repaint();
    }//GEN-LAST:event_butClearActionPerformed

    private void srcDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_srcDeleteActionPerformed

    private void tVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tVertexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tVertexActionPerformed

    private void fVertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fVertexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fVertexActionPerformed

    private void wtEdgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wtEdgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wtEdgeActionPerformed
    
    void setEllipse(double x, double x1, double y1, double x2, double y2){
        double y = y1 + ((y2-y1)*(x-x1)/(x2-x1));
        ellipse.setFrame(xc, y, 30, 30);
        System.out.println("Thread= " + xc + " " + y + " "+ xf);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D gg = (Graphics2D) g;
        RenderingHints ac = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        ac.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        gg.setRenderingHints(ac);
        if(yes==true){
            gg.setColor(blue);
            gg.fill(ellipse);
            for(Edge i:pathP){
                gg.setColor(Color.BLACK);
                Vertex src = (i.getSource());
                Vertex dest = (i.getDestination());
                int x1, y1, x2, y2;
                int radius = 30;
                x1=src.getX()*factor;
                y1=src.getY()*factor;
                x2=dest.getX()*factor;
                y2=dest.getY()*factor;
                gg.setStroke(new BasicStroke(3));
                gg.drawLine(x1+(radius/2)-5,y1+(radius/2)+5,x2+(radius/2)-5,y2+(radius/2)+5); 
                gg.setColor(Color.BLUE);
                radius = 30;
                gg.drawOval(x1,y1,radius,radius);  
                gg.fillOval(x1,y1,radius,radius); 
                gg.setColor(Color.YELLOW);  
                gg.drawString(""+(src.getName()),(x1)+(radius/2)-5,(y1)+(radius/2)+5);
                gg.setColor(Color.BLUE);
                radius = 30;
                x1 = dest.getX()*factor;
                y1 = dest.getY()*factor;
                gg.drawOval(x1,y1,radius,radius);  
                gg.fillOval(x1,y1,radius,radius); 
                gg.setColor(Color.YELLOW);  
                gg.drawString(""+(dest.getName()),(x1)+(radius/2)-5,(y1)+(radius/2)+5);
                gg.drawString(Integer.toString((int) i.getWeight()),(x1+x2)/2,(y1+y2)/2);

            }
            
        }
        
        for (Vertex i:vertices){
            int x1, y1;
            int radius = 30;
            if(i.getVisited()==true){
                continue;
            }
            x1 = i.getX()*factor;
            y1 = i.getY()*factor;
            gg.drawOval(x1,y1,radius,radius);  
            gg.setColor(Color.yellow);  
            gg.fillOval(x1,y1,radius,radius); 
            gg.setColor(Color.BLACK);  
            gg.drawString(""+(i.getName()),(x1)+(radius/2)-5,(y1)+(radius/2)+5);
        }
        
        g.setColor(Color.RED);
        for(Edge i:edges)
        {
            Vertex src = (i.getSource());
            Vertex dest = (i.getDestination());
            int flg = 0;
            if(i.getSource().getVisited()==true && i.getDestination().getVisited()==true){
                 continue;
            }
            int x1, y1, x2, y2;
            int radius = 30;
            x1=src.getX()*factor;
            y1=src.getY()*factor;
            x2=dest.getX()*factor;
            y2=dest.getY()*factor;
            gg.setStroke(new BasicStroke(3));
            gg.drawLine(x1+(radius/2)-5,y1+(radius/2)+5,x2+(radius/2)-5,y2+(radius/2)+5);
            gg.drawString(Integer.toString((int) i.getWeight()),(x1+x2)/2,(y1+y2)/2);
        }
        
       

    }
    
    void print(ArrayList<Edge> path){
        for(Edge i:edges){
            i.getDestination().setVisited(false);
            i.getSource().setVisited(false);
        }
       pathP = path;
       String s="";
       int k=0;
       for(Edge i:path){
           if(k==0){ 
               s+=i.getSource();
               k++;
           }
           s += " -> " + i.getDestination();
           System.out.println(i.getSource() + " " + i.getDestination() + " " + i.getWeight());
           i.getDestination().setVisited(true);
           i.getSource().setVisited(true);
       }
       textPath.setText(s);
       repaint();
    }
    
    void Dijkstra(Vertex from_vertex, Vertex to_vertex){
        index=0;
        yes=true;
        
        xi=from_vertex.getX()*factor;
        yi=from_vertex.getY()*factor;
        try{
            if(from_vertex.getName().compareTo(to_vertex.getName())==0){
                textPath.setText("already on same vertex");
                System.out.println("already on same vertex");
                return;
            }

            HashMap<Vertex, ArrayList<Edge> > graph = new HashMap<Vertex, ArrayList<Edge> >();
            for (Vertex value : vertices){ 
                value.set();
                value.setDistance(Double.MAX_VALUE);
                value.setVisited(false);
            } 
            for(Edge i : edges){
                Vertex vv  = i.source;
                ArrayList<Edge> t1 = graph.get(vv);
                if(t1==null){
                    ArrayList<Edge> a1 = new ArrayList<>();
                    a1.add(i);
                    graph.put(vv, a1);
                }
                else{
                    t1.add(i);
                }
            }
            System.out.println(graph);
            if(graph.get(from_vertex)==null){
                textPath.setText("no path exists");
                System.out.println("no path exists");
                return;
            }
            from_vertex.setDistance(0.0);
            PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
            priorityQueue.add(from_vertex);
            from_vertex.setVisited(true);

            while(!priorityQueue.isEmpty()){
                Vertex currVertex = priorityQueue.poll();
                if(graph.get(currVertex)==null){ 
                    currVertex.setVisited(true);
                      continue;
                  }
                for(Edge i: graph.get(currVertex)){
                    Vertex v = i.destination;
                    if(v.getVisited() == false){
                        double newDist = currVertex.getDistance() + i.getWeight();
                        if(newDist < v.getDistance()){
                            priorityQueue.remove(v);
                            v.setDistance(newDist);
                            v.setParent(i);
                            priorityQueue.add(v);
                        }
                    }
                }
                currVertex.setVisited(true);
            }
            ArrayList<Edge> path = new ArrayList<>();
            Vertex i = to_vertex;
                while(i.getParent()!=null){
                    path.add((Edge) i.getParent());
                    i = i.getParent().source;
            }
            if(path.size()==0 || graph.get(from_vertex)==null|| to_vertex.getDistance()==Double.MAX_VALUE){
                textPath.setText("no path exists");
                System.out.println("no path exists");
                return;
            }
            t = new Timer(50,this);
            t.start();
            Collections.reverse(path);
            print(path);
            xf=path.get(0).getDestination().getX()*factor;
            yf=path.get(0).getDestination().getY()*factor;
            xc=xi;
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "Enter correct details.\n","Error", JOptionPane.ERROR_MESSAGE);  
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphDisplay().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteE;
    private javax.swing.JButton DeleteV;
    private javax.swing.JTextField FileName;
    private javax.swing.JTextField FileNameExport;
    private javax.swing.JButton Import;
    private javax.swing.ButtonGroup Modes;
    private javax.swing.JPanel addEdge;
    private javax.swing.JPanel addVertex;
    private javax.swing.JButton butAddEdge;
    private javax.swing.JButton butAddVertex;
    private javax.swing.JButton butClear;
    private javax.swing.JButton butDelVertex;
    private javax.swing.JButton butDeleteEdge;
    private javax.swing.JButton butDijkstra;
    private javax.swing.JRadioButton butEdgeMode;
    private javax.swing.JButton butExport;
    private javax.swing.JButton butModVertex;
    private javax.swing.JButton butModifyEdge;
    private javax.swing.JButton butModifyEdgeGUI;
    private javax.swing.JButton butSearchEdge;
    private javax.swing.JButton butSearchVertex;
    private javax.swing.JRadioButton butVertexMode;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField delVertex;
    private javax.swing.JTextField destDelete;
    private javax.swing.JTextField destEdge;
    private javax.swing.JTextField edgDest;
    private javax.swing.JTextField edgSource;
    private javax.swing.JTextField edgWt;
    private javax.swing.JTextField fVertex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField seaName;
    private javax.swing.JTextField srcDelete;
    private javax.swing.JTextField srcEdge;
    private javax.swing.JTextField tVertex;
    private javax.swing.JTextField textPath;
    private javax.swing.JTextField varWt;
    private javax.swing.JTextField verName;
    private javax.swing.JTextField verX;
    private javax.swing.JTextField verY;
    private javax.swing.JTextField wtEdge;
    private javax.swing.JTextField xVertex;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setEllipse(xc, xi, yi, xf, yf);
        if(xc<xf) xc+=6.25;
        else xc-=6.25;
        System.out.println(xc + " " + xi + " "+ xf);
        repaint();
         if((xi<=xf && xc>=xf) || (xi>=xf && xc<=xf)){
             index++;
             index=index%pathP.size();
            if(index>pathP.size()){
//                t.stop();
                System.out.println("Stop");
                index=0;
//                ellipse.setFrame(3000, 3000, 30, 30);
            }
            else{
                xi=pathP.get(index).getSource().getX()*factor;
                yi=pathP.get(index).getSource().getY()*factor;
                xf=pathP.get(index).getDestination().getX()*factor;
                yf=pathP.get(index).getDestination().getY()*factor;
                xc=xi;
    
                System.out.println(pathP.get(index).getDestination() + " " + pathP.get(index).getSource());
            }
        }
                  
    }

  
}

//Reference: https://www.geeksforgeeks.org line No.909-934
//Reference: https://www.journaldev.com/ line No.1058-1071
