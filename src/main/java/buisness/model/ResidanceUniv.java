/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.model;

/**
 *
 * @author samykaderr
 */
public class ResidanceUniv {
    
    private final  int idResidence ;
    int cpt =0;
    String nomR;
    String localisation;
    int capacite ;
    //construceur par defaut
    public ResidanceUniv (){
        this.idResidence = 0;
        this.capacite =0;
        this.localisation =null;
        this.nomR = null;
    }
    //constructeur par parametre 
    public ResidanceUniv(String nomR,String localisation ,int capacite){
        this.idResidence = cpt++;
        this.capacite = capacite;
        this.localisation = localisation;
        this.nomR = nomR;
    }
    //les geter et seter 
    public void setnomR(String Nom){
        this.nomR = Nom;
    }
    public String getnomR(){
        return this.nomR;
    }
    public void setlocalisation(String local){
        this.localisation = local;
    }
    public String getlocalisation (){
        return this.localisation ;
    }
    public void setcapacite(int capacit){
        this.capacite = capacit;
    }
    public int getcapacite(){
        return this.capacite;
    }
    
}
