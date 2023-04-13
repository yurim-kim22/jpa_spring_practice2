package com.greedy.secondDay.employee.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greedy.secondDay.common.Pagenation;
import com.greedy.secondDay.common.PagingButtonInfo;
import com.greedy.secondDay.employee.dto.EmployeeDTO;
import com.greedy.secondDay.employee.service.EmployeeService;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping(value="/{empId}")
	public String findEmpById(@PathVariable String empId, Model model) {
		
		EmployeeDTO emp = employeeService.findEmpById(empId);
		
		model.addAttribute("emp", emp);
		
		return "employee/one";
	} 
	
	@GetMapping("/list")
	public String findEmpList(@PageableDefault Pageable pageable, Model model) {
		
		Page<EmployeeDTO> empList = employeeService.findEmpList(pageable);
		
		PagingButtonInfo paging = Pagenation.getPagingButtonInfo(empList);
		
		model.addAttribute("paging", paging);
		model.addAttribute("empList", empList);
		
		return "employee/list";
	}
	
	@GetMapping("/querymethod")
	public void queryMethodPage() {}
	
	@GetMapping("/test1")
	public String empTest1(@RequestParam Integer salary, Model model) {
		
		List<EmployeeDTO> empList = employeeService.empTest1(salary);
		
		model.addAttribute("empList", empList);
		
		return "employee/list2";
	}
}
