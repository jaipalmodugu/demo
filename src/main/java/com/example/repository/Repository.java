package com.example.repository;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
import com.example.jpa.CustomJpa;

@Transactional
@Service
public class Repository  {

	@Autowired
	private CustomJpa customJpa;
	
	public Employee get(Integer i){
		
		return customJpa.findOne(i);
	}
	
	public Employee createEmployee(Employee e){
		
		return customJpa.save(e);
	}
	public List<Employee> getAllEmployees(){
		
		return customJpa.findAll();
	}
	public void deleteEmployee(Integer id){
		
		customJpa.delete(id);
	}
}
