/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Product;
import tn.esprit.MSProducts.entity.Tag;

/**
 *
 * @author psn
 */
public interface ProductService {
    
    public Flux<Product> getAll();
    
    public Mono<Product> getById(final String id);
    
    public Mono update(final String id, final Product product);
    
    public Mono save(final Product product);
    
    public Mono delete(final String id);

    public Mono<Product> getByTagId(String tagId);
    
}
