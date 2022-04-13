package com.dupuidstshibanda.webservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dupuidstshibanda.webservice.model.Eleve;
import com.dupuidstshibanda.webservice.repository.EleveRepository;

import lombok.Data;

@Data
@Service
public class EleveService {
	
	@Autowired
	private EleveRepository EleveRepository;
	
	public Optional<Eleve> getEleve(final Long id) {
		return EleveRepository.findById(id);
	}
	
	public Iterable<Eleve> getEleves() {
		return EleveRepository.findAll();
	}
	
	public void deleteEleve(final Long id) {
		EleveRepository.deleteById(id);
	}
	
	public Eleve saveEleve(Eleve Eleve) {
		Eleve savedEleve = EleveRepository.save(Eleve);
		return savedEleve;
	}

}