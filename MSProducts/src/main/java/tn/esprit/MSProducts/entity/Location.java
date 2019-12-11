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
public class Location {
    
    @Id
    private String id;
    
    private String gatewayId;
    private String description;
    private long maxHumidity;
    private long minHumidity;
    private long maxTemp;
    private long minTemp;

    public Location() {
    }

    public Location(String id, String gatewayId, String description, long maxHumidity, long minHumidity, long maxTemp, long minTemp) {
        this.id = id;
        this.gatewayId = gatewayId;
        this.description = description;
        this.maxHumidity = maxHumidity;
        this.minHumidity = minHumidity;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(long maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public long getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(long minHumidity) {
        this.minHumidity = minHumidity;
    }

    public long getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(long maxTemp) {
        this.maxTemp = maxTemp;
    }

    public long getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(long minTemp) {
        this.minTemp = minTemp;
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", gatewayId=" + gatewayId + ", description=" + description + ", maxHumidity=" + maxHumidity + ", minHumidity=" + minHumidity + ", maxTemp=" + maxTemp + ", minTemp=" + minTemp + '}';
    }
    
            
          
}
