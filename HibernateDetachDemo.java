package com.te.hibernatedemo.util;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.hibernatedemo.HibernareDemoTy.Employee;

public class HibernateDetachDemo {

	public static void main(String[] args) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transaction = null;
		// Employee employee = null;
		Scanner sc = new Scanner(System.in);

		try {
			int id = sc.nextInt();
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Employee employee = manager.find(Employee.class, id);
			System.out.println("Before detaching");

			manager.detach(employee);
			employee.setName("Sabjan");
			manager.merge(employee);
			System.out.println("After detaching");
			System.out.println(employee);
			transaction.commit();
			
			/*
			 * System.out.println(employee.getId()); System.out.println(employee.getName());
			 * System.out.println(employee.getSalary());
			 */
			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!= null)
			{
				transaction.rollback();
			}
		}
		finally
		{
			if(manager!= null)
			{
				manager.close();
			}
			if(factory!= null)
			{
				factory.close();
			}
		}

	}

}
