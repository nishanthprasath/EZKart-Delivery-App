/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;


/**
 *
 * @author dkdha
 */

import user_interface.MainJFrame;
/**
 *
 * @author dkdha
 */
public class Customer {

    
   private String customer_name;
   private String email_id;
   private String phone_no;
   private String password;
   private String gender;
   private String address;


    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    } 

    public void setAddress(String address) {
        this.address = address;
    }
    

    
        @Override
    public String toString() {
        return email_id;
    }
}

