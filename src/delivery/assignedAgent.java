/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package delivery;

/**
 *
 * @author snehagovindarajan
 */
public class assignedAgent {
    private String cust_id;
    private String order_id;
    private String delPerson_id;

    private String agent_id;
    private String orderStatus;
    
    
    public String getDelPerson_id() {
        return delPerson_id;
    }

    public void setDelPerson_id(String delPerson_id) {
        this.delPerson_id = delPerson_id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(String agent_id) {
        this.agent_id = agent_id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    
    
}
