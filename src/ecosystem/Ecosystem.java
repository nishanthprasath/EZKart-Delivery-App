/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystem;
import community.Community;
import organisation.Organisation;
import customer.CustomerAccountDirectory;
import employee.EmployeeAccountDirectory;
import organisation.FoodVendorDirectory;
import items.ItemDirectory;
import items.MeatItemDirectory;
import java.util.ArrayList;
import organisation.MeatVendorDirectory;
/**
 *
 * @author dkdha
 */
public class Ecosystem extends Organisation {
    
    private static Ecosystem business;
    private ArrayList<Community> communityList;
    CustomerAccountDirectory customerList;
    EmployeeAccountDirectory empList;
    FoodVendorDirectory foodList;
    MeatVendorDirectory meatList;
    ItemDirectory itemList;
    MeatItemDirectory meatItemList;
    
    
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
    
        public MeatVendorDirectory getMeatDirectory()
    {
        if(meatList == null)
        {
            this.meatList = new MeatVendorDirectory();
        }
        return meatList;
    }
     
    public MeatItemDirectory getMeatItemDirectory()
    {
        if(meatItemList == null)
        {
            this.meatItemList = new MeatItemDirectory();
        }
        return meatItemList;
    }
    
    
    
}
