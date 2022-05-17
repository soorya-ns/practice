package com.sun.test.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeUtil {

	public EmployeeUtil() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static List<Employee> getEmplyeeList() {
		
		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(6, "Leela", "leela@test.com", 45000L, "6677554433", false));
		empList.add(new Employee(7, "Deepa", "deepa@test.com", 55000L, "7777554433", true));
		empList.add(new Employee(4, "Raghu", "raghu@test.com", 61000L, "4477554433", true));
		empList.add(new Employee(9, "Kiran", "kiran1@test.com", 13000L, "9977554433", true));
		empList.add(new Employee(5, "Shankara", "shankara@test.com", 7000L, "5577554433", true));
		empList.add(new Employee(1, "Ravi", "ravi@test.com", 15000L, "1177554433", true));
		empList.add(new Employee(2, "Verma", "verma@test.com", 11000L, "2277554433", true));
		empList.add(new Employee(3, "Kiran", "kiran@test.com", 8000L, "3377554433", false));
		empList.add(new Employee(8, "Vicky", "vicky@test.com", 45000L, "8877554433", true));

		return empList;
		
	}


	public static List<Employee> getEmplyeeWithAddressList() {

		List<Employee> empList = new ArrayList<Employee>();

		List<Address> lA = new ArrayList<>();
		lA.add(new Address(11, "11 Lane", "5th CROSS","123-12","AB1","1231",true));
		lA.add(new Address(12, "12 Lane", "6th CROSS","124-12","AB2","1232",false));
		empList.add(new Employee(6, "Leela", "leela@test.com", 45000L, "6677554433", false, lA));

		List<Address> lB = new ArrayList<>();
		lB.add(new Address(21, "21 Lane", "21 CROSS","123-21","AB-21","1231-21",true));
		lB.add(new Address(22, "22 Lane", "22 CROSS","124-22","AB-22","1232-22",false));
		empList.add(new Employee(7, "Deepa", "deepa@test.com", 55000L, "7777554433", true, lB));

		List<Address> lC = new ArrayList<>();
		lC.add(new Address(31, "31 Lane", "31 CROSS","123-31","AB-31","1231-31",true));
		lC.add(new Address(32, "32 Lane", "32 CROSS","124-32","AB-32","1232-32",false));
		empList.add(new Employee(4, "Raghu", "raghu@test.com", 61000L, "4477554433", true, lC));

		List<Address> lD = new ArrayList<>();
		lD.add(new Address(41, "41 Lane", "41 CROSS","123-41","AB-41","1231-41",true));
		lD.add(new Address(42, "42 Lane", "42 CROSS","124-42","AB-42","1232-42",false));
		empList.add(new Employee(9, "Kiran", "kiran1@test.com", 13000L, "9977554433", true, lD));


		List<Address> lE = new ArrayList<>();
		lE.add(new Address(51, "51 Lane", "51 CROSS","123-51","AB-51","1231-51",true));
		lE.add(new Address(52, "52 Lane", "52 CROSS","124-52","AB-52","1232-52",false));
		empList.add(new Employee(5, "Shankara", "shankara@test.com", 7000L, "5577554433", true, lE));

		List<Address> lF = new ArrayList<>();
		lF.add(new Address(61, "61 Lane", "61 CROSS","123-61","AB-61","1231-61",true));
		lF.add(new Address(62, "62 Lane", "62 CROSS","124-62","AB-62","1232-62",false));
		empList.add(new Employee(1, "Ravi", "ravi@test.com", 15000L, "1177554433", true, lF));

		List<Address> lG = new ArrayList<>();
		lG.add(new Address(71, "71 Lane", "71 CROSS","123-71","AB-71","1231-71",true));
		lG.add(new Address(72, "72 Lane", "72 CROSS","124-72","AB-72","1232-72",false));
		empList.add(new Employee(2, "Verma", "verma@test.com", 11000L, "2277554433", true, lG));

		List<Address> lH = new ArrayList<>();
		lH.add(new Address(81, "81 Lane", "81 CROSS","123-81","AB-81","1231-81",true));
		lH.add(new Address(82, "82 Lane", "82 CROSS","124-82","AB-82","1232-82",false));
		empList.add(new Employee(3, "Kiran", "kiran@test.com", 8000L, "3377554433", false, lH));

		List<Address> lI = new ArrayList<>();
		lI.add(new Address(91, "91 Lane", "91 CROSS","123-91","AB-91","1231-91",true));
		lI.add(new Address(92, "92 Lane", "92 CROSS","124-92","AB-92","1232-92",false));
		empList.add(new Employee(8, "Vicky", "vicky@test.com", 45000L, "8877554433", true, lI));

		return empList;

	}

	public static List<Employee> getEmplyeeWithAddressAndSkillsList() {

		List<Employee> empList = new ArrayList<Employee>();

		List<Address> lA = new ArrayList<>();
		lA.add(new Address(11, "11 Lane", "5th CROSS","123-12","AB1","1231",true));
		lA.add(new Address(12, "12 Lane", "6th CROSS","124-12","AB2","1232",false));
		List<String> skillsA= new ArrayList<>();
		skillsA.add("Java");
		skillsA.add("C");
		empList.add(new Employee(6, "Leela", "leela@test.com", 45000L, "6677554433", false, lA, skillsA));

		List<Address> lB = new ArrayList<>();
		lB.add(new Address(21, "21 Lane", "21 CROSS","123-21","AB-21","1231-21",true));
		lB.add(new Address(22, "22 Lane", "22 CROSS","124-22","AB-22","1232-22",false));
		List<String> skillsB= new ArrayList<>();
		skillsB.add("CSS3");
		skillsB.add("Bootstrap");
		empList.add(new Employee(7, "Deepa", "deepa@test.com", 55000L, "7777554433", true, lB, skillsB));

		List<Address> lC = new ArrayList<>();
		lC.add(new Address(31, "31 Lane", "31 CROSS","123-31","AB-31","1231-31",true));
		lC.add(new Address(32, "32 Lane", "32 CROSS","124-32","AB-32","1232-32",false));
		List<String> skillsC= new ArrayList<>();
		skillsC.add("Angular8");
		skillsC.add("HTML5");
		empList.add(new Employee(4, "Raghu", "raghu@test.com", 61000L, "4477554433", true, lC, skillsC));

		List<Address> lD = new ArrayList<>();
		lD.add(new Address(41, "41 Lane", "41 CROSS","123-41","AB-41","1231-41",true));
		lD.add(new Address(42, "42 Lane", "42 CROSS","124-42","AB-42","1232-42",false));
		List<String> skillsD= new ArrayList<>();
		skillsD.add("JQuery");
		skillsD.add("UX");
		empList.add(new Employee(9, "Kiran", "kiran1@test.com", 13000L, "9977554433", true, lD, skillsD));


		List<Address> lE = new ArrayList<>();
		lE.add(new Address(51, "51 Lane", "51 CROSS","123-51","AB-51","1231-51",true));
		lE.add(new Address(52, "52 Lane", "52 CROSS","124-52","AB-52","1232-52",false));
		List<String> skillsE= new ArrayList<>();
		skillsE.add("Javascript");
		skillsE.add("Angular");
		empList.add(new Employee(5, "Shankara", "shankara@test.com", 7000L, "5577554433", true, lE, skillsE));

		List<Address> lF = new ArrayList<>();
		lF.add(new Address(61, "61 Lane", "61 CROSS","123-61","AB-61","1231-61",true));
		lF.add(new Address(62, "62 Lane", "62 CROSS","124-62","AB-62","1232-62",false));
		List<String> skillsF= new ArrayList<>();
		skillsF.add("Python");
		skillsF.add("AWS");
		empList.add(new Employee(1, "Ravi", "ravi@test.com", 15000L, "1177554433", true, lF, skillsF));

		List<Address> lG = new ArrayList<>();
		lG.add(new Address(71, "71 Lane", "71 CROSS","123-71","AB-71","1231-71",true));
		lG.add(new Address(72, "72 Lane", "72 CROSS","124-72","AB-72","1232-72",false));
		List<String> skillsG= new ArrayList<>();
		skillsG.add("COGNOS");
		skillsG.add("PHP");
		empList.add(new Employee(2, "Verma", "verma@test.com", 11000L, "2277554433", true, lG, skillsG));

		List<Address> lH = new ArrayList<>();
		lH.add(new Address(81, "81 Lane", "81 CROSS","123-81","AB-81","1231-81",true));
		lH.add(new Address(82, "82 Lane", "82 CROSS","124-82","AB-82","1232-82",false));
		List<String> skillsH= new ArrayList<>();
		skillsH.add("AS400");
		skillsH.add("COBOL");
		empList.add(new Employee(3, "Kiran", "kiran@test.com", 8000L, "3377554433", false, lH, skillsH));

		List<Address> lI = new ArrayList<>();
		lI.add(new Address(91, "91 Lane", "91 CROSS","123-91","AB-91","1231-91",true));
		lI.add(new Address(92, "92 Lane", "92 CROSS","124-92","AB-92","1232-92",false));
		List<String> skillsI= new ArrayList<>();
		skillsI.add("C#");
		skillsI.add("DotNet");
		empList.add(new Employee(8, "Vicky", "vicky@test.com", 45000L, "8877554433", true, lI, skillsI));

		return empList;

	}


	public static List<Employee> getEmplyeeWithAddressSkillsDeptAgeGenderList() {

		List<Employee> empList = new ArrayList<Employee>();

		List<Address> lA = new ArrayList<>();
		lA.add(new Address(11, "11 Lane", "5th CROSS","123-12","AB1","1231",true));
		lA.add(new Address(12, "12 Lane", "6th CROSS","124-12","AB2","1232",false));
		List<String> skillsA= new ArrayList<>();
		skillsA.add("Java");
		skillsA.add("C");
		empList.add(new Employee(6, "Leela", "leela@test.com", 45000L, "6677554433", false, lA, skillsA, "IT", "F", 23));

		List<Address> lB = new ArrayList<>();
		lB.add(new Address(21, "21 Lane", "21 CROSS","123-21","AB-21","1231-21",true));
		lB.add(new Address(22, "22 Lane", "22 CROSS","124-22","AB-22","1232-22",false));
		List<String> skillsB= new ArrayList<>();
		skillsB.add("CSS3");
		skillsB.add("Bootstrap");
		empList.add(new Employee(7, "Deepa", "deepa@test.com", 55000L, "7777554433", true, lB, skillsB, "IT", "F", 25));

		List<Address> lC = new ArrayList<>();
		lC.add(new Address(31, "31 Lane", "31 CROSS","123-31","AB-31","1231-31",true));
		lC.add(new Address(32, "32 Lane", "32 CROSS","124-32","AB-32","1232-32",false));
		List<String> skillsC= new ArrayList<>();
		skillsC.add("Angular8");
		skillsC.add("HTML5");
		empList.add(new Employee(4, "Raghu", "raghu@test.com", 61000L, "4477554433", true, lC, skillsC, "QA", "M", 27));

		List<Address> lD = new ArrayList<>();
		lD.add(new Address(41, "41 Lane", "41 CROSS","123-41","AB-41","1231-41",true));
		lD.add(new Address(42, "42 Lane", "42 CROSS","124-42","AB-42","1232-42",false));
		List<String> skillsD= new ArrayList<>();
		skillsD.add("JQuery");
		skillsD.add("UX");
		empList.add(new Employee(9, "Raju", "kiran1@test.com", 13000L, "9977554433", true, lD, skillsD, "NW", "M", 29));


		List<Address> lE = new ArrayList<>();
		lE.add(new Address(51, "51 Lane", "51 CROSS","123-51","AB-51","1231-51",true));
		lE.add(new Address(52, "52 Lane", "52 CROSS","124-52","AB-52","1232-52",false));
		List<String> skillsE= new ArrayList<>();
		skillsE.add("Javascript");
		skillsE.add("Angular");
		empList.add(new Employee(5, "Shankari", "shankara@test.com", 7000L, "5577554433", true, lE, skillsE, "QA", "F", 22));

		List<Address> lF = new ArrayList<>();
		lF.add(new Address(61, "61 Lane", "61 CROSS","123-61","AB-61","1231-61",true));
		lF.add(new Address(62, "62 Lane", "62 CROSS","124-62","AB-62","1232-62",false));
		List<String> skillsF= new ArrayList<>();
		skillsF.add("Python");
		skillsF.add("AWS");
		empList.add(new Employee(1, "Rekha", "ravi@test.com", 15000L, "1177554433", true, lF, skillsF, "NW", "F", 26));

		List<Address> lG = new ArrayList<>();
		lG.add(new Address(71, "71 Lane", "71 CROSS","123-71","AB-71","1231-71",true));
		lG.add(new Address(72, "72 Lane", "72 CROSS","124-72","AB-72","1232-72",false));
		List<String> skillsG= new ArrayList<>();
		skillsG.add("COGNOS");
		skillsG.add("PHP");
		empList.add(new Employee(2, "Verma", "verma@test.com", 11000L, "2277554433", true, lG, skillsG, "IT", "M", 25));

		List<Address> lH = new ArrayList<>();
		lH.add(new Address(81, "81 Lane", "81 CROSS","123-81","AB-81","1231-81",true));
		lH.add(new Address(82, "82 Lane", "82 CROSS","124-82","AB-82","1232-82",false));
		List<String> skillsH= new ArrayList<>();
		skillsH.add("AS400");
		skillsH.add("COBOL");
		empList.add(new Employee(3, "Kirana", "kiran@test.com", 8000L, "3377554433", false, lH, skillsH, "QA", "F", 23));

		List<Address> lI = new ArrayList<>();
		lI.add(new Address(91, "91 Lane", "91 CROSS","123-91","AB-91","1231-91",true));
		lI.add(new Address(92, "92 Lane", "92 CROSS","124-92","AB-92","1232-92",false));
		List<String> skillsI= new ArrayList<>();
		skillsI.add("C#");
		skillsI.add("DotNet");
		empList.add(new Employee(8, "Vicky", "vicky@test.com", 45000L, "8877554433", true, lI, skillsI, "IT", "M", 21));

		return empList;

	}
public static List<Integer> getIntList() {
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		return list;
		
	}

}
