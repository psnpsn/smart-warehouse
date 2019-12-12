/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.service;

import java.util.Objects;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Product;
import tn.esprit.MSProducts.entity.Tag;
import tn.esprit.MSProducts.repository.ProductRepository;

/**
 *
 * @author psn
 */
@Service
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepository productRepository;

    public ProductServiceImpl(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @Override
    public Flux<Product> getAll() {
        return productRepository.findAll().switchIfEmpty(Flux.empty());
    }
    
    @Override
    public Mono<Product> getById(final String id) {
        return productRepository.findById(id);
    }
    
    @Override
    public Mono update(final String id, final Product product) {
	return productRepository.save(product);
    }
    
    @Override
    public Mono save(final Product product) {
	return productRepository.save(product);
    }
    
    @Override
    public Mono delete(final String id) {
	final Mono<Product> dbProduct = getById(id);
	if (Objects.isNull(dbProduct)) {
            return Mono.empty();
	}
	return getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(productToBeDeleted -> productRepository
		.delete(productToBeDeleted).then(Mono.just(productToBeDeleted)));
    }

    @Override
    public Mono<Product> getByTagId(String tagId) {
        return productRepository.findOneByTagId(tagId);
    }
    
}
