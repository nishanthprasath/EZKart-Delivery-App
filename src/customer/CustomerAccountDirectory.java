/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;
import java.util.ArrayList;
import customer.Customer;

/**
 *
 * @author dkdha
 */
public class CustomerAccountDirectory {
    
    private ArrayList<Customer> customertList;

    public CustomerAccountDirectory() {
        customertList = new ArrayList();
    }

    public ArrayList<Customer> getUserAccountList() {
        return customertList;
    }
    
    public void SetUserAccountList(Customer ob)
    {
        customertList.add(ob);
    }
    
    public Customer authenticateUser(String username, String password){
        for (Customer c : customertList)
            if (c.getEmail_id().equals(username) && c.getPassword().equals(password)){
                return c;
            }
        return null;
    }
    
    public Customer createUserAccount(String name, String password, String email_id,
            String phone_no, String gender, String address, String zipcode){
        Customer c = new Customer();
        c.setCustomer_name(name);
        c.setPassword(password);
        c.setAddress(address);
        c.setGender(gender);
        c.setEmail_id(email_id);
        c.setZipcode(zipcode);
        c.getCust_id();
        return c;
    }
    

    

    
}
