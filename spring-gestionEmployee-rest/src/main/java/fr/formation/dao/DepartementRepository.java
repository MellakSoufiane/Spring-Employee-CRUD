package fr.formation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.formation.domain.Departement;

@Repository("departmentRepository")
public interface DepartementRepository extends JpaRepository<Departement, Integer> {

	
}
