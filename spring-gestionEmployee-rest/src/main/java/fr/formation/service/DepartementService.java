package fr.formation.service;

import javax.persistence.EntityNotFoundException;

import fr.formation.domain.Departement;
import fr.formation.pojo.DepartementDTO;


public interface DepartementService {

//	Departement findDepartement(int departementId) ;
	Departement createDepartement(Departement departement);
	
//	void deleteDepartement(Long departementId) throws EntityNotFoundException;
//	void updateDepartement(long departementId, DepartementDTO departementDTO) throws EntityNotFoundException;
}
