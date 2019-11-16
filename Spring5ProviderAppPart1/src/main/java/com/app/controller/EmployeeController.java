package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bean.Employee;

@Controller
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@GetMapping("/show")
	public ResponseEntity<String>getShow(){
		String body="Welcome to get method";
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<String>(body, status);
	}
	
	@PostMapping("/show")
	public ResponseEntity<String>getShowA(){
		String body="Welcome to POstt method";
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<String>(body, status);
	}
	
	@PutMapping("/show")
	public ResponseEntity<String>getShowAA(){
		String body="Welcome to PUT method";
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<String>(body, status);
	}
	
	@DeleteMapping("/show")
	public ResponseEntity<String>getShowAAA(){
		String body="Welcome to DELETE method";
		HttpStatus status=HttpStatus.OK;
		return new ResponseEntity<String>(body, status);
	}
	
	
	@PostMapping("/data")

	public ResponseEntity<Employee> processData(@RequestBody Employee emp){
		emp.setEmpSal((emp.getEmpSal()*4));
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
	}
	

}
