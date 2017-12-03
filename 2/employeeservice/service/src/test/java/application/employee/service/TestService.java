package application.employee.service;

import application.employee.config.EmployeeConfigContext;
import application.employee.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Collection;

public class TestService {

    public static void main(String[]args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfigContext.class);

        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

        Employee employee = new Employee();
        employee.setCode("E01");
        employee.setName("Jim");
        employeeService.addEmployee(employee);

        Collection<Employee> employees = employeeService.getEmployees();
        for (Employee e :employees){
            System.out.println(e.getId());
            System.out.println(e.getCode());
            System.out.println(e.getName());
        }
    }
}
