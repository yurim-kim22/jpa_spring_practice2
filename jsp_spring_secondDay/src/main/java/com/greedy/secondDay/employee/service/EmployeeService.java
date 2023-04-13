package com.greedy.secondDay.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.greedy.secondDay.employee.dto.EmployeeDTO;
import com.greedy.secondDay.employee.entity.Employee;
import com.greedy.secondDay.repository.DepartmentRepository;
import com.greedy.secondDay.repository.EmployeeRepository;

@Service
public class EmployeeService {
	 
	private final EmployeeRepository employeeRepository;
	private final DepartmentRepository departmentRepository;
	private ModelMapper modelMapper;
	
	public EmployeeService(EmployeeRepository employeeRepository
			,DepartmentRepository departmentRepository
			,ModelMapper modelMapper) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
		this.modelMapper = modelMapper;
	}
	
	
	//1. findById 200번 사원 조회
	public EmployeeDTO findEmpById(String empId) {
		
		Employee employee = employeeRepository.findById(empId).orElseThrow(IllegalArgumentException::new);
		
		return modelMapper.map(employee, EmployeeDTO.class);
	}

	//2. findAll 페이징
	public Page<EmployeeDTO> findEmpList(Pageable pageable) {
	pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1,
			pageable.getPageSize(),
			Sort.by("empId").descending());
	
	Page<Employee> empList = employeeRepository.findAll(pageable);
	
	return empList.map(employee -> modelMapper.map(employee, EmployeeDTO.class));
	}


	public List<EmployeeDTO> empTest1(Integer salary) {

		List<Employee> empList = employeeRepository.findBySalaryGreaterThanOrderBySalary(salary);
		
		return empList.stream().map(employee -> modelMapper.map(employee, EmployeeDTO.class)).collect(Collectors.toList());
	}

}
