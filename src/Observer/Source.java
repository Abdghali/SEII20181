/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aashgar
 */
public class Source {
    private String data;
    private List<Observer> observers =
       new ArrayList<Observer>();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyObservers();
    }
    public void addObserver(Observer anObserver){
        observers.add(anObserver);
    }
    private void notifyObservers(){
        for(Observer anObserver:observers)
            anObserver.update();
    }
    
}
