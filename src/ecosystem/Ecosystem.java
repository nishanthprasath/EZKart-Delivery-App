/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystem;
import community.Community;
import organisation.Organisation;
import customer.CustomerAccountDirectory;
import employee.Employee;
import employee.EmployeeAccountDirectory;
import java.util.ArrayList;
/**
 *
 * @author dkdha
 */
public class Ecosystem extends Organisation {
    
    private static Ecosystem business;
    private ArrayList<Community> communityList;
    CustomerAccountDirectory customerList;
    EmployeeAccountDirectory empList;
    
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
    
    public CustomerAccountDirectory getCustDirectory()
    {
        if(customerList == null)
        {
            this.customerList = new CustomerAccountDirectory();
        }
        return customerList;
    }
    
    public EmployeeAccountDirectory getEmpDirectory()
    {
        if(empList == null)
        {
            this.empList = new EmployeeAccountDirectory();
        }
        return empList;
    }
    
    public ArrayList<Community> getCommunityList() {
        if(communityList == null){
            this.communityList = new ArrayList<Community>();
        }
        return communityList;
    }
    
    public Community createAndAddNetwork(){
        Community community= new Community();
        communityList.add(community);
        return community;
    }
    
     public Community retriveNetwork(String name){
         Community com=new Community();
        for(Community community : communityList){
            if(community.getCommunityName().equalsIgnoreCase(name)){
                com= community;
            }
        }
        return com;
    }
    
}
