package com.group.libraryapp.controller.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;

@RestController
public class CalculatorController {

	@GetMapping("/add")
	public int add(CalculatorAddRequest request) {
		return request.getNum1() + request.getNum2();
	}

	@PostMapping("/multiply")
	public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
		return request.getNum1() * request.getNum2();
	}
}
