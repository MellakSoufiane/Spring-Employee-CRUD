package fr.formation.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.formation.dao.EmployeeRepository;
import fr.formation.domain.Employee;
import fr.formation.pojo.EmployeeDTO;


@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public Employee insert(Employee employee) {
		Employee employeedata = new Employee();
		employeedata.setNom(employee.getNom());
		employeedata.setPrenom(employee.getPrenom());
		employeedata.setNaissance(employee.getNaissance());
		employeedata.setAnciennete(employee.getAnciennete());
		
		employeeRepository.save(employee);
		employee.setMatricule(employeedata.getMatricule());
		
		return employee;
	}

	

}
