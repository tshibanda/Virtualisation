package com.dupuidstshibanda.webservice.model;

import javax.persistence.*;

import org.springframework.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "eleves")
public class Eleve {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Long id;
    
    @NonNull
    @Column(name="prenom", length = 50)
    public String prenom;

    @Column(name="nom", length = 50)
    public String nom;
    
    @Column(name="email", length = 100)
    public String email;
    
    @Column(name="note", length = 2)
    public int note;
    
    
    public Eleve() {
		this.prenom = "";
		this.nom = "";
		this.email = "";
		this.note = 0;
	}


    public String getPrenom() {
    	return prenom;
    }

    public String getNom() {
    	return nom;
    }

    public String getEmail() {
    	return email;
    }

    public int getNote() {
    	return note;
    }

    public void setPrenom(String prenom) {
    	this.prenom = prenom;
    }
    
    public void setNom(String nom) {
    	this.nom = nom;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public void setNote(int note) {
    	this.note = note;
    }

}