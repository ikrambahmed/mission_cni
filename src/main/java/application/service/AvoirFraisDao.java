package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.AvoirFrais;
import application.repository.AvoirFraisRepository;

@Service
public class AvoirFraisDao implements IAvoirFrais {
	
	@Autowired
	AvoirFraisRepository avoirFraisRespository;

	@Override
	public List<AvoirFrais> getFrais() {
		return avoirFraisRespository.findAll() ; 
	}

	@Override
	public AvoirFrais addFrais(AvoirFrais frais) {
		return avoirFraisRespository.save(frais) ; 
	}

	@Override
	public void updateFrais(AvoirFrais frais) {
		avoirFraisRespository.save(frais) ; 		
	}

	@Override
	public void deleteFrais(AvoirFrais frais) {
	
		
	}
	
	
	
	
}
