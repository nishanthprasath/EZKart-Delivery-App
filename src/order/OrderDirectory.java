/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author dkdha
 */
public class OrderDirectory {
        
    
     private ArrayList<Order> orderList;


    public OrderDirectory() {
        orderList = new ArrayList();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public void setOrdList(Order ob)
    {
        orderList.add(ob);
    }
    
    
    public Order createOrder(String custid, float total){
        Order o = new Order();
        Random rand = new Random();
        o.setCust_id(custid);
        o.setTotal_price(total);
        o.setOrderid('O' + Integer.toString(rand.nextInt(10000)));

        return o;
    }

    
}
