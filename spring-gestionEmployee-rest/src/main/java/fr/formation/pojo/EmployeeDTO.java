package fr.formation.pojo;


import fr.formation.domain.Departement;


public class EmployeeDTO {

	public int matricule;
	public String nom;
	public String prenom;
	public String naissance;
	public int anciennete;
	public Departement departement;
	
	public EmployeeDTO() {
		
	}

	public EmployeeDTO(String nom, String prenom, String naissance, int anciennete) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		this.anciennete = anciennete;
	}

	public EmployeeDTO( String nom, String prenom, String naissance, int anciennete,
			Departement departement) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
		this.anciennete = anciennete;
		this.departement = departement;
	}

	public long getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
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
