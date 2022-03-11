package fr.formation.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.dao.DepartementRepository;
import fr.formation.domain.Departement;
import fr.formation.domain.Employee;
import fr.formation.pojo.DepartementDTO;
import fr.formation.pojo.EmployeeDTO;

@Transactional
@Service
public class DepartementServiceImpl implements DepartementService {

	@Autowired
	private DepartementRepository departementRepository;

	@Override
	public Departement createDepartement(Departement departement) {
		Departement departementdata=new Departement();
		departementdata.setId(departement.getId());
		departementdata.setNom(departement.getNom());
		departementRepository.save(departementdata);
	
		return departement;
	}

}
