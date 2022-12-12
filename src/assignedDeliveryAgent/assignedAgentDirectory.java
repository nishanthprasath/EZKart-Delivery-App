/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignedDeliveryAgent;

import java.util.ArrayList;
import java.util.Random;
import order.Order;

/**
 *
 * @author snehagovindarajan
 */
public class assignedAgentDirectory {
        
     private ArrayList<assignedAgent> assignedAgentList;
     public assignedAgentDirectory() {
        assignedAgentList = new ArrayList();
    }


    public ArrayList<assignedAgent> getAssignedAgentList() {
        return assignedAgentList;
    }

    public void setAssignedAgentList(assignedAgent assAgent) {
        assignedAgentList.add(assAgent);
    }


    public assignedAgent createAssignedAgent(String custId, String orderId, String status, String delPersin_id ){
        assignedAgent assAgent = new assignedAgent();
        Random rand = new Random();
        assAgent.setCust_id(custId);
        assAgent.setOrder_id(orderId);
        assAgent.setOrderStatus(status);
        assAgent.setDelPerson_id(delPersin_id);
        assAgent.setAgent_id('A' + Integer.toString(rand.nextInt(10000)));

        return assAgent;
    }
}
