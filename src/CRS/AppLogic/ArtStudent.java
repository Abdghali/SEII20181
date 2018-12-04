/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.AppLogic;

/**
 *
 * @author aashgar
 */
public class ArtStudent implements StudentType{

    @Override
    public double calcGrade(int mid, int lab, int fin) {
        return mid*0.40 + lab*0.10 + fin*0.50;
    }
    
}
