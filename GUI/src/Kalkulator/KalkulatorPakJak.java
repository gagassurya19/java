/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kalkulator;

/**
 *
 * @author oOo
 */
public class KalkulatorPakJak extends javax.swing.JFrame {

    /**
     * Creates new form KalkulatorPakJak
     */
    double bilangan1, bilangan2;
    String Operator;
    public KalkulatorPakJak() { //contructor
        initComponents();
        bilangan1 = 0;
        bilangan2 = 0;
        Operator = null;
        Output.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdTitik = new javax.swing.JButton();
        cmdSamaDengan = new javax.swing.JButton();
        cmd1 = new javax.swing.JButton();
        cmd2 = new javax.swing.JButton();
        cmd3 = new javax.swing.JButton();
        cmdPersen = new javax.swing.JButton();
        cmdMinPlus = new javax.swing.JButton();
        cmdClear = new javax.swing.JButton();
        cmdKurang = new javax.swing.JButton();
        cmdKali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Output = new javax.swing.JTextField();
        cmd7 = new javax.swing.JButton();
        cmd8 = new javax.swing.JButton();
        cmd9 = new javax.swing.JButton();
        cmd4 = new javax.swing.JButton();
        cmd5 = new javax.swing.JButton();
        cmd6 = new javax.swing.JButton();
        cmdTambah = new javax.swing.JButton();
        cmd0 = new javax.swing.JButton();
        cmdBagi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmdTitik.setText(".");
        cmdTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTitikActionPerformed(evt);
            }
        });

        cmdSamaDengan.setText("=");
        cmdSamaDengan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdSamaDenganMouseClicked(evt);
            }
        });
        cmdSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSamaDenganActionPerformed(evt);
            }
        });

        cmd1.setText("1");
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd1ActionPerformed(evt);
            }
        });

        cmd2.setText("2");
        cmd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd2ActionPerformed(evt);
            }
        });

        cmd3.setText("3");
        cmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd3ActionPerformed(evt);
            }
        });

        cmdPersen.setText("%");
        cmdPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPersenActionPerformed(evt);
            }
        });

        cmdMinPlus.setText("+/-");
        cmdMinPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMinPlusActionPerformed(evt);
            }
        });

        cmdClear.setText("C");
        cmdClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdClearMouseClicked(evt);
            }
        });
        cmdClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClearActionPerformed(evt);
            }
        });

        cmdKurang.setText("-");
        cmdKurang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdKurangMouseClicked(evt);
            }
        });
        cmdKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKurangActionPerformed(evt);
            }
        });

        cmdKali.setText("X");
        cmdKali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdKaliMouseClicked(evt);
            }
        });
        cmdKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdKaliActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kalkulator");

        Output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputActionPerformed(evt);
            }
        });

        cmd7.setText("7");
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd7ActionPerformed(evt);
            }
        });

        cmd8.setText("8");
        cmd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd8ActionPerformed(evt);
            }
        });

        cmd9.setText("9");
        cmd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd9ActionPerformed(evt);
            }
        });

        cmd4.setText("4");
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });

        cmd5.setText("5");
        cmd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd5ActionPerformed(evt);
            }
        });

        cmd6.setText("6");
        cmd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd6ActionPerformed(evt);
            }
        });

        cmdTambah.setText("+");
        cmdTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdTambahMouseClicked(evt);
            }
        });
        cmdTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTambahActionPerformed(evt);
            }
        });

        cmd0.setText("0");
        cmd0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd0ActionPerformed(evt);
            }
        });

        cmdBagi.setText("/");
        cmdBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBagiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmd1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmd7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdMinPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdClear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmd4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdKali, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdSamaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd7)
                    .addComponent(cmd8)
                    .addComponent(cmd9)
                    .addComponent(cmdMinPlus)
                    .addComponent(cmdClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd4)
                    .addComponent(cmd5)
                    .addComponent(cmd6)
                    .addComponent(cmdKurang)
                    .addComponent(cmdKali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd1)
                    .addComponent(cmd2)
                    .addComponent(cmd3)
                    .addComponent(cmdTambah)
                    .addComponent(cmdBagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdPersen)
                    .addComponent(cmd0)
                    .addComponent(cmdTitik)
                    .addComponent(cmdSamaDengan))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTitikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdTitikActionPerformed

    private void cmdSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSamaDenganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdSamaDenganActionPerformed

    private void cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd1ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("1");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd1ActionPerformed

    private void cmd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd2ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("2");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd2ActionPerformed

    private void cmd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd3ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("3");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd3ActionPerformed

    private void cmdPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPersenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdPersenActionPerformed

    private void cmdMinPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMinPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMinPlusActionPerformed

    private void cmdClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdClearActionPerformed

    private void cmdKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKurangActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmdKurangActionPerformed

    private void cmdKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdKaliActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmdKaliActionPerformed

    private void OutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OutputActionPerformed

    private void cmd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd7ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("7");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd7ActionPerformed

    private void cmd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd8ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("8");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd8ActionPerformed

    private void cmd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd9ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("9");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd9ActionPerformed

    private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("4");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd4ActionPerformed

    private void cmd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd5ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("5");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd5ActionPerformed

    private void cmd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd6ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("6");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd6ActionPerformed

    private void cmdTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTambahActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmdTambahActionPerformed

    private void cmd0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd0ActionPerformed
        // TODO add your handling code here:
        String temp = Output.getText();
        if (temp.equals("0")) {
            Output.setText("0");
        }else{
            Output.setText(temp + "1");
        }
    }//GEN-LAST:event_cmd0ActionPerformed

    private void cmdBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBagiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmdBagiActionPerformed

    private void cmdTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdTambahMouseClicked
        // TODO add your handling code here:
        if (bilangan1 == 0) {
            bilangan1 = Double.parseDouble(Output.getText());
        }else{
            bilangan2 = Double.parseDouble(Output.getText());
            double hasil = 0;
            if (Operator.equals("+")) {
                hasil = bilangan1 + bilangan2;
            }else if(Operator.equals("-")){
                hasil = bilangan1 - bilangan2;
            }else if(Operator.equals("*")){
                hasil = bilangan1 * bilangan2;
            }else if(Operator.equals("/")){
                hasil = bilangan1 / bilangan2;
            }
            bilangan1 = hasil;
        }
        Operator = "+";
        Output.setText("0");
    }//GEN-LAST:event_cmdTambahMouseClicked

    private void cmdKurangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdKurangMouseClicked
        // TODO add your handling code here:
        if (bilangan1 == 0) {
            bilangan1 = Double.parseDouble(Output.getText());
        }else{
            bilangan2 = Double.parseDouble(Output.getText());
            double hasil = 0;
            if (Operator.equals("-")) {
                hasil = bilangan1 + bilangan2;
            }else if(Operator.equals("-")){
                hasil = bilangan1 - bilangan2;
            }else if(Operator.equals("*")){
                hasil = bilangan1 * bilangan2;
            }else if(Operator.equals("/")){
                hasil = bilangan1 / bilangan2;
            }
            bilangan1 = hasil;
        }
        Operator = "+";
        Output.setText("0");
    }//GEN-LAST:event_cmdKurangMouseClicked

    private void cmdKaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdKaliMouseClicked
        // TODO add your handling code here:
        if (bilangan1 == 0) {
            bilangan1 = Double.parseDouble(Output.getText());
        }else{
            bilangan2 = Double.parseDouble(Output.getText());
            double hasil = 0;
            if (Operator.equals("*")) {
                hasil = bilangan1 + bilangan2;
            }else if(Operator.equals("-")){
                hasil = bilangan1 - bilangan2;
            }else if(Operator.equals("*")){
                hasil = bilangan1 * bilangan2;
            }else if(Operator.equals("/")){
                hasil = bilangan1 / bilangan2;
            }
            bilangan1 = hasil;
        }
        Operator = "+";
        Output.setText("0");
    }//GEN-LAST:event_cmdKaliMouseClicked

    private void cmdSamaDenganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdSamaDenganMouseClicked
        // TODO add your handling code here:
        bilangan2 = Double.parseDouble(Output.getText());
        double hasil = 0;
        if (Operator.equals("*")) {
                hasil = bilangan1 + bilangan2;
            }else if(Operator.equals("-")){
                hasil = bilangan1 - bilangan2;
            }else if(Operator.equals("*")){
                hasil = bilangan1 * bilangan2;
            }else if(Operator.equals("/")){
                hasil = bilangan1 / bilangan2;
            }
        Output.setText(String.valueOf(hasil));
        bilangan1 = 0;
        bilangan2 = 0;
        Operator = "";
    }//GEN-LAST:event_cmdSamaDenganMouseClicked

    private void cmdClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdClearMouseClicked
        // TODO add your handling code here:
        Output.setText("0");
        bilangan1 = 0;
        bilangan2 = 0;
        Operator = "";
    }//GEN-LAST:event_cmdClearMouseClicked

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
            java.util.logging.Logger.getLogger(KalkulatorPakJak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorPakJak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorPakJak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorPakJak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorPakJak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Output;
    private javax.swing.JButton cmd0;
    private javax.swing.JButton cmd1;
    private javax.swing.JButton cmd2;
    private javax.swing.JButton cmd3;
    private javax.swing.JButton cmd4;
    private javax.swing.JButton cmd5;
    private javax.swing.JButton cmd6;
    private javax.swing.JButton cmd7;
    private javax.swing.JButton cmd8;
    private javax.swing.JButton cmd9;
    private javax.swing.JButton cmdBagi;
    private javax.swing.JButton cmdClear;
    private javax.swing.JButton cmdKali;
    private javax.swing.JButton cmdKurang;
    private javax.swing.JButton cmdMinPlus;
    private javax.swing.JButton cmdPersen;
    private javax.swing.JButton cmdSamaDengan;
    private javax.swing.JButton cmdTambah;
    private javax.swing.JButton cmdTitik;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
