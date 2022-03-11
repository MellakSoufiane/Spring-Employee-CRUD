package fr.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.formation.domain.Departement;
import fr.formation.pojo.DepartementDTO;
import fr.formation.pojo.EmployeeDTO;
import fr.formation.service.DepartementService;
import fr.formation.service.EmployeeService;

@Controller
@RequestMapping("/departements")
public class DepartementController {
	
	@Autowired
	private DepartementService departementservice;
	
	//Create employee
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Departement insertDepartement(@RequestBody Departement departementdto) {
		return departementservice.createDepartement(departementdto);
	}
	

}
