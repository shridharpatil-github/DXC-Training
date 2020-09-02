package com.stackroute.test.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stackroute.controller.EmployeeController;
import com.stackroute.exception.*;

import com.stackroute.model.Employee;
import com.stackroute.service.EmployeeService;
import static org.mockito.ArgumentMatchers.eq;

/*    
 * The following annontation 
 * @RunWith(SpringRunner.class) tells Junit to run using Spring's testing support

 * 
 */

@RunWith(SpringRunner.class)

/*
 * The following annotation @WebMvcTest is to fire up an application context ( IOC )
 * that contains only the beans needed for testing a web controller
 * 
 */

@WebMvcTest

public class EmployeeControllerTest {
	
	@Autowired
	
	/* the below is the main entry point for server-side Spring MVC test support  */
	private MockMvc mockMvc;
	private Employee employee;
	
	
	/* The below annotation is used to which object needs to be mocked */
	@MockBean
	private EmployeeService employeeService;
	
	
	/* Mockito's @injectMocks annotations allow us to inject mocked dependencies  */
	@InjectMocks
	
	private EmployeeController employeeController;
	
	private List<Employee> allEmployees=null;

	@Before
	public void setUp() throws Exception{
		
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(employeeController).build();
		employee=new Employee();
		employee.set_id(1);
		employee.setEmpName("Ram");
		employee.setDesignation("Manager");
		employee.setDepartment("Sales");
		employee.setBasic(23000);
		allEmployees=new ArrayList<>();
		allEmployees.add(employee);
	}
	
	
	@Test
	public void createEmployeeSuccess() throws Exception{
	
		when(employeeService.createEmployee(any())).thenReturn(employee);
		mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/employee/addEmployee")
		.contentType(MediaType.APPLICATION_JSON).content(asJsonString(employee)))
		.andExpect(MockMvcResultMatchers.status().isCreated())
		.andDo(MockMvcResultHandlers.print());
	}


	@Test
	public void createEmployeeFailure() throws Exception{
	
		when(employeeService.createEmployee(any())).thenThrow(EmployeeNotCreatedException.class);
		mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/employee/addEmployee")
		.contentType(MediaType.APPLICATION_JSON).content(asJsonString(employee)))
		.andExpect(MockMvcResultMatchers.status().isConflict())
		.andDo(MockMvcResultHandlers.print());
	}
	

    @Test
    public void deleteEmployeeSuccess() throws Exception {

        when(employeeService.deleteEmployee(1)).thenReturn(true);
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/employee/deleteEmployee/1")
                .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }


    @Test
    public void deleteEmployeeFailure() throws Exception {

        when(employeeService.deleteEmployee(2)).thenThrow(EmployeeDoesNoteExistsException.class);
        mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/employee/deleteEmployee/2")
                .contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isNotFound())
                .andDo(MockMvcResultHandlers.print());
    }


    @Test
    public void updateEmployeeSuccess() throws Exception {

        when(employeeService.updateEmployee(any(),eq(employee.get_id()))).thenReturn(employee);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/employee/updateEmployee/1")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(employee)))
                .andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void updateEmployeeFailure() throws Exception {

        when(employeeService.updateEmployee(any(),eq(employee.get_id()))).thenReturn(null);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/employee/updateEmployee/2")
                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(employee)))
                .andExpect(MockMvcResultMatchers.status().isConflict()).andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void getAllEmployees() throws Exception {
        when(employeeService.getAllEmployees()).thenReturn(allEmployees);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/employee/displayaAllEmployees")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void getEmployeeByIdSuccess() throws Exception {
        when(employeeService.getEmployeeById(employee.get_id())).thenReturn(employee);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/employee/getEmployeeById/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


    @Test
    public void getEmployeeByIdFailure() throws Exception {
        when(employeeService.getEmployeeById(employee.get_id())).thenThrow(EmployeeNotFoundException.class);
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/employee/getEmployeeById/2")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }


	private String asJsonString(Employee employee) {
		// TODO Auto-generated method stub
		try {
			return new ObjectMapper().writeValueAsString(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	
	}
	
}
