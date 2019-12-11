/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSTagReader;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author psn
 */
@RestController("tag")
public class TagController {
    
    private MessageChannel greet;

    public TagController(TagBinding binding) {
        greet = binding.tagreading();
    }
    
    @GetMapping("tag")
    public void publish(@RequestBody Tag tag) {
        Message<Tag> msg = MessageBuilder.withPayload(tag)
            .build();
        this.greet.send(msg);
        System.out.println(tag.toString());
    }
}
