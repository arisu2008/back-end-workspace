package com.kh.example.practice3.model.Employee;

import java.lang.ProcessHandle.Info;

import com.kh.overriding.model.Customer;

public class Member {
	
	
	private int  empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonus;
	
	Employee employee = new Employee();
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Member [empNo=" + empNo + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", dept="
				+ dept + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	public Member(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	};
	
	public void modify(String phone) {
		
	}
	
	public void modify(int salary) {
		
	}
	
	public void modify(double bonus) {
		
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
