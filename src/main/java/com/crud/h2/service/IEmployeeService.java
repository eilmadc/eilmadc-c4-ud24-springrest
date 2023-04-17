/**
 * 
 */
package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Employee;

/**
 * @author elena-01
 *
 */
public interface IEmployeeService {

	/*
	 * ---------- Methods CRUD ----------
	 */

	public List<Employee> listEmployees(); // READ: List of all employees

	public Employee saveEmployee(Employee employee); // CREATE: Save an employee

	public Employee employeeById(Long id);// READ:data of employee by id

	public List<Employee> listEmployeeByNombre(String nombre);// READ: List Employees by name

	public Employee updateEmployee(Employee employee); // UPDATE: employee data

	public void deleteEmployee(long id);// DELETE: employee

}
