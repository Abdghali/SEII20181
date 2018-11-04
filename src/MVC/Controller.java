/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author aashgar
 */
public class Controller {
    private Model aModel;
    private View aView;
    public Controller(Model aModel, View aView){
        this.aModel = aModel;
        this.aView = aView;
    }
    
    public void updateView(){
       aView.showData(aModel.getName(), 
               aModel.getMajor(),
               aModel.getGrade());
    }
}
