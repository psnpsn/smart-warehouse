/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSProducts.entity;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author psn
 */
@Document(collection = "product")
public class Product {
    
    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private String addedDate;
    private String condition;
    private Tag tag;
    private Location location;
    private Category category;
    private String supplierId;

    public Product() {
    }

    public Product(String id, String name, String description, Double price, String addedDate, String condition, Tag tag, Location location, Category category, String supplierId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.addedDate = addedDate;
        this.condition = condition;
        this.tag = tag;
        this.location = location;
        this.category = category;
        this.supplierId = supplierId;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", addedDate=" + addedDate + ", condition=" + condition + ", tag=" + tag + ", location=" + location + ", category=" + category + ", supplierId=" + supplierId + '}';
    }
    
    
    
}
