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
public class PharmaVendorDirectory {
    private ArrayList<PharmaVendorOnboarding> pharmaVendorList;
    Random rand;

    public PharmaVendorDirectory() {
        pharmaVendorList = new ArrayList();
    }

    public ArrayList<PharmaVendorOnboarding> getPharmaVendorList() {
        return pharmaVendorList;
    }
    
    public void setPharmaVendorList(PharmaVendorOnboarding pv_ob)
    {
        pharmaVendorList.add(pv_ob);
    }
    
    
        public PharmaVendorOnboarding createShopData(String name, String location){
        PharmaVendorOnboarding pv = new PharmaVendorOnboarding();
        rand = new Random();
        pv.setShop_name(name);
        pv.setLocation(location);
        pv.getShop_id();
        pv.setShop_id('S' + Integer.toString(rand.nextInt(10000)));
        return pv;
    }
}
