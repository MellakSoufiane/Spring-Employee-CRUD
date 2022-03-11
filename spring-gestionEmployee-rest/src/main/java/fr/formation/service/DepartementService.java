package fr.formation.service;

import javax.persistence.EntityNotFoundException;

import fr.formation.pojo.DepartementDTO;


public interface DepartementService {

	DepartementDTO findDepartement(Long departementId) throws EntityNotFoundException;
	DepartementDTO createDepartement(DepartementDTO departementDTO);
	
	void deleteDepartement(Long departementId) throws EntityNotFoundException;
	void updateDepartement(long departementId, DepartementDTO departementDTO) throws EntityNotFoundException;
}
