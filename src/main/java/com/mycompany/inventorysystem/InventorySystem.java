/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inventorysystem;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

/**
 *
 * @author LoneDespair
 */
public class InventorySystem {
    

    public static void main(String[] args) {
        new PrimaryForm().setVisible(true);
        
        
        //save();
        
    }
    
    
    static public void save() {
        LinkedList.Node node = new LinkedList.Node();
        Product product = ((Product)node.data);
        
        Field[] fields = Product.class.getDeclaredFields();
        
        for (Field field : fields) {
            System.out.println(field.getName());
            System.out.println("HERE");
        }
        
        System.out.println(Arrays.toString(fields));
        
    }
    
}
