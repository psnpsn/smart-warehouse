/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSTagReader;

/**
 *
 * @author psn
 */
public class Tag {
    
    private String id;
    private String gatewayId;
    private String discoveryTime;

    public Tag() {
    }

    public Tag(String id, String gatewayId, String discoveryTime) {
        this.id = id;
        this.gatewayId = gatewayId;
        this.discoveryTime = discoveryTime;
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

    public String getDiscoveryTime() {
        return discoveryTime;
    }

    public void setDiscoveryTime(String discoveryTime) {
        this.discoveryTime = discoveryTime;
    }

    @Override
    public String toString() {
        return "Tag{" + "id=" + id + ", gatewayId=" + gatewayId + ", discoveryTime=" + discoveryTime + '}';
    }
    
    
    
}
