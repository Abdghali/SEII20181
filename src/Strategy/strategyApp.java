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
public class strategyApp {
    public static void main(String[] args) {
        Student aStudent;
        aStudent = new ItStudent();
        Grading aGrading = new Grading(aStudent);
        System.out.println("Grade is: "+
                aGrading.computeGrade(97, 88, 80));
        
        aStudent = new ArtStudent(); 
        aGrading.setaStudent(aStudent);
        System.out.println("Grade is: "+
                aGrading.computeGrade(97, 88, 80));
        
    }
}
