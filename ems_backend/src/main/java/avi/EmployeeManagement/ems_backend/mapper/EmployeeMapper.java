package avi.EmployeeManagement.ems_backend.mapper;

import avi.EmployeeManagement.ems_backend.dto.Employeedto;
import avi.EmployeeManagement.ems_backend.entity.Employee;

public class EmployeeMapper {
    //mapping employeedto to employee entity
    public static Employeedto maptoEmployeedto(Employee employee){
        return new Employeedto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getMobile()
        );
    }
    // mapping employee entity to employedto
    public static Employee maptoEmployee(Employeedto employeedto){
        return new Employee(
                employeedto.getId(),
                employeedto.getFirstName(),
                employeedto.getLastName(),
                employeedto.getEmail(),
                employeedto.getMobile()
        );
    }
}
