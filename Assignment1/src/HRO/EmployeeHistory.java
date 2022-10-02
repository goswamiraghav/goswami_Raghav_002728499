/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HRO;

import java.util.ArrayList;

/**
 *
 * @author raghavgoswami
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> employeehistory ;
    
    public EmployeeHistory()
    {
        this.employeehistory= new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeehistory() {
        return employeehistory;
    }

    public void setEmployeehistory(ArrayList<Employee> employeehistory) {
        this.employeehistory = employeehistory;
    }
    public Employee newemployeehistory()
    {
        Employee newch = new Employee();
        employeehistory.add(newch);
        return newch;     
    }
    public void deleteemployees(Employee ch )
    {
        employeehistory.remove(ch);
    }
    
    
    
    
}
