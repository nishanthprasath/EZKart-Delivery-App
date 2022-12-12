/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nishu
 */
public class PharmaItemDirectory {
    private ArrayList<PharmaItem> pharmaItemList;
     Random rand;


    public PharmaItemDirectory() {
        pharmaItemList = new ArrayList();
    }

    public ArrayList<PharmaItem> getPharmaItemList() {
        return pharmaItemList;
    }
    
    public void setPharmaItemList(PharmaItem ob)
    {
        pharmaItemList.add(ob);
    }
    
    
    public PharmaItem createItems(String name, float price, String expiry, String type,
            int qty, String shop_id){
        PharmaItem i = new PharmaItem();
        rand = new Random();
        i.setItemName(name);
        i.setPrice(price);
        i.setExpiry(expiry);
        i.setType(type);
        i.setQuantity(qty);
        i.setItemid('I' + Integer.toString(rand.nextInt(10000)));
        i.setShop_id(shop_id);
        return i;
    }
}
