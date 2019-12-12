/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Category;

/**
 *
 * @author psn
 */
public interface CategoryService {
    
    public Flux<Category> getAll();
    
    public Mono<Category> getById(final String id);
    
    public Mono update(final String id, final Category category);
    
    public Mono save(final Category category);
    
    public Mono delete(final String id);
    
}
