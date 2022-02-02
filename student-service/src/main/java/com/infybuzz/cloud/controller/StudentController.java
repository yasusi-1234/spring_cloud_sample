package com.infybuzz.cloud.controller;

import com.infybuzz.cloud.request.CreateStudentRequest;
import com.infybuzz.cloud.response.StudentResponse;
import com.infybuzz.cloud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@Autowired
	WebClient webclient;
	
	@PostMapping("/create")
	public StudentResponse createStudent (@RequestBody CreateStudentRequest createStudentRequest) {
		return studentService.createStudent(createStudentRequest);
	}
	
	@GetMapping("getById/{id}")
	public StudentResponse getById (@PathVariable long id) {
		return studentService.getById(id);
	}
	
}
