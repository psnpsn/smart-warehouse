/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 *
 * @author psn
 */
public interface TagBinding {
    
    String TAG_READING = "tagreadingChannel";

    @Input(TAG_READING)
    SubscribableChannel tagreading();
    
}
