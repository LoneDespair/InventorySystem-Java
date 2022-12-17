/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package inventorymanagementsystem;

import javax.swing.JComponent;


/**
 *
 * @author LoneDespair
 */
public class PurchasePage extends javax.swing.JPanel {
    PurchaseOption purchaseOption ;
    CartPage cartPage;
    JComponent home;
    
    /**
     * Creates new form PurchasePage
     */
    public PurchasePage() {
        initComponents();
        cartPage = new CartPage(selection);
        purchaseOption = new PurchaseOption(cartPage);
        
        add(purchaseOption, 0);
        add(cartPage, 0);
        
        purchaseOption.setVisible(false);
        cartPage.setVisible(false);
        
        shelfScroll.getVerticalScrollBar().setUnitIncrement(16);
    }
    
    public void setup(PurchaseOption newPurchaseOption) {
        purchaseOption = newPurchaseOption;
    }
    
    public void open() {
        setVisible(true);
        
        // Clears all existing components
        shelf.removeAll();
        
        for (Product product : ProductList.hashTable.values()) {
            shelf.add(new PurchaseProduct(product, purchaseOption));
        }
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

        selection = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        shelfScroll = new javax.swing.JScrollPane();
        shelf = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setLayout(new javax.swing.OverlayLayout(this));

        selection.setLayout(new javax.swing.BoxLayout(selection, javax.swing.BoxLayout.Y_AXIS));

        header.setBackground(new java.awt.Color(250, 171, 121));
        header.setMaximumSize(new java.awt.Dimension(32767, 100));
        header.setMinimumSize(new java.awt.Dimension(800, 112));
        header.setPreferredSize(new java.awt.Dimension(800, 112));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PURCHASE");

        jButton1.setBackground(new java.awt.Color(250, 171, 120));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/menu.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cartButton.setBackground(new java.awt.Color(250, 171, 121));
        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/cart.png"))); // NOI18N
        cartButton.setText("jButton2");
        cartButton.setBorderPainted(false);
        cartButton.setPreferredSize(new java.awt.Dimension(112, 112));
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, headerLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addComponent(cartButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        selection.add(header);

        shelf.setBackground(new java.awt.Color(232, 243, 214));
        shelf.setLayout(new java.awt.GridLayout(0, 4));
        shelfScroll.setViewportView(shelf);

        selection.add(shelfScroll);

        add(selection);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (home != null) home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        selection.setVisible(false);
        cartPage.open();
    }//GEN-LAST:event_cartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartButton;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel selection;
    private javax.swing.JPanel shelf;
    private javax.swing.JScrollPane shelfScroll;
    // End of variables declaration//GEN-END:variables
}
