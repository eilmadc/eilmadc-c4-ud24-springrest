/**
 * C4-UD24-Spring Resftul
 */
package com.crud.h2.dto;

import com.crud.h2.controller.Jobs;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author elena-01
 *
 */

@Entity
@Table(name = "employee")
public class Employee {

	// -----------Atributos Employee-------------------

	// ID autoincremental
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name="trabajo")
	private String trabajo;
	@Column(name = "salario")
	private double salario;

	// -----------Constructores-------------------
	/**
	 * Constructor por defecto
	 */
	public Employee() {

	}

	/**
	 * Constructor con parametros
	 * 
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Employee(Long id, String nombre, String trabajo, Double salario) {
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	}

	// -----------Getters / Setters -------------------
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void setTrabajo(String trabajo) {
		Jobs jobs= null;
		if (jobs.equals(trabajo)) {
			setSalario(jobs.valueOf(trabajo).pay());
		}

		this.trabajo = trabajo;
	}

	/**
	 * @return the salario
	 */
	public Double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/*
	 * Print in console
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

}
