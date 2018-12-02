/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aashgar
 */
public class DbConnection {
    private Connection aConnection;
    private Statement aStatement;
    private static DbConnection aDbConnection;
    private DbConnection(){}
    public static DbConnection getDbConnection(){
          if(aDbConnection == null)
              aDbConnection = new DbConnection();
          return aDbConnection;
    }
    public Statement getStatement() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        aConnection = DriverManager.
                getConnection("jdbc:mysql://localhost:3306/university","root","root");
        aStatement = aConnection.createStatement();
        return aStatement;
    }
    
    
}
