/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tn.esprit.MSForklift.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.MSForklift.entity.Forklift;
import tn.esprit.MSForklift.repository.ForkliftRepository;

/**
 *
 * @author user
 */
@Service
public class ForkliftService {

    @Autowired
    private ForkliftRepository repo;
    
    public Forklift create(Forklift forklift){
        System.out.println(forklift.toString());
        return repo.save(forklift);
    }
    
    public Forklift getForklift(String id){
        return repo.findById(id).orElse(null);
    }
    
    public List<Forklift> getAll(){
        return repo.findAll();
    }
    
    public void delete(Forklift forklift){
        repo.delete(forklift);
    }
    
    public void update(Forklift forklift){
        repo.save(forklift);
    }

}
