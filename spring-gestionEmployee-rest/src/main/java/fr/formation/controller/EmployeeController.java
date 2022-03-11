package fr.formation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import fr.formation.domain.Employee;
import fr.formation.pojo.EmployeeDTO;
import fr.formation.service.DepartementService;
import fr.formation.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private DepartementService departementservice;
	
	//Create employee
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Employee insertEmployee(@RequestBody Employee employeeDto) {
		return employeeService.insert(employeeDto);
	}
	
}
