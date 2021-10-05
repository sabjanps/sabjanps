package com.te.hibernatedemo.util;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.hibernatedemo.HibernareDemoTy.Employee;

public class FindHibernateImpl {

	public void get(Employee employee) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		employee = manager.find(Employee.class, id);
		// Employee employee1 = manager.find(null, Employee.class);
		System.out.println(employee);
		System.out.println("-----------------------------");
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDesignation());
		System.out.println(employee.getSalary());
		System.out.println(employee);
		// System.out.println(employee1);
	}

}
