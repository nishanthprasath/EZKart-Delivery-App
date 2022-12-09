/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author dkdha
 */
public class EmployeeAccountDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeAccountDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmpAccountList() {
        return employeeList;
    }
    
    public void SetEmpAccountList(Employee ob)
    {
        employeeList.add(ob);
    }
    
    public Employee authenticateUser(String username, String password){
        for (Employee e : employeeList)
            if (e.getEmail_id().equals(username) && e.getPassword().equals(password)){
                return e;
            }
        return null;
    }
    
    public Employee createEmpAccount(String name, String password, String email_id,
            String phone_no, String dept, String address, String role){
        Employee e = new Employee();
        e.setEmployee_name(name);
        e.setPassword(password);
        e.setAddress(address);
        e.setDepartment(dept);
        e.setEmail_id(email_id);
        e.setRole(role);
        e.getEmp_id();
        return e;
    
}
}
