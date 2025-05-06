package com.mycompany.stock.system.frontadmin.igu;

import com.google.gson.JsonObject;
import com.mycompany.stock.system.frontadmin.api.ApiClient;
import com.mycompany.stock.system.frontadmin.api.ApiClientDelete;
import com.mycompany.stock.system.frontadmin.api.ApiClientGet;
import com.mycompany.stock.system.frontadmin.api.ApiClientPost;
import com.mycompany.stock.system.frontadmin.api.ApiClientPut;
import com.mycompany.stock.system.frontadmin.model.Product;
import com.mycompany.stock.system.frontadmin.model.User;
import java.awt.CardLayout;
import java.util.List;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminFrame extends javax.swing.JFrame {

    private ApiClientPost apiClientPost;
    private ApiClientGet apiClientGet;
    private ApiClientPut apiClientPut;
    private ApiClientDelete apiClientDelete;

    public AdminFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadProductsIntoTable(viewProducts);
        loadUsersIntoTable(viewUsers);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        btnAddProductPanel = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        btnShowProductPanel = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        btnUpdateProductPanel = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();
        btnDeleteProductPanel = new javax.swing.JButton();
        panelUsers = new javax.swing.JPanel();
        jSeparator15 = new javax.swing.JSeparator();
        btnFormAddUsers = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JSeparator();
        btnShowUsers = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        btnUpdateUsers = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JSeparator();
        btnDeleteUsers = new javax.swing.JButton();
        panelSales = new javax.swing.JPanel();
        jSeparator19 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jSeparator20 = new javax.swing.JSeparator();
        jButton14 = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JSeparator();
        jButton15 = new javax.swing.JButton();
        panelContent = new javax.swing.JPanel();
        productManagment = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        formAddProduct = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNameProduct = new javax.swing.JTextField();
        txtDescriptionProduct = new javax.swing.JTextField();
        txtStockProduct = new javax.swing.JTextField();
        txtPriceProduct = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSaveProduct = new javax.swing.JButton();
        btnCleanFormProduct = new javax.swing.JButton();
        formShowProduct = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewProducts = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSearchProductId = new javax.swing.JTextPane();
        btnSearchProduct = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        formUpdateProducts = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtIdProductUpdate = new javax.swing.JTextField();
        btnSelectProductUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNameUpdateProduct = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDescriptionUpdateProduct = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPriceUpdateProduct = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStockUpdateProduct = new javax.swing.JTextField();
        btnUpdateProducts = new javax.swing.JButton();
        btnCleanUpdate = new javax.swing.JButton();
        formDeleteProduct = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtDeleteProductId = new javax.swing.JTextField();
        btnDeleteProduct = new javax.swing.JButton();
        productManagment1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        formAddUser = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNameUser = new javax.swing.JTextField();
        txtEmailUser = new javax.swing.JTextField();
        txtRoleUser = new javax.swing.JTextField();
        txtPassUser = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnSaveUser = new javax.swing.JButton();
        btnCleanFormUser = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        formShowUser = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewUsers = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtSearchUserId = new javax.swing.JTextPane();
        btnSearchUser = new javax.swing.JButton();
        btnViewAllUser = new javax.swing.JButton();
        formUpdateUser = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtNameUserUpdate = new javax.swing.JTextField();
        txtEmailUserUpdate = new javax.swing.JTextField();
        txtRoleUserUpdate = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnUpdateUser = new javax.swing.JButton();
        btnCleanFormUserUpdate = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtUpdateUserId = new javax.swing.JTextField();
        btnSearchUpdateUser = new javax.swing.JButton();
        formDeleteUser = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        txtDeleteUser = new javax.swing.JTextField();
        btnDeleteUser = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

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

        btnAddProductPanel.setText("Add Products");
        btnAddProductPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductPanelActionPerformed(evt);
            }
        });
        panelProducts.add(btnAddProductPanel);

        jSeparator12.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator12.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator12.setPreferredSize(new java.awt.Dimension(25, 10));
        panelProducts.add(jSeparator12);

        btnShowProductPanel.setText("Show Products");
        btnShowProductPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowProductPanelActionPerformed(evt);
            }
        });
        panelProducts.add(btnShowProductPanel);

        jSeparator13.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator13.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator13.setPreferredSize(new java.awt.Dimension(25, 10));
        panelProducts.add(jSeparator13);

        btnUpdateProductPanel.setText("Update Products");
        btnUpdateProductPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductPanelActionPerformed(evt);
            }
        });
        panelProducts.add(btnUpdateProductPanel);

        jSeparator14.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator14.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator14.setPreferredSize(new java.awt.Dimension(25, 10));
        panelProducts.add(jSeparator14);

        btnDeleteProductPanel.setText("Delete Products");
        btnDeleteProductPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductPanelActionPerformed(evt);
            }
        });
        panelProducts.add(btnDeleteProductPanel);

        panelFunctions.add(panelProducts, "products");

        panelUsers.setLayout(new javax.swing.BoxLayout(panelUsers, javax.swing.BoxLayout.X_AXIS));

        jSeparator15.setMaximumSize(new java.awt.Dimension(65, 10));
        jSeparator15.setPreferredSize(new java.awt.Dimension(65, 10));
        panelUsers.add(jSeparator15);

        btnFormAddUsers.setText("Add Users");
        btnFormAddUsers.setMaximumSize(new java.awt.Dimension(114, 23));
        btnFormAddUsers.setMinimumSize(new java.awt.Dimension(114, 23));
        btnFormAddUsers.setPreferredSize(new java.awt.Dimension(114, 23));
        btnFormAddUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormAddUsersActionPerformed(evt);
            }
        });
        panelUsers.add(btnFormAddUsers);

        jSeparator16.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator16.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator16.setPreferredSize(new java.awt.Dimension(25, 10));
        panelUsers.add(jSeparator16);

        btnShowUsers.setText("Show Users");
        btnShowUsers.setMaximumSize(new java.awt.Dimension(114, 23));
        btnShowUsers.setMinimumSize(new java.awt.Dimension(114, 23));
        btnShowUsers.setPreferredSize(new java.awt.Dimension(114, 23));
        btnShowUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowUsersActionPerformed(evt);
            }
        });
        panelUsers.add(btnShowUsers);

        jSeparator17.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator17.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator17.setPreferredSize(new java.awt.Dimension(25, 10));
        panelUsers.add(jSeparator17);

        btnUpdateUsers.setText("Update Users");
        btnUpdateUsers.setMaximumSize(new java.awt.Dimension(114, 23));
        btnUpdateUsers.setMinimumSize(new java.awt.Dimension(114, 23));
        btnUpdateUsers.setPreferredSize(new java.awt.Dimension(114, 23));
        btnUpdateUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUsersActionPerformed(evt);
            }
        });
        panelUsers.add(btnUpdateUsers);

        jSeparator18.setMaximumSize(new java.awt.Dimension(25, 10));
        jSeparator18.setMinimumSize(new java.awt.Dimension(25, 10));
        jSeparator18.setPreferredSize(new java.awt.Dimension(25, 10));
        panelUsers.add(jSeparator18);

        btnDeleteUsers.setText("Delete Users");
        btnDeleteUsers.setMaximumSize(new java.awt.Dimension(114, 23));
        btnDeleteUsers.setMinimumSize(new java.awt.Dimension(114, 23));
        btnDeleteUsers.setPreferredSize(new java.awt.Dimension(114, 23));
        btnDeleteUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUsersActionPerformed(evt);
            }
        });
        panelUsers.add(btnDeleteUsers);

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

        panelContent.setLayout(new java.awt.CardLayout());

        jLabel13.setText("WELCOME TO PRODUCT MANAGMENT");

        javax.swing.GroupLayout productManagmentLayout = new javax.swing.GroupLayout(productManagment);
        productManagment.setLayout(productManagmentLayout);
        productManagmentLayout.setHorizontalGroup(
            productManagmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productManagmentLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel13)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        productManagmentLayout.setVerticalGroup(
            productManagmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productManagmentLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel13)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        panelContent.add(productManagment, "productManagment");

        jLabel2.setText("Description");

        txtNameProduct.setMaximumSize(new java.awt.Dimension(130, 22));
        txtNameProduct.setMinimumSize(new java.awt.Dimension(130, 22));
        txtNameProduct.setPreferredSize(new java.awt.Dimension(130, 22));

        txtDescriptionProduct.setMaximumSize(new java.awt.Dimension(130, 22));
        txtDescriptionProduct.setMinimumSize(new java.awt.Dimension(130, 22));
        txtDescriptionProduct.setPreferredSize(new java.awt.Dimension(130, 22));

        txtStockProduct.setMaximumSize(new java.awt.Dimension(130, 22));
        txtStockProduct.setMinimumSize(new java.awt.Dimension(130, 22));
        txtStockProduct.setPreferredSize(new java.awt.Dimension(130, 22));

        txtPriceProduct.setMaximumSize(new java.awt.Dimension(130, 22));
        txtPriceProduct.setMinimumSize(new java.awt.Dimension(130, 22));
        txtPriceProduct.setPreferredSize(new java.awt.Dimension(130, 22));

        jLabel3.setText("Name");

        jLabel4.setText("Price");

        jLabel5.setText("Stock");

        btnSaveProduct.setText("Save");
        btnSaveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProductActionPerformed(evt);
            }
        });

        btnCleanFormProduct.setText("Clean");
        btnCleanFormProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanFormProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formAddProductLayout = new javax.swing.GroupLayout(formAddProduct);
        formAddProduct.setLayout(formAddProductLayout);
        formAddProductLayout.setHorizontalGroup(
            formAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAddProductLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(formAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formAddProductLayout.createSequentialGroup()
                        .addComponent(btnSaveProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCleanFormProduct))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAddProductLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formAddProductLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStockProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formAddProductLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAddProductLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69)
                        .addComponent(txtDescriptionProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        formAddProductLayout.setVerticalGroup(
            formAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAddProductLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(formAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(formAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescriptionProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(formAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(formAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(formAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveProduct)
                    .addComponent(btnCleanFormProduct))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        panelContent.add(formAddProduct, "addProducts");

        viewProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Description", "Price", "Stock"
            }
        ));
        jScrollPane1.setViewportView(viewProducts);
        if (viewProducts.getColumnModel().getColumnCount() > 0) {
            viewProducts.getColumnModel().getColumn(4).setResizable(false);
            viewProducts.getColumnModel().getColumn(4).setHeaderValue("Stock");
        }

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ID");

        txtSearchProductId.setMaximumSize(new java.awt.Dimension(62, 20));
        jScrollPane2.setViewportView(txtSearchProductId);

        btnSearchProduct.setText("Search");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        btnViewAll.setText("View all");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formShowProductLayout = new javax.swing.GroupLayout(formShowProduct);
        formShowProduct.setLayout(formShowProductLayout);
        formShowProductLayout.setHorizontalGroup(
            formShowProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formShowProductLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(formShowProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formShowProductLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSearchProduct)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewAll))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        formShowProductLayout.setVerticalGroup(
            formShowProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formShowProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formShowProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formShowProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchProduct)
                        .addComponent(btnViewAll)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        panelContent.add(formShowProduct, "showProducts");

        jLabel7.setText("ID");

        txtIdProductUpdate.setMaximumSize(new java.awt.Dimension(64, 22));

        btnSelectProductUpdate.setText("Select Product");
        btnSelectProductUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectProductUpdateActionPerformed(evt);
            }
        });

        jLabel8.setText("Name");

        jLabel9.setText("Description");

        jLabel10.setText("Price");

        jLabel11.setText("Stock");

        btnUpdateProducts.setText("Update");
        btnUpdateProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProductsActionPerformed(evt);
            }
        });

        btnCleanUpdate.setText("Clean");
        btnCleanUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formUpdateProductsLayout = new javax.swing.GroupLayout(formUpdateProducts);
        formUpdateProducts.setLayout(formUpdateProductsLayout);
        formUpdateProductsLayout.setHorizontalGroup(
            formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formUpdateProductsLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(formUpdateProductsLayout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(90, 90, 90)
                            .addComponent(txtStockUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formUpdateProductsLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(93, 93, 93)
                            .addComponent(txtPriceUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formUpdateProductsLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(58, 58, 58)
                            .addComponent(txtDescriptionUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(formUpdateProductsLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNameUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formUpdateProductsLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29)
                                .addComponent(txtIdProductUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSelectProductUpdate))))
                    .addGroup(formUpdateProductsLayout.createSequentialGroup()
                        .addComponent(btnUpdateProducts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCleanUpdate)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        formUpdateProductsLayout.setVerticalGroup(
            formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formUpdateProductsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdProductUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectProductUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtDescriptionUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtPriceUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtStockUpdateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formUpdateProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateProducts)
                    .addComponent(btnCleanUpdate))
                .addGap(0, 193, Short.MAX_VALUE))
        );

        panelContent.add(formUpdateProducts, "updateProducts");

        jLabel12.setText("ID");

        btnDeleteProduct.setText("Delete");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formDeleteProductLayout = new javax.swing.GroupLayout(formDeleteProduct);
        formDeleteProduct.setLayout(formDeleteProductLayout);
        formDeleteProductLayout.setHorizontalGroup(
            formDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDeleteProductLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtDeleteProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteProduct)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        formDeleteProductLayout.setVerticalGroup(
            formDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDeleteProductLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(formDeleteProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDeleteProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteProduct))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        panelContent.add(formDeleteProduct, "deleteProducts");

        jLabel18.setText("WELCOME TO USER MANAGMENT");

        javax.swing.GroupLayout productManagment1Layout = new javax.swing.GroupLayout(productManagment1);
        productManagment1.setLayout(productManagment1Layout);
        productManagment1Layout.setHorizontalGroup(
            productManagment1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productManagment1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel18)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        productManagment1Layout.setVerticalGroup(
            productManagment1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productManagment1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel18)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        panelContent.add(productManagment1, "userManagment");

        jLabel14.setText("Email");

        txtNameUser.setMaximumSize(new java.awt.Dimension(130, 22));
        txtNameUser.setMinimumSize(new java.awt.Dimension(130, 22));
        txtNameUser.setPreferredSize(new java.awt.Dimension(130, 22));

        txtEmailUser.setMaximumSize(new java.awt.Dimension(130, 22));
        txtEmailUser.setMinimumSize(new java.awt.Dimension(130, 22));
        txtEmailUser.setPreferredSize(new java.awt.Dimension(130, 22));

        txtRoleUser.setMaximumSize(new java.awt.Dimension(130, 22));
        txtRoleUser.setMinimumSize(new java.awt.Dimension(130, 22));
        txtRoleUser.setPreferredSize(new java.awt.Dimension(130, 22));

        txtPassUser.setMaximumSize(new java.awt.Dimension(130, 22));
        txtPassUser.setMinimumSize(new java.awt.Dimension(130, 22));
        txtPassUser.setPreferredSize(new java.awt.Dimension(130, 22));

        jLabel15.setText("Name");

        jLabel16.setText("Password");

        jLabel17.setText("Role");

        btnSaveUser.setText("Save");
        btnSaveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveUserActionPerformed(evt);
            }
        });

        btnCleanFormUser.setText("Clean");
        btnCleanFormUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanFormUserActionPerformed(evt);
            }
        });

        jLabel19.setText("User Roles:");

        jLabel20.setText("1 -> Admin");

        jLabel21.setText("2 -> Seller");

        javax.swing.GroupLayout formAddUserLayout = new javax.swing.GroupLayout(formAddUser);
        formAddUser.setLayout(formAddUserLayout);
        formAddUserLayout.setHorizontalGroup(
            formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAddUserLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formAddUserLayout.createSequentialGroup()
                        .addComponent(btnSaveUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCleanFormUser))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAddUserLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formAddUserLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRoleUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formAddUserLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAddUserLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(69, 69, 69)
                        .addComponent(txtEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        formAddUserLayout.setVerticalGroup(
            formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAddUserLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19))
                .addGap(1, 1, 1)
                .addComponent(jLabel20)
                .addGap(1, 1, 1)
                .addGroup(formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoleUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(29, 29, 29)
                .addGroup(formAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveUser)
                    .addComponent(btnCleanFormUser))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        panelContent.add(formAddUser, "addUsers");

        viewUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Email", "Role_id"
            }
        ));
        jScrollPane3.setViewportView(viewUsers);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("ID");

        txtSearchUserId.setMaximumSize(new java.awt.Dimension(62, 20));
        jScrollPane4.setViewportView(txtSearchUserId);

        btnSearchUser.setText("Search");
        btnSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUserActionPerformed(evt);
            }
        });

        btnViewAllUser.setText("View all");
        btnViewAllUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formShowUserLayout = new javax.swing.GroupLayout(formShowUser);
        formShowUser.setLayout(formShowUserLayout);
        formShowUserLayout.setHorizontalGroup(
            formShowUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formShowUserLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(formShowUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formShowUserLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSearchUser)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewAllUser))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        formShowUserLayout.setVerticalGroup(
            formShowUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formShowUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formShowUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formShowUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchUser)
                        .addComponent(btnViewAllUser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        panelContent.add(formShowUser, "showUsers");

        jLabel23.setText("Email");

        txtNameUserUpdate.setMaximumSize(new java.awt.Dimension(130, 22));
        txtNameUserUpdate.setMinimumSize(new java.awt.Dimension(130, 22));
        txtNameUserUpdate.setPreferredSize(new java.awt.Dimension(130, 22));

        txtEmailUserUpdate.setMaximumSize(new java.awt.Dimension(130, 22));
        txtEmailUserUpdate.setMinimumSize(new java.awt.Dimension(130, 22));
        txtEmailUserUpdate.setPreferredSize(new java.awt.Dimension(130, 22));

        txtRoleUserUpdate.setMaximumSize(new java.awt.Dimension(130, 22));
        txtRoleUserUpdate.setMinimumSize(new java.awt.Dimension(130, 22));
        txtRoleUserUpdate.setPreferredSize(new java.awt.Dimension(130, 22));

        jLabel24.setText("Name");

        jLabel26.setText("Role");

        btnUpdateUser.setText("Update");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnCleanFormUserUpdate.setText("Clean");
        btnCleanFormUserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanFormUserUpdateActionPerformed(evt);
            }
        });

        jLabel27.setText("User Roles:");

        jLabel28.setText("1 -> Admin");

        jLabel29.setText("2 -> Seller");

        jLabel25.setText("ID");

        btnSearchUpdateUser.setText("Search");
        btnSearchUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUpdateUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formUpdateUserLayout = new javax.swing.GroupLayout(formUpdateUser);
        formUpdateUser.setLayout(formUpdateUserLayout);
        formUpdateUserLayout.setHorizontalGroup(
            formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formUpdateUserLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formUpdateUserLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtUpdateUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchUpdateUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(formUpdateUserLayout.createSequentialGroup()
                        .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(formUpdateUserLayout.createSequentialGroup()
                                .addComponent(btnUpdateUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCleanFormUserUpdate))
                            .addGroup(formUpdateUserLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNameUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formUpdateUserLayout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(txtRoleUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formUpdateUserLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmailUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)))
                .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        formUpdateUserLayout.setVerticalGroup(
            formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formUpdateUserLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel25)
                    .addComponent(txtUpdateUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchUpdateUser))
                .addGap(1, 1, 1)
                .addComponent(jLabel28)
                .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formUpdateUserLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel29))
                    .addGroup(formUpdateUserLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNameUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoleUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))))
                .addGap(18, 18, 18)
                .addGroup(formUpdateUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCleanFormUserUpdate)
                    .addComponent(btnUpdateUser))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        panelContent.add(formUpdateUser, "updateUsers");

        jLabel30.setText("ID");

        btnDeleteUser.setText("Delete");

        javax.swing.GroupLayout formDeleteUserLayout = new javax.swing.GroupLayout(formDeleteUser);
        formDeleteUser.setLayout(formDeleteUserLayout);
        formDeleteUserLayout.setHorizontalGroup(
            formDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDeleteUserLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(txtDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteUser)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        formDeleteUserLayout.setVerticalGroup(
            formDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formDeleteUserLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(formDeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteUser))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        panelContent.add(formDeleteUser, "deleteUsers");

        jPanel3.add(panelContent, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Agrego funcionalidad a la botonera dependiendo de lo que quiera hacer el usuarios
    para que aparezcan los botones para comenzar a interactuar con la API*/
    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        CardLayout clF = (CardLayout) (panelFunctions.getLayout());
        clF.show(panelFunctions, "products");
        CardLayout clC = (CardLayout) (panelContent.getLayout());
        clC.show(panelContent, "productManagment");
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        CardLayout clF = (CardLayout) (panelFunctions.getLayout());
        clF.show(panelFunctions, "users");
        CardLayout clC = (CardLayout) (panelContent.getLayout());
        clC.show(panelContent, "userManagment");
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        CardLayout cl = (CardLayout) (panelFunctions.getLayout());
        cl.show(panelFunctions, "sales");
    }//GEN-LAST:event_btnSalesActionPerformed

    /* Seccion de productos */
 /* Agregamos productos nuevos a la base de datos con su stock */
    private void btnAddProductPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductPanelActionPerformed
        CardLayout cl = (CardLayout) (panelContent.getLayout());
        cl.show(panelContent, "addProducts");
    }//GEN-LAST:event_btnAddProductPanelActionPerformed

    private void btnSaveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProductActionPerformed
        apiClientPost = new ApiClientPost();

        Product product = new Product();
        product.setName(txtNameProduct.getText());
        product.setDescription(txtDescriptionProduct.getText());
        product.setPrice(Double.parseDouble(txtPriceProduct.getText()));
        product.setStock(Integer.parseInt(txtStockProduct.getText()));

        try {
            JsonObject response = ApiClientPost.post("/products", product);
            System.out.println("Response: " + response);
            JOptionPane.showMessageDialog(rootPane, "Product added in successfully");
        } catch (IOException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnSaveProductActionPerformed

    private void btnCleanFormProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanFormProductActionPerformed
        txtNameProduct.setText("");
        txtDescriptionProduct.setText("");
        txtPriceProduct.setText("");
        txtStockProduct.setText("");
    }//GEN-LAST:event_btnCleanFormProductActionPerformed

    /* Mostrar los productos */

    private void btnShowProductPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowProductPanelActionPerformed
        CardLayout cl = (CardLayout) (panelContent.getLayout());
        cl.show(panelContent, "showProducts");
    }//GEN-LAST:event_btnShowProductPanelActionPerformed

    /* Actualizar productos */

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        try {
            String idTexto = txtSearchProductId.getText();
            if (idTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please, enter the ID of the product.");
                return;
            }

            int id = Integer.parseInt(idTexto);

            JsonObject response = ApiClientGet.get("/products/" + id);
            JsonObject data = response.getAsJsonObject("data");

            Product producto = ApiClient.gson.fromJson(data, Product.class);

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"ID", "Nombre", "Descripción", "Stock", "Precio"});

            model.addRow(new Object[]{
                producto.getId(),
                producto.getName(),
                producto.getDescription(),
                producto.getStock(),
                producto.getPrice()
            });

            viewProducts.setModel(model);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The ID must be a number.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to find the product: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSearchProductActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        loadProductsIntoTable(viewProducts);
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnSelectProductUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectProductUpdateActionPerformed
        try {
            String idTexto = txtIdProductUpdate.getText();
            if (idTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please, enter the ID of the product.");
                return;
            }

            int id = Integer.parseInt(idTexto);

            JsonObject response = ApiClientGet.get("/products/" + id);
            JsonObject data = response.getAsJsonObject("data");

            Product producto = ApiClient.gson.fromJson(data, Product.class);
            txtNameUpdateProduct.setText(producto.getName());
            txtDescriptionUpdateProduct.setText(producto.getDescription());
            txtPriceUpdateProduct.setText(String.valueOf(producto.getPrice()));
            txtStockUpdateProduct.setText(String.valueOf(producto.getStock()));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The ID must be a number.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to find the product: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSelectProductUpdateActionPerformed

    private void btnUpdateProductPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductPanelActionPerformed
        CardLayout cl = (CardLayout) (panelContent.getLayout());
        cl.show(panelContent, "updateProducts");
    }//GEN-LAST:event_btnUpdateProductPanelActionPerformed

    private void btnUpdateProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProductsActionPerformed
        try {
            String idTexto = txtIdProductUpdate.getText();

            Product producto = new Product();
            producto.setName(txtNameUpdateProduct.getText());
            producto.setDescription(txtDescriptionUpdateProduct.getText());
            producto.setPrice(Double.parseDouble(txtPriceUpdateProduct.getText()));
            producto.setStock(Integer.parseInt(txtStockUpdateProduct.getText()));

            JsonObject response = ApiClientPut.put("/products/" + idTexto, producto);

            if (response != null && response.has("data")) {
                JOptionPane.showMessageDialog(this, "Product updated successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update the product.");
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateProductsActionPerformed

    private void btnCleanUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanUpdateActionPerformed
        txtIdProductUpdate.setText("");
        txtNameUpdateProduct.setText("");
        txtDescriptionUpdateProduct.setText("");
        txtPriceUpdateProduct.setText("");
        txtStockUpdateProduct.setText("");
    }//GEN-LAST:event_btnCleanUpdateActionPerformed

    /* Borrar Productos */

    private void btnDeleteProductPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductPanelActionPerformed
        CardLayout cl = (CardLayout) (panelContent.getLayout());
        cl.show(panelContent, "deleteProducts");
    }//GEN-LAST:event_btnDeleteProductPanelActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        try {
            String idTexto = txtDeleteProductId.getText();

            if (idTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please, enter the ID of the product to be removed.");
                return;
            }

            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure about removing this product?", "Confirm removal", JOptionPane.YES_NO_OPTION);

            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }

            int id = Integer.parseInt(idTexto);
            int responseCode = ApiClientDelete.delete("/products/" + id);

            if (responseCode >= 200 && responseCode < 300) {
                JOptionPane.showMessageDialog(this, "Product updated successfully.");
                txtDeleteProductId.setText("");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteProductActionPerformed

    /* Gestion de usuarios */
 /* Crear usuarios */
    private void btnFormAddUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormAddUsersActionPerformed
        CardLayout cl = (CardLayout) (panelContent.getLayout());
        cl.show(panelContent, "addUsers");
    }//GEN-LAST:event_btnFormAddUsersActionPerformed

    private void btnSaveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveUserActionPerformed
        apiClientPost = new ApiClientPost();

        User user = new User();
        user.setName(txtNameUser.getText());
        user.setEmail(txtEmailUser.getText());
        user.setPassword(txtPassUser.getText());
        user.setRole_id(Long.parseLong(txtRoleUser.getText()));

        try {
            JsonObject response = ApiClientPost.post("/create", user);
            System.out.println("Response: " + response);
            JOptionPane.showMessageDialog(rootPane, "User added in successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSaveUserActionPerformed

    private void btnCleanFormUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanFormUserActionPerformed
        txtNameUser.setText("");
        txtEmailUser.setText("");
        txtPassUser.setText("");
        txtRoleUser.setText("");
    }//GEN-LAST:event_btnCleanFormUserActionPerformed

    /* Buscar Usuarios */

    private void btnShowUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowUsersActionPerformed
        CardLayout cl = (CardLayout) (panelContent.getLayout());
        cl.show(panelContent, "showUsers");
    }//GEN-LAST:event_btnShowUsersActionPerformed

    private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUserActionPerformed
        try {
            String idTexto = txtSearchUserId.getText();
            if (idTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please, enter the ID of the user.");
                return;
            }

            int id = Integer.parseInt(idTexto);

            JsonObject response = ApiClientGet.get("/users/" + id);
            JsonObject data = response.getAsJsonObject("data");

            User user = ApiClient.gson.fromJson(data, User.class);

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"ID", "Name", "Email", "Role_id"});

            model.addRow(new Object[]{
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole_id()
            });

            viewUsers.setModel(model);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The ID must be a number.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to find the user: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSearchUserActionPerformed

    private void btnViewAllUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllUserActionPerformed
        loadUsersIntoTable(viewUsers);
    }//GEN-LAST:event_btnViewAllUserActionPerformed

    /* Actualizar usuarios */

    private void btnUpdateUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUsersActionPerformed
        CardLayout cl = (CardLayout) (panelContent.getLayout());
        cl.show(panelContent, "updateUsers");
    }//GEN-LAST:event_btnUpdateUsersActionPerformed

    /* Buscar el usuario */

    private void btnSearchUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUpdateUserActionPerformed
        try {
            String idTexto = txtUpdateUserId.getText();
            if (idTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please, enter the ID of the user.");
                return;
            }

            int id = Integer.parseInt(idTexto);

            JsonObject response = ApiClientGet.get("/users/" + id);

            if (response != null && response.has("data") && !response.get("data").isJsonNull()) {
                JsonObject data = response.getAsJsonObject("data");

                User user = ApiClient.gson.fromJson(data, User.class);
                txtNameUserUpdate.setText(user.getName());
                txtEmailUserUpdate.setText(user.getEmail());
                txtRoleUserUpdate.setText(String.valueOf(user.getRole_id()));
            } else {
                JOptionPane.showMessageDialog(this, "The user does not exist.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The ID must be a number.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Failed to find the user: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSearchUpdateUserActionPerformed

    /* Realiza la modificacion */

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        String idTexto = txtUpdateUserId.getText();
        User user = new User();
        user.setName(txtNameUserUpdate.getText());
        user.setEmail(txtEmailUserUpdate.getText());
        user.setRole_id(Long.parseLong(txtRoleUserUpdate.getText()));
        try {
            JsonObject response = ApiClientPut.put("/users/" + idTexto, user);
            System.out.println("Json: " + response);
            if (response != null && response.has("data") && response.get("data").isJsonObject()) {
                JOptionPane.showMessageDialog(this, "User updated successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update the user.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnCleanFormUserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanFormUserUpdateActionPerformed
        txtUpdateUserId.setText("");
        txtNameUserUpdate.setText("");
        txtEmailUserUpdate.setText("");
        txtRoleUserUpdate.setText("");
    }//GEN-LAST:event_btnCleanFormUserUpdateActionPerformed

    private void btnDeleteUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUsersActionPerformed
        CardLayout cl = (CardLayout) (panelContent.getLayout());
        cl.show(panelContent, "deleteUsers");
    }//GEN-LAST:event_btnDeleteUsersActionPerformed

    /* Muestra todos los productos en una tabla */
    private void loadProductsIntoTable(JTable table) {
        apiClientGet = new ApiClientGet();
        try {
            com.google.gson.JsonObject response = ApiClientGet.get("/products");
            com.google.gson.JsonArray productosArray = response.getAsJsonArray("data");
            java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<List<Product>>() {
            }.getType();
            List<Product> productos = ApiClient.gson.fromJson(productosArray, listType);

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"ID", "Nombre", "Descripción", "Stock", "Precio"});

            for (Product p : productos) {
                model.addRow(new Object[]{
                    p.getId(),
                    p.getName(),
                    p.getDescription(),
                    p.getStock(),
                    p.getPrice()
                });
            }

            viewProducts.setModel(model);

        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar productos: " + e.getMessage());
        }
    }

    private void loadUsersIntoTable(JTable table) {
        apiClientGet = new ApiClientGet();
        try {
            com.google.gson.JsonObject response = ApiClientGet.get("/users");
            com.google.gson.JsonArray usersArray = response.getAsJsonArray("data");
            java.lang.reflect.Type listType = new com.google.gson.reflect.TypeToken<List<User>>() {
            }.getType();
            List<User> users = ApiClient.gson.fromJson(usersArray, listType);

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"ID", "Name", "Email", "Role_id"});

            for (User u : users) {
                model.addRow(new Object[]{
                    u.getId(),
                    u.getName(),
                    u.getEmail(),
                    u.getRole_id()
                });
            }

            viewUsers.setModel(model);

        } catch (IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar productos: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProductPanel;
    private javax.swing.JButton btnCleanFormProduct;
    private javax.swing.JButton btnCleanFormUser;
    private javax.swing.JButton btnCleanFormUserUpdate;
    private javax.swing.JButton btnCleanUpdate;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnDeleteProductPanel;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnDeleteUsers;
    private javax.swing.JButton btnFormAddUsers;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSaveProduct;
    private javax.swing.JButton btnSaveUser;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnSearchUpdateUser;
    private javax.swing.JButton btnSearchUser;
    private javax.swing.JButton btnSelectProductUpdate;
    private javax.swing.JButton btnShowProductPanel;
    private javax.swing.JButton btnShowUsers;
    private javax.swing.JButton btnUpdateProductPanel;
    private javax.swing.JButton btnUpdateProducts;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton btnUpdateUsers;
    private javax.swing.JButton btnUsers;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnViewAllUser;
    private javax.swing.JPanel formAddProduct;
    private javax.swing.JPanel formAddUser;
    private javax.swing.JPanel formDeleteProduct;
    private javax.swing.JPanel formDeleteUser;
    private javax.swing.JPanel formShowProduct;
    private javax.swing.JPanel formShowUser;
    private javax.swing.JPanel formUpdateProducts;
    private javax.swing.JPanel formUpdateUser;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
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
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelFunctions;
    private javax.swing.JPanel panelProducts;
    private javax.swing.JPanel panelSales;
    private javax.swing.JPanel panelUsers;
    private javax.swing.JPanel productManagment;
    private javax.swing.JPanel productManagment1;
    private javax.swing.JTextField txtDeleteProductId;
    private javax.swing.JTextField txtDeleteUser;
    private javax.swing.JTextField txtDescriptionProduct;
    private javax.swing.JTextField txtDescriptionUpdateProduct;
    private javax.swing.JTextField txtEmailUser;
    private javax.swing.JTextField txtEmailUserUpdate;
    private javax.swing.JTextField txtIdProductUpdate;
    private javax.swing.JTextField txtNameProduct;
    private javax.swing.JTextField txtNameUpdateProduct;
    private javax.swing.JTextField txtNameUser;
    private javax.swing.JTextField txtNameUserUpdate;
    private javax.swing.JTextField txtPassUser;
    private javax.swing.JTextField txtPriceProduct;
    private javax.swing.JTextField txtPriceUpdateProduct;
    private javax.swing.JTextField txtRoleUser;
    private javax.swing.JTextField txtRoleUserUpdate;
    private javax.swing.JTextPane txtSearchProductId;
    private javax.swing.JTextPane txtSearchUserId;
    private javax.swing.JTextField txtStockProduct;
    private javax.swing.JTextField txtStockUpdateProduct;
    private javax.swing.JTextField txtUpdateUserId;
    private javax.swing.JTable viewProducts;
    private javax.swing.JTable viewUsers;
    // End of variables declaration//GEN-END:variables
}
