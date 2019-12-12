/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSEmployees.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */
@Document
public class Badge {
    
    @Id
    private String id;
    
    private String releaseDate;
    private String expirationDate;
    private String employeeId;

    public Badge() {
    }

    public Badge(String id, String releaseDate, String expirationDate, String employeeId) {
        this.id = id;
        this.releaseDate = releaseDate;
        this.expirationDate = expirationDate;
        this.employeeId = employeeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Badge{" + "id=" + id + ", releaseDate=" + releaseDate + ", expirationDate=" + expirationDate + ", employeeId=" + employeeId + '}';
    }
    
    
}
