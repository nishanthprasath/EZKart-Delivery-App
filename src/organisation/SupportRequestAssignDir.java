/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organisation;

import java.util.ArrayList;
import user_interface.support_admin.SupportAdminPanel;
/**
 *
 * @author dkdha
 */
public class SupportRequestAssignDir {
    
    private ArrayList<SupportRequestAssign> supassignlist;


    public SupportRequestAssignDir() {
        supassignlist = new ArrayList();
    }

    public ArrayList<SupportRequestAssign> getsupassignList() {
        return supassignlist;
    }
    
    public void SetUserAccountList(SupportRequestAssign ob)
    {
        supassignlist.add(ob);
    }
    
        public static SupportRequestAssign createsupdata(){
        SupportRequestAssign s = new SupportRequestAssign();
        
        s.setSup_id(SupportAdminPanel.tblSupportAdmin.getValueAt(SupportAdminPanel.index, 0).toString());
        s.setOrder_id(SupportAdminPanel.tblSupportAdmin.getValueAt(SupportAdminPanel.index, 1).toString());
        s.setCust_id(SupportAdminPanel.tblSupportAdmin.getValueAt(SupportAdminPanel.index, 2).toString());
        s.setReason(SupportAdminPanel.tblSupportAdmin.getValueAt(SupportAdminPanel.index, 3).toString());
        s.setEmp_id(SupportAdminPanel.jComboBox1.getSelectedItem().toString());
        

        return s;
    }
    
    
}
