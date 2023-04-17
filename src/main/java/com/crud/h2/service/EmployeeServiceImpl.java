/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.EmployeeDAO;
import com.crud.h2.dto.Employee;

/**
 * @author elena-01
 */

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	/*
	 * Methods of Interface IEmployeeDAO
	 */
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public List<Employee> listEmployees() {
		return employeeDAO.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDAO.save(employee);
	}

	@Override
	public Employee employeeById(Long id) {
		return employeeDAO.findById(id).get();
	}

	@Override
	public List<Employee> listEmployeeByNombre(String nombre) {
		return employeeDAO.findByNombre(nombre);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.save(employee);
	}

	@Override
	public void deleteEmployee(long id) {
		employeeDAO.deleteById(id);

	}

}
