/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
public abstract class EmployeePrototype implements Cloneable {
    protected String name;
    protected String role;

    public EmployeePrototype(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public abstract EmployeePrototype clone();

    public String getDetails() {
        return "Name: " + name + ", Role: " + role;
    }
}
