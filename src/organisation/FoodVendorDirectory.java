/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organisation;

import customer.Customer;
import java.util.ArrayList;
import organisation.FoodVendorDirectory;
import organisation.FoodVendorOnboarding;

/**
 *
 * @author dkdha
 */
public class FoodVendorDirectory {
    
    private ArrayList<FoodVendorOnboarding> foodVendorList;

    public FoodVendorDirectory() {
        foodVendorList = new ArrayList();
    }

    public ArrayList<FoodVendorOnboarding> getFoodVendorList() {
        return foodVendorList;
    }
    
    public void setFoodVendorList(FoodVendorOnboarding fv)
    {
        foodVendorList.add(fv);
    }
    
    
        public FoodVendorOnboarding createShopData(String name, String location){
        FoodVendorOnboarding fv = new FoodVendorOnboarding();
        fv.setShop_name(name);
        fv.setLocation(location);
        fv.getShop_id();
        return fv;
    }
    
}
