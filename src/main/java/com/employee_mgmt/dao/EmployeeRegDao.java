package com.employee_mgmt.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

 import com.employee_mgmt.model.EmployeeInformation;
 import com.employee_mgmt.model.EmployeeDependent;
import com.employee_mgmt.utl.HibernateUtl;

public class EmployeeRegDao {
	
	
	public static void saveEmployeeInfo(EmployeeInformation employeeInfo) {
		Transaction transaction = null;
		try(Session session = HibernateUtl.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.save(employeeInfo);
			transaction.commit();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public static void dependent(EmployeeDependent dependent) {
		Transaction transaction = null;
		try(Session session = HibernateUtl.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.save(dependent);
			transaction.commit();
		}catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
