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
    
            
          
}