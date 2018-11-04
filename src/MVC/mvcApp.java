/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author aashgar
 */
public class mvcApp {
    public static void main(String[] args) {
        Model aModel = new Model();
        aModel.setName("Ali");
        aModel.setMajor("SW Development");
        aModel.setGrade(79.99);
        
        View aView = new View();
        
        Controller aController = new 
        Controller(aModel, aView);
        
        aModel.setName("Ahmad");
        aModel.setMajor("Math");
        aModel.setGrade(100);
        
        aController.updateView();
    }
    
}
