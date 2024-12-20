/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
 enum EmployeeType {
    FULL_TIME, PART_TIME, CONTRACTOR
}

public class EmployeeFactory {
    public static Employee createEmployee(EmployeeType type) {
        switch (type) {
            case FULL_TIME:
                return new FullTimeEmployee();
            case PART_TIME:
                return new PartTimeEmployee();
            case CONTRACTOR:
                return new ContractorEmployee();
            default:
                throw new IllegalArgumentException("Unknown employee type");
        }
    }
}