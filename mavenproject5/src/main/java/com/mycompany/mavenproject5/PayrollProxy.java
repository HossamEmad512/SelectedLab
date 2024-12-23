/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */

public class PayrollProxy implements PayrollAccess {
    private RealPayrollSystem realPayrollSystem;
    private boolean hasAccess;

    public PayrollProxy(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    @Override
    public void processPayroll() {
        if (hasAccess) {
            if (realPayrollSystem == null) {
                realPayrollSystem = new RealPayrollSystem();
            }
            realPayrollSystem.processPayroll();
        } else {
            System.out.println("Access denied: You do not have permission to process payroll.");
        }
    }
}


