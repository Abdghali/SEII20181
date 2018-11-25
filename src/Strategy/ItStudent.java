/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author aashgar
 */
public class ItStudent implements Student{

    @Override
    public double calcGrade(int mid, int lab, int fin) {
        return mid*0.20 + lab*0.30 + fin*0.50;
    }
    
}
