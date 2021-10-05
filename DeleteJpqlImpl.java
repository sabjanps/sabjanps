package com.te.hibernatedemo.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.hibernatedemo.HibernareDemoTy.Employee;

public class DeleteJpqlImpl {

	  public int deletebyId(int id) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		EntityTransaction transction = null;
		int result = 0;

		try {
			factory = Persistence.createEntityManagerFactory("emp");
			manager = factory.createEntityManager();
			transction = manager.getTransaction();
			transction.begin();
			//String delete = "delete from Employee where id =:'4'";
			String deleteQuery = "DELETE FROM Employee WHERE id =4";
			Query query = manager.createQuery(deleteQuery);
			/*
			 * query.setParameter("name", args[1]); query.setParameter("desig", args[2]);
			 * query.setParameter("id", Integer.parseInt(args[0]));
			 */
		    //query.setParameter("id", Integer.parseInt(args[0]));
			 result = query.executeUpdate();
			transction.commit();
		} catch (Exception e) {
			e.printStackTrace();

			if (transction != null) {
				transction.rollback();
			}
		} finally {

			if (manager != null) {
				manager.close();
			}
			if (factory != null) {
				factory.close();
			}
		}
		
		return result;

}

}
