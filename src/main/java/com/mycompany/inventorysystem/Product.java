/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorysystem;

/**
 *
 * @author LoneDespair
 */
public class Product extends LinkedList.Data{
    int id = 0;
    String name = "None";
    int quantity;
    String description;
    
    
    public Product(int newId, String newName, int newQuantity, String newDescription) {
        id = newId;
        name = newName;
        quantity = newQuantity;
        description = newDescription;
    }
    
    
}