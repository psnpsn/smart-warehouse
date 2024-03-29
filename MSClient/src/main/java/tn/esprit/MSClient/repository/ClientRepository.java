/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.esprit.MSClient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.MSClient.entity.Client;

/**
 *
 * @author user
 */
public interface ClientRepository extends MongoRepository<Client, String>{
    
    public Client findByNom(String nom);
    
}
