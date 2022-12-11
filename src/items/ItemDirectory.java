/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package items;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dkdha
 */
public class ItemDirectory {
    
     private ArrayList<Item> itemList;
     Random rand;


    public ItemDirectory() {
        itemList = new ArrayList();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
    
    public void setItemList(Item ob)
    {
        itemList.add(ob);
    }
    
    
    public Item createItems(String name, float price, String type,
            int qty, String shop_id){
        Item i = new Item();
        rand = new Random();
        i.setItemName(name);
        i.setPrice(price);
        i.setType(type);
        i.setQuantity(qty);
        i.setItemid('I' + Integer.toString(rand.nextInt(10000)));
        i.setShop_id(shop_id);
        return i;
    }
    
}
