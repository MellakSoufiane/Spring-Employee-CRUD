package fr.formation.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="EMPLOYEE")
public class Employee {

	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long matricule;

	 	@Column(nullable = false)
		public String nom;
		
		@Column(nullable = false)
		public String prenom;
		
		@Column(nullable = false)
		public String naissance;
		
		@Column(nullable = false)
		public int anciennete;
	
		@ManyToOne
		  @JoinColumn(name = "dept_id")
		  @JsonIgnore
		  private Departement departement;

		public Long getMatricule() {
			return matricule;
		}

		public void setMatricule(Long matricule) {
			this.matricule = matricule;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getNaissance() {
			return naissance;
		}

		public void setNaissance(String naissance) {
			this.naissance = naissance;
		}

		public int getAnciennete() {
			return anciennete;
		}

		public void setAnciennete(int anciennete) {
			this.anciennete = anciennete;
		}

		public Departement getDepartement() {
			return departement;
		}

		public void setDepartement(Departement departement) {
			this.departement = departement;
		}
		
		
}
