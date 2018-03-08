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
abstract public class Personnage {
            
    int force;
    int pv;
    int endurance;
    String nom;
    
    public Personnage(){
        this.initAttributs();
    }
    
    public Personnage(String nom){
        this();
        this.nom = nom;
    }
    
    abstract protected void initAttributs();
    
    public void attaquer(Personnage cible){
        
        String message;
        
        int resultat = this.force - cible.endurance;
        
        if(resultat > 0){ 
            cible.pv -= resultat;
            
            if(cible.pv > 0){
                message = this.nom + " attaque " + cible.nom + ": " + cible.nom + " perd " + resultat + " PV. Il lui reste " + cible.pv + " PV";
            }else{
                message = this.nom + " attaque " + cible.nom + ": " + cible.nom + " perd " + resultat + " PV. " + cible.nom + " est mort !!!!";
            }
            
        }else{
            message = this.nom + " attaque " + cible.nom + ": " + cible.nom + " est trop fort, l'attaque a échoué";
        }
        
        System.out.println(message);   
    }  
}
