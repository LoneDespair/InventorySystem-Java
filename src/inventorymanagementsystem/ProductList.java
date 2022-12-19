/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package inventorymanagementsystem;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import javax.swing.JFileChooser;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author LoneDespair
 */
public class ProductList extends javax.swing.JPanel {
    //Product product = new Product();
    ProductListUpdate updater = new ProductListUpdate();
    String listFilePath = Paths.get(System.getProperty("user.dir"),"src/inventorymanagementsystem/productList.txt").toString();
    String tempFilePath = Paths.get(System.getProperty("user.dir"),"src/inventorymanagementsystem/temp.txt").toString();
    static TreeMap<Integer, Product> productTree = new TreeMap<>();    
    PurchasePage purchasePage;
    
    DefaultTableModel model;
    JTable table;
    JComponent home;
    
    BufferedImage selectedImage;
    
    
    /**
     * Creates new form ProductPage
     */
    
    
    public ProductList(PurchasePage newPurchasePage) {
        this();
        purchasePage = newPurchasePage;
        populate();
        sort();
    }
    
    
    public ProductList() {
        initComponents();
    }
    
    
    
    public void open() {
        setVisible(true);
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
                
                Scanner productScan = new Scanner(itemLine).useDelimiter("\\s+");
                Product product = new Product();

                product.id = Integer.parseInt(productScan.next());
                product.name = productScan.next();
                product.quantity = Integer.parseInt(productScan.next());
                product.price = Double.parseDouble(productScan.next());
                
                if (productScan.hasNext()) {
                    product.image = ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(productScan.next())));
                    
                }
                
                loadProduct(product);
                //productTree.put(product.id, product);
            }             
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void update() {
        model.setRowCount(0);
        
        for (Product product : productTree.values()) {
            model.addRow(new Object[] {product.id, product.name, product.quantity, product.price});
        }
        updater.update();
    }
    
    public void loadProduct(Product product) {
        productTree.put(product.id, product);
        if (purchasePage != null) purchasePage.addProduct(product);
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        imageButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(232, 243, 214));

        HeaderPanel.setBackground(new java.awt.Color(250, 171, 120));
        HeaderPanel.setMinimumSize(new java.awt.Dimension(800, 112));
        HeaderPanel.setPreferredSize(new java.awt.Dimension(800, 112));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(250, 171, 120));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorymanagementsystem/menu.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(112, 112));
        jButton1.setPreferredSize(new java.awt.Dimension(112, 112));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        HeaderPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 110));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 243, 214));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCT LIST");
        HeaderPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 800, 110));

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

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jLabel11.setText("Image");

        imageButton.setText("No image selected");
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(imageButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addComponent(btnAddItem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(imageButton))
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
                            .addComponent(btnDeleteItem))
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

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
            Product product = new Product();
            imageButton.setText("No image selected");
            
            if(model.getRowCount()!=0)
            product.id = Integer.parseInt(String.valueOf(model.getValueAt(model.getRowCount()-1, 0)))+1;
            else
            product.id = 1;
            product.name = newName.toUpperCase();
            product.quantity = newQty;
            product.price = newPrice;
            product.image = selectedImage;
            selectedImage = null;
            itemDetails[0] = String.format("%04d", product.id);
            itemDetails[1] = product.name;
            itemDetails[2] = String.valueOf(product.quantity);
            itemDetails[3] = String.format("%.2f", product.price);
            model.addRow(itemDetails);
            newNameField.setText(null);
            newQtyField.setText(null);
            newPriceField.setText(null);
            loadProduct(product);
            //productTree.put(product.id, product);

            updater.update();
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
            
            int id = Integer.parseInt(String.valueOf(model.getValueAt(rowSelected, 0)));
            Product product = productTree.get(id);
            
            product.name = editName;
            product.quantity = Integer.parseInt(editQty);
            product.price = Double.parseDouble(editPrice);
            
            product.sendEvent(ProductEvent.Type.MODIFY);
            updater.update();
        }
        else
        JOptionPane.showMessageDialog(null, "Please do not leave a parameter empty.");
    }//GEN-LAST:event_btnEditItemActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        model = (DefaultTableModel)jTable1.getModel();
        table = (JTable)jTable1;
        int rowSelected = table.getSelectedRow();
        if(rowSelected!=-1) {
            int id = Integer.parseInt(String.valueOf(model.getValueAt(rowSelected, 0)));
            productTree.get(id).sendEvent(ProductEvent.Type.DELETE);
            
            productTree.remove(id);
            
            model.removeRow(rowSelected);
            int i;
            
            updater.update();
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

    /*        
        model = (DefaultTableModel)jTable1.getModel();
        table = (JTable)jTable1;
        for(int i=model.getRowCount()-1; i>=0; i--)
        model.removeRow(i);
        updater.update();
    */
    
    
    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageButtonActionPerformed
        LookAndFeel original = UIManager.getLookAndFeel();
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println("Errrorr");
        }
        
        JFileChooser fileChooser = new JFileChooser();
        
        try {
            UIManager.setLookAndFeel(original);
        }
        catch (Exception e) {
            System.out.println("Errrorr");
        }
        
        
        
        
        //new FileNameExtensionFilter("");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png");
        fileChooser.setFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);
        
        if (fileChooser.showSaveDialog(null) == 0) {
            
            try {
                File file = fileChooser.getSelectedFile();
                imageButton.setText(file.getName());
                
                selectedImage = ImageIO.read(file);
                
            }
            catch (Exception e) {
                System.out.println("Failed to set selectedImage");
            }
            /*
            BufferedImage image = ImageIO.read(fileChooser.getSelectedFile());
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            ImageIO.write(image, "png", stream);
            String textIcon = Base64.getEncoder().encodeToString(stream.toByteArray())*/
            
        }
        else {
            System.out.println("cancel");
        }
        
        
        
    }//GEN-LAST:event_imageButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        if (home != null) home.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnEditItem;
    private javax.swing.JButton imageButton;
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
    // End of variables declaration//GEN-END:variables
}
