/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.game.investigation.suspect;

/**
 *
 * @author Thibaut
 */
public class Murderer extends Suspect implements Lie  {
    protected String m_motive;

    
    /*$$ CONSTRUCTOR $$*/
    public Murderer(String name, boolean sex, int age, int stressLevel, int cooperationLevel, String personality, String look, String physicalAspect, boolean findedInnocent, int[] testimonyRef, String motive) {
        super(name, sex, age, stressLevel, look, physicalAspect, findedInnocent, testimonyRef);
        this.m_motive = motive;
    }

    
    /*$$ GETTERS & SETTERS $$*/
    public String getMotive() {
        return m_motive;
    }
    
    
    /*$$ METHODS $$*/
    @Override
    public void giveAlibi() {
        //Lance dé pour crédibilité et cohérence
            //Si ok, créer fausse piste (donner faux alibi)
            //sinon, seContredit()
            
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//end void giveAlibi

    
    @Override
    public void giveTestimony() {
        //Lance dé pour crédibilité et cohérence
           //Si ok, inventeTémoignage()
           //sinon, seContredit()
            
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//end void giveTestimony

    
    @Override
    public void all_Lie() {
        //Afficher le suspect a dit des choses contradictoires => c'est étrange...
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//end void all_Lie

    
    @Override
    public void alibi_FalseLead() {
        //donne un alibi au hasard
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//end void alibi_FalseLead

    
    @Override
    public void testimony_addTestimony() {
        //Dans le tableau d'indice, ajoute un témoignage avec islie = true
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }//end void testimony_addTestimony
    
    
    public void confess(){
    }//end void confess
}
