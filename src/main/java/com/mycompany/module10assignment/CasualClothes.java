/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author jayso
 */
//if this method is called it will show a whole casual fit
public class CasualClothes implements ClothingFactory {

    //this will create a new CasualTop and print out casual top
    @Override
    public Tops top() {
        return new CasualTops();
    }

    //this will create a new CasualPants and print out casual pants
    @Override
    public Pants pant() {
        return new CasualPants();
    }

    //this will create a new CasualShoes and print out casual shoes
    @Override
    public Shoes shoe() {
        return new CasualShoes();
    }
    
}
