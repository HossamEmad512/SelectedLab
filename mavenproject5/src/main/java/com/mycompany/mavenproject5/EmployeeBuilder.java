
package com.mycompany.mavenproject5;


public class EmployeeBuilder {
     String name;
     String role;
     double salary;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee build() {
        return new Employee(name, role, salary);
    }
}
   

