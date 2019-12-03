/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSEmployees.service;

import java.util.Objects;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.MSEmployees.entity.Employee;
import tn.esprit.MSEmployees.repository.EmployeeRepository;

/**
 *
 * @author psn
 */
@Service
public class EmployeeService {
    
    private final EmployeeRepository empRepository;

    public EmployeeService(final EmployeeRepository empRepository) {
        this.empRepository = empRepository;
    }
    
    
    
    public Flux<Employee> getAll() {
		return empRepository.findAll().switchIfEmpty(Flux.empty());
	}
	public Mono<Employee> getById(final String id) {
		return empRepository.findById(id);
	}
	public Mono update(final String id, final Employee emp) {
		return empRepository.save(emp);
	}
	public Mono save(final Employee emp) {
		return empRepository.save(emp);
	}
	public Mono delete(final String id) {
		final Mono<Employee> dbEmployee = getById(id);
		if (Objects.isNull(dbEmployee)) {
			return Mono.empty();
		}
		return getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(empToBeDeleted -> empRepository
				.delete(empToBeDeleted).then(Mono.just(empToBeDeleted)));
	}
}
