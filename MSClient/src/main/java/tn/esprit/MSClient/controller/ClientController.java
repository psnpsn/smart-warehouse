/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.esprit.MSClient.controller;

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
import tn.esprit.MSClient.entity.Client;
import tn.esprit.MSClient.service.ClientService;

/**
 *
 * @author user
 */
@RestController
public class ClientController {

@Autowired
    private ClientService service;
    
    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClient(@PathVariable String id){
        return new ResponseEntity<>(service.getClient(id), HttpStatus.OK);
    }
    
    @GetMapping("/client/all")
    public ResponseEntity<List<Client>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("/client")
    public ResponseEntity<Client> saveClient(@RequestBody Client client){
        return new ResponseEntity<>(service.create(client), HttpStatus.OK);
    }
    
    @PutMapping("/client")
    public ResponseEntity<String> updateClient(@RequestBody Client client){
        service.update(client);
        return new ResponseEntity<>("Client updated successfully", HttpStatus.OK);
    }
    
    @DeleteMapping("/client/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable String id){
        Client client = new Client();
        client = service.getClient(id);
        service.delete(client);
        return new ResponseEntity<>("Client deleted successfully", HttpStatus.OK);
    }


}
