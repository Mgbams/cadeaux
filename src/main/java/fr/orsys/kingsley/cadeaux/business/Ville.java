package fr.orsys.kingsley.cadeaux.business;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Ville {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	@Column(length = 100, unique = true, nullable = false)
	private String nom;
	private String codePostal;
	
	@Column(nullable = false)
	private Double latitude;
	
	@Column(nullable = false)
	private Double longitude;
	
	private String codeInsee;
	private int nbHabitants;
	
	@Lob
	private String description;
	private LocalDate dateAdhesion;
	
	@ManyToOne
	private Departement departement;
}
