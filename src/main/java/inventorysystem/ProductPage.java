/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package inventorysystem;

import static inventorysystem.PurchasePage.path;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import javax.swing.JFileChooser;

/**
 *
 * @author LoneDespair
 */
public class ProductPage extends javax.swing.JPanel {
    Product product = new Product();
    ProductListUpdate updater = new ProductListUpdate();
    String listFilePath = Paths.get(System.getProperty("user.dir"),"src/main/java/inventorysystem/productList.txt").toString();
    String tempFilePath = Paths.get(System.getProperty("user.dir"),"src/main/java/inventorysystem/temp.txt").toString();
    HashMap <Integer, Product> hashTable = new HashMap <Integer, Product>();    
    DefaultTableModel model;
    JTable table;
    
    /**
     * Creates new form ProductPage
     */
    public ProductPage() {
        initComponents();
        populate();
        sort();
    }

    private void sort() {
        model = (DefaultTableModel)jTable1.getModel();
        table = jTable1;
        TableRowSorter <DefaultTableModel> sorter = new TableRowSorter <DefaultTableModel> (model);
        table.setRowSorter(sorter);
    }
    
    private void populate() {
        String itemLine = new String();
        String[] itemDetails = new String[4];
        model = (DefaultTableModel)jTable1.getModel();
        int i;
        try(FileReader file = new FileReader(listFilePath)) {            
            Scanner scan = new Scanner(file);                                   
            for(i=model.getRowCount()-1; i>=0; i--)
                model.removeRow(i);
                    
            while(scan.hasNext()) {
                itemLine = scan.nextLine();
                itemDetails = itemLine.split("\\s+");
                model.addRow(itemDetails);                                       
            }             
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        newNameField = new javax.swing.JTextField();
        newQtyField = new javax.swing.JTextField();
        newPriceField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        itemSelectName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        itemSelectQty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        itemSelectPrice = new javax.swing.JTextField();
        btnEditItem = new javax.swing.JButton();
        btnDeleteItem = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        selectImage = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 214));

        HeaderPanel.setBackground(new java.awt.Color(250, 171, 120));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCT LIST");

