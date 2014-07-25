/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.Date;

/**
 *
 * @author Luong
 */
public class Employee extends Person{
    private double salary;
    
    public Employee(double salary, String name, Date birthday) {
      super(name,birthday);
      
     this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    public String toString(){
         return super.toString() + " Salary: " + salary;
    }
    
    
}
