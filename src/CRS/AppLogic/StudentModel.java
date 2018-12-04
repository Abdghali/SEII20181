/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.AppLogic;

import java.util.List;
import java.util.Observable;

/**
 *
 * @author aashgar
 */
public class StudentModel extends Observable{
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
        setChanged();
        notifyObservers();
    }
    
}
