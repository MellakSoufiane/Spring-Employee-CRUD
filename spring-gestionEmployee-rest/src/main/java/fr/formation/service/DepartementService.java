package fr.formation.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;



import fr.formation.domain.Departement;
import fr.formation.pojo.DepartementDTO;


public interface DepartementService {

	 public List<Departement> fetchDepartementList();

	    public Departement saveDepartement(Departement departement);

	    public Departement fetchDepartementById(Long deptId);

	    

	    void deleteDepartementById(Long deptId);

	    public Departement updateDepartement(Departement departement,Long deptId);
}
