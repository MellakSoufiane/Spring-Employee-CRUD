package fr.formation.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import fr.formation.domain.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	
	
	
}
