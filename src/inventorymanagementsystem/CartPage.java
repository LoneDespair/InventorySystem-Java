/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package inventorymanagementsystem;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author LoneDespair
 */
public class CartPage extends javax.swing.JPanel {
    Bill bill = new Bill();
    
    JComponent previous;
    ReceiptPage receiptPage;

    /**
     * Creates new form CartPage
     */
    
    public CartPage() {
        initComponents();
        scroll.getVerticalScrollBar().setUnitIncrement(16);
    }
    
    public CartPage(ReceiptPage newReceiptPage) {
        this();
        receiptPage = newReceiptPage;
        setVisible(false);
        
        
        updateSummary();
    }
    
    public void open(JComponent newPrevious, ImageIcon backIcon) {
        previous = newPrevious;
        backButton.setIcon(backIcon);
        setVisible(true);
    }
    
    public void removeCartGrocery(CartGrocery cartGrocery) {
        bill.table.remove(cartGrocery.product.id);
        shelf.remove(cartGrocery);
        shelf.repaint();
        updateSummary();
    }
    
    public void addGrocery(Grocery newGrocery) {
        int id = newGrocery.product.id;
        CartGrocery existingCartGrocery = bill.table.getOrDefault(id, null);
        
        if (existingCartGrocery == null) {
            CartGrocery newCartGrocery = new CartGrocery(newGrocery, this);
            bill.table.put(id, newCartGrocery);
            shelf.add(newCartGrocery);
        } else {
            existingCartGrocery.append(newGrocery);
        }
        
        updateSummary();
    }
    
    
    public void updateSummary() {
        bill.update();
        
        vatableLabel.setText(Money.format(bill.getVatable()));
        vatLabel.setText(Money.format(bill.getVat()));
        
        totalLabel.setText(Money.format(bill.getTotal()));
        shippingLabel.setText(Money.format(bill.getShippingFee()));
        updateError();
    }
    
    public void updateError() {
        String text = "Pay";
        
        
        if (bill.table.size() == 0) text = "No product selected";
        else if (bill.cash < bill.getTotal()) text = "Not enough cash";
        
        payButton.setText(text);
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
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vatableLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        payButton = new javax.swing.JButton();
        vatLabel = new javax.swing.JLabel();
        shippingLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        cashSpinner = new javax.swing.JSpinner();
        scroll = new javax.swing.JScrollPane();
        shelf = new javax.swing.JPanel();

        setBackground(new java.awt.Color(232, 243, 214));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(250, 171, 121));
        header.setPreferredSize(new java.awt.Dimension(800, 112));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(250, 171, 121));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/cart.png"))); // NOI18N
        backButton.setBorderPainted(false);
        backButton.setPreferredSize(new java.awt.Dimension(112, 112));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        header.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SHOPPING CART");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 220, 169));
        jPanel1.setMinimumSize(new java.awt.Dimension(276, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(276, 220));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("SUMMARY");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("VATable");

        vatableLabel.setForeground(new java.awt.Color(102, 102, 102));
        vatableLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        vatableLabel.setText("₱0.00");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("VAT - 12%");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Shipping fee");

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Amount due");

        payButton.setBackground(new java.awt.Color(250, 219, 216));
        payButton.setForeground(new java.awt.Color(102, 102, 102));
        payButton.setText("PAY");
        payButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButtonActionPerformed(evt);
            }
        });

        vatLabel.setForeground(new java.awt.Color(102, 102, 102));
        vatLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        vatLabel.setText("₱0.00");

        shippingLabel.setForeground(new java.awt.Color(102, 102, 102));
        shippingLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        shippingLabel.setText("₱0.00");

        totalLabel.setForeground(new java.awt.Color(102, 102, 102));
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalLabel.setText("₱0.00");
        totalLabel.setAlignmentX(0.5F);

        cashSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 10.0d));
        cashSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cashSpinnerStateChanged(evt);
            }
        });
        cashSpinner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cashSpinnerKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cashSpinner, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(payButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(shippingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(vatableLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vatableLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(vatLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(shippingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalLabel))
                .addGap(18, 18, 18)
                .addComponent(cashSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 130, 210, 230));

        scroll.setBackground(new java.awt.Color(232, 243, 214));
        scroll.setBorder(null);
        scroll.setForeground(new java.awt.Color(232, 243, 214));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setOpaque(false);
        scroll.setPreferredSize(new java.awt.Dimension(100, 0));

        shelf.setBackground(new java.awt.Color(232, 243, 214));
        shelf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 243, 214), 12));
        shelf.setLayout(new javax.swing.BoxLayout(shelf, javax.swing.BoxLayout.Y_AXIS));
        scroll.setViewportView(shelf);

        add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 560, 488));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (previous == null) System.out.println("Null purchase page");
        else {
            previous.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void payButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButtonActionPerformed
        
        
        
        if (receiptPage == null) System.out.println("Null receipt page");
        else if (!payButton.getText().equals("Pay")) {
            JOptionPane.showMessageDialog(null, payButton.getText());
        }
        else {
            receiptPage.open(bill);
            
            bill = new Bill();
            shelf.removeAll();
            cashSpinner.setValue(0.0);
            updateSummary();
            setVisible(false);
        }
    }//GEN-LAST:event_payButtonActionPerformed

    private void cashSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cashSpinnerStateChanged
        bill.cash = (Double) cashSpinner.getValue();
        updateError();
    }//GEN-LAST:event_cashSpinnerStateChanged

    private void cashSpinnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cashSpinnerKeyTyped

    }//GEN-LAST:event_cashSpinnerKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JSpinner cashSpinner;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payButton;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPanel shelf;
    private javax.swing.JLabel shippingLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel vatLabel;
    private javax.swing.JLabel vatableLabel;
    // End of variables declaration//GEN-END:variables
}
