package com.springmongo.crud.repository;

import com.springmongo.crud.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {


}


