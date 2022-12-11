/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;
import java.util.ArrayList;
import customer.Customer;
import java.util.Random;
import ecosystem.Ecosystem;

/**
 *
 * @author dkdha
 */
public class CustomerAccountDirectory {
    
    private Ecosystem system;
    private ArrayList<Customer> customertList;
    Random rand;


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
    

   
    public Customer createUserAccount(String name, String password, String email_id,
            String phone_no, String gender, String address, String zipcode){
        Customer c = new Customer();
        rand = new Random();
        c.setCustomer_name(name);
        c.setPassword(password);
        c.setAddress(address);
        c.setGender(gender);
        c.setEmail_id(email_id);
        c.setZipcode(zipcode);
        c.setCust_id('C' + Integer.toString(rand.nextInt(10000)));
        return c;
    }
    
//        public boolean checkIfUseridUnique(String emailId){
//        for (Customer c : customertList){
//            if (c.getEmail_id().equals(emailId))
//                return false;
//        }
//        return true;
//    }
    
    
}
