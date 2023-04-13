package com.greedy.secondDay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greedy.secondDay.employee.entity.Employee;


public interface EmployeeRepository extends JpaRepository <Employee, String> {
	
	/*전달 월급을 초과하는 사원의 목록을 월급순으로 조회하는 메소드*/
	List<Employee> findBySalaryGreaterThanOrderBySalary(Integer salary);

}
