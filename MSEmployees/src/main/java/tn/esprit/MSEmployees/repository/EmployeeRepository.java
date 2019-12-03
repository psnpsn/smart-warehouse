/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSEmployees.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import tn.esprit.MSEmployees.entity.Employee;

/**
 *
 * @author psn
 */
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
    
}
