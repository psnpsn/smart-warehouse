/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import tn.esprit.MSProducts.entity.Product;

/**
 *
 * @author psn
 */
public interface ProductRepository extends ReactiveMongoRepository<Product, String>{
    
}