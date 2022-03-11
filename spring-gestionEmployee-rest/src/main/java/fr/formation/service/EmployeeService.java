package fr.formation.service;

import java.util.List;



import fr.formation.domain.Employee;




public interface EmployeeService {

		public Employee saveEmployeewithNewDepartement(Employee employee);

	    public Employee saveEmployee(Employee employee, Long DeptId);

	    public List<Employee> fetchEmployeeList();

	    public Employee fetchEmployeeById(Long employeeId);

	    public void deleteEmployeeById(Long employeeId);

	    public Employee updateEmployee(Employee employee,Long employeeId);

	    

}




