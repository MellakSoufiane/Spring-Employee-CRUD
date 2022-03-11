package fr.formation.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import fr.formation.domain.Employee;
import fr.formation.pojo.EmployeeDTO;



public interface EmployeeService {
//	EmployeeDTO findEmployee(Long employeeId) throws EntityNotFoundException;
//	Employee createEmployee(Employee employeeId);
//	
//	void deleteEmployee(Long employeeId) throws EntityNotFoundException;
//	void updateEmployee(long employeeId, EmployeeDTO employeeDTO) throws EntityNotFoundException;
	
	
	public Employee insert(Employee employee);
	

}




