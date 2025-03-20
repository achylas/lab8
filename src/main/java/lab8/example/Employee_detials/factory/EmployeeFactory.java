package lab8.example.Employee_detials.factory;

import lab8.example.Employee_detials.model.Employee;
import lab8.example.Employee_detials.model.FullTimeEmployee;
import lab8.example.Employee_detials.model.Intern;
import lab8.example.Employee_detials.model.PartTimeEmployee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeFactory {
    public Employee createEmployee(String type) {
        switch (type.toLowerCase()) {
            case "fulltime":
                return new FullTimeEmployee();
            case "parttime":
                return new PartTimeEmployee();
            case "intern":
                return new Intern();
            default:
                throw new IllegalArgumentException("Invalid employee type: " + type);
        }
    }
}
