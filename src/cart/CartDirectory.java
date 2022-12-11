/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cart;

import java.util.ArrayList;

/**
 *
 * @author dkdha
 */
public class CartDirectory {
    
    
     private ArrayList<Cart> cartList;


    public CartDirectory() {
        cartList = new ArrayList();
    }

    public ArrayList<Cart> getCartList() {
        return cartList;
    }
    
    public void setCartList(Cart ob)
    {
        cartList.add(ob);
    }
    
    
    public Cart createCart(String Itemid, String name, int qty, float price, String type){
        Cart c = new Cart();
        c.setItemId(Itemid);
        c.setItemName(name);
        c.setPrice(price);
        c.setQuantity(qty);
        c.setType(type);

        return c;
    }

    
}
