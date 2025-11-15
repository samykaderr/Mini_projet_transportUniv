/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.student.mini_projet_transportuniv;

import buisness.model.user;
import buisness.model.Campuss;

/**
 *
 * @author say abdelkader achouche
 */
public class Etudiant extends user{
    private String matricule;
    private String filiere;
    private String niveau;
    private Campuss campus;
    //constructeur etudiant
    public Etudiant(String nom, String prenom, String datenaissence, String email, String telephone, String filiere, String niveau, Campuss campus) {
        super(nom, prenom, datenaissence, email, telephone);
        this.filiere = filiere;
        this.niveau = niveau;
        this.campus = campus;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getFiliere() {
        return filiere;
    }
    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
    public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    public Campuss getCampus() {
        return campus;
    }
    public void setCampus(Campuss campus) {
        this.campus = campus;
    }

}

