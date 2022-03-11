package fr.formation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.formation.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
