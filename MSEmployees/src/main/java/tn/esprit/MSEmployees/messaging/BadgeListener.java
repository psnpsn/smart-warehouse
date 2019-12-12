/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSEmployees.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import reactor.core.publisher.Mono;
import tn.esprit.MSEmployees.entity.Badge;
import tn.esprit.MSEmployees.entity.Employee;
import tn.esprit.MSEmployees.service.BadgeService;
import tn.esprit.MSEmployees.service.EmployeeService;

/**
 *
 * @author psn
 */
@EnableBinding(BadgeBinding.class)
public class BadgeListener {
    
    @Autowired
    private BadgeService badgeService;
    
    @Autowired
    private EmployeeService employeeService;
    
    @StreamListener(target = BadgeBinding.BADGE)
    public void processTagChannelTagReading(BadgeRead badgeRead) {
        
        Mono<Employee> emp = employeeService.getByBadgeId(badgeRead.getId());
        Mono<Badge> badge = badgeService.getById(badgeRead.getId());
        
        Employee e = emp.block();
        String s = e.getStatus();
        if ( s.equals("left") ){
            e.setStatus("on site");
        }else{
            e.setStatus("left");
        }
        
        System.out.println(badgeRead.toString());
    }
    
}
