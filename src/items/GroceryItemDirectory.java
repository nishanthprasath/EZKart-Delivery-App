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
public class GroceryItemDirectory {
    private ArrayList<GroceryItem> groceryItemList;
     Random rand;


    public GroceryItemDirectory() {
        groceryItemList = new ArrayList();
    }

    public ArrayList<GroceryItem> getGroceryItemList() {
        return groceryItemList;
    }
    
    public void setGroceryItemList(GroceryItem ob)
    {
        groceryItemList.add(ob);
    }
    
    
    public GroceryItem createItems(String name, float price, String bestb, String type,
            int qty, String shop_id){
        GroceryItem i = new GroceryItem();
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
