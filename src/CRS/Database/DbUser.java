/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class DbUser {
    private Statement aStatement;
    public boolean verifyUser(String userName,String password){
        boolean isFound = false;
        DbConnection aDbConnection = 
                DbConnection.getDbConnection();        
        try {
            aStatement = aDbConnection.getStatement();
            String sql ="Select * From Users Where userName='" +
                    userName +"' And password='" +
                    password + "'";
            ResultSet rs = aStatement.executeQuery(sql);
            if(rs.next())
                isFound = true;
        } catch (Exception ex) {
            Logger.getLogger(DbUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isFound;
    }
    
}
