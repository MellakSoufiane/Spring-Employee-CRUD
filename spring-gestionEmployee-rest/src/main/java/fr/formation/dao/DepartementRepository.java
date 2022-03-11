package fr.formation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.formation.domain.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement, Long> {

}
