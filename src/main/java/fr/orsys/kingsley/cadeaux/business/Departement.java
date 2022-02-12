package fr.orsys.kingsley.cadeaux.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	private String nom;
	private String numero; 
	
	@OneToMany(mappedBy = "departement")
	private List<Ville> villes;
	
	@ManyToOne()
	private Region region;
}
