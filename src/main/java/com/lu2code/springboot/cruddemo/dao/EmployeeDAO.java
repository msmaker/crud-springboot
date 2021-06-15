package com.lu2code.springboot.cruddemo.dao;

import java.util.List;

import com.lu2code.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
}
