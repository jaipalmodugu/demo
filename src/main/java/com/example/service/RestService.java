package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.repository.Repository;

@RestController
public class RestService {

	
	@Autowired
	private Repository repository;
	@GetMapping("/test/{id}")
	public Employee test(@PathVariable("id") Integer id)throws Exception{
		
		return repository.get(id);
	}
	@PostMapping("/create-employee")
	public Employee createEmployee(@RequestBody Employee employee)throws Exception{
		
		return repository.createEmployee(employee);
	}
	@GetMapping("/getall-employee")
	public List<Employee> getAll()throws Exception{
		
		return repository.getAllEmployees();
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id") Integer id){
		repository.deleteEmployee(id);
	}
}
