/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package support;

import java.util.ArrayList;
import java.util.Random;
import support.SupportRequest;
import support.SupportRequestDirectory;

/**
 *
 * @author dkdha
 */
public class SupportRequestDirectory {
    
    
    private ArrayList<SupportRequest> supportList;


    public SupportRequestDirectory() {
        supportList = new ArrayList();
    }

    public ArrayList<SupportRequest> getSupportList() {
        return supportList;
    }
    
    public void setSupList(SupportRequest ob)
    {
        supportList.add(ob);
    }
    
    
    public SupportRequest createReq(String custid, String orderid, String reason){
        SupportRequest sr = new SupportRequest();
        Random rand = new Random();
        sr.setCustid(custid);
        sr.setOrderid(orderid);
        sr.setReason(reason);
        sr.setSupid("SP" + Integer.toString(rand.nextInt(10000)));
        return sr;
    }

    
}
