/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.service;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Location;
import tn.esprit.MSProducts.repository.LocationRepository;

/**
 *
 * @author psn
 */
@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;
    
    @Override
    public Flux<Location> getAll() {
        return locationRepository.findAll().switchIfEmpty(Flux.empty());
    }

    @Override
    public Mono<Location> getById(String id) {
        return locationRepository.findById(id).switchIfEmpty(Mono.empty());
    }

    @Override
    public Mono update(String id, Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Mono save(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Mono delete(String id) {
        final Mono<Location> dbLocation = getById(id);
        if (Objects.isNull(dbLocation)){
            return Mono.empty();
        }
        return dbLocation.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(locationToBeDeleted -> locationRepository
		.delete(locationToBeDeleted).then(Mono.just(locationToBeDeleted)));
    }

    @Override
    public Mono<Location> getByGatewayId(String gatewayId) {
        return locationRepository.findOneByGatewayId(gatewayId);
    }
    
}
