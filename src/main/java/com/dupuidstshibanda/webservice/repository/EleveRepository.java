package com.dupuidstshibanda.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dupuidstshibanda.webservice.model.Eleve;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long> {

}