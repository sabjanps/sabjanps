package com.te.hibernatedemo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.HibernareDemoTy.Employee;

public class UpdateImplementatio {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee employee = new Employee();
		manager.find(Employee.class, 1);

	    employee = null;
		int id = employee.getId();
		employee = manager.find(Employee.class, id);
		String ename = employee.getName(); //
		employee.getDesignation();
		employee.getName();
		employee.getSalary(); //
		employee.setName(ename);
		//employee.setSalary(salary);
		employee.setSalary(20000d);

		employee.setDesignation("desgination");

	}

}
