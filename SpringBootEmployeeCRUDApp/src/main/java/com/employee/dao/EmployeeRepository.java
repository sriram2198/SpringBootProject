package com.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.employee.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
