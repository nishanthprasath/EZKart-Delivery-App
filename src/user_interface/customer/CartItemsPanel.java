/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package user_interface.customer;

import java.awt.Color;
import cart.CartDirectory;
import ecosystem.Ecosystem;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import order.Order;
import order.OrderDirectory;
import user_interface.customer.CustomerMainPanel;
import customer.CustomerAccountDirectory;

/**
 *
 * @author nishu
 */
public class CartItemsPanel extends javax.swing.JPanel {
    
    CartDirectory crd;
    CartDirectory dcrd;
    DefaultTableModel tblmodel;
    OrderDirectory ord;
    Ecosystem system;
    float value = 0;
    static int cnt = 0;


    /**
     * Creates new form CartItemsPanel
     */
    
    public float total_price()
    {
        for(int i=0; i< crd.getCartList().size(); i++)
        {
            
            value = value + (crd.getCartList().get(i).getQuantity() * crd.getCartList().get(i).getPrice());

            }
                 
                 return value;
                             
    }
    
    public void populateTable()
    {
        tblmodel = (DefaultTableModel)tblCart.getModel();
        tblmodel.setRowCount(0);
      
         for(int i=0; i< crd.getCartList().size(); i++)
        {
             Object data_value [] = {crd.getCartList().get(i).getItemName(),
                 
                 crd.getCartList().get(i).getQuantity(),
                 
                 crd.getCartList().get(i).getQuantity() * crd.getCartList().get(i).getPrice()

            };
           tblmodel.addRow(data_value);
           
           cnt++;
        }
    
    }
    public CartItemsPanel(Ecosystem system , CartDirectory crd, OrderDirectory ord) {
        initComponents();
        this.system = system;
        this.crd = crd;
        dcrd = system.getCartDirectory();
 
        String total = Float.toString(total_price());
        lblTotal.setText(total);
        populateTable();
        jPanel1.setBackground(new Color(0,0,0,20));

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblCart);

        jButton2.setBackground(new java.awt.Color(51, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Click to Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Value");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("<value>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123)
                .addComponent(jButton2)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal)
                    .addComponent(jLabel2))
                .addGap(79, 79, 79))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1042, 714);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shop-bg.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1042, 714);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        

        float tot = total_price();
        ord = system.getOrderDirectory();
        Order o = ord.createOrder(CustomerMainPanel.cust_id, tot );
        ord.setOrdList(o);
        crd.getCartList().clear();
        JOptionPane.showMessageDialog(new JFrame(), "Order placed successfully");
        populateTable();
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    public void rePlaceCart(CartDirectory crd){
     crd = new CartDirectory();}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblCart;
    // End of variables declaration//GEN-END:variables
}
