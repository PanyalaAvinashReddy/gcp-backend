package avi.EmployeeManagement.ems_backend.service.impl;

import avi.EmployeeManagement.ems_backend.dto.Employeedto;
import avi.EmployeeManagement.ems_backend.entity.Employee;
import avi.EmployeeManagement.ems_backend.repository.EmployeeRepository;
import avi.EmployeeManagement.ems_backend.service.EmployeeService;
import avi.EmployeeManagement.ems_backend.mapper.EmployeeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceimpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public Employeedto createEmployee(Employeedto employeedto) {

        Employee employee = EmployeeMapper.maptoEmployee(employeedto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployeedto(savedEmployee);
    }
}
