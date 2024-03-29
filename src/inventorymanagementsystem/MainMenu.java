/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorymanagementsystem;

import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author user
 */
public class MainMenu extends javax.swing.JFrame {
    String logoPath = Paths.get(System.getProperty("user.dir"), "src/inventorymanagementsystem/menu.png").toString();
    
    PurchasePage purchasePage;
    CartPage cartPage;
    
    
    ImageIcon homeIcon = new ImageIcon(logoPath);
    
    /**
     * Creates new form MainMenu
     * @param username
     */
    
    public MainMenu(String username) {
        this();
        userlabel.setText(username);
    }
    
     public MainMenu() {
        initComponents();
        
        
        ReceiptPage receiptPage = new ReceiptPage(homePage, productList);
        cartPage = new CartPage(receiptPage);
        purchasePage = new PurchasePage(cartPage);
        
        add(receiptPage, 0);
        add(cartPage, 0);
        add(purchasePage, 0);
        
        productList.home = homePage;
        user.home = homePage;
    }
     
    //public PurchasePage getPurchasePage() { return purchasePage; }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePage = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        productButton = new javax.swing.JButton();
        usersButton = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        purchaseButton = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        userlabel = new javax.swing.JLabel();
        productList = new inventorymanagementsystem.ProductList();
        receiptPage = new inventorymanagementsystem.ReceiptPage();
        user = new inventorymanagementsystem.User();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.CardLayout());

        homePage.setBackground(new java.awt.Color(232, 243, 214));
        homePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(250, 171, 120));
        HeaderPanel.setMaximumSize(new java.awt.Dimension(32767, 112));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(800, 112));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVENTORY MANAGEMENT SYSTEM");
        HeaderPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 31, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/logo.png"))); // NOI18N
        HeaderPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        homePage.add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel2.setBackground(new java.awt.Color(232, 243, 214));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productButton.setBackground(new java.awt.Color(252, 249, 190));
        productButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        productButton.setForeground(new java.awt.Color(250, 171, 120));
        productButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/ProductsIcon.png"))); // NOI18N
        productButton.setText("PRODUCTS");
        productButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 171, 120), 2, true));
        productButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productButton.setFocusable(false);
        productButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productButtonActionPerformed(evt);
            }
        });
        jPanel2.add(productButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 374, 200));

        usersButton.setBackground(new java.awt.Color(252, 249, 190));
        usersButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        usersButton.setForeground(new java.awt.Color(250, 171, 120));
        usersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/UsersIcon.png"))); // NOI18N
        usersButton.setText("USERS");
        usersButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 171, 120), 2, true));
        usersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersButton.setFocusable(false);
        usersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonActionPerformed(evt);
            }
        });
        jPanel2.add(usersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 374, 200));

        cartButton.setBackground(new java.awt.Color(252, 249, 190));
        cartButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cartButton.setForeground(new java.awt.Color(250, 171, 120));
        cartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/CartHome.png"))); // NOI18N
        cartButton.setText("CART");
        cartButton.setToolTipText("");
        cartButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 171, 120), 2, true));
        cartButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartButton.setFocusable(false);
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 374, 200));

        purchaseButton.setBackground(new java.awt.Color(252, 249, 190));
        purchaseButton.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        purchaseButton.setForeground(new java.awt.Color(250, 171, 120));
        purchaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/PurchaseIcon.png"))); // NOI18N
        purchaseButton.setText("PURCHASE");
        purchaseButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 171, 120), 2, true));
        purchaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseButton.setFocusable(false);
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });
        jPanel2.add(purchaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 374, 200));

        homePage.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 800, 430));

        BottomPanel.setBackground(new java.awt.Color(255, 220, 169));
        BottomPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(250, 171, 120));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("LOG OUT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setMaximumSize(new java.awt.Dimension(999, 999));
        jButton1.setPreferredSize(new java.awt.Dimension(55, 42));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        BottomPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 11, 110, -1));

        userlabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        userlabel.setForeground(new java.awt.Color(250, 171, 120));
        userlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/UserIcon45px.png"))); // NOI18N
        userlabel.setText("jLabel2");
        userlabel.setMaximumSize(new java.awt.Dimension(9999, 99999));
        userlabel.setPreferredSize(new java.awt.Dimension(112, 48));
        BottomPanel.add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 156, -1));

        homePage.add(BottomPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 800, 60));

        getContentPane().add(homePage, "card2");
        getContentPane().add(productList, "card4");
        getContentPane().add(receiptPage, "card5");
        getContentPane().add(user, "card5");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void productButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productButtonActionPerformed
        homePage.setVisible(false);
        productList.open();
    }//GEN-LAST:event_productButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        homePage.setVisible(false);
        purchasePage.open();
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?","Log Out", JOptionPane.YES_NO_OPTION);
        
        if(choice == 0){
            try {
                new LoginScreen().setVisible(true);
            } catch (Exception e) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, e);
            }
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        homePage.setVisible(false);
        cartPage.open(homePage, homeIcon);
    }//GEN-LAST:event_cartButtonActionPerformed

    private void usersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersButtonActionPerformed
        homePage.setVisible(false);
        user.setVisible(true);
    }//GEN-LAST:event_usersButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton cartButton;
    private javax.swing.JPanel homePage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton productButton;
    private inventorymanagementsystem.ProductList productList;
    private javax.swing.JButton purchaseButton;
    private inventorymanagementsystem.ReceiptPage receiptPage;
    private inventorymanagementsystem.User user;
    private javax.swing.JLabel userlabel;
    private javax.swing.JButton usersButton;
    // End of variables declaration//GEN-END:variables
}
