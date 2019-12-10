/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSTagReader;

import org.springframework.amqp.core.Queue;

/**
 *
 * @author psn
 */
public class RabbitConfiguration {
    
    private String fanoutExchange;
    
    private String queueName;
    
    Queue queue() {
        return new Queue(queueName, true);
    }
    
}
