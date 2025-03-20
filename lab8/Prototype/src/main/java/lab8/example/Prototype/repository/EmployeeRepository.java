package lab8.example.Prototype.repository;

import lab8.example.Prototype.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}