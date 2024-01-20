package com.boot.test.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coforge")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String city;
	private String deparment;
	
	
	public Employee(int id, String name, String city, String deparment) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.deparment = deparment;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDeparment() {
		return deparment;
	}


	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", deparment=" + deparment + "]";
	}
	
	
	

}
