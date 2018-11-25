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
public class stateApp {
    public static void main(String[] args) {
        Context aContext = new Context();
        
        State aState;
        aState = new openState(aContext);
        aState.doAction();
        
        aState = new closeState(aContext);
        aState.doAction();
        
        System.out.println("Current State is: " +
                aContext.getaState());
        
        
    }
}
