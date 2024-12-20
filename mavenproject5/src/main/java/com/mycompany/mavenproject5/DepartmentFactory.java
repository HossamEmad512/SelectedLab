/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
enum DepartmentType {
    HR, FINANCE, IT
}

public class DepartmentFactory {
    public static Department createDepartment(DepartmentType type) {
        switch (type) {
            case HR -> {
                return new HRDepartment();
            }
            case FINANCE -> {
                return new FinanceDepartment();
            }
            case IT -> {
                return new ITDepartment();
            }
            default -> throw new IllegalArgumentException("Unknown department type");
        }
    }
}
