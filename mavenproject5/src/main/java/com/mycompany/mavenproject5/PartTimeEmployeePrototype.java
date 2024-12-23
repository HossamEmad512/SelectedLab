/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject5;

/**
 *
 * @author EmadAbdElGhanyKamelM
 */

public class PartTimeEmployeePrototype extends EmployeePrototype {
    public PartTimeEmployeePrototype(String name) {
        super(name, "Part-Time");
    }

    @Override
    public EmployeePrototype clone() {
        return new PartTimeEmployeePrototype(this.name);
    }
}

