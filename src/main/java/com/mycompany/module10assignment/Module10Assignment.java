/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.module10assignment;

/**
 *
 * @author jayso
 */
public class Module10Assignment {

    //public static void main(String[] args) {
    public static Application configure() {
        //creates an Application
        Application app;
        //created a ClothingFactory
        ClothingFactory factory;

        //the clothing types should all be lower case
        String clothes = "party";
        
//if statement to choose proper clothing style 
        if (clothes.contains("casual")) {
            factory = new CasualClothes();
            app = new Application(factory);
        } else if (clothes.contains("professional")) {
            factory = new ProfessionalClothes();
            app = new Application(factory);
        }
        else if (clothes.contains("party")) {
            factory = new PartyClothes();
            app = new Application(factory);
        }
        else {
            factory = new MistakesWereMade();
            app = new Application(factory);
        }
        return app;
    }
//main method that will run program
    public static void main(String[] args) {
        Application app = configure();
        try {
        app.reveal();
        }
        catch (Exception e) {
            System.out.println("Improper clothing type");
        }
    }

}
