package lab8.example.Prototype.service;

import lab8.example.Prototype.entity.Employee;
import lab8.example.Prototype.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Save a new employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    // Clone an existing employee by ID
    public Employee cloneEmployee(Long id) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);

        if (existingEmployee.isPresent()) {
            Employee clonedEmployee = existingEmployee.get().clone();
            clonedEmployee.setId(null); // Set ID to null so JPA creates a new entity
            return employeeRepository.save(clonedEmployee);
        } else {
            throw new RuntimeException("Employee with ID " + id + " not found");
        }
    }
}