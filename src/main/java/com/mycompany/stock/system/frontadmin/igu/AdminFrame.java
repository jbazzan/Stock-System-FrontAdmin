package com.mycompany.stock.system.frontadmin.igu;

import java.awt.CardLayout;

public class AdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminFrame
     */
    public AdminFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnProducts = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnUsers = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnSales = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btnLogOut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        panelFunctions = new javax.swing.JPanel();
        panelProducts = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        jButton7 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        panelUsers = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        jButton9 = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        jButton11 = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JSeparator();
        jButton12 = new javax.swing.JButton();
        panelSales = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jButton14 = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JSeparator();
        jButton15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setMaximumSize(new java.awt.Dimension(20, 400));
        jSeparator6.setPreferredSize(new java.awt.Dimension(20, 400));
        jPanel1.add(jSeparator6, java.awt.BorderLayout.WEST);

        jPanel2.setMaximumSize(new java.awt.Dimension(200, 400));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 400));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jSeparator1.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator1.setMaximumSize(new java.awt.Dimension(300, 40));
        jSeparator1.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel2.add(jSeparator1);

        btnProducts.setText("Manage Products");
        btnProducts.setMaximumSize(new java.awt.Dimension(150, 50));
        btnProducts.setMinimumSize(new java.awt.Dimension(150, 50));
        btnProducts.setPreferredSize(new java.awt.Dimension(150, 50));
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });
        jPanel2.add(btnProducts);

        jSeparator2.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator2.setMaximumSize(new java.awt.Dimension(300, 25));
        jSeparator2.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel2.add(jSeparator2);

        btnUsers.setText("Manage Users");
        btnUsers.setMaximumSize(new java.awt.Dimension(150, 50));
        btnUsers.setMinimumSize(new java.awt.Dimension(150, 50));
        btnUsers.setPreferredSize(new java.awt.Dimension(150, 50));
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });
        jPanel2.add(btnUsers);

        jSeparator3.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator3.setMaximumSize(new java.awt.Dimension(300, 25));
        jSeparator3.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel2.add(jSeparator3);

        btnSales.setText("Sales History");
        btnSales.setMaximumSize(new java.awt.Dimension(150, 50));
        btnSales.setMinimumSize(new java.awt.Dimension(150, 50));
        btnSales.setPreferredSize(new java.awt.Dimension(150, 50));
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });
        jPanel2.add(btnSales);

        jSeparator4.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator4.setMaximumSize(new java.awt.Dimension(300, 50));
        jPanel2.add(jSeparator4);

        btnLogOut.setText("Log out");
        btnLogOut.setMaximumSize(new java.awt.Dimension(150, 50));
        btnLogOut.setMinimumSize(new java.awt.Dimension(150, 50));
        btnLogOut.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel2.add(btnLogOut);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(630, 400));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jSeparator5.setForeground(new java.awt.Color(242, 242, 242));
        jSeparator5.setMaximumSize(new java.awt.Dimension(20, 400));
        jSeparator5.setMinimumSize(new java.awt.Dimension(20, 400));
        jSeparator5.setPreferredSize(new java.awt.Dimension(20, 400));
        jPanel3.add(jSeparator5, java.awt.BorderLayout.WEST);

        panelFunctions.setPreferredSize(new java.awt.Dimension(630, 60));
        panelFunctions.setLayout(new java.awt.CardLayout());

        panelProducts.setLayout(new javax.swing.BoxLayout(panelProducts, javax.swing.BoxLayout.X_AXIS));

        jSeparator11.setMaximumSize(new java.awt.Dimension(65, 10));
        jSeparator11.setPreferredSize(new java.awt.Dimension(65, 10));
        panelProducts.add(jSeparator11);

        jButton7.setText("Add Products");
        panelProducts.add(jButton7);

        jSeparator12.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator12.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator12.setPreferredSize(new java.awt.Dimension(25, 10));
        panelProducts.add(jSeparator12);

        jButton6.setText("Show Products");
        panelProducts.add(jButton6);

        jSeparator13.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator13.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator13.setPreferredSize(new java.awt.Dimension(25, 10));
        panelProducts.add(jSeparator13);

        jButton5.setText("Find Products");
        panelProducts.add(jButton5);

        jSeparator14.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator14.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator14.setPreferredSize(new java.awt.Dimension(25, 10));
        panelProducts.add(jSeparator14);

        jButton8.setText("Delete Products");
        panelProducts.add(jButton8);

        panelFunctions.add(panelProducts, "products");

        panelUsers.setLayout(new javax.swing.BoxLayout(panelUsers, javax.swing.BoxLayout.X_AXIS));

        jSeparator15.setMaximumSize(new java.awt.Dimension(65, 10));
        jSeparator15.setPreferredSize(new java.awt.Dimension(65, 10));
        panelUsers.add(jSeparator15);

        jButton9.setText("Add Users");
        jButton9.setMaximumSize(new java.awt.Dimension(114, 23));
        jButton9.setMinimumSize(new java.awt.Dimension(114, 23));
        jButton9.setPreferredSize(new java.awt.Dimension(114, 23));
        panelUsers.add(jButton9);

        jSeparator16.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator16.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator16.setPreferredSize(new java.awt.Dimension(25, 10));
        panelUsers.add(jSeparator16);

        jButton10.setText("Show Users");
        jButton10.setMaximumSize(new java.awt.Dimension(114, 23));
        jButton10.setMinimumSize(new java.awt.Dimension(114, 23));
        jButton10.setPreferredSize(new java.awt.Dimension(114, 23));
        panelUsers.add(jButton10);

        jSeparator17.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator17.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator17.setPreferredSize(new java.awt.Dimension(25, 10));
        panelUsers.add(jSeparator17);

        jButton11.setText("Find Users");
        jButton11.setMaximumSize(new java.awt.Dimension(114, 23));
        jButton11.setMinimumSize(new java.awt.Dimension(114, 23));
        jButton11.setPreferredSize(new java.awt.Dimension(114, 23));
        panelUsers.add(jButton11);

        jSeparator18.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator18.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator18.setPreferredSize(new java.awt.Dimension(25, 10));
        panelUsers.add(jSeparator18);

        jButton12.setText("Delete Users");
        jButton12.setMaximumSize(new java.awt.Dimension(114, 23));
        jButton12.setMinimumSize(new java.awt.Dimension(114, 23));
        jButton12.setPreferredSize(new java.awt.Dimension(114, 23));
        panelUsers.add(jButton12);

        panelFunctions.add(panelUsers, "users");

        panelSales.setLayout(new javax.swing.BoxLayout(panelSales, javax.swing.BoxLayout.X_AXIS));

        jSeparator19.setMaximumSize(new java.awt.Dimension(85, 10));
        jSeparator19.setPreferredSize(new java.awt.Dimension(65, 10));
        panelSales.add(jSeparator19);

        jButton13.setText("All Sales");
        jButton13.setMaximumSize(new java.awt.Dimension(130, 23));
        jButton13.setMinimumSize(new java.awt.Dimension(130, 23));
        jButton13.setPreferredSize(new java.awt.Dimension(130, 23));
        panelSales.add(jButton13);

        jSeparator20.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator20.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator20.setPreferredSize(new java.awt.Dimension(25, 10));
        panelSales.add(jSeparator20);

        jButton14.setText("Sales by User");
        jButton14.setMaximumSize(new java.awt.Dimension(130, 23));
        jButton14.setMinimumSize(new java.awt.Dimension(130, 23));
        jButton14.setPreferredSize(new java.awt.Dimension(130, 23));
        panelSales.add(jButton14);

        jSeparator21.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator21.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator21.setPreferredSize(new java.awt.Dimension(25, 10));
        panelSales.add(jSeparator21);

        jButton15.setText("Sales by Products");
        jButton15.setMaximumSize(new java.awt.Dimension(130, 23));
        jButton15.setMinimumSize(new java.awt.Dimension(130, 23));
        jButton15.setPreferredSize(new java.awt.Dimension(130, 23));
        panelSales.add(jButton15);

        panelFunctions.add(panelSales, "sales");

        jPanel3.add(panelFunctions, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel3, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
         CardLayout cl = (CardLayout)(panelFunctions.getLayout());
         cl.show(panelFunctions, "products");
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
         CardLayout cl = (CardLayout)(panelFunctions.getLayout());
         cl.show(panelFunctions, "users");
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
         CardLayout cl = (CardLayout)(panelFunctions.getLayout());
         cl.show(panelFunctions, "sales");        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalesActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnUsers;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel panelFunctions;
    private javax.swing.JPanel panelProducts;
    private javax.swing.JPanel panelSales;
    private javax.swing.JPanel panelUsers;
    // End of variables declaration//GEN-END:variables
}
