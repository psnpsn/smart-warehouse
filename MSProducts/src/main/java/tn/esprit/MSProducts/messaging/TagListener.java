/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.messaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import tn.esprit.MSProducts.entity.Tag;

/**
 *
 * @author psn
 */
@EnableBinding(TagBinding.class)
public class TagListener {
    
    @StreamListener(target = TagBinding.TAG_READING)
    public void processTagChannelTagReading(Tag tag) {
        System.out.println(tag.toString());
    }
    
}
