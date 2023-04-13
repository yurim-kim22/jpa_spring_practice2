package com.greedy.secondDay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greedy.secondDay.employee.entity.Department;
import com.greedy.secondDay.employee.entity.Employee;

public interface DepartmentRepository extends JpaRepository <Department, String> {

}
