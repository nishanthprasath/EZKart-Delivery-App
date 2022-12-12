/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enterprise;

//import community.Community;

/**
 *
 * @author snehagovindarajan
 */
public class Enterprise {
     private EnterpriseType enterpriseType;
     private String shopName;
//     private Community community;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
     
     public enum EnterpriseType {
        FoodEnterprise("Food Enterprise"), MeatEnterprise("Meat Enterprise"), GroceriesEnterprise("Groceries Enterprise"), PharmacyEnterprise("Pharmacy Enterprise");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise() {
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
        public Enterprise(String name, EnterpriseType type) {
        this.enterpriseType = type;
        this.shopName = name;
    }
     
}
