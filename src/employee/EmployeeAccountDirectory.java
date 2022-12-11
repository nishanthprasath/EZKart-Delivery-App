/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

import employee.Employee;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dkdha
 */
public class EmployeeAccountDirectory {
    
    private ArrayList<Employee> employeeList;
    Random rand;

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
        rand = new Random();
        e.setEmployee_name(name);
        e.setPassword(password);
        e.setEmail_id(email_id);
        e.setPhone_no(phone_no);
        e.setAddress(address);
        e.setDepartment(dept);
        e.setRole(role);
        e.setEmp_id('E' + Integer.toString(rand.nextInt(10000)));
        return e;
    
}
    
        public boolean checkIfUsernameIsUnique(String emailId){
        for (Employee e : employeeList){
            if (e.getEmail_id().equals(emailId))
                return false;
        }
        return true;
    }
    
//    public static void main(String[] args) {
//        
//        EmployeeAccountDirectory emp_dir = new EmployeeAccountDirectory();
//        for(Employee e: emp_dir.getEmpAccountList())
//        {
//            System.out.println(e.getEmp_id() + e.getRole());
//        }
//    }
    
}