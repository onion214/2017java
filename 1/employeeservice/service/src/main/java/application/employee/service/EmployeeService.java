package application.employee.service;

import application.employee.model.Employee;
import application.employee.model.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }
}
