package payroll.employee;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Employee {

    private @Id
    @GeneratedValue Long id;
    private String firsName;
    private String lastName;
    private String role;

    public Employee() {
    }

    public Employee(String firsName, String lastName, String role) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.firsName + " " + this.lastName;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firsName = parts[0];
        this.lastName = parts[1];
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee employee = (Employee) obj;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firsName, employee.firsName)
                && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firsName, this.lastName, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + this.id +
                ", firstName='" + this.firsName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", role='" + this.role + '\'' +
                '}';
    }
}
