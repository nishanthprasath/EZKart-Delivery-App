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
public class MeatItemDirectory {
    private ArrayList<MeatItem> meatItemList;
     Random rand;


    public MeatItemDirectory() {
        meatItemList = new ArrayList();
    }

    public ArrayList<MeatItem> getMeatItemList() {
        return meatItemList;
    }
    
    public void setMeatItemList(MeatItem ob)
    {
        meatItemList.add(ob);
    }
    
    
    public MeatItem createItems(String name, float price, String bestb, String type,
            int qty, String shop_id){
        MeatItem i = new MeatItem();
        rand = new Random();
        i.setItemName(name);
        i.setPrice(price);
        i.setBestBefore(bestb);
        i.setType(type);
        i.setQuantity(qty);
        i.setItemid('I' + Integer.toString(rand.nextInt(10000)));
        i.setShop_id(shop_id);
        return i;
    }
}
