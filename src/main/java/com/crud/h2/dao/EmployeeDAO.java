/**
 * C4-UD24-Spring Resftul
 */
package com.crud.h2.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Employee;


/**
 * @author elena-01
 *
 */
public interface EmployeeDAO extends JpaRepository<Employee, Long>{

	//List of Employees
	public List<Employee> findAll();
	
	//List of employees por nombre
	public List<Employee> findByNombre(String nombre);
}
