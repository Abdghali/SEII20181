/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author aashgar
 */
public class adapterApp {
    public static void main(String[] args) {
        Grading adGrading =
                new gradingAdapter();
        
        System.out.println("State grade is :"+
                adGrading.computeGrade(89.99,
                        87.6, 91.2));
    }
    
}
