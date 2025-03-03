/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user_interface.support_agent;

import ecosystem.Ecosystem;
import java.awt.Color;
import javax.swing.JOptionPane;
import user_interface.MainJFrame;

import ecosystem.Ecosystem;
import user_interface.MainJFrame;
import organisation.SupportRequestAssignDir;
import employee.Employee;
import employee.EmployeeAccountDirectory;
import javax.swing.table.DefaultTableModel;
import order.OrderDirectory;
import organisation.SupportRequestAssign;
import organisation.SupportRequestAssignDir;
import order.Order;
/**
 *
 * @author nishu
 */
public class SupportAgentPanel extends javax.swing.JPanel {
    
    Ecosystem system;
    MainJFrame mainframe;
    SupportRequestAssignDir sard;
    OrderDirectory ord;
    DefaultTableModel tblModel;

    int count = 0;

    /**
     * Creates new form SupportAgentPanel
     */
    public SupportAgentPanel(Ecosystem system, MainJFrame mainframe, String sup_emp_id) {
        initComponents();
        this.system = system;
        this.mainframe = mainframe;
        sard = system.getSupportAssignDirectory();
        ord = system.getOrderDirectory();
        tblModel = (DefaultTableModel)tblDeliveryAgent2.getModel();

        
        
            for(SupportRequestAssign sa1: sard.getsupassignList())
            {
                if(sa1.getEmp_id().equals(sup_emp_id))
                {
                    
                    
                  
             Object data_value [] = {sard.getsupassignList().get(count).getSup_id(),

                sard.getsupassignList().get(count).getOrder_id(),
                sard.getsupassignList().get(count).getCust_id(),
                sard.getsupassignList().get(count).getReason(),
                 
            };
           tblModel.addRow(data_value);
//        }
                    
                    
                }
                count++;
            }
        jPanel1.setBackground(new Color(0,0,0,15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDeliveryAgent2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setLayout(null);

        tblDeliveryAgent2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Support ID", "Order ID", "Customer ID", "Reason"
            }
        ));
        tblDeliveryAgent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeliveryAgent2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblDeliveryAgent2);

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        add(jPanel1);
        jPanel1.setBounds(50, 100, 890, 460);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer-support-bg.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 720);

        jLabel10.setFont(new java.awt.Font("Maku", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Welcome Admin ..!!");
        add(jLabel10);
        jLabel10.setBounds(100, 0, 380, 80);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDeliveryAgent2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeliveryAgent2MouseClicked
        // TODO add your handling code here:
        
        int index = tblDeliveryAgent2.getSelectedRow();
        String message = "Issue Resolved\n";
        Object[] params = {message};
        JOptionPane.showConfirmDialog(null, params, "Update Issue Status", JOptionPane.PLAIN_MESSAGE);
        
        for(Order o1: ord.getOrderList())
        {
            if(o1.getOrderid().equals(tblDeliveryAgent2.getValueAt(index, 1).toString()))
            {
                o1.setStatus("Resolved");
            }
        }
    }//GEN-LAST:event_tblDeliveryAgent2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
     mainframe.logoutAction();
     mainframe.displayPane();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblDeliveryAgent2;
    // End of variables declaration//GEN-END:variables
}
