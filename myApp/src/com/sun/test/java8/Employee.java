package com.sun.test.java8;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public Employee() {}
	
	
	private int id;

	private String name;
	
	private String email;

	private String gender;

	private Integer age;

	private long salary;
	
	private String mobile;

	private String department;

	private boolean permanent;

	private List<Address> addresses;

	private List<String> skills;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, String email,long salary,String mobile,boolean permanent) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.mobile = mobile;
		this.permanent = permanent;
		
	}

	public Employee(int id, String name, String email,long salary,String mobile,boolean permanent, List<Address> addresses) {
if(null == this.addresses) {
	addresses = new ArrayList<>();
}
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.mobile = mobile;
		this.permanent = permanent;
		this.addresses = addresses;

	}

	public Employee(int id, String name, String email,long salary,String mobile,boolean permanent, List<Address> addresses, List<String> skills) {
		if(null == this.addresses) {
			addresses = new ArrayList<>();
		}
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.mobile = mobile;
		this.permanent = permanent;
		this.addresses = addresses;
		this.skills = skills;

	}

	public Employee(int id, String name, String email,long salary,String mobile,boolean permanent, List<Address> addresses, List<String> skills, String department) {
		if(null == this.addresses) {
			addresses = new ArrayList<>();
		}
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.mobile = mobile;
		this.permanent = permanent;
		this.addresses = addresses;
		this.skills = skills;
		this.department = department;

	}
	public Employee(int id, String name, String email,long salary,String mobile,boolean permanent, List<Address> addresses, List<String> skills, String department, String gender, Integer age) {
		if(null == this.addresses) {
			addresses = new ArrayList<>();
		}
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.mobile = mobile;
		this.permanent = permanent;
		this.addresses = addresses;
		this.skills = skills;
		this.department = department;
		this.gender = gender;
		this.age = age;

	}
	
	public boolean isPermanent() {
		return permanent;
	}



	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}



	@Override
	public String toString() {
		return 
				"Employee Id: "+this.getId()
		+", Name: "+this.getName()
	+", Email: "+this.getEmail()
	+", Salary: "+this.getSalary()
	+", Mobile: "+this.getMobile()
	+", Permanent: "+this.isPermanent()
						+", Skills: "+this.getSkills()
						+", Department: "+this.getDepartment()
		+", Addresses: "+this.getAddresses();
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}
