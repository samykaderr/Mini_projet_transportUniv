/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buisness.model;

/**
 *
 * @author user
 */
import java.util.Date;

public class Chauffeur extends user {

    private String permis;
    private Date dateEmbouchement;

    // constructeur du chauffeur
    public Chauffeur(String nom, String prenom, String datenaissence, String email, String telephone,
                     String permis, Date dateEmbouchement) {
        // call user constructor that exists in user.java
        super(nom, prenom, datenaissence, email, telephone);
        this.permis = permis;
        // use the provided date if not null, otherwise default to now
        this.dateEmbouchement = (dateEmbouchement != null) ? dateEmbouchement : new Date();
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public Date getDateEmbouchement() {
        return dateEmbouchement;
    }

    public void setDateEmbouchement(Date dateEmbouchement) {
        this.dateEmbouchement = dateEmbouchement;
    }

}

