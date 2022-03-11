package fr.formation.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import fr.formation.domain.Employee;
import fr.formation.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	 @Autowired
	    private EmployeeService employeeService;

	    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	    @GetMapping("/")
	    public List<Employee> fetchEmpList(){
	        LOGGER.info("Inside the fetchDepartmentById of the class EmployeeController");
	        return employeeService.fetchEmployeeList();
	    }

	    @GetMapping("/{id}")
	    public Employee fetchEmpById(@PathVariable("id") Long Id){        
	        return employeeService.fetchEmployeeById(Id);
	    }

	    @PostMapping("/")   
	    public Employee saveEmpWithNewSchool(@Valid @RequestBody Employee emp ){ 
	        LOGGER.info("Inside the saveEmployee of the class EmployeeController");
	        return employeeService.saveEmployeewithNewDepartement(emp);
	    }

	    @PostMapping("/add/{employeeId}")
	    public Employee saveEmp(@RequestBody Employee emp,@PathVariable("employeeId") Long employeeId){
	        return employeeService.saveEmployee(emp,employeeId);
	    }

	    @DeleteMapping("/{employeeId}")
	    public String deleteEmpById(@PathVariable("employeeId") Long employeeId){        
	    	employeeService.deleteEmployeeById(employeeId);
	        return "Employee deleted !";
	    }

	    @PutMapping("/{id}")
	    public Employee updateEmp(@RequestBody Employee emp,@PathVariable("id") Long id ){   // For the Update , we need to get the department by id , and update that departement

	        return employeeService.updateEmployee(emp,id);
	    }
	 

	   
	
}
