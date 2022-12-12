/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organisation;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nishu
 */
public class GroceryVendorDirectory {
    private ArrayList<GroceryVendorOnboarding> groceryVendorList;
    Random rand;

    public GroceryVendorDirectory() {
        groceryVendorList = new ArrayList();
    }

    public ArrayList<GroceryVendorOnboarding> getGroceryVendorList() {
        return groceryVendorList;
    }
    
    public void setGroceryVendorList(GroceryVendorOnboarding gv_ob)
    {
        groceryVendorList.add(gv_ob);
    }
    
    
        public GroceryVendorOnboarding createShopData(String name, String location){
        GroceryVendorOnboarding gv = new GroceryVendorOnboarding();
        rand = new Random();
        gv.setShop_name(name);
        gv.setLocation(location);
        gv.getShop_id();
        gv.setShop_id('S' + Integer.toString(rand.nextInt(10000)));
        return gv;
    }
}
