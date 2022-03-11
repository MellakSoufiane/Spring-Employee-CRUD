package fr.formation.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="DEPARTEMENT")
public class Departement {
	
	  @Id 
	  private Long id;

	  @Column(name="nom")
	  private String nom;
//	  @OneToMany(mappedBy="departement",
//				fetch=FetchType.EAGER,
//				cascade=CascadeType.ALL)
//	private List<Employee> employees = new ArrayList<>();

	 public Departement() {}

	public Departement(String nom) {
		super();
		this.nom = nom;
	}

	public Long getId() {
		
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	 @Override
	  public String toString() {
	    return "Departement [id=" + id + ", nom=" + nom + "]";
	  }
	
}
