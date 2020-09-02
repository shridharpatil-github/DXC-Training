package com.stackroute.employee.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stackroute.keepnote.model.Employee;


/*
 * This class is implementing the NoteDAO interface. This class has to be annotated with @Repository
 * annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, thus 
 * 				 clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */
@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.
	 */
	
	
	SessionFactory sessionFactory;
	@Autowired
	public EmployeeDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/*
	 * Save the note in the database(note) table.
	 */

	public boolean saveEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
		
		return true;

	}
	
	/*
	 * Remove the note from the database(note) table.
	 */

	public boolean deleteEmployee(int employeeId) {
		if(getEmployeeById(employeeId)==null) {
			return false;
		}else {
		Session session = sessionFactory.getCurrentSession();
		session.delete(getEmployeeById(employeeId));
		
		return true;

	}
	}

	/*
	 * retrieve all existing notes sorted by created Date in descending
	 * order(showing latest note first)
	 */
	public List<Employee> getAllEmployees() {
		String hqlQuery = "FROM Employee employee ORDER BY employee.joiningDate DESC";
		Query query = getSessionFactory().getCurrentSession().createQuery(hqlQuery);
		List result = query.getResultList();
		return result;
		

	}

	/*
	 * retrieve specific note from the database(note) table
	 */
	public Employee getEmployeeById(int employeeId) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee =session.get(Employee.class, employeeId);
		
		return employee;

	}

	/* Update existing note */

	public boolean updateEmployee(Employee employee) {
		if(getEmployeeById(employee.getEmpId())==null) {
			return false;
		}else {
		sessionFactory.getCurrentSession().clear();
		sessionFactory.getCurrentSession().update(employee);
		
		return true;
		}

	}

	

}
