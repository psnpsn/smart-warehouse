/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Product;
import tn.esprit.MSProducts.entity.Tag;

/**
 *
 * @author psn
 */
public interface ProductRepository extends ReactiveMongoRepository<Product, String>{
    
    public Mono<Product> findOneByTagId(final String tagId);
    
}
