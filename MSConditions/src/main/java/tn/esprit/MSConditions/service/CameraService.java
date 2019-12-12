package tn.esprit.MSConditions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.MSConditions.entity.Camera;
import tn.esprit.MSConditions.entity.Environment;
import tn.esprit.MSConditions.repository.CameraRepository;
import tn.esprit.MSConditions.repository.EnvironmentRepository;

public class CameraService {
	@Autowired
	private CameraRepository candidatRepository;
	
	
	//Ajouter un candidat
	public Camera addCandidat(Camera candidat) {
		return candidatRepository.save(candidat);
	}
	
	

	
	//Supprimer un candidat
	public String deleteCandidat(int id) {
		if(candidatRepository.findById(id).isPresent()) {
			candidatRepository.deleteById(id);
			return "Le candidat avec l'id " + id + " a ete supprime";
		}
		else {
			return "Le candidat avec l'id " + id + " n'a pas ete supprime";
		}
	}
	
	
	
	//Obtenir tous les candidats
	public  List<Camera> GetCandidats() {
		return (List<Camera>) candidatRepository.findAll();
	}
	
	//Methode additionnelle (Pas dans l'atelier)
	//Chercher un candidat
	public Camera findCandidat(int id) {
		if(candidatRepository.findById(id).isPresent()) {
			Camera existingCandidat = candidatRepository.findById(id).get();
			return existingCandidat;
		}
		else {
			return null;
		}
	}
	
	
	
	

}
