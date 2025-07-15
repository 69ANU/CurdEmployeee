package crud.employee.service;

import java.util.List;

import crud.employee.entity.Employee;

public interface EmployeeService {

	void createNewEmployee(Employee emp);
	Employee searchEmployee(Long id);
	void updateEmployee(Employee emp);
	void deleteEmployee(Long id);
	List<Employee> getAllEmployees();
}