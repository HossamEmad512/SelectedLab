
package com.mycompany.mavenproject5;


public class EmpoyeeBilder {
    String name;
    double salary;
    
    public EmpoyeeBilder Name(String name)
    {
        this.name = name;
        
        return this;
    }
    
    public EmpoyeeBilder Salary(double salay)
    {
        this.salary= salary;
        return this;
    }
    
   public Employee build ()
   {
       return new Employee(name,salary);
   } 
    
}
