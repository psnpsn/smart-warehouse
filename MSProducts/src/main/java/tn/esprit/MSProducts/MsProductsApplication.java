package tn.esprit.MSProducts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import reactor.core.publisher.Mono;
import tn.esprit.MSProducts.entity.Category;
import tn.esprit.MSProducts.entity.Location;
import tn.esprit.MSProducts.entity.Product;
import tn.esprit.MSProducts.entity.Tag;
import tn.esprit.MSProducts.service.CategoryService;
import tn.esprit.MSProducts.service.LocationService;
import tn.esprit.MSProducts.service.ProductService;

@SpringBootApplication
@EnableEurekaClient
public class MsProductsApplication {

       
        
	public static void main(String[] args) {
//		SpringApplication.run(MsProductsApplication.class, args);
                
                ApplicationContext context = SpringApplication.run(MsProductsApplication.class, args);
                        
                LocationService locationService = context.getBean(LocationService.class);
                
                CategoryService categoryService = context.getBean(CategoryService.class);
                
                ProductService productService = context.getBean(ProductService.class);
                
               
                Location location = new Location();
                Category category = new Category();
                
                Tag tag = new Tag("T001","G001","2019-12-02 13:50:22");
                
                Mono<Location> loc = locationService.getById("L001");
                location = loc.block();
                 System.out.println(location.toString());
                Mono<Category> cat = categoryService.getById("C001");
                category = cat.block();
                
                Product product = new Product("POO1","Potato","Potato from kairouane",0.7,"2019-11-29","85,30",tag.getId(),location,category,"S001");
                Mono<Product> prod = productService.save(product);
                Product pro = prod.block();
                System.out.println(pro.toString());
	}

}
