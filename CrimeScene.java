/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ISEN
 */
public class CrimeScene extends InvestigationElement {
    int penalty;

    public CrimeScene(int penalty, int[] refProof) {
        super(refProof);
        this.penalty = penalty;
    }
    
}
