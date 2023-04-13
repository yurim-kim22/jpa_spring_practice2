package com.greedy.secondDay.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMPLOYEE")
@SequenceGenerator(
		name="SEQ_EMP_ID_GENERATOR",		
		sequenceName="SEQ_EID",		
		initialValue=100,					
		allocationSize=1					
)
public class Employee {

	@Id
	@Column(name="EMP_ID")
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,		
			generator="SEQ_EMP_ID_GENERATOR"		
	)
    private String empId;
	@Column(name="EMP_NAME")
    private String empName;
	@Column(name="EMP_NO")
    private String empNo;
	@Column(name="EMAIL")
    private String email;
	@Column(name="PHONE")
    private String phone;
	@Column(name="DEPT_CODE")
    private String deptCode;
	@Column(name="JOB_CODE")
    private String jobCode;
	@Column(name="SAL_LEVEL")
    private String salLevel;
	@Column(name="SALARY")
    private int salary;
	@Column(name="BONUS")
    private Integer bonus;
	@Column(name="MANAGER_ID")
    private Integer managerId;
	
	@Column(name="HIRE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;
	
	@Column(name="ENT_DATE")
	@Temporal(TemporalType.TIMESTAMP)
    private Date entDate;
	
	@Column(name="ENT_YN")
    private String entYn;

	public Employee() {
		
	}

	public Employee(String empId, String empName, String empNo, String email, String phone, String deptCode,
			String jobCode, String salLevel, int salary, Integer bonus, Integer managerId, Date hireDate, Date entDate,
			String entYn) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.email = email;
		this.phone = phone;
		this.deptCode = deptCode;
		this.jobCode = jobCode;
		this.salLevel = salLevel;
		this.salary = salary;
		this.bonus = bonus;
		this.managerId = managerId;
		this.hireDate = hireDate;
		this.entDate = entDate;
		this.entYn = entYn;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getSalLevel() {
		return salLevel;
	}

	public void setSalLevel(String salLevel) {
		this.salLevel = salLevel;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Date getEntDate() {
		return entDate;
	}

	public void setEntDate(Date entDate) {
		this.entDate = entDate;
	}

	public String getEntYn() {
		return entYn;
	}

	public void setEntYn(String entYn) {
		this.entYn = entYn;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empNo=" + empNo + ", email=" + email
				+ ", phone=" + phone + ", deptCode=" + deptCode + ", jobCode=" + jobCode + ", salLevel=" + salLevel
				+ ", salary=" + salary + ", bonus=" + bonus + ", managerId=" + managerId + ", hireDate=" + hireDate
				+ ", entDate=" + entDate + ", entYn=" + entYn + "]";
	}

	
	
	
	
}
