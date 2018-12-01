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
public class largeObserver extends Observer{

    public largeObserver(Source aSource) {
        super(aSource);
    }
    
    @Override
    public void update() {
        System.out.println(
                aSource.getData().toUpperCase());
    }
}
