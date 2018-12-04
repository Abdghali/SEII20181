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
public class Grading {
    private StudentType aStudentType;

    public Grading(String type) {
        if(type.equalsIgnoreCase("it"))
            this.aStudentType = new ItStudent();
        else if(type.equalsIgnoreCase("art"))
            this.aStudentType = new ArtStudent();
        else
            this.aStudentType = new ItStudent();
    }
    public double computeGrade(int mid, int lab, int fin){
        return this.aStudentType.calcGrade(mid, lab, fin);
    }
    
    
}
