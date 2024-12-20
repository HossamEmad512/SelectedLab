/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
public class PayrollSystem {
    private static PayrollSystem instance;

    private PayrollSystem() {}

    public static PayrollSystem getInstance() {
        if (instance == null) {
            instance = new PayrollSystem();
        }
        return instance;
    }

    public void processPayroll() {
        System.out.println("Processing payroll...");
    }
}

