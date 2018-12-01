/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author aashgar
 */
public class observerApp {
    public static void main(String[] args) {
        Source aSource = new Source();
        Observer smallObserver =
                new smallObserver(aSource);
        Observer largeObserver =
                new largeObserver(aSource);
        
        aSource.setData("SW Desgn");
        aSource.setData("Design Pattern is very funny");
        
    }
    
}
