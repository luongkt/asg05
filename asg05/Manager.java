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
public class Manager extends Employee{
    private Employee assistant;
    double salary;
   

    public Manager(Employee assistant, double salary, String name, Date birthday) {
        super(salary, name, birthday);
        this.assistant = assistant;
    }

    public Employee setAssistant() {
        return assistant;
    }
public Double Salary(){
    return salary;
}
    public String toString(){
        return super.toString() + "   is Manager";
    }

 
  
}
