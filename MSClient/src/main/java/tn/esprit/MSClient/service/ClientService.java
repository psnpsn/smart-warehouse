/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.esprit.MSClient.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import tn.esprit.MSClient.entity.Client;
import tn.esprit.MSClient.repository.ClientRepository;

/**
 *
 * @author user
 */

@Service
public class ClientService {
    @Autowired
    private ClientRepository repo;
    
    public Client create(Client client){
        System.out.println(client.toString());
        return repo.save(client);
    }
    
    public Client getClient(String id){
        return repo.findById(id).orElse(null);
    }
    
    public List<Client> getAll(){
        return repo.findAll();
    }
    
    public void delete(Client client){
        repo.delete(client);
    }
    
    public void update(Client client){
        repo.save(client);
    }
    
}
