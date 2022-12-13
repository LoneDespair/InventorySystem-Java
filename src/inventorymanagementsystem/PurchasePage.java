/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package inventorymanagementsystem;

import java.nio.file.Paths;
import java.util.HashMap;

/**
 *
 * @author BWISITA
 */
public class PurchasePage extends javax.swing.JPanel {
    /**
     * Creates new form PurchasePage
     */
    public PurchasePage() {
        initComponents();
        
        purchaseSelection.setup(purchaseOption);
        purchaseOption.setVisible(false);
        
        /*
        for (int idx = 0; idx < 3; idx++) {
            Product product = new Product();
            product.loadIcon(path);
            purchaseSelection.addProduct(product);
        }*/
    }
    
    public void open() {
        setVisible(true);
        purchaseSelection.open();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purchaseOption = new inventorymanagementsystem.PurchaseOption();
        purchaseSelection = new inventorymanagementsystem.PurchaseSelection();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new javax.swing.OverlayLayout(this));
        add(purchaseOption);
        add(purchaseSelection);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private inventorymanagementsystem.PurchaseOption purchaseOption;
    private inventorymanagementsystem.PurchaseSelection purchaseSelection;
    // End of variables declaration//GEN-END:variables
}
