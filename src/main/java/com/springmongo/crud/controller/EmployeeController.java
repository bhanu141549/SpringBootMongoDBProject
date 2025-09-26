package com.springmongo.crud.controller;

import com.springmongo.crud.dto.EmployeeTO;
import com.springmongo.crud.model.Employee;
import com.springmongo.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@RequestBody EmployeeTO emp){
        return employeeService.createEmployee(emp);
    }

    @GetMapping("/get/employee")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }


    @GetMapping("/delete/employee")
    @ResponseStatus(HttpStatus.OK)
    public String deleteEmployees(@RequestParam String id){
        return employeeService.deleteEmployees(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public String updateEmployee(@RequestBody EmployeeTO emp){
        return employeeService.updateEmployee(emp);
    }

}
