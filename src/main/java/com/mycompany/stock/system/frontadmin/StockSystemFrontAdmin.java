/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stock.system.frontadmin;

import com.mycompany.stock.system.frontadmin.igu.AdminFrame;

/**
 *
 * @author javie
 */
public class StockSystemFrontAdmin {

    public static void main(String[] args) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminFrame().setVisible(true);
            }
        });
    }
}
