package ru.badziy.spring.rest;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.badziy.spring.rest.configuration.MyConfig;
import ru.badziy.spring.rest.entity.Employee;

import java.util.List;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
/*
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

 */
        /*
        Employee empById = communication.getEmployee(1);
        System.out.println(empById);

         */
        /*
        Employee emp = new Employee("Fatima", "Badzieva", "IT", 1500);
        emp.setId(11);
        communication.saveEmployee(emp);

         */
        communication.deleteEmployee(11);
    }
}
