/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author aashgar
 */
public abstract class Grading {
    protected legacyGrading aLegacyGrading=
            new legacyGrading();
    public abstract double computeGrade(double mid,
            double lab, double fin);
    
}
