package demo.service;

import demo.config.MongoConfigContext;
import demo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[]args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MongoConfigContext.class);

        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

        Employee employee = new Employee();
        employee.setCode("K01");
        employee.setName("Jack");
        employeeService.addEmployee(employee);
    }
}
