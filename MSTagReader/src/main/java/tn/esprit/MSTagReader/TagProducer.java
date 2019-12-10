/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSTagReader;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author psn
 */
public class TagProducer {
    
    @Autowired
    private RabbitTemplate rabbitTemplate;
    
    @Autowired
    private Exchange exchange;
    
    public void createTag(){
        String routingKey = "tag.created";
        String message = "tag created";
        rabbitTemplate.convertAndSend(exchange.getName(), routingKey, message);
    }
}
