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
public abstract class Observer {
    protected Source aSource;

    public Observer(Source aSource) {
        this.aSource = aSource;
        this.aSource.addObserver(this);
    }
    
    public abstract void update();
    
}
