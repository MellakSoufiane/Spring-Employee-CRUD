package fr.formation.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.formation.dao.DepartementRepository;
import fr.formation.dao.EmployeeRepository;
import fr.formation.domain.Departement;
import fr.formation.domain.Employee;
import fr.formation.pojo.EmployeeDTO;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DepartementRepository departementRepository;

	@Override
	public Employee saveEmployeewithNewDepartement(Employee employee) {
		departementRepository.save(employee.getDepartement());
	        return employeeRepository.save(employee);
	}

	@Override
	public Employee saveEmployee(Employee employee, Long DeptId) {
			Departement departement = departementRepository.findById(DeptId).get();
			employee.setDepartement(departement);
	        return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeById(Long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}

	@Override
	public Employee updateEmployee(Employee employee, Long employeeId) {
		Employee emp = employeeRepository.findById(employeeId).get();
		emp.setNom( employee.getNom() );
		emp.setPrenom( employee.getPrenom() );
		emp.setNaissance( employee.getNaissance() );
		emp.setAnciennete( employee.getAnciennete() );

		employeeRepository.save(emp);

        return emp;
	}

	


	

	

}