        jButton1.setText("back");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderPanelLayout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                    .addGap(96, 96, 96)))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HeaderPanelLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel1)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        btnUpdate.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnUpdate.setText("Update List File");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Name", "Stock Qty", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Add New Item:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Item Name");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("Price");

        btnAddItem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAddItem.setText("Add");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Modify Exisiting Item:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Item Name");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setText("Quantity");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setText("Price");

        btnEditItem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEditItem.setText("Edit");
        btnEditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditItemActionPerformed(evt);
            }
        });

        btnDeleteItem.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDeleteItem.setText("Delete");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Search:");

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnClear.setText("Clear List");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel11.setText("Image");

        selectImage.setText("No image selected");
        selectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(newQtyField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(newNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(newPriceField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(selectImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(btnEditItem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                        .addComponent(btnDeleteItem))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(itemSelectName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(itemSelectQty, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(itemSelectPrice)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(searchField))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(btnAddItem))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnUpdate)
                        .addGap(157, 157, 157)
                        .addComponent(btnClear)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(selectImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddItem)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemSelectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemSelectQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemSelectPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditItem)
                            .addComponent(btnDeleteItem)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        model = (DefaultTableModel)jTable1.getModel();
        table = jTable1;
        updater.update(model, table);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel)jTable1.getModel();
        table = (JTable)jTable1;
        int rowSelected = table.getSelectedRow();
        itemSelectName.setText(String.valueOf(model.getValueAt(rowSelected, 1)));
        itemSelectQty.setText(String.valueOf(model.getValueAt(rowSelected, 2)));
        itemSelectPrice.setText(String.valueOf(model.getValueAt(rowSelected, 3)));
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        model = (DefaultTableModel)jTable1.getModel();
        table = jTable1;
        String[] itemDetails = new String[4];
        String newName = newNameField.getText();
        int newQty = Integer.parseInt(newQtyField.getText());
        double newPrice = Double.parseDouble(newPriceField.getText());
        int i;
        for(i=0; i<=model.getRowCount()-1; i++) {
            if(String.valueOf(model.getValueAt(i, 1)).equalsIgnoreCase(newName)) {
                JOptionPane.showMessageDialog(null, String.format("Item with name %s already exists.", newNameField.getText().toUpperCase()));
                return;
            }
        }

        if(!newNameField.getText().isEmpty() && !newQtyField.getText().isEmpty() && !newPriceField.getText().isEmpty()) {
            if(model.getRowCount()!=0)
            product.id = Integer.parseInt(String.valueOf(model.getValueAt(model.getRowCount()-1, 0)))+1;
            else
            product.id = 1;
            product.name = newName.toUpperCase();
            product.quantity = newQty;
            product.price = newPrice;
            itemDetails[0] = String.format("%04d", product.id);
            itemDetails[1] = product.name;
            itemDetails[2] = String.valueOf(product.quantity);
            itemDetails[3] = String.format("%.2f", product.price);
            model.addRow(itemDetails);
            newNameField.setText(null);
            newQtyField.setText(null);
            newPriceField.setText(null);

            updater.update(model, table);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please fill in all parameters before adding.");
            return;
        }

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnEditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditItemActionPerformed
        model = (DefaultTableModel)jTable1.getModel();
        table = (JTable)jTable1;
        int rowSelected = table.getSelectedRow();

        if(rowSelected == -1) {
            JOptionPane.showMessageDialog(null, "Please select an item.");
            return;
        }
        String editName = itemSelectName.getText();
        String editQty = itemSelectQty.getText();
        String editPrice = itemSelectPrice.getText();

        if(!editName.isEmpty() && !editQty.isEmpty() && !editPrice.isEmpty()) {
            model.setValueAt(editName.toUpperCase(), rowSelected, 1);
            model.setValueAt(editQty, rowSelected, 2);
            model.setValueAt(editPrice, rowSelected, 3);
            updater.update(model, table);
        }
        else
        JOptionPane.showMessageDialog(null, "Please do not leave a parameter empty.");
    }//GEN-LAST:event_btnEditItemActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        model = (DefaultTableModel)jTable1.getModel();
        table = (JTable)jTable1;
        int rowSelected = table.getSelectedRow();
        if(rowSelected!=-1) {
            model.removeRow(rowSelected);
            int i;
            updater.update(model, table);
        }
        else
        JOptionPane.showMessageDialog(null, "Please select an item.");
    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        model = (DefaultTableModel)jTable1.getModel();
        table = (JTable)jTable1;
        String search = searchField.getText().toUpperCase();
        TableRowSorter <DefaultTableModel> sorter = new TableRowSorter <DefaultTableModel> (model);
        table.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_searchFieldKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        model = (DefaultTableModel)jTable1.getModel();
        table = (JTable)jTable1;
        for(int i=model.getRowCount()-1; i>=0; i--)
        model.removeRow(i);
        updater.update(model, table);
    }//GEN-LAST:event_btnClearActionPerformed

    private void selectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        
        if (fileChooser.showSaveDialog(null) == 0) {
            System.out.printf("Successs %s\n", fileChooser.getSelectedFile().getAbsolutePath());
            
            /*
            BufferedImage image = ImageIO.read(fileChooser.getSelectedFile());
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            ImageIO.write(image, "png", stream);
            String textIcon = Base64.getEncoder().encodeToString(stream.toByteArray())*/
            
        }
        else {
            System.out.println("cancel");
        }
    }//GEN-LAST:event_selectImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnEditItem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField itemSelectName;
    private javax.swing.JTextField itemSelectPrice;
    private javax.swing.JTextField itemSelectQty;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField newNameField;
    private javax.swing.JTextField newPriceField;
    private javax.swing.JTextField newQtyField;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton selectImage;
    // End of variables declaration//GEN-END:variables
}
