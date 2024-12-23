/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
public class FullTimeEmployeePrototype extends EmployeePrototype {
    public FullTimeEmployeePrototype(String name) {
        super(name, "Full-Time");
    }

    @Override
    public EmployeePrototype clone() {
        return new FullTimeEmployeePrototype(this.name);
    }
}