/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
public class Employee {
    String name;
    String role;
    double salary;
    
    public Employee(){}

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Role: " + role + ", Salary: " + salary;
    }
}
