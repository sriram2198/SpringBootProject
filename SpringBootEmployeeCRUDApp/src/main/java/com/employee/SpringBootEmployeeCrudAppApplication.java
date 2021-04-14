package com.employee;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.employee.dao.EmployeeRepository;
import com.employee.entity.Employee;

@SpringBootApplication
public class SpringBootEmployeeCrudAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootEmployeeCrudAppApplication.class, args);
		EmployeeRepository emprepo = context.getBean(EmployeeRepository.class);
		
		Employee emp = new Employee();
		emp.setFirstName("sriram");
		emp.setLastName("ramakrishna");
		emp.setEmploymentId("ramhp");
		emp.setStartDate("01/20/2002");
		emp.setEndDate("02/11/20012");
		emp.setDesignation("Java developer");
		emp.setDepartment("technical");
		emp.setStatus("java dev at myPaisaa");
		emp.setGender("male");
		emp.setBloodGroup("o+");
		emp.setAddr("shimoga");
		
		Employee emp1 = emprepo.save(emp);
		System.out.println(emp1);
		
		Employee emp2 = new Employee();
		emp2.setFirstName("ankit");
		emp2.setLastName("tiwari");
		emp2.setEmploymentId("tiwarioracle");
		emp2.setStartDate("02/12/2002");
		emp2.setEndDate("06/11/2012");
		emp2.setDesignation("python developer");
		emp2.setDepartment("technical");
		emp2.setStatus("python dev at oracle");
		emp2.setGender("male");
		emp2.setBloodGroup("o+");
		emp2.setAddr("mysore");
		
		Employee empl = emprepo.save(emp2);
		System.out.println(empl);
		System.out.println("done");
		
		Employee emp3 = new Employee();
		emp3.setFirstName("rohan");
		emp3.setLastName("kumar");
		emp3.setEmploymentId("kumarDel");
		emp3.setStartDate("05/12/2000");
		emp3.setEndDate("07/11/2012");
		emp3.setDesignation("javascript developer");
		emp3.setDepartment("technical");
		emp3.setStatus("javascript dev at oracle");
		emp3.setGender("male");
		emp3.setBloodGroup("A+");
		emp3.setAddr("delhi");
		
		//Creating Employee records
		List<Employee> emps = List.of(emp,emp2,emp3);
		Iterable<Employee> result = emprepo.saveAll(emps);
		result.forEach(employees->{
			System.out.println(employees);
		});
		System.out.println("done");
		
		//Reading Employee records
		Optional<Employee> optional = emprepo.findById((long) 3);
		Employee e = optional.get();
		e.setLastName("raj");
		Employee e1 = emprepo.save(e);
		System.out.println(e1);
		
		//Updating Employee records
		Iterable<Employee> itr = emprepo.findAll();
		Iterator<Employee> iterator = itr.iterator();
		while(iterator.hasNext())
		{
			Employee Emp = iterator.next();
			System.out.println(Emp);
		}
		
		//Deleting the Employee records
		emprepo.deleteById((long) 1);
		System.out.println("deleted");
	}
	
}