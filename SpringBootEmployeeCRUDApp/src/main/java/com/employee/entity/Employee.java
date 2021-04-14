package com.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String firstName;
	private String lastName;
	private String employmentId;
	private String startDate;
	private String endDate;
	private String designation;
	private String department;
	private String status;
	private String gender;
	private Date dob;
	private String bloodGroup;
	private String addr;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Long id, String firstName, String lastName, String employmentId, String startDate, String endDate,
			String designation, String department, String status, String gender, Date dob, String bloodGroup,
			String addr) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employmentId = employmentId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.designation = designation;
		this.department = department;
		this.status = status;
		this.gender = gender;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.addr = addr;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmploymentId() {
		return employmentId;
	}
	public void setEmploymentId(String employmentId) {
		this.employmentId = employmentId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", employmentId="
				+ employmentId + ", startDate=" + startDate + ", endDate=" + endDate + ", designation=" + designation
				+ ", department=" + department + ", status=" + status + ", gender=" + gender + ", dob=" + dob
				+ ", bloodGroup=" + bloodGroup + ", addr=" + addr + "]";
	}
	
	
	
	
	

}
