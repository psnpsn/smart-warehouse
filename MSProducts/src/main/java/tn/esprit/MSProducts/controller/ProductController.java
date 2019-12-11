/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.controller;

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
import tn.esprit.MSProducts.entity.Product;
import tn.esprit.MSProducts.service.ProductService;

/**
 *
 * @author psn
 */
@RestController
@RequestMapping("prod")
public class ProductController {
    
        private final ProductService productService;

    public ProductController(final ProductService productService) {
        this.productService = productService;
    }
        
	@GetMapping
	public Flux<Product> getAll() {
		return productService.getAll();
	}
	@GetMapping("{id}")
	public Mono getById(@PathVariable("id") final String id) {
		return productService.getById(id);
	}
	@PutMapping("{id}")
	public Mono updateById(@PathVariable("id") final String id, @RequestBody final Product product) {
		return productService.update(id, product);
	}
	@PostMapping
	public Mono save(@RequestBody final Product product) {
		return productService.save(product);
	}
	@DeleteMapping("{id}")
	public Mono delete(@PathVariable final String id) {
		return productService.delete(id);
	}
        
}
