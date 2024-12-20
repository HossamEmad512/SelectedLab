/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
public abstract class Employee {
    String name;
    double salary;

    @Override
    public String toString() {
        return "Employee{name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
