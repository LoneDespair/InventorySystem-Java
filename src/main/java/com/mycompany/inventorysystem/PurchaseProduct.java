/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.inventorysystem;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Image;

/**
 *
 * @author LoneDespair
 */
public class PurchaseProduct extends javax.swing.JPanel {
    
    Image image;
    
    /**
     * Creates new form PurchaseProduct
     */
    public PurchaseProduct() {
        initComponents();
        
        image = new ImageIcon("C:/Users/LoneDespair/Downloads/icecream_1.jpg").getImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        holder = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        iconBackground = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        button = new com.mycompany.inventorysystem.ColoredButton();

        setEnabled(false);
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        holder.setBackground(new java.awt.Color(252, 249, 190));
        holder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(102, 102, 102));
        nameLabel.setText("Selecta Ice cream");
        holder.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 30));

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(250, 171, 121));
        priceLabel.setText("₱150.00");
        holder.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 30));

        iconBackground.setBackground(new java.awt.Color(255, 220, 169));
        iconBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setBackground(new java.awt.Color(250, 171, 121));
        icon.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                iconComponentResized(evt);
            }
        });
        iconBackground.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 180));

        holder.add(iconBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 180));

        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setFocusable(false);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        holder.add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 280));

        add(holder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonActionPerformed

    private void iconComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_iconComponentResized
        if (image == null) {
            return;
        }
        
        Dimension iconSize = icon.getSize();
        
        int width = image.getWidth(this), height = image.getHeight(this);
        
        double scalex = (double)iconSize.width / width;
        double scaley = (double)iconSize.height / height;
       
        double ratio = Math.max(scalex, scaley);
        
        System.out.printf("RATIO %f %f %f", ratio, iconSize.width * ratio, image.getWidth(this) * ratio);
        image = image.getScaledInstance((int)(ratio * width), (int)(height * ratio), Image.SCALE_DEFAULT);
        
        icon.setIcon(new ImageIcon(image));
    }//GEN-LAST:event_iconComponentResized


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.inventorysystem.ColoredButton button;
    private javax.swing.JPanel holder;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel iconBackground;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
}
