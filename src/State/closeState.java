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
public class closeState implements State{
   
    public closeState(Context aContext) {
        aContext.setaState(this);
    }
    

    @Override
    public void doAction() {
        System.out.println("Close State ...");
    }

    @Override
    public String toString() {
        return "CloseState";
    }
}
