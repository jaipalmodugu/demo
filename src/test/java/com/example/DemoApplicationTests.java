package com.example;


import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.Employee;
import com.example.jpa.CustomJpa;
import com.example.repository.Repository;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		
	}

	@Mock
	public CustomJpa customJpa;
	
	@InjectMocks
	private Repository repository = new Repository();
	
	@org.junit.Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
		public void testSaveEmployee(){
			Employee emp1=new Employee();
			emp1.setId(4);
			emp1.setName("varun");
			emp1.setDept("acc");
			emp1.setCompany("nisum");
		Mockito.when(customJpa.save(emp1)).thenReturn(null);
		Employee employee = repository.createEmployee(emp1);
		Assert.assertEquals(Integer.valueOf(employee.getId()), Integer.valueOf(4));
		Assert.assertEquals(employee.getName(),"varn");
		}
	
}
