/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organisation;

import customer.Customer;
import java.util.ArrayList;
import organisation.FoodVendorDirectory;
import organisation.FoodVendorOnboarding;
import java.util.Random;

/**
 *
 * @author dkdha
 */
public class FoodVendorDirectory {
    
    private ArrayList<FoodVendorOnboarding> foodVendorList;
    Random rand;

    public FoodVendorDirectory() {
        foodVendorList = new ArrayList();
    }

    public ArrayList<FoodVendorOnboarding> getFoodVendorList() {
        return foodVendorList;
    }
    
    public void setFoodVendorList(FoodVendorOnboarding fv_ob)
    {
        foodVendorList.add(fv_ob);
    }
    
    
        public FoodVendorOnboarding createShopData(String name, String location){
        FoodVendorOnboarding fv = new FoodVendorOnboarding();
        rand = new Random();
        fv.setShop_name(name);
        fv.setLocation(location);
        fv.getShop_id();
        fv.setShop_id('S' + Integer.toString(rand.nextInt(10000)));
        return fv;
    }
    
}
