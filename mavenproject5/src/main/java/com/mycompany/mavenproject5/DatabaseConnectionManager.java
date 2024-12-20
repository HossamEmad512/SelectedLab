package com.mycompany.mavenproject5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EmadAbdElGhanyKamelM
 */
public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {}

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }
}