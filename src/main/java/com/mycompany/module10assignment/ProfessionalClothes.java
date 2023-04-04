/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author jayso
 */
//if this method is called it will show a whole professional fit
public class ProfessionalClothes implements ClothingFactory {
    
    //this will create a new ProfessionalTop and print out professional top
    @Override
    public Tops top() {
        return new ProfessionalTops();
    }

    //this will create a new ProfessionalTop and print out professional top
    @Override
    public Pants pant() {
        return new ProfessionalPants();
    }

    //this will create a new ProfessionalTop and print out Professional top
    @Override
    public Shoes shoe() {
        return new ProfessionalShoes();
    }
}
