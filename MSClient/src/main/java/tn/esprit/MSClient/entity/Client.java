/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.esprit.MSClient.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author user
 */

Document( collection = "client" )
public class Client {

@Id
    private String id;
    
     private String nom;
     private String prenom;
     private String email;
     private String phoneNumber;

    public Client() {
    }

    public Client(String id, String nom, String prenom, String email, String phoneNumber) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
     

}
