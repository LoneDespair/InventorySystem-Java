/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorysystem;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.Paths;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author LoneDespair
 */
public class Product extends LinkedList.Data{
    int id = 0;
    String name = "No product name given";
    int quantity = 0;
    int price = 0;
    BufferedImage image;

    
    public Product() { }
    
    public void loadIcon(String path) {
        System.out.println(path);
        
        try {
            image = ImageIO.read(new File(path));
            
            /*
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            ImageIO.write(image, "png", stream);
            String textIcon = Base64.getEncoder().encodeToString(stream.toByteArray());*/
        }
        catch (Exception e) {
            System.out.printf("Load icon catch:\n %s\n", e);
        }
    }
    
    
    public Product(int newId, String newName, int newQuantity, int newPrice) {
        id = newId;
        name = newName;
        quantity = newQuantity;
        price = newPrice;
    }
}