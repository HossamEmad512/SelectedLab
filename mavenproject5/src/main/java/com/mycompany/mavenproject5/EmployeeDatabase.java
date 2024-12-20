/////*
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//// */
////package com.mycompany.mavenproject5;
////
/////**
//// *
//// * @author EmadAbdElGhanyKamelM
//// */
////
////
//import java.sql.*;
//import java.util.ArrayList;
//
//class EmployeeDatabase {
//    private static EmployeeDatabase instance;
//    private final String DB_URL = "jdbc:mysql://localhost:3306/EmployeeDB";
//    private final String DB_USER = "root";
//    private final String DB_PASSWORD = "yourpassword";
//
//    private EmployeeDatabase() {
//        // Load JDBC driver
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException("Failed to load JDBC driver.", e);
//        }
//    }
//
//    public static synchronized EmployeeDatabase getInstance() {
//        if (instance == null) {
//            instance = new EmployeeDatabase();
//        }
//        return instance;
//    }
//
//    public void addEmployee(Employee employee) {
//        String query = "INSERT INTO Employees (name, type, salary) VALUES (?, ?, ?)";
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//             PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setString(1, employee.getName());
//            statement.setString(2, employee.getType());
//            statement.setDouble(3, employee.getSalary());
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Error adding employee to database.", e);
//        }
//    }
//
//    public java.util.List<Employee> getEmployees() {
//        String query = "SELECT * FROM Employees";
//        java.util.List<Employee> employees = new ArrayList<>();
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(query)) {
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String type = resultSet.getString("type");
//                double salary = resultSet.getDouble("salary");
//                employees.add(new Employee(id, name, type, salary));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Error retrieving employees from database.", e);
//        }
//        return employees;
//    }
//}
