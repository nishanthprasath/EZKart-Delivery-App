/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystem;
import delivery.assignedAgent;
import delivery.assignedAgentDirectory;
import organisation.Organisation;
import customer.CustomerAccountDirectory;
import employee.EmployeeAccountDirectory;
import organisation.FoodVendorDirectory;
import items.ItemDirectory;
import items.MeatItemDirectory;
import java.util.ArrayList;
import organisation.MeatVendorDirectory;
import order.OrderDirectory;
import organisation.SupportRequestAssignDir;
import support.SupportRequestDirectory;
import organisation.SupportRequestAssignDir;
import cart.CartDirectory;
import items.GroceryItemDirectory;
import items.PharmaItemDirectory;
import organisation.GroceryVendorDirectory;
import organisation.PharmaVendorDirectory;
/**
 *
 * @author dkdha
 */
public class Ecosystem extends Organisation {
    
    private static Ecosystem business;
    CustomerAccountDirectory customerList;
    EmployeeAccountDirectory empList;
    FoodVendorDirectory foodList;
    MeatVendorDirectory meatList;
    MeatItemDirectory meatItemList;
    OrderDirectory orderList;
    ItemDirectory itemList;
    SupportRequestDirectory supportList;
    assignedAgentDirectory assignedAgentList;
    SupportRequestAssignDir supassignList;
    GroceryVendorDirectory groceryList;
    PharmaVendorDirectory pharmaList;
    GroceryItemDirectory groceryItemList;
    PharmaItemDirectory pharmaItemList;
    CartDirectory cartList;
    
    
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
    
//    public ArrayList<Community> getCommunityList() {
//        if(communityList == null){
//            this.communityList = new ArrayList<Community>();
//        }
//        return communityList;
//    }
//    
//    public Community createAndAddNetwork(){
//        Community community= new Community();
//        communityList.add(community);
//        return community;
//    }
//    
//     public Community retriveNetwork(String name){
//         Community com=new Community();
//        for(Community community : communityList){
//            if(community.getCommunityName().equalsIgnoreCase(name)){
//                com= community;
//            }
//        }
//        return com;
//    }
    
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
        
        
        
        public OrderDirectory getOrderDirectory()
    {
        if(orderList == null)
        {
            this.orderList = new OrderDirectory();
        }
        return orderList;
    }
        
    public assignedAgentDirectory getAssignedAgentDirectory()
    {
        if(assignedAgentList == null)
        {
            this.assignedAgentList = new assignedAgentDirectory();
        }
        return assignedAgentList;
    }
       
        
     public SupportRequestDirectory getSupportDirectory()
    {
        if(supportList == null)
        {
            this.supportList = new SupportRequestDirectory();
        }
        return supportList;
    }
     
    public SupportRequestAssignDir getSupportAssignDirectory()
    {
        if(supassignList == null)
        {
            this.supassignList = new SupportRequestAssignDir();
        }
        return supassignList;
    }
    
    
    public CartDirectory getCartDirectory()
    {
        if(cartList == null)
        {
            this.cartList = new CartDirectory();
        }
        return cartList;
    }
    

     
    public GroceryVendorDirectory getGroceryDirectory()
    {
        if(groceryList == null)
        {
            this.groceryList = new GroceryVendorDirectory();
        }
        return groceryList;
    }
    
    public PharmaVendorDirectory getPharmaDirectory()
    {
        if(pharmaList == null)
        {
            this.pharmaList = new PharmaVendorDirectory();
        }
        return pharmaList;
    }
    
    
    public GroceryItemDirectory getGroceryItemDirectory()
    {
        if(groceryItemList == null)
        {
            this.groceryItemList = new GroceryItemDirectory();
        }
        return groceryItemList;
    }
    
    public PharmaItemDirectory getPharmaItemDirectory()
    {
        if(pharmaItemList == null)
        {
            this.pharmaItemList = new PharmaItemDirectory();
        }
        return pharmaItemList;
    }
    

}

    
    
    

