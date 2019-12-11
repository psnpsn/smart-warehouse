/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.MSSupplier.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.MSSupplier.entity.Supplier;
import tn.esprit.MSSupplier.repository.SupplierRepository;

/**
 *
 * @author oussa
 */
@Service
public class SupplierService {
    
    @Autowired
    private SupplierRepository repo;
    
    public Supplier create(Supplier supplier){
        System.out.println(supplier.toString());
        return repo.save(supplier);
    }
    
    public Supplier getSupplier(String id){
        return repo.findById(id).orElse(null);
    }
    
    public List<Supplier> getAll(){
        return repo.findAll();
    }
    
    public void delete(Supplier supplier){
        repo.delete(supplier);
    }
    
    public void update(Supplier supplier){
        repo.save(supplier);
    }
    
}
