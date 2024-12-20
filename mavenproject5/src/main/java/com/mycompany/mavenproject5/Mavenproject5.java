/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject5;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
public class Mavenproject5 {

    public static void main(String[] args) {
             // Singleton example for Payroll System
        PayrollSystem payrollSystem = PayrollSystem.getInstance();
        payrollSystem.processPayroll();

        // Singleton example for Database Connection Manager
        DatabaseConnectionManager dbManager = DatabaseConnectionManager.getInstance();
        dbManager.connect();

        // Factory for Employee Types
        Employee fullTimeEmployee = EmployeeFactory.createEmployee(EmployeeType.FULL_TIME);
        Employee partTimeEmployee = EmployeeFactory.createEmployee(EmployeeType.PART_TIME);
        Employee contractorEmployee = EmployeeFactory.createEmployee(EmployeeType.CONTRACTOR);

        // Factory for Department Creation
        Department hrDepartment = DepartmentFactory.createDepartment(DepartmentType.HR);
        Department financeDepartment = DepartmentFactory.createDepartment(DepartmentType.FINANCE);
        Department itDepartment = DepartmentFactory.createDepartment(DepartmentType.IT);

        // Example usage
        System.out.println(fullTimeEmployee);
        System.out.println(hrDepartment);
        
        GUI.main(args);

    }
}














