package com.student.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavigationController {
	
	@GetMapping("/openAddStudentPage")
	public String openAddStudentPage() {
		return "add-student";
	}
	@GetMapping("/openUpdateStudentPage")
	public String openUpdateStudentPage() {
		return "update-student";
	}
	@GetMapping("/openDeleteStudentPage")
	public String openDeleteStudentPage() {
		return "delete-student";
	}
	
	@GetMapping("/openSearchStudentPage")
	public String openSearchStudentPage() {
		return "search-student";
	}
	
}
