/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */
@Document
public class Category {
    
    
    private String id;
    
    private String name;
    private String description;
    private long optimalHumidity;
    private long optimalTemprature;

    public Category() {
    }

    public Category(String id, String name, String description, long optimalHumidity, long optimalTemprature) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.optimalHumidity = optimalHumidity;
        this.optimalTemprature = optimalTemprature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getOptimalHumidity() {
        return optimalHumidity;
    }

    public void setOptimalHumidity(long optimalHumidity) {
        this.optimalHumidity = optimalHumidity;
    }

    public long getOptimalTemprature() {
        return optimalTemprature;
    }

    public void setOptimalTemprature(long optimalTemprature) {
        this.optimalTemprature = optimalTemprature;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", description=" + description + ", optimalHumidity=" + optimalHumidity + ", optimalTemprature=" + optimalTemprature + '}';
    }
    
    
}
