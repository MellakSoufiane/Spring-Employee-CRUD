package fr.formation.service;

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
	public EmployeeDTO findEmployee(Long employeeId) throws EntityNotFoundException {
		Employee employee=null;
		employee=employeeRepository.findById(employeeId)
				.orElseThrow(
						()-> new EntityNotFoundException("Impossible de trouver un employee avec ce matricule : " + employeeId));
		return new EmployeeDTO(employee.getMatricule(), employee.getNom(), employee.getPrenom(), employee.getNaissance(), employee.getAnciennete(), employee.getDepartement());
	}

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employeeId) {
		Employee employee=new Employee();
		employee.setAnciennete(employeeId.getAnciennete());
		employee.setMatricule(employeeId.getMatricule());
		employee.setNaissance(employeeId.getNaissance());
		employee.setNom(employeeId.getNom());
		employee.setPrenom(employeeId.getPrenom());
		
		employeeRepository.save(employee);
		return employeeId;
	}

	@Override
	public void deleteEmployee(Long employeeId) throws EntityNotFoundException {
	Employee employee=employeeRepository.findById(employeeId)
				.orElseThrow(
						()-> new EntityNotFoundException("Impossible de trouver un employee avec ce matricule : " + employeeId));
	employeeRepository.delete(employee);
	}

	@Override
	public void updateEmployee(long employeeId, EmployeeDTO employeeDTO) throws EntityNotFoundException {
		Employee employee=employeeRepository.findById(employeeId)
				.orElseThrow(
						()-> new EntityNotFoundException("Impossible de trouver un employee avec ce matricule : " + employeeId));
		employee.setAnciennete(employeeDTO.getAnciennete());
		employee.setMatricule(employeeDTO.getMatricule());
		employee.setNaissance(employeeDTO.getNaissance());
		employee.setNom(employeeDTO.getNom());
		employee.setPrenom(employeeDTO.getPrenom());
		
		employeeRepository.save(employee);
		
	}

}
