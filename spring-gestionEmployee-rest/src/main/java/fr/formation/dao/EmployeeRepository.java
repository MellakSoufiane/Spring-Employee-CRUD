package fr.formation.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import fr.formation.domain.Employee;


@Repository("studentRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	
	
	
}
