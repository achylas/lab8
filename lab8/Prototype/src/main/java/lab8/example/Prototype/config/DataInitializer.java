package lab8.example.Prototype.config;

import lab8.example.Prototype.entity.Employee;
import lab8.example.Prototype.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        return args -> {
            employeeRepository.save(new Employee(null, "Alice Johnson", "HR", 50000));
            employeeRepository.save(new Employee(null, "Bob Smith", "IT", 60000));
        };
    }
}