/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise;

import java.util.ArrayList;

/**
 *
 * @author snehagovindarajan
 */
public class EnterpriseDirectory {
      private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
      
     public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
     
     public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.FoodEnterprise){
            enterprise = new FoodEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.MeatEnterprise){
            enterprise = new MeatEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.GroceriesEnterprise)
        {
            enterprise = new GroceriesEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.PharmacyEnterprise){
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
     
      public boolean isUnique(String name){
        for(Enterprise enterprise : enterpriseList){
            if(name.equalsIgnoreCase(enterprise.getShopName())){
                return false;
            }
        }
        return true;
    }
}
