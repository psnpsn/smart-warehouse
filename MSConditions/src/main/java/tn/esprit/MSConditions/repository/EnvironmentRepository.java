package tn.esprit.MSConditions.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.MSConditions.entity.Environment;;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EnvironmentRepository extends CrudRepository<Environment, Integer> {

}
