/**
 * 
 */
package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Employee;
import com.crud.h2.service.EmployeeServiceImpl;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	/*
	 * READ: List of all employees
	 */
	@GetMapping("/employees")
	public List<Employee> listEmployees() {
		return employeeServiceImpl.listEmployees();
	}

	/*
	 * CREATE: Save an employee
	 */
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		employee.setSalario(employee.getSalario());
		return employeeServiceImpl.saveEmployee(employee);
	}

	/*
	 * READ:data of employee by id
	 */
	@GetMapping("/employee/{id}")
	public Employee employeeById(@PathVariable(name = "id") Long id) {

		Employee employee_bid = new Employee();
		employee_bid = employeeServiceImpl.employeeById(id);
		System.out.println("Employee id: " + employee_bid);
		return employee_bid;
	}

	/*
	 * READ: List Employees by name
	 */
	@GetMapping("/employees/{nombre}")
	public List<Employee> listEmployeeByNombre(@PathVariable(name = "nombre") String nombre) {
		return employeeServiceImpl.listEmployeeByNombre(nombre);
	}

	/*
	 * UPDATE: employee data
	 */
	@PutMapping("/employees/{id}")
	public Employee actualizarEmployee(@PathVariable(name = "id") Long id, @RequestBody Employee employee) {

		Employee employee_selected = new Employee();
		Employee employee_updated = new Employee();
		try {
			employee_selected = employeeServiceImpl.employeeById(id);

			employee_selected.setNombre(employee.getNombre());
			employee_selected.setTrabajo(employee.getTrabajo());
			employee_selected.setSalario(employee.getSalario());

			employee_updated = employeeServiceImpl.updateEmployee(employee_selected);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("El employee actualizado es: " + employee_updated);

		return employee_updated;
	}

	/*
	 * DELETE: employee
	 */
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name = "id") Long id) {
		employeeServiceImpl.deleteEmployee(id);
	}

}
