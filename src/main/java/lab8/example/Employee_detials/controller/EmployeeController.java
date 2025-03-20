package lab8.example.Employee_detials.controller;

import lab8.example.Employee_detials.factory.EmployeeFactory;
import lab8.example.Employee_detials.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeFactory employeeFactory;

    public EmployeeController(EmployeeFactory employeeFactory) {
        this.employeeFactory = employeeFactory;
    }

    @GetMapping("/{type}")
    public String getEmployee(@PathVariable String type) {
        try {
            Employee employee = employeeFactory.createEmployee(type);
            return employee.getDetails();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}