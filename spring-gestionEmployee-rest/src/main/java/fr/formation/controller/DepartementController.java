package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.domain.Departement;

import fr.formation.service.DepartementService;


@RestController
@RequestMapping("/departements")
public class DepartementController {
	
	@Autowired
	private DepartementService departementservice;
	
	@GetMapping("/")
    public List<Departement> fetchDepartList(){
        return departementservice.fetchDepartementList();
    }

    @PostMapping("/")
    public Departement saveDep(@RequestBody Departement dep){
        return departementservice.saveDepartement(dep);
    }


    @GetMapping("/{id}")
    public Departement fetchDepById(@PathVariable("id") Long id){
        return departementservice.fetchDepartementById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteSchoolById(@PathVariable("id") Long id){
    	departementservice.deleteDepartementById(id);
        return "Departement Deleted !";
    }

    @PutMapping("/{id}")
    public Departement updateDepartement(@RequestBody Departement dep,@PathVariable("id") Long id){
        return departementservice.updateDepartement(dep,id);
    }
	

}
