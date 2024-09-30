package avi.EmployeeManagement.ems_backend.repository;

import avi.EmployeeManagement.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
