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
import tn.esprit.MSProducts.entity.Category;
import tn.esprit.MSProducts.repository.CategoryRepository;

/**
 *
 * @author psn
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Flux<Category> getAll() {
        return categoryRepository.findAll().switchIfEmpty(Flux.empty());
    }

    @Override
    public Mono<Category> getById(String id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Mono update(String id, Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Mono save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Mono delete(String id) {
        final Mono<Category> dbCategory = getById(id);
        if (Objects.isNull(dbCategory)){
            return Mono.empty();
        }
        return dbCategory.switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(categoryToBeDeleted -> categoryRepository
		.delete(categoryToBeDeleted).then(Mono.just(categoryToBeDeleted)));
    }
    
}
