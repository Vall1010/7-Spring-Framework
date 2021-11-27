package com.montrealcollege.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.montrealcollege.config.AppConfig;
import com.montrealcollege.entities.Employee;

public class MainApp {

	public static void main(String... args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp2", Employee.class);
		Employee emp3 = context.getBean("emp3", Employee.class);

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
