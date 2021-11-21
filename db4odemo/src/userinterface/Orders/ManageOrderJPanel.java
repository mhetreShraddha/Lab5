/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Orders;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dgoda
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount userAccount;
    private Restaurant restaurant;
    private ArrayList<Dishes> cartList;
    private double totalPrice;
    
    public ManageOrderJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount, Restaurant restaurant) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.restaurant = restaurant;
        
        populateDishesForRestro();
        cartList = new ArrayList<Dishes>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenu = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustMenu = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        lblCart = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        lblPlaceOrder1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblTotalPrice = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        btnPlaceOrder1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMenu.setText("Menu");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblCustMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Dish Description", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustMenu);

        btnAddToCart.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        lblCart.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCart.setText("Cart");

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dish Name", "Dish Description", "Dish Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        lblPlaceOrder1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlaceOrder1.setText("Place Order");

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTotalPrice.setText("Total Price($):");

        txtTotalPrice.setEditable(false);
        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        btnPlaceOrder1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnPlaceOrder1.setText("Place Order");
        btnPlaceOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(217, 217, 217)
                            .addComponent(btnAddToCart))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(244, 244, 244)
                            .addComponent(lblCart))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDelete)
                                        .addGap(95, 95, 95)
                                        .addComponent(btnPlaceOrder1)
                                        .addGap(46, 46, 46)
                                        .addComponent(lblTotalPrice)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnBack)
                                        .addGap(155, 155, 155)
                                        .addComponent(lblPlaceOrder1)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(238, 238, 238)
                            .addComponent(lblMenu))))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, lblCart, lblMenu});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, lblTotalPrice});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblPlaceOrder1))
                .addGap(23, 23, 23)
                .addComponent(lblMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddToCart)
                .addGap(28, 28, 28)
                .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(lblTotalPrice)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrder1))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, lblCart, lblMenu});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, lblTotalPrice, txtTotalPrice});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        int selectedRow = tblCustMenu.getSelectedRow();
        if(selectedRow >= 0) {
            Dishes selectedDish = (Dishes) tblCustMenu.getValueAt(selectedRow, 0);
            cartList.add(selectedDish);
            totalPrice += Double.parseDouble(selectedDish.getPrice());
            txtTotalPrice.setText(String.valueOf(totalPrice));
            populateCartTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to add the Dishes to the Cart.");
        }
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart.getSelectedRow();
        if(selectedRow >= 0) {
            Dishes selectedDish = (Dishes) tblCart.getValueAt(selectedRow, 0);
            cartList.remove(selectedDish);
            totalPrice -= Double.parseDouble(selectedDish.getPrice());
            txtTotalPrice.setText(String.valueOf(totalPrice));
            populateCartTable();
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row to delete the Dishes in the Cart.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void btnPlaceOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrder1ActionPerformed
        // TODO add your handling code here:
        Customer customer = ecosystem.getCustomerDirectory().getCustomer(userAccount.getUsername());
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        restaurant.addOrder(timeStamp, restaurant.getRestaurantUsername(), userAccount.getUsername(), null, String.valueOf(totalPrice), "New Order", cartList, restaurant.getRestaurantAddress());
        customer.addOrder(timeStamp, restaurant.getRestaurantUsername(), userAccount.getUsername(), null, String.valueOf(totalPrice), "New Order", cartList, customer.getAddress());
        JOptionPane.showMessageDialog(null, "Order placed successfully.");
    }//GEN-LAST:event_btnPlaceOrder1ActionPerformed

    public void populateDishesForRestro() {
        DefaultTableModel menuModel = (DefaultTableModel) tblCustMenu.getModel();
        menuModel.setRowCount(0);
       // Restaurant restaurant = ecosystem.getRestaurantDirectory().getRestaurant(userAccount.getUsername());
        for (Dishes dishes : restaurant.getDishesList()) {
            Object[] row = new Object[3];
            row[0] = dishes;
            row[1] = dishes.getDishDescripton();
            row[2] = dishes.getPrice();
            menuModel.addRow(row);
        }
    }
    
    public void populateCartTable() {
        DefaultTableModel cartModel = (DefaultTableModel) tblCart.getModel();
        cartModel.setRowCount(0);
        for (Dishes dishes : cartList) {
            Object[] row = new Object[3];
            row[0] = dishes;
            row[1] = dishes.getDishDescripton();
            row[2] = dishes.getPrice();
            cartModel.addRow(row);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPlaceOrder1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCart;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPlaceOrder1;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblCustMenu;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
