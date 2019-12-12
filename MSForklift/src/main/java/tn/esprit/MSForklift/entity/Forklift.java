/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.esprit.MSForklift.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author user
 */
@Document( collection = "forklift" )
public class Forklift {

    @Id
    private String id; 
    
     private int disponibilite;
    

    public Forklift() {
    }

    public Forklift(String id, int disponibilite) {
        this.id = id;
        this.disponibilite = disponibilite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(int disponibilite) {
        this.disponibilite = disponibilite;
    }

     

}
