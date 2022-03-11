package fr.formation.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import fr.formation.dao.DepartementRepository;
import fr.formation.dao.EmployeeRepository;
import fr.formation.domain.Departement;


@Service
public class DepartementServiceImpl implements DepartementService {

	@Autowired
	private DepartementRepository departementRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Departement> fetchDepartementList() {
		
		return departementRepository.findAll();
	}

	@Override
	public Departement saveDepartement(Departement departement) {
		return departementRepository.save(departement);
	}

	@Override
	public Departement fetchDepartementById(Long deptId) {
		return departementRepository.findById(deptId).get();
	}

	@Override
	public void deleteDepartementById(Long deptId) {
		departementRepository.deleteById(deptId);
		
	}

	@Override
	public Departement updateDepartement(Departement departement, Long deptId) {
		Departement newDepartment = departementRepository.findById(deptId).get();
		newDepartment.setDepartName(departement.getDepartName());
		departementRepository.save(newDepartment);
        return newDepartment;
	}

	

}
