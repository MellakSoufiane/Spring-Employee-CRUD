package fr.formation.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.dao.DepartementRepository;
import fr.formation.domain.Departement;
import fr.formation.pojo.DepartementDTO;

@Transactional
@Service
public class DepartementServiceImpl implements DepartementService {

	@Autowired
	private DepartementRepository departementRepository;

	//trouver un departement
	@Override
	public DepartementDTO findDepartement(Long departementId) throws EntityNotFoundException {
		Departement departement=null;
		departement=departementRepository.findById(departementId)
				.orElseThrow(
						()-> new EntityNotFoundException("Impossible de trouver un département avec l'id : " + departementId));
		return new DepartementDTO(departement.getId(), departement.getNom(), departement.getEmployee());
	}

	//creer un departement
	@Override
	public DepartementDTO createDepartement(DepartementDTO departementDTO) {
		Departement departement=new Departement();
		departement.setNom(departementDTO.getNom());

		departementRepository.save(departement);
		departementDTO.setId(departement.getId());
		return departementDTO;
	}


	//supprimer un departement
	@Override
	public void deleteDepartement(Long departementId) throws EntityNotFoundException {
		Departement departement=departementRepository.findById(departementId)
				.orElseThrow(
						()-> new EntityNotFoundException("Impossible de trouver un département avec l'id : " + departementId));
		departementRepository.delete(departement);
	}

	//MAJ un departement
	@Override
	public void updateDepartement(long departementId, DepartementDTO departementDTO) throws EntityNotFoundException {
		Departement departement=departementRepository.findById(departementId)
				.orElseThrow(
						()-> new EntityNotFoundException("Impossible de trouver un département avec l'id : " + departementId));
		departement.setNom(departementDTO.getNom());
		departementRepository.save(departement);
	}

}
