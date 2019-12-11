/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Location;
import tn.esprit.MSProducts.service.LocationService;

/**
 *
 * @author psn
 */
@RestController
@RequestMapping("location")
public class LocationController {
    
    @Autowired
    private LocationService locationService;
    
    @GetMapping
	public Flux<Location> getAll() {
		return locationService.getAll();
	}
	@GetMapping("{id}")
	public Mono getById(@PathVariable("id") final String id) {
		return locationService.getById(id);
	}
	@PutMapping("{id}")
	public Mono updateById(@PathVariable("id") final String id, @RequestBody final Location location) {
		return locationService.update(id, location);
	}
	@PostMapping
	public Mono save(@RequestBody final Location location) {
		return locationService.save(location);
	}
	@DeleteMapping("{id}")
	public Mono delete(@PathVariable final String id) {
		return locationService.delete(id);
	}
}
