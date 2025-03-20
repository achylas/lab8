package lab8.example.Prototype.controller;

import lab8.example.Prototype.entity.Employee;
import lab8.example.Prototype.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Create a new employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Clone an existing employee
    @PostMapping("/{id}/clone")
    public Employee cloneEmployee(@PathVariable Long id) {
        return employeeService.cloneEmployee(id);
    }

    // Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
