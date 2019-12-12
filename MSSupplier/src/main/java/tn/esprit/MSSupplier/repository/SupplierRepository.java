/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSSupplier.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.esprit.MSSupplier.entity.Supplier;

/**
 *
 * @author oussa
 */
public interface SupplierRepository extends MongoRepository<Supplier, String>{
    
    public Supplier findByName(String name);
    
}
