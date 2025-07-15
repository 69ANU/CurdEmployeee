package crud.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee.entity.Employee;
import crud.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImplementation 
implements EmployeeService  {
	
	@Autowired
EmployeeRepository repo;
   @Override
	public void createNewEmployee(Employee emp) {
	
		repo.save(emp);
		}
   
   public Employee searchEmployee(Long id) {
		
		return repo.findById(id).get();
		}
   public void updateEmployee(Employee emp) {
		
		repo.save(emp);
		}
   public void deleteEmployee(Long id) {
	   repo.deleteById(id);
   }

@Override
public List<Employee> getAllEmployees() {
	
	return repo.findAll();
}
}
