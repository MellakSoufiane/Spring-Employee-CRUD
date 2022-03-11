package fr.formation.service;

import javax.persistence.EntityNotFoundException;

import fr.formation.pojo.EmployeeDTO;



public interface EmployeeService {
	EmployeeDTO findEmployee(Long employeeId) throws EntityNotFoundException;
	EmployeeDTO createEmployee(EmployeeDTO employeeId);
	
	void deleteEmployee(Long employeeId) throws EntityNotFoundException;
	void updateEmployee(long employeeId, EmployeeDTO employeeDTO) throws EntityNotFoundException;
}




