/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.model;

/**
 *
 * @author user
 */
public class Campuss {
     private int idCampus;
    private String nomCampus;
    private String LocalisationCampus;
    //le constructeur de Campus
    public Campuss(int idCampus, String nomCampus, String LocalisationCampus) {
        this.idCampus = idCampus;
        this.nomCampus = nomCampus;
        this.LocalisationCampus = LocalisationCampus;
    }
    public int getIdCampus() {
        return idCampus;
    }
    public void setIdCampus(int idCampus) {
        this.idCampus = idCampus;
    }
    public String getNomCampus() {
        return nomCampus;}
    public void setNomCampus(String nomCampus) {
        this.nomCampus = nomCampus;
    }
    public String getLocalisationCampus() {
        return LocalisationCampus;
    }
    public void setLocalisationCampus(String localisationCampus) {
        LocalisationCampus = localisationCampus;
    }
}
