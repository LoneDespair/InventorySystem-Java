/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.awt.Color;

/**
 *
 * @author LoneDespair
 */
public class PurchaseOption extends javax.swing.JPanel {
    Color transparent = new Color(0, 0, 0, 0);

    /**
     * Creates new form PurchaseOption
     */
    public PurchaseOption() {
        initComponents();
        
        //inputConsumer.setBackground(transparent);
        bg.setBackground(new Color(23, 32, 42, 100));
    }
    
    public void open(Product product) {
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new com.mycompany.inventorysystem.InputConsumer();
        iconBg = new javax.swing.JPanel();
        jIconRenderer1 = new com.mycompany.inventorysystem.JIconRenderer();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        coloredButton1 = new com.mycompany.inventorysystem.ColoredButton();
        bg = new com.mycompany.inventorysystem.InputConsumer();

        setBackground(new java.awt.Color(51, 51, 255));
        setLayout(new javax.swing.OverlayLayout(this));

        content.setBackground(new java.awt.Color(252, 249, 190));
        content.setMaximumSize(new java.awt.Dimension(624, 250));
        content.setMinimumSize(new java.awt.Dimension(624, 250));
        content.setPreferredSize(new java.awt.Dimension(624, 250));

        iconBg.setBackground(new java.awt.Color(255, 220, 169));
        iconBg.setMaximumSize(new java.awt.Dimension(200, 200));
        iconBg.setMinimumSize(new java.awt.Dimension(200, 200));
        iconBg.setLayout(new java.awt.CardLayout());
        iconBg.add(jIconRenderer1, "card2");

        jSpinner1.setMaximumSize(new java.awt.Dimension(75, 32767));
        jSpinner1.setMinimumSize(new java.awt.Dimension(75, 22));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Quantity");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Name of product here");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 171, 121));
        jLabel3.setText("₱0.00");

        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Add to cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        coloredButton1.setText("X");
        coloredButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        coloredButton1.setMaximumSize(new java.awt.Dimension(27, 27));
        coloredButton1.setMinimumSize(new java.awt.Dimension(27, 27));
        coloredButton1.setPreferredSize(new java.awt.Dimension(15, 15));
        coloredButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloredButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(iconBg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contentLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(114, Short.MAX_VALUE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(coloredButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconBg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(contentLayout.createSequentialGroup()
                .addComponent(coloredButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(content);

        bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bgMouseMoved(evt);
            }
        });
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        add(bg);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        setVisible(false);
    }//GEN-LAST:event_bgMousePressed

    private void bgMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseMoved
           
    }//GEN-LAST:event_bgMouseMoved

    private void coloredButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloredButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_coloredButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.inventorysystem.InputConsumer bg;
    private com.mycompany.inventorysystem.ColoredButton coloredButton1;
    private com.mycompany.inventorysystem.InputConsumer content;
    private javax.swing.JPanel iconBg;
    private javax.swing.JButton jButton1;
    private com.mycompany.inventorysystem.JIconRenderer jIconRenderer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
