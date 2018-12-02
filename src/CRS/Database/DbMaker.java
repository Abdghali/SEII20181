/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

/**
 *
 * @author aashgar
 */
public class DbMaker {
    private static DbMaker aDbMaker;
    private DbUser aDbUser;
    private DbMaker(){
        aDbUser = new DbUser();
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
}
