package com.te.hibernatedemo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.HibernareDemoTy.Employee;

public class InsertImplementationDemo {

	public void insert(Employee employee) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transction = null;

		employee = new Employee();
		employee.setId(5);
		employee.setName("Hashiya");
		employee.setSalary(20000000);
		employee.setDesignation("java Full Stack Java Developer");

		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transction = manager.getTransaction();
			transction.begin();
			manager.persist(employee);
			 transction.commit();
		} 
		catch (Exception e) {
			e.printStackTrace();
			if (transction != null) {
				transction.rollback();
			}
			if (factory != null) {
				factory.close();
			}
			if (manager != null) {
				manager.close();
			}

		}
		
	}
}
