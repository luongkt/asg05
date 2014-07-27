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
public class Person {
    protected String name;
    protected Date birthday;
    
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){
        return (name + birthday).toString();
    }
}
