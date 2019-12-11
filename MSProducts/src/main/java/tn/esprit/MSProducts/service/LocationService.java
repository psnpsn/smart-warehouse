/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Location;

/**
 *
 * @author psn
 */
public interface LocationService {
    
    public Flux<Location> getAll();
    
    public Mono<Location> getById(final String id);
    
    public Mono update(final String id, final Location location);
    
    public Mono save(final Location location);
    
    public Mono delete(final String id);
    
}
