package com.stackroute.employee.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stackroute.employee.dao.EmployeeDAO;

import com.stackroute.keepnote.model.Employee;



/*
 * Annotate the class with @Controller annotation.@Controller annotation is used to mark 
 * any POJO class as a controller so that Spring can recognize this class as a Controller
 */
@Controller
public class EmployeeController {
	/*
	 * From the problem statement, we can understand that the application requires
	 * us to implement the following functionalities.
	 * 
	 * 1. display the list of existing notes from the persistence data. Each note
	 * should contain Note Id, title, content, status and created date. 2. Add a new
	 * note which should contain the note id, title, content and status. 3. Delete
	 * an existing note 4. Update an existing note
	 * 
	 */

	/*
	 * Autowiring should be implemented for the NoteDAO. Create a Note object.
	 * 
	 */

	
	private EmployeeDAO dao;
	@Autowired
	public EmployeeController(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	/*
	 * Define a handler method to read the existing notes by calling the
	 * getAllNotes() method of the NoteRepository class and add it to the ModelMap
	 * which is an implementation of Map for use when building model data for use
	 * with views. it should map to the default URL i.e. "/"
	 */
	@RequestMapping("/")
	public String getAllEmployees(ModelMap modelMap) {
		modelMap.addAttribute("employeeList", dao.getAllEmployees());
		return "index";
	}

	/*
	 * Define a handler method which will read the Note data from request parameters
	 * and save the note by calling the addNote() method of NoteRepository class.
	 * Please note that the createdAt field should always be auto populated with
	 * system time and should not be accepted from the user. Also, after saving the
	 * note, it should show the same along with existing notes. Hence, reading notes
	 * has to be done here again and the retrieved notes object should be sent back
	 * to the view using ModelMap. This handler method should map to the URL
	 * "/saveNote".
	 */
	@RequestMapping("/add")
	public String addEmployee(ModelMap modelMap,@RequestParam String name, @RequestParam String designation, @RequestParam String department,@RequestParam int basic) {
		
		if(designation.isEmpty() || department.isEmpty()){
			modelMap.addAttribute("errorMessage", "Fields should not be empty");
			return "index";
		} else {
			Employee employee = new Employee();
			employee.setName(name);
			employee.setDesignation(designation);
		    employee.setDepartment(department);
		    employee.setJoiningDate(LocalDateTime.now());
		    employee.setBasic(basic);
		
			dao.saveEmployee(employee);
			modelMap.addAttribute("employeeList", dao.getAllEmployees());
			return "redirect:/";
		}
		
	}

	/*
	 * Define a handler method to delete an existing note by calling the
	 * deleteNote() method of the NoteRepository class This handler method should
	 * map to the URL "/deleteNote"
	 */
	@RequestMapping("/delete")
	public String deleteEmployee(ModelMap modelMap, @RequestParam int employeeId) {
		dao.deleteEmployee(employeeId);
		modelMap.addAttribute("employeeList", dao.getAllEmployees());
		return "redirect:/";
	}
	
	@RequestMapping("/update")
	public String updateEmployee(ModelMap modelMap, @RequestParam int employeeId,@RequestParam String name, @RequestParam String designation, @RequestParam String department,@RequestParam int basic) {
		Employee employee = new Employee();
		employee.setEmpId(employeeId);
		employee.setName(name);
	    employee.setDesignation(designation);
	    employee.setDepartment(department);
		employee.setJoiningDate(LocalDateTime.now());
		employee.setBasic(basic);
		dao.updateEmployee(employee);
		modelMap.addAttribute("employeeList", dao.getAllEmployees());
		return "redirect:/";
	}
	
	@RequestMapping("/updateEmployee")
	public String update(ModelMap modelMap,@RequestParam int employeeId) {
		modelMap.addAttribute("employee", dao.getEmployeeById(employeeId));
		return "update";
		
	}
}
