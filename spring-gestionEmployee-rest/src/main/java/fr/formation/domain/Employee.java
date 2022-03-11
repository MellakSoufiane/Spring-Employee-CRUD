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
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data   // Lombok => getter , setters , ToString  ..
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long matricule;

	 	@NotBlank(message = "Please enter the employee name !")
		public String nom;
		public String prenom;
		public String naissance;
		public int anciennete;
		
		@ManyToOne(
	            fetch = FetchType.LAZY
	    )
	    @JoinColumn(
	            name = "departement_id"
	    )
	   @JsonIgnore
	   private Departement departement;
		
}
