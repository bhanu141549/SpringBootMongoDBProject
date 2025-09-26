package com.springmongo.crud.service;

import com.springmongo.crud.dto.EmployeeTO;
import com.springmongo.crud.model.Employee;
import com.springmongo.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(EmployeeTO employeeTO){
        try {
            Employee emp = Employee.builder().
                    empName(employeeTO.getEmpName()).
                    salary(employeeTO.getSalary()).
                    location(employeeTO.getLocation()).
                    build();
            employeeRepository.save(emp);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return " Employee created Successfully";
    }

    public List<Employee> getEmployees(){
        List<Employee> empList = new ArrayList<>();
        try {
            empList = employeeRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return empList;
    }

    public String deleteEmployees(String id) {
        try {
            employeeRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return id+" Employee Deleted Successfully";
    }

    public String updateEmployee(EmployeeTO emp) {
        try {
            Employee employee = Employee.builder().
                    id(emp.getId()).
                    empName(emp.getEmpName()).
                    location(emp.getLocation()).
                    salary(emp.getSalary()).build();
            employeeRepository.save(employee);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "Employee details Updated Successfully";
    }

}
