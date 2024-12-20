

package com.mycompany.mavenproject5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    private static List<Employee> employees = new ArrayList<>();
    private static List<DepartmentType> employeeDepartments = new ArrayList<>(); // تخزين الأقسام لكل موظف

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame mainFrame = new JFrame("Employee Management System");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        JButton addEmployeeButton = new JButton("Add Employee");
        JButton viewEmployeeButton = new JButton("View Employees");
        JButton managePayrollButton = new JButton("Manage Payroll");
        JButton exitButton = new JButton("Exit");

        panel.add(addEmployeeButton);
        panel.add(viewEmployeeButton);
        panel.add(managePayrollButton);
        panel.add(exitButton);

        mainFrame.add(panel);

        addEmployeeButton.addActionListener(e -> openAddEmployeeWindow());
        viewEmployeeButton.addActionListener(e -> openViewEmployeeWindow());
        managePayrollButton.addActionListener(e -> openManagePayrollWindow());
        exitButton.addActionListener(e -> System.exit(0));

        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

    private static void openAddEmployeeWindow() {
        JFrame frame = new JFrame("Add Employee");
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel typeLabel = new JLabel("Type:");
        JComboBox<EmployeeType> typeComboBox = new JComboBox<>(EmployeeType.values());
        
        JLabel departLabel = new JLabel("Department:");
        JComboBox<DepartmentType> departComboBox = new JComboBox<>(DepartmentType.values());

        JLabel salaryLabel = new JLabel("Salary:");
        JTextField salaryField = new JTextField();

        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(typeLabel);
        frame.add(typeComboBox);
        frame.add(departLabel);
        frame.add(departComboBox);
        frame.add(salaryLabel);
        frame.add(salaryField);
        frame.add(saveButton);
        frame.add(cancelButton);

        saveButton.addActionListener(e -> {
            String name = nameField.getText();
            EmployeeType type = (EmployeeType) typeComboBox.getSelectedItem();
            DepartmentType depart = (DepartmentType) departComboBox.getSelectedItem();

            double salary;
            try {
                salary = Double.parseDouble(salaryField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid salary input!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Employee employee = EmployeeFactory.createEmployee(type);
            employee.name = name;
            employee.salary = salary;

            employees.add(employee);
            employeeDepartments.add(depart); // تخزين القسم في القائمة

            JOptionPane.showMessageDialog(frame, "Employee added successfully!");
            frame.dispose();
        });

        cancelButton.addActionListener(e -> frame.dispose());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void openViewEmployeeWindow() {
        JFrame frame = new JFrame("View Employees");
        frame.setSize(600, 300);

        String[] columnNames = {"ID", "Name", "Type", "Department", "Salary"}; // إضافة عمود "Department"
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            DepartmentType department = employeeDepartments.get(i); // جلب القسم من القائمة
            model.addRow(new Object[]{i + 1, employee.name, employee.getClass().getSimpleName(), department, employee.salary});
        }

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void openManagePayrollWindow() {
        JFrame frame = new JFrame("Manage Payroll");
        frame.setSize(300, 150);

        JLabel label = new JLabel("Payroll processing is centralized", SwingConstants.CENTER);
        JButton processButton = new JButton("Process Payroll");

        processButton.addActionListener(e -> {
            PayrollSystem payrollSystem = PayrollSystem.getInstance();
            payrollSystem.processPayroll();
            JOptionPane.showMessageDialog(frame, "Payroll processed successfully!");
        });

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(processButton, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
