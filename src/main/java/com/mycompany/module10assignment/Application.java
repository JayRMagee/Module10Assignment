/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author jayso
 */
public class Application {
    //variables with type interface
    private Tops top;
    private Pants pant;
    private Shoes shoe;
    
    //this is a constructor for the application class
    public Application(ClothingFactory factory) {
        top = factory.top();
        pant = factory.pant();
        shoe = factory.shoe();
    }
    
    //this calls the methods from each interface
    public void reveal() {
        top.top();
        pant.pant();
        shoe.shoe();
    }
    
    
}
