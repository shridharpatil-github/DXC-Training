package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;
import com.model.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		StudentDao studentDao=new StudentDao();
		Student student=new Student();
		// reading the data from request parameter
		 int roll=Integer.parseInt(request.getParameter("roll"));
		 String name=request.getParameter("name");
		 int marks=Integer.parseInt(request.getParameter("marks"));
		 
		 // Storing the data in student object
		 student.setRoll(roll);
		 student.setName(name);
		 student.setMarks(marks);
	    // pass the student object to the studentDAO
		 
		boolean isAdded= studentDao.addStudent(student);
		RequestDispatcher view=null;
		
		if(isAdded)
		 {
			view=request.getRequestDispatcher("student.jsp");
			List<Student> studentList=studentDao.getStudents();
			request.setAttribute("studentList",studentList);
	        view.forward(request, response);		 
		 }
		else
		{
			view=request.getRequestDispatcher("error.jsp"); 
	        view.forward(request, response);	
		}
		 
	}

	
}




