/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import java.util.Date;
import person.Manager;
/**
 *
 * @author Luong
 */
public class PeopleTest {
    
    public static void main(String[]args){
        Employee newbie = new Employee(1000000, "Newbie",new Date (2, 10, 1986));
          
          System.out.println(newbie.toString());
        Manager boss = new Manager( newbie,4000000, "Boss",new Date ( 2,23,1986));
        
         System.out.println(boss.toString());
        boss.setAssistant();     
        
           Manager bigBoss = new Manager(newbie, 10000000, "Big Boss", new Date(3,12,1969));
        bigBoss.setAssistant();
        
         
          System.out.println(bigBoss.toString());
    
    }
    
}
