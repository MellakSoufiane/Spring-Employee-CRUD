package fr.formation.pojo;

import java.util.List;

import fr.formation.domain.Employee;

public class DepartementDTO {

	public Integer id;
	public String nom;
	public List<Employee> employee;
	
	public DepartementDTO() {
		
	}

	public DepartementDTO(String nom) {
		super();
		this.nom = nom;
	}

	public DepartementDTO( String nom, List<Employee> employee) {
		super();
		
		this.nom = nom;
		this.employee = employee;
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	


}
