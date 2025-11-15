/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.model;

/**
 *
 * @author samy abdelkader achouche
 */
public class user {
    long id;
    private static long cmpt = 0;
    String nom;
    String prenom;
    String datenaissence;
    String email;
    String telephone;
    
    public user(String nom, String prenom, String datenaissence, String email , String telephone) {
        cmpt++;
        id = cmpt;
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissence = datenaissence;
        this.email = email;
        this.telephone = telephone;
    }
    public user() {
        this.nom = "";
        this.prenom = "";
        this.datenaissence = "00/00/0000";
        this.email = "";
        this.telephone = "";
    }
    //les geters
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getDatenaissence() {
        return datenaissence;
    }
    public String getEmail() {
        return email;
    }
    public String getTelephone() {
        return telephone;
    }
    //les seters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDatenaissence(String datenaissence) {
        this.datenaissence = datenaissence;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
