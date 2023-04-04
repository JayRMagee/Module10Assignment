/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author jayso
 */
//if this method is called it will show a whole party fit
public class PartyClothes implements ClothingFactory {
    
    //this will create a new PartyTops and print out party top
    @Override
    public Tops top() {
        return new PartyTops();
    }

    ////this will create a new PartyTop and print out Party pant
    @Override
    public Pants pant() {
        return new PartyPants();
    }

    ////this will create a new PartyTop and print out party shoe
    @Override
    public Shoes shoe() {
        return new PartyShoes();
    }
}
