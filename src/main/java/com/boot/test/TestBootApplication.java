package com.boot.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.boot.test.dao.EmployeeRepository;
import com.boot.test.entities.Employee;

@SpringBootApplication
public class TestBootApplication {

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(TestBootApplication.class, args);
		EmployeeRepository repository = Context.getBean(EmployeeRepository.class);
		
		
		Employee employee=new Employee();
//		
		// Adding 1st employee
		employee.setName("Akash Singh");
		employee.setCity("Faizabad ");
		employee.setDeparment("Head office");
		Employee saves = repository.save(employee);
		System.out.println(saves);
//		employee.setName("Aayesha");
//		employee.setCity("Phoolpur");
//		employee.setDeparment("Software Engineer");
//		Employee emp1 = repository.save(employee);
//		System.out.println(emp1);
		
		//Employee employee2=new Employee();
		
		// Adding 2nd employee
		
//		employee2.setName("Sivani");
//		employee2.setCity("Gokul");
//		employee2.setDeparment("Test Engineer");
//		
//		
//		Employee employee3=new Employee();
//		
		// Adding 3rd employee
		
//		employee3.setName("Divya");
//		employee3.setCity("Delhi");
//		employee3.setDeparment("Data Engineer");
		
		// Adding multiple employee using list of method and Lambda expression
//		
//		List<Employee> employees = List.of(employee2,employee3);
//		
//		Iterable<Employee> result = repository.saveAll(employees);
//		result.forEach(emp->{
//			System.out.println(emp);
//		});		
//		System.out.println(result);
		
		
		// Getting employee by id 
		
//		Optional<Employee> optional = repository.findById(52);
//		Employee emp = optional.get();
		
		//Update employee by id
		
//		emp.setName("Deepak");  //Set name by using id 
//		repository.save(emp);  
//		System.out.println(emp);
//		
		// Getting all employee by findAll method
		
//		Iterable<Employee> all = repository.findAll();
//		all.forEach(t ->System.out.println(t) );
		
		//repository.deleteById(2);
		//System.out.println("Employee Deleted Successfully");
		
	}

}
