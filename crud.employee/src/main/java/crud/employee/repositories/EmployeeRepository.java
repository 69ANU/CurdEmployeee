package crud.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.employee.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>
{

}
