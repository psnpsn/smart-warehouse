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
import tn.esprit.MSProducts.entity.Category;
import tn.esprit.MSProducts.service.CategoryService;

/**
 *
 * @author psn
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping
	public Flux<Category> getAll() {
		return categoryService.getAll();
	}
	@GetMapping("{id}")
	public Mono getById(@PathVariable("id") final String id) {
		return categoryService.getById(id);
	}
	@PutMapping("{id}")
	public Mono updateById(@PathVariable("id") final String id, @RequestBody final Category category) {
		return categoryService.update(id, category);
	}
	@PostMapping
	public Mono save(@RequestBody final Category category) {
		return categoryService.save(category);
	}
	@DeleteMapping("{id}")
	public Mono delete(@PathVariable final String id) {
		return categoryService.delete(id);
	}
}
