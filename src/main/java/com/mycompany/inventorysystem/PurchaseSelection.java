/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.inventorysystem;

/**
 *
 * @author LoneDespair
 */
public class PurchaseSelection extends javax.swing.JPanel {
    PurchaseOption purchaseOption = null;
    
    /**
     * Creates new form PurchasePage
     */
    public PurchaseSelection() {
        initComponents();
    }
    
    public void setup(PurchaseOption newPurchaseOption) {
        purchaseOption = newPurchaseOption;
    }
    
    
    public void addProduct(Product product) {
        shelf.add(new PurchaseProduct(product, purchaseOption));
    }
    
    
    
    public void addPurchaseProduct() {
        
    }
    
    public void select(PurchaseProduct newSelected) {
    }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shelf = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        header.setBackground(new java.awt.Color(250, 171, 121));
        header.setMaximumSize(new java.awt.Dimension(32767, 100));
        header.setMinimumSize(new java.awt.Dimension(0, 100));
        header.setPreferredSize(new java.awt.Dimension(576, 100));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PURCHASE");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addGap(0, 290, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 290, Short.MAX_VALUE)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );

        add(header);

        shelf.setBackground(new java.awt.Color(232, 243, 214));
        shelf.setLayout(new java.awt.GridLayout(1, 2));
        jScrollPane1.setViewportView(shelf);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel shelf;
    // End of variables declaration//GEN-END:variables
}
