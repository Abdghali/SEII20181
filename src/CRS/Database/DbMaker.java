/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import CRS.AppLogic.Student;
import java.util.List;

/**
 *
 * @author aashgar
 */
public class DbMaker {
    private static DbMaker aDbMaker;
    private DbUser aDbUser;
    private DbStudent aDbStudent;
    private DbMaker(){
        aDbUser = new DbUser();
        aDbStudent = new DbStudent();
    }
    public static DbMaker getDbMaker(){
        if(aDbMaker == null)
            aDbMaker = new DbMaker();
        return aDbMaker;
    }
    public boolean verifyUserDbMaker(String userName,
            String password){
        return aDbUser.verifyUser(userName, password);
    }
    public void addStudentDbMaker(Student asStudent){
        aDbStudent.addStudent(asStudent);
    }
    public List<Student> getStudentsDbMaker(){
        return aDbStudent.getStudents();
    }
}
