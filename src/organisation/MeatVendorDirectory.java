/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organisation;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author snehagovindarajan
 */
public class MeatVendorDirectory {
    
       
    private ArrayList<MeatVendorOnboarding> meatVendorList;
    Random rand;

    public MeatVendorDirectory() {
        meatVendorList = new ArrayList();
    }

    public ArrayList<MeatVendorOnboarding> getMeatVendorList() {
        return meatVendorList;
    }
    
    public void setMeatVendorList(MeatVendorOnboarding mv_ob)
    {
        meatVendorList.add(mv_ob);
    }
    
    
        public MeatVendorOnboarding createShopData(String name, String location){
        MeatVendorOnboarding meatVendor = new MeatVendorOnboarding();
        rand = new Random();
        meatVendor.setShop_name(name);
        meatVendor.setLocation(location);
        meatVendor.getShop_id();
        meatVendor.setShop_id('M' + Integer.toString(rand.nextInt(10000)));
        return meatVendor;
    }
}
