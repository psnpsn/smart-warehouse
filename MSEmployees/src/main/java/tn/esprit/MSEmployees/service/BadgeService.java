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
import tn.esprit.MSEmployees.entity.Badge;
import tn.esprit.MSEmployees.repository.BadgeRepository;

/**
 *
 * @author psn
 */
@Service
public class BadgeService {
    
    private final BadgeRepository empRepository;

    public BadgeService(final BadgeRepository empRepository) {
        this.empRepository = empRepository;
    }
    
    
    
    public Flux<Badge> getAll() {
		return empRepository.findAll().switchIfEmpty(Flux.empty());
	}
	public Mono<Badge> getById(final String id) {
		return empRepository.findById(id);
	}
	public Mono update(final String id, final Badge emp) {
		return empRepository.save(emp);
	}
	public Mono save(final Badge emp) {
		return empRepository.save(emp);
	}
	public Mono delete(final String id) {
		final Mono<Badge> dbBadge = getById(id);
		if (Objects.isNull(dbBadge)) {
			return Mono.empty();
		}
		return getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(empToBeDeleted -> empRepository
				.delete(empToBeDeleted).then(Mono.just(empToBeDeleted)));
	}
    
}
