package avi.EmployeeManagement.ems_backend.controller;

import avi.EmployeeManagement.ems_backend.dto.Employeedto;
import avi.EmployeeManagement.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class employeeController {
    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<Employeedto> createEmployee(@RequestBody Employeedto employeedto){
        Employeedto savedemployee =employeeService.createEmployee(employeedto);
        return new ResponseEntity<>(savedemployee, HttpStatus.CREATED);
    }
    @GetMapping("/login")
public String login(){
        return "login";
    }
}
