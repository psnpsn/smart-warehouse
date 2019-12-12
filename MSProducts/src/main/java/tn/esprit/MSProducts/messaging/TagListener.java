/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Location;
import tn.esprit.MSProducts.entity.Product;
import tn.esprit.MSProducts.entity.Tag;
import tn.esprit.MSProducts.service.LocationService;
import tn.esprit.MSProducts.service.ProductService;

/**
 *
 * @author psn
 */
@EnableBinding(TagBinding.class)
public class TagListener {
    
    @Autowired
    private ProductService productService;
    
    @Autowired
    private LocationService locationService;
    
    @StreamListener(target = TagBinding.TAG_READING)
    public void processTagChannelTagReading(Tag tag) {
        
        Mono<Product> product = productService.getByTagId(tag.getId());
        Mono<Location> loc = locationService.getByGatewayId(tag.getGatewayId());
        
        Location location = loc.block();
        
        
        Product prod = product.block();
        prod.setLocation(location);
        System.out.println(prod.toString());
                
        productService.save(prod);
      
        System.out.println(tag.toString());
    }
    
}
