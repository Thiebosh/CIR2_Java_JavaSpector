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
public class Innocent extends Suspect {
    String alibi;

    public Innocent(String name, boolean sex, int age, int stressLevel, int cooperationLevel, String personality, String look, String physicalAspect, boolean findedInnocent, int[] testimonyRef, String alibi) {
        super(name, sex, age, stressLevel, cooperationLevel, personality, look, physicalAspect, findedInnocent, testimonyRef);
        this.alibi = alibi;
    }

    public String getAlibi() {
        return alibi;
    }
    
    @Override
    void BeInterrogated() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayInfos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
