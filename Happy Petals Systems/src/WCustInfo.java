
import java.awt.event.KeyEvent;
import java.text.DateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class WCustInfo extends javax.swing.JFrame {

    /**
     * Creates new form WCustInfo
     */
    DateFormat df = DateFormat.getDateInstance();
    String tarikh = "";
    String tarikhpasti = " ";
    public WCustInfo() {
        initComponents();
    }
    
       public WCustInfo(String e) {
        initComponents();
        ptotal.setText(e);
    }
        public String j;
    public void select_combo()
    {
        
        int ind = wcust_state.getSelectedIndex();
        if (ind == 0)
        {
            j = "Johor";
        }
        
         if (ind == 1)
        {
            j = "Kedah";
        }
         
          if (ind == 2)
        {
            j = "Kelantan";
        }
       
           if (ind == 3)
        {
            j = "Kuala Lumpur";
        }
           
            if (ind == 4)
        {
            j = "Labuan";
        }
            
             if (ind == 5)
        {
            j = "Melaka";
        }
             
              if (ind == 6)
        {
            j = "Negeri Sembilan";
        }
              
         if (ind == 7)
        {
            j = "Pahang";
        }      
         
          if (ind == 8)
        {
            j = "Perak";
        }
          
           if (ind == 9)
        {
            j = "Perlis";
        }
           
            if (ind == 10)
        {
            j = "Pulau Pinang";
        }
            
             if (ind ==11)
        {
            j = "Sabah";
        }
              if (ind == 12)
        {
            j = "Sarawak";
        }
               if (ind == 13)
        {
            j = "Selangor";
        }
                if (ind == 14)
        {
            j = "Terengganu";
        }
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        wcust_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        wcust_address = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        wcust_postcode = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        wcust_state = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        wcust_phoneno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        display_date = new javax.swing.JLabel();
        wcust_email = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        next2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ptotal = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        wdate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        combo_MM = new javax.swing.JComboBox<>();
        combo_YYYY = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Customer's details ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 110, 200, 32);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Name     :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 160, 78, 32);

        wcust_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wcust_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wcust_nameActionPerformed(evt);
            }
        });
        jPanel1.add(wcust_name);
        wcust_name.setBounds(250, 160, 425, 28);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Address  : ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(160, 220, 90, 39);

        wcust_address.setColumns(20);
        wcust_address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wcust_address.setRows(5);
        jScrollPane2.setViewportView(wcust_address);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(250, 220, 421, 69);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setText("Postcode :");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(240, 320, 90, 30);

        wcust_postcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wcust_postcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wcust_postcodeKeyTyped(evt);
            }
        });
        jPanel1.add(wcust_postcode);
        wcust_postcode.setBounds(340, 320, 140, 28);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("State      :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(250, 370, 80, 20);

        wcust_state.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wcust_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Johor", "Kedah", "Kelantan", "Kuala Lumpur", "Labuan", "Melaka", "Negeri Sembilan", "Pahang", "Perak", "Perlis", "Pulau Pinang", "Sabah", "Sarawak", "Selangor", "Terengganu", " " }));
        jPanel1.add(wcust_state);
        wcust_state.setBounds(340, 370, 160, 28);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Phone no :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(148, 420, 90, 34);

        jButton1.setText("Date Confirmed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 580, 160, 29);

        wcust_phoneno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wcust_phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wcust_phonenoKeyTyped(evt);
            }
        });
        jPanel1.add(wcust_phoneno);
        wcust_phoneno.setBounds(260, 430, 179, 28);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Email       :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(150, 470, 90, 31);

        display_date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(display_date);
        display_date.setBounds(720, 580, 170, 30);

        wcust_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wcust_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wcust_emailActionPerformed(evt);
            }
        });
        jPanel1.add(wcust_email);
        wcust_email.setBounds(260, 468, 440, 40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Date pick up");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(80, 530, 120, 32);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setText("Choose date :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(150, 580, 120, 30);

        next2.setText("Next");
        next2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next2ActionPerformed(evt);
            }
        });
        jPanel1.add(next2);
        next2.setBounds(960, 930, 65, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Total                :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 710, 137, 32);

        ptotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(ptotal);
        ptotal.setBounds(230, 710, 153, 32);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel47.setText("Credit/Debit Card No :");
        jPanel1.add(jLabel47);
        jLabel47.setBounds(90, 650, 184, 20);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(280, 650, 350, 28);

        jLabel3.setText("MM              YYYY");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(770, 620, 140, 20);

        wdate.setDateFormatString("d MMM yyyy");
        wdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(wdate);
        wdate.setBounds(280, 580, 180, 26);

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel4.setText("Walk-In");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(520, 30, 140, 60);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/floral-header copy.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(250, 0, 540, 130);

        jLabel6.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        jLabel6.setText("*Please fill in all the details*");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 80, 370, 30);

        combo_MM.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combo_MM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(combo_MM);
        combo_MM.setBounds(760, 650, 60, 28);

        combo_YYYY.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combo_YYYY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027" }));
        jPanel1.add(combo_YYYY);
        combo_YYYY.setBounds(850, 650, 73, 28);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("/");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(830, 640, 20, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Expiry date :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(650, 640, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/abtract nude background copy.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1100, 980);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1122, 1043));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void wcust_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wcust_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wcust_nameActionPerformed

    private void wcust_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wcust_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wcust_emailActionPerformed

    private void next2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next2ActionPerformed
        // TODO add your handling code here:
        String d = wcust_name.getText(); 
        String a = wcust_address.getText();
       String b = wcust_postcode.getText();
       j="";
       select_combo();
       String l = wcust_phoneno.getText();
       String p = wcust_email.getText();
      // String t = wdate.getText();
      tarikh = display_date.getText();
       String e = ptotal.getText();
        new WReview(d,a,b,j,l,p,e,tarikh).setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_next2ActionPerformed

    private void wcust_postcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wcust_postcodeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE ) || c==KeyEvent.VK_DELETE )
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_wcust_postcodeKeyTyped

    private void wcust_phonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wcust_phonenoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE ) || c==KeyEvent.VK_DELETE )
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_wcust_phonenoKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE ) || c==KeyEvent.VK_DELETE )
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tarikh = df.format(wdate.getDate()); 
       display_date.setText(tarikh);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(WCustInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WCustInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WCustInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WCustInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WCustInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_MM;
    private javax.swing.JComboBox<String> combo_YYYY;
    public static javax.swing.JLabel display_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton next2;
    private javax.swing.JLabel ptotal;
    private javax.swing.JTextArea wcust_address;
    private javax.swing.JTextField wcust_email;
    private javax.swing.JTextField wcust_name;
    private javax.swing.JTextField wcust_phoneno;
    private javax.swing.JTextField wcust_postcode;
    private javax.swing.JComboBox<String> wcust_state;
    private com.toedter.calendar.JDateChooser wdate;
    // End of variables declaration//GEN-END:variables
}
