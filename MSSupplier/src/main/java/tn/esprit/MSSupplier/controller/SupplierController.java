/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSSupplier.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.MSSupplier.entity.Supplier;
import tn.esprit.MSSupplier.service.SupplierService;

/**
 *
 * @author oussa
 */
@RestController
public class SupplierController {
    
    @Autowired
    private SupplierService service;
    
    @GetMapping("/supplier/{id}")
    public ResponseEntity<Supplier> getSupplier(@PathVariable String id){
        return new ResponseEntity<>(service.getSupplier(id), HttpStatus.OK);
    }
    
    @GetMapping("/supplier/all")
    public ResponseEntity<List<Supplier>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("/supplier")
    public ResponseEntity<Supplier> saveSupplier(@RequestBody Supplier supplier){
        return new ResponseEntity<>(service.create(supplier), HttpStatus.OK);
    }
    
    @PutMapping("/supplier")
    public ResponseEntity<String> updateSupplier(@RequestBody Supplier supplier){
        service.update(supplier);
        return new ResponseEntity<>("Supplier updated successfully", HttpStatus.OK);
    }
    
    @DeleteMapping("/supplier/{id}")
    public ResponseEntity<String> deleteSupplier(@PathVariable String id){
        Supplier supplier = new Supplier();
        supplier = service.getSupplier(id);
        service.delete(supplier);
        return new ResponseEntity<>("Supplier deleted successfully", HttpStatus.OK);
    }
}
