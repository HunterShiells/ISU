/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DealerShip;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author hunt4991
 */
public class CarDealerTycoon extends javax.swing.JFrame {

    public ArrayList<Vehicle> lot = new ArrayList<Vehicle>(); // Vehicle a, b, c, d, e, f, g, h, i, j, k, l;
    int money = 20000, cost;
    Vehicle v;

    public CarDealerTycoon() {
        initComponents();
        lot.add(new PassengerCar(15000, "Toyota", "Prius", 2005, "yes"));
        lot.add(new PassengerCar(5000, "Acura", "CSX", 2007, "no"));
        lot.add(new PassengerCar(47800, "Aston Martin", "Vantage V8", 2007, "no"));
        lot.add(new PassengerCar(19880, "Audi", "A4", 2014, "no"));
        lot.add(new PassengerCar(31980, "MINI", "Cooper Convertable", 2018, "no"));
        lot.add(new PassengerCar(31999, "Jaguar", "XF 3.0L", 2014, "no"));
        lot.add(new PassengerCar(52899, "Lexus", "RX 350", 2017, "no"));
        lot.add(new PassengerCar(13900, "Dodge", "Caravan", 2015, "no"));
        lot.add(new Truck(39999, "Dodge", "RAM 1500 Pickup", 2017, "yes"));
        lot.add(new Truck(17999, "Ford", "F-150", 2015, "yes"));
        lot.add(new Truck(22000, "Chevrolet", "1500 Pickup", 2016, "no"));
        lot.add(new Truck(14988, "Toyota", "Tacoma", 2008, "yes"));
        lot.add(new PassengerCar(100000, "Ford", "Mustang", 2018, "no"));
        lot.add(new PassengerCar(125000, "Tesla", "Model X", 2016, "yes"));
        for (int i = 0; i < 14; i++) {
            tblforsale.setValueAt(lot.get(i).sum(), i, 0);
            int startingp = lot.get(i).getPrice();
            lot.get(i).setStartingPrice(startingp);
        }
        txtmon.setText("Money: " + money);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtmon = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblforsale = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblowned = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cars Owned: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cars Available:");

        jButton1.setText("Buy Selected");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Restore Selected");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sell Selected");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Rent Selected");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Scrap ($300)");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtmon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtmon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtmon.setText("Money: $50000");

        tblforsale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Car"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblforsale);
        if (tblforsale.getColumnModel().getColumnCount() > 0) {
            tblforsale.getColumnModel().getColumn(0).setPreferredWidth(170);
        }

        tblowned.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cars Owned"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblowned);
        if (tblowned.getColumnModel().getColumnCount() > 0) {
            tblowned.getColumnModel().getColumn(0).setResizable(false);
        }

        jButton6.setText("Statistics");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmon, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(txtmon))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int loc = tblforsale.getSelectedRow();
        StartingMenu menu = new StartingMenu(this, true);
        String locs = lot.get(loc).toString();
        menu.distext(locs);
        menu.setVisible(true);
        if (menu.getsig().equals("buy")) {
            cost = lot.get(loc).buy(lot.get(loc).getPrice());
            if (money < cost) {
                JOptionPane.showMessageDialog(this, "You do not have enought money for this vehicle you need: " + cost);
                return;
            }
            money -= cost;
        }
        txtmon.setText("Money: " + money);
        tblforsale.setValueAt("",loc,0);
        tblowned.setValueAt(lot.get(loc).sum(), loc, 0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int loc = tblowned.getSelectedRow();
        JOptionPane.showMessageDialog(this, "You have Scraped a car!!!! What a horrible person you are, you gained $300 dollars!");
        tblowned.setValueAt("", loc, 0);
        lot.remove(loc);
        money += 300;
        txtmon.setText("Money: " + money);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Rent rent = new Rent(this, true);
        int loc = tblowned.getSelectedRow();
        String locs = lot.get(loc).sum();
        int carprice = lot.get(loc).getPrice();
        if(carprice<1500){
            JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
            return;
        }
        else if(carprice>1500 && carprice<10000){
            if(carprice<2000){
                JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                return;
            }
            rent.textx(locs, 2000);
        }
        else if(carprice>10000 && carprice<25000){
            if(carprice<2000){
                JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                return;
            }
            rent.textx(locs, 2000);
        }
        else if(carprice>25000 && carprice<50000){
            if(carprice<3000){
                JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                return;
            }
            rent.textx(locs, 3000);
        }
        else if(carprice>50000 && carprice<100000){
            if(carprice<4000){
                JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                return;
            }
            rent.textx(locs, 4000);
        }
        else if (carprice>10000){
            if(carprice<5500){
                JOptionPane.showMessageDialog(this, "The car is in a horrible condition to rent out, sell, destroy or restore it!");
                return;
            }
            rent.textx(locs, 5500);
        }
        rent.setVisible(true);
        if (rent.getsig().equals("yes")){
            if(carprice>1500 && carprice<10000){
                money+=2400;
                lot.get(loc).setPrice(carprice-2000);
                JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $2000, but you gain $2400, due to value");
            }
            else if(carprice>10000 && carprice<25000){
                money+=3000;
                lot.get(loc).setPrice(carprice-2000);
                JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $2000, but you gain $3000, due to value");
            }
            else if(carprice>25000 && carprice<50000){
                money+=4500;
                lot.get(loc).setPrice(carprice-3000);
                JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $3000, but you gain $4500, due to value");
            }
            else if(carprice>50000 && carprice<100000){
                money+=6000;
                lot.get(loc).setPrice(carprice-4000);
                JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $4000, but you gain $6000, due to value");
            }
            else if(carprice>100000){
               money+=10000;
               lot.get(loc).setPrice(carprice-5500);
               JOptionPane.showMessageDialog(this, "You have rented out a car, its value declines $5500, but you gain $10000, due to value"); 
            }
        }
        txtmon.setText("Money: " + money);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int loc = tblowned.getSelectedRow();
        JOptionPane.showMessageDialog(this, lot.get(loc).sum() + " Is now worth: " + lot.get(loc).getPrice());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Selling sell = new Selling(this, true);
        int loc = tblowned.getSelectedRow();
        String locs = lot.get(loc).sum();
        int carprice = lot.get(loc).getPrice();
        sell.text(locs, carprice);
        sell.setVisible(true);
        if (sell.getsig().equals("yes")){
            money += carprice;
            JOptionPane.showMessageDialog(this, "Car successfully sold, Thanks for your business DEALER!");
        }
        txtmon.setText("Money: " + money);
        tblowned.setValueAt("", loc, 0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Restore restore = new Restore(this, true);
        int loc = tblowned.getSelectedRow();
        String locs = lot.get(loc).sum();
        int carprice = lot.get(loc).getPrice();
        int ramm = lot.get(loc).getStartingprice()/2;
        int org = lot.get(loc).getStartingprice();
        restore.text(locs, ramm);
        restore.setVisible(true);
        if (restore.getsig().equals("yes")){
            if(ramm>money){
                JOptionPane.showMessageDialog(this, "You do not have enough money for this Restore!");
                return;
            }
            money -= ramm;
            lot.get(loc).setPrice(org);
            JOptionPane.showMessageDialog(this, "Car successfully sold, Thanks for your business DEALER!");
        }
        txtmon.setText("Money: " + money);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarDealerTycoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDealerTycoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDealerTycoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDealerTycoon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDealerTycoon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblforsale;
    private javax.swing.JTable tblowned;
    private javax.swing.JLabel txtmon;
    // End of variables declaration//GEN-END:variables
}
