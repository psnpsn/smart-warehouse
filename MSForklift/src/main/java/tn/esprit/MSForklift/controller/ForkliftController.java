/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.esprit.MSForklift.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.MSForklift.entity.Forklift;
import tn.esprit.MSForklift.service.ForkliftService;

/**
 *
 * @author user
 */
@RestController
public class ForkliftController {
    @Autowired
    private ForkliftService service;
    
    @GetMapping("/forklift/{id}")
    public ResponseEntity<Forklift> getForklift(@PathVariable String id){
        return new ResponseEntity<>(service.getForklift(id), HttpStatus.OK);
    }
    
    @GetMapping("/forklift/all")
    public ResponseEntity<List<Forklift>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("/forklift")
    public ResponseEntity<Forklift> saveForklift(@RequestBody Forklift forklift){
        return new ResponseEntity<>(service.create(forklift), HttpStatus.OK);
    }
    
    @PutMapping("/forklift")
    public ResponseEntity<String> updateForklift(@RequestBody Forklift forklift){
        service.update(forklift);
        return new ResponseEntity<>("Forklift updated successfully", HttpStatus.OK);
    }
    
    @DeleteMapping("/forklift/{id}")
    public ResponseEntity<String> deleteForklift(@PathVariable String id){
        Forklift forklift = new Forklift();
        forklift = service.getForklift(id);
        service.delete(forklift);
        return new ResponseEntity<>("Forklift deleted successfully", HttpStatus.OK);
    }

}
