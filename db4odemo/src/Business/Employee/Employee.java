/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    
    
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    

    @Override
    public String toString() {
        return name;
    }
    
    
}
