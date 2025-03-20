package lab8.example.Prototype.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    private double salary;

    // Clone method to implement the Prototype pattern
    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning Employee", e);
        }
    }
}