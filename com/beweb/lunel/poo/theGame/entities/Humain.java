/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beweb.lunel.poo.theGame.entities;

/**
 *
 * @author cantinelli
 */
public class Humain extends Personnage {
    
    public Humain(){
 
    }

    public Humain(String nom) {
        super(nom);
    }

    @Override
    protected void initAttributs() {
        this.force = 5;
        this.pv = 72;
        this.endurance = 3;  
    }
    
    
    
    
    
}
