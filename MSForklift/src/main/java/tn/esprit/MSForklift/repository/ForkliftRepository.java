/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.esprit.MSForklift.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.MSForklift.entity.Forklift;

/**
 *
 * @author user
 */
public interface ForkliftRepository extends MongoRepository<Forklift, String>{
    
    public Forklift findById(String id);
    
}


