/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10assignment;

/**
 *
 * @author jayso
 */
//this method will return an error if an improper clothing style was inserted
public class MistakesWereMade implements ClothingFactory {
//catches exception so does not print bunch of lines
    @Override
    public Tops top() {
        try {
        throw new UnsupportedOperationException("Not supported yet."); 
        }
        catch(Exception e) {
        }
        return null;
    }

    @Override
    public Pants pant() {
        try {
        throw new UnsupportedOperationException("Not supported yet."); 
        }
        catch(Exception e) {
        }
        return null;
    }

    @Override
    public Shoes shoe() {
        try {
        throw new UnsupportedOperationException("Not supported yet."); 
        }
        catch(Exception e) {
        }
        return null;
    }
    
}
