package com.employee_mgmt.utl;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.employee_mgmt.model.Department;
import com.employee_mgmt.model.Designation;
import com.employee_mgmt.model.EmployeeDependent;
import com.employee_mgmt.model.EmployeeInformation;
import com.employee_mgmt.model.EmployeeMaster;
import com.employee_mgmt.model.Location;


/**
 * Java based configuration
 * 
 * @author ramesh Fadatare
 *
 */
public class HibernateUtl {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL,
						"jdbc:postgresql://192.168.29.245:5432/employee_management_saurabh?useSSL=false");
				settings.put(Environment.USER, "postgres");
				settings.put(Environment.PASS, "admin");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");

				settings.put(Environment.SHOW_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				settings.put(Environment.HBM2DDL_AUTO, "update");

				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Department.class);
				configuration.addAnnotatedClass(Designation.class);
				configuration.addAnnotatedClass(EmployeeDependent.class);
				configuration.addAnnotatedClass(EmployeeInformation.class);
				configuration.addAnnotatedClass(EmployeeMaster.class);
				configuration.addAnnotatedClass(Location.class);
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				System.out.println("Hibernate Java Config serviceRegistry created");
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}