/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSTagReader;

/**
 *
 * @author oussa
 */
public class Badge {
    private String id;
    private String doorId;
    private String discoveryTime;

    public Badge() {
    }

    public Badge(String id, String doorId, String discoveryTime) {
        this.id = id;
        this.doorId = doorId;
        this.discoveryTime = discoveryTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDoorId() {
        return doorId;
    }

    public void setDoorId(String doorId) {
        this.doorId = doorId;
    }

    public String getDiscoveryTime() {
        return discoveryTime;
    }

    public void setDiscoveryTime(String discoveryTime) {
        this.discoveryTime = discoveryTime;
    }
    
    
    
    
    
}
