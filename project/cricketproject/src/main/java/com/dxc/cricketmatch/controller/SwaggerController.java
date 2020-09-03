package com.dxc.cricketmatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shreedharagowda
 *
 */
@Controller
public class SwaggerController {
	/**
	 * @return String
	 */
	@RequestMapping("/")
	public String swaggerUI()
	{
		return "redirect:/swagger-ui.html";
	}

}