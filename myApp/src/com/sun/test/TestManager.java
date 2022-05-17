package com.sun.test;

import com.sun.test.java8.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestManager {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        List<Employee> emplList  = EmployeeUtil.getEmplyeeWithAddressSkillsDeptAgeGenderList();
        System.out.println("QnA-1: How may Male and Female employees are there in the Organization.Assume only 2 Genders(Male and Female) ");
        //Option 01
        Map<String, Long> maleFimaleCounts = emplList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
        System.out.println(maleFimaleCounts);
        //Option 02
        Map<Boolean, List<Employee>> genderCount = emplList.stream().collect(Collectors.partitioningBy(e -> e.getGender().equals("M")));
        for (Map.Entry<Boolean, List<Employee>> list : genderCount.entrySet()) {
            if(list.getKey()){
                System.out.println("M");
                list.getValue().stream().collect(Collectors.toList()).forEach(System.out::println);
            }else{
                System.out.println("F");
                list.getValue().stream().collect(Collectors.toList()).forEach(System.out::println);

            }

        }
        //Option 03

        System.out.println("QnA-2: Print the name of all departments in the Organization ");
        System.out.println("QnA-3: Average Age of Male and Female Employees");
        System.out.println("QnA-4: Get the details of Highest paid Employee in the Org");
        System.out.println("QnA-5: Get the names of all employee (or who have joined after 2015) whos salary greater than 25k");
        System.out.println("QnA-6: Count the number od Employees in each dept");
        System.out.println("QnA-7: Average salary of each dept");
        System.out.println("QnA-8: Get the details of youngest 'Male' employee in the 'IT' department");
        System.out.println("QnA-9: Who is the most Working experience in the Org");
        System.out.println("QnA-10: How many Males and Females employees are there in IT department Team");
        System.out.println("QnA-11: What is the average salary of  Males and Females Employees");
        System.out.println("QnA-12: List down the names of all Employees in each department");
        System.out.println("QnA-13: Average and Total Salary of the Whole Organization");
        System.out.println("QnA-14: Separate the Employees who are younger or equl to 25 years from those employees who are older than 25 years ");
        System.out.println("QnA-15: Who is the Oldest employee in the Organization? and Get all Other details as well ");
        System.out.println("QnA-16: Map() and flatMap()? ");
        System.out.println("QnA-17: Group and Counts ");


        test10();

    }

    public static void test11() {
        List<Employee> emplList  = EmployeeUtil.getEmplyeeWithAddressSkillsDeptAgeGenderList();
        System.out.println("QnA-1: How may Male and Female employees are there in the Organization ");
        System.out.println("QnA-2: Print the name of all departments in the Organization ");
        System.out.println("QnA-3: Average Age of Male and Female Employees");
        System.out.println("QnA-4: Get the details of Highest paid Employee in the Org");
        System.out.println("QnA-5: Get the names of all employee (or who have joined after 2015) whos salary greater than 25k");
        System.out.println("QnA-6: Count the number od Employees in each dept");
        System.out.println("QnA-7: Average salary of each dept");
        System.out.println("QnA-8: Get the details of youngest 'Male' employee in the 'IT' department");
        System.out.println("QnA-9: Who is the most Working experience in the Org");
        System.out.println("QnA-10: How many Males and Females employees are there in IT department Team");
        System.out.println("QnA-11: What is the average salary of  Males and Females Employees");
        System.out.println("QnA-12: List down the names of all Employees in each department");
        System.out.println("QnA-13: Average and Total Salary of the Whole Organization");
        System.out.println("QnA-14: Separate the Employees who are younger or equl to 25 years from those employees who are older than 25 years ");
        System.out.println("QnA-15: Who is the Oldest employee in the Organization? and Get all Other details as well ");
        System.out.println("QnA-16: Map() and flatMap()? ");
        System.out.println("QnA-17: Group and Counts ");




    }
    public static void test10() {
        List<Employee> emplList  = EmployeeUtil.getEmplyeeWithAddressSkillsDeptAgeGenderList();

        System.out.println("QnA-1: How may Male and Female employees are there in the Organization ");
        Map<String, Long> noOfMaleFemaleEmpMap = emplList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleFemaleEmpMap);

        System.out.println("QnA-2: Print the name of all departments in the Organization ");
        emplList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        //OR
        List<String> list1 = emplList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("QnA-3: Average Age of Male and Female Employees");
        Map<String, Double> avgAgeMaleFemaleEmpMap = emplList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeMaleFemaleEmpMap);


        System.out.println("QnA-4: Get the details of Highest paid Employee in the Org");
        Optional<Employee> highestPaidEmpMap = emplList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(highestPaidEmpMap.get().getName()+" : "+highestPaidEmpMap.get().getSalary());


        System.out.println("QnA-5: Get the names of all employee (or who have joined after 2015) whos salary greater than 25k");
        emplList.stream().filter(e -> e.getSalary() > 25000).map(Employee::getName).forEach(System.out::println);


        System.out.println("QnA-6: Count the number od Employees in each dept");
        Map<String, Long> countNubOfEmpInEachDeptMap = emplList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = countNubOfEmpInEachDeptMap.entrySet();

        for(Map.Entry<String, Long> entry: entrySet){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }

        System.out.println("QnA-7: Average salary of each dept");
        Map<String, Double> avgSalOfEachDept = emplList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingLong(Employee::getSalary)));

        Set<Map.Entry<String, Double>> entrySet1 = avgSalOfEachDept.entrySet();

        for(Map.Entry<String, Double> entry : entrySet1){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


        System.out.println("QnA-8: Get the details of youngest 'Male' employee in the 'IT' department");

        Optional<Employee> youngestMaleInITDept = emplList.stream().filter(e -> e.getGender().equals("M") && e.getDepartment().equals("IT")).min(Comparator.comparingInt(Employee::getAge));

        Employee youngestMale = youngestMaleInITDept.get();

        System.out.println(youngestMale.getName()+" : " +youngestMale.getAge());


        System.out.println("QnA-9: Who is the most Working experience in the Org");
        Optional<Employee> mostWorkExp  = emplList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).findFirst();
        //OR
        //Optional<Employee> mostWorkExp1  = emplList.stream().max(Comparator.comparingInt(Employee::getAge));

        Employee mostWorkExpEmp = mostWorkExp.get();

        System.out.println(mostWorkExpEmp.getName()+" : " +mostWorkExpEmp.getAge());


        System.out.println("QnA-10: How many Males and Females employees are there in IT department Team");

        Map<String, Long> malesAndFemalesInITDeprt = emplList.stream().filter(e -> e.getDepartment().equals("IT")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(malesAndFemalesInITDeprt);


        System.out.println("QnA-11: What is the average salary of  Males and Females Employees");

        Map<String, Double> avgSalaryofMaleandFemale = emplList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingLong(Employee::getSalary)));
        System.out.println(avgSalaryofMaleandFemale);


        System.out.println("QnA-12: List down the names of all Employees in each department");

        Map<String, List<Employee>> deptEmpList = emplList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
        //OR :: Map<String, List<Employee>> deptEmpList = emplList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(deptEmpList);

        System.out.println("QnA-13: Average and Total Salary of the Whole Organization");

        DoubleSummaryStatistics emplSalaryStatics = emplList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(emplSalaryStatics.getAverage()+" :  "+emplSalaryStatics.getSum());


        System.out.println("QnA-14: Separate the Employees who are younger or equl to 25 years from those employees who are older than 25 years ");
        Map<Boolean, List<Employee>> empList25AgePartioning = emplList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        Set<Map.Entry<Boolean, List<Employee>>> entrySetEmp = empList25AgePartioning.entrySet();
        for(Map.Entry<Boolean, List<Employee>> entry: entrySetEmp){
            if(entry.getKey()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }else{
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }


        System.out.println("QnA-15: Who is the Oldest employee in the Organization? and Get all Other details as well ");
        Optional<Employee> oldestEmplWrapper = emplList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee emp = oldestEmplWrapper.get();
        System.out.println(emp.getName()+" : "+emp.getAge());

        System.out.println("QnA-16: Map() and flatMap()? ");
        final List<List<String>> empEmails1 = emplList.stream().map(e -> e.getSkills()).collect(Collectors.toList());
        System.out.println(empEmails1);

        List<String> empEmails2 = emplList.stream().flatMap(e -> e.getSkills().stream()).collect(Collectors.toList());
        System.out.println(empEmails2);

        System.out.println("QnA-17: Group and Counts ");
        List<String> names = Arrays.asList("Soorya", "Chandra", "Shankara", "Ravi", "Sharade", "Shankar", "Ravi");
        Map<String, Long> counts =
                names.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counts);

        System.out.println("QnA-17: reduce() with int values");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);

        System.out.println("QnA-18: reduce() with + user.getAge(), Integer::sum  ");
        List<User> users = Arrays.asList(new User("John", 30, 519.00), new User("Julie", 35, 305.00));
        int computedAges = users.stream().reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);//**
        System.out.println(computedAges);

        System.out.println("QnA-19: reduce() with + user.getDepositAmount(), Double::sum  ");
        List<User> users1 = Arrays.asList(new User("John", 30, 519.00), new User("Julie", 35, 305.00));
        double computedAges1 = users1.stream().reduce(0.0, (a, b) -> a+b.getDepositAmount(), Double::sum);//**
        System.out.println(computedAges1);

    }
    public static void test9() {


        int total = IntStream.rangeClosed(0, 100).sum();
        System.out.println("total: "+total);

        List<String> names = Arrays.asList("Soorya", "Chandra", "Shankara", "Ravi", "Sharade", "Shankar", "Ravi");

        List<String> names1 = names.stream().distinct().collect(Collectors.toList());

        System.out.println("List1: "+names1);


        List<Employee> employees = Arrays.asList(new Employee(1, "Soorya"), new Employee(1, "Ravi"), new Employee(1, "Chandra"), new Employee(1, "Ravi"), new Employee(1, "Sharade"));



        Map<Employee, Long> counts =
                employees.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counts);
    }
    public static void test8() {
        List<String> names = Arrays.asList("Soorya", "Chandra", "Shankara", "Ravi", "Sharade", "Shankar", "Ravi");


        Map<String, Long> counts =
                names.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counts);
    }
    public static void test7() {

        int total = IntStream.rangeClosed(0, 100).sum();
        System.out.println("total: "+total);

        List<String> names = Arrays.asList("Soorya", "Chandra", "Shankara", "Ravi", "Sharade", "Shankar", "Ravi");

        List<String> names1 = names.stream().distinct().collect(Collectors.toList());

        System.out.println("List1: "+names1);


    }
    public static void t5() {
        List<Employee> empAddressList = EmployeeUtil.getEmplyeeWithAddressAndSkillsList();

        List<String> empEmails = empAddressList.stream().map(emp -> emp.getEmail()).collect(Collectors.toList());

        System.out.println(empEmails);
        final List<List<String>> empEmails1 = empAddressList.stream().map(emp -> emp.getSkills()).collect(Collectors.toList());

        System.out.println(empEmails1);

        List<String> empEmails2 = empAddressList.stream().flatMap(emp -> emp.getSkills().stream()).collect(Collectors.toList());

        System.out.println(empEmails2);

        List<String> empEmails3 = empAddressList.stream().flatMap(emp -> emp.getSkills().stream().sorted()).sorted().collect(Collectors.toList());

        System.out.println(empEmails3);

        System.out.println();
    }
    public static void t4() {
        List<Employee> empList = EmployeeUtil.getEmplyeeList();
       // empList.stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
    }
    public static void t3() {
        Map<Integer, String> map = GeneralUtil.getMapNameAndIdInt();


  /* 1st Way */
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, (o1,o2) -> o1.getKey().compareTo(o2.getKey()));
        entries.stream().forEach(System.out::println);

        /* 2nd Way */
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
    public static void t2() {
        //String str = Ram.randomAlphanumeric(5).toUpperCase()+RandamStringUtils.randomNumeric(3)+RandamStringUtils.randomAlpha(3).toUpperCase();

       // System.out.println(str);
    }

    public static void t1() {
        String s1 = new String("Soorya");
        String s2 = new String("Soorya");

        System.out.println("Result : " + s1.equals(s2));
        System.out.println("Result : " + s1 == s2);
    }
}
