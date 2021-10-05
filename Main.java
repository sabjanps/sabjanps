package com.te.hibernatedemo.util;

import java.util.Scanner;

import com.te.hibernatedemo.HibernareDemoTy.Employee;
import com.te.hibernatedemo.bean.Employee.UpdateUsingJql;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee();
		InsertImplementationDemo idemo = new InsertImplementationDemo();
		UpdateUsingJql uql = new UpdateUsingJql();
		DeleteJpqlImpl delete = new DeleteJpqlImpl();
		FindHibernateImpl find = new FindHibernateImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int choice = sc.nextInt();
		int id = 0;

		switch (choice) {
		case 1:

			idemo.insert(employee);
			break;
		case 2:

			uql.update(employee);
			break;
		case 3:

			uql.update(employee);
			break;
		case 4:

			delete.deletebyId(3);
			break;
		case 5:

			find.get(employee);
			break;

		default:
			break;
		}

	}

}
