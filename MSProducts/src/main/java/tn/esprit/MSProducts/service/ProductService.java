/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.service;

import java.util.Objects;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Product;
import tn.esprit.MSProducts.repository.ProductRepository;

/**
 *
 * @author psn
 */
public class ProductService {
    
    private final ProductRepository productRepository;

    public ProductService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    
    
	public Flux<Product> getAll() {
		return productRepository.findAll().switchIfEmpty(Flux.empty());
	}
	public Mono<Product> getById(final String id) {
		return productRepository.findById(id);
	}
	public Mono update(final String id, final Product product) {
		return productRepository.save(product);
	}
	public Mono save(final Product product) {
		return productRepository.save(product);
	}
	public Mono delete(final String id) {
		final Mono<Product> dbProduct = getById(id);
		if (Objects.isNull(dbProduct)) {
			return Mono.empty();
		}
		return getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(productToBeDeleted -> productRepository
				.delete(productToBeDeleted).then(Mono.just(productToBeDeleted)));
	}
    
}
