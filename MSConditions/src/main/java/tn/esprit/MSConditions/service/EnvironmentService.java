package tn.esprit.MSConditions.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import tn.esprit.MSConditions.entity.Environment;
import tn.esprit.MSConditions.repository.EnvironmentRepository;


@Service
public class EnvironmentService	 {

	
	@Autowired
	private EnvironmentRepository candidatRepository;
	
	
	//Ajouter un candidat
	public Environment addCandidat(Environment candidat) {
		return candidatRepository.save(candidat);
	}
	
	
	//Mettre a jour les informations d'un candidat
	public Environment updateCandidat(int id, Environment newCandidat) {
		if(candidatRepository.findById(id).isPresent()) {
			Environment existingCandidat = candidatRepository.findById(id).get();
			existingCandidat.setId(newCandidat.getId());
			existingCandidat.setTemperature(newCandidat.getTemperature());
			existingCandidat.setHumidity(newCandidat.getHumidity());
			
			return candidatRepository.save(existingCandidat);
		}
		else {
			return null;
		}
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
	public  List<Environment> GetCandidats() {
		return (List<Environment>) candidatRepository.findAll();
	}
	
	//Methode additionnelle (Pas dans l'atelier)
	//Chercher un candidat
	public Environment findCandidat(int id) {
		if(candidatRepository.findById(id).isPresent()) {
			Environment existingCandidat = candidatRepository.findById(id).get();
			return existingCandidat;
		}
		else {
			return null;
		}
	}
	
	
	
	
}
