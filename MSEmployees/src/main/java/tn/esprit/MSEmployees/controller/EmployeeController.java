/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSEmployees.controller;

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
import tn.esprit.MSEmployees.entity.Employee;
import tn.esprit.MSEmployees.repository.EmployeeRepository;
import tn.esprit.MSEmployees.service.EmployeeService;

/**
 *
 * @author psn
 */
@RestController
@RequestMapping("emp")
public class EmployeeController {
    
    private final EmployeeService service;

    public EmployeeController(final EmployeeService service) {
        this.service = service;
    }
    
    
    
        @GetMapping
	public Flux<Employee> getAll() {
		return service.getAll();
	}
	@GetMapping("{id}")
	public Mono getById(@PathVariable("id") final String id) {
		return service.getById(id);
	}
	@PutMapping("{id}")
	public Mono updateById(@PathVariable("id") final String id, @RequestBody final Employee emp) {
		return service.update(id, emp);
	}
	@PostMapping
	public Mono save(@RequestBody final Employee emp) {
		return service.save(emp);
	}
	@DeleteMapping("{id}")
	public Mono delete(@PathVariable final String id) {
		return service.delete(id);
	}
}
