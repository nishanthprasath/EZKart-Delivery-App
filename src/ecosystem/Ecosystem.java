/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystem;
import organisation.Organisation;
import customer.CustomerAccountDirectory;
import employee.Employee;
import employee.EmployeeAccountDirectory;
import organisation.FoodVendorDirectory;
import items.ItemDirectory;
/**
 *
 * @author dkdha
 */
public class Ecosystem extends Organisation {
    
    private static Ecosystem business;
    CustomerAccountDirectory customerList;
    EmployeeAccountDirectory empList;
    FoodVendorDirectory foodList;
    ItemDirectory itemList;
    
    
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
    
     public FoodVendorDirectory getFoodDirectory()
    {
        if(foodList == null)
        {
            this.foodList = new FoodVendorDirectory();
        }
        return foodList;
    }
     
    public ItemDirectory getItemDirectory()
    {
        if(itemList == null)
        {
            this.itemList = new ItemDirectory();
        }
        return itemList;
    }
    
    
    
}
