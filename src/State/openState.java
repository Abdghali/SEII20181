/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author aashgar
 */
public class openState implements State{
   
    public openState(Context aContext) {
        aContext.setaState(this);
    }
    

    @Override
    public void doAction() {
        System.out.println("Open State ...");
    }

    @Override
    public String toString() {
        return "OpenState";
    }
    
    
    
}
