/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class FruitBasket extends javax.swing.JFrame {

    /**
     * Creates new form FruitBasket
     */
    public static int fcount = 0;
    static int tick1;
    static int tick2;
    static int tick3;

    public FruitBasket() {
        initComponents();
        if(tick1 == 1)
        {
            
            fsmall.setSelected(true);
        }
        
        if(tick2 == 1)
        {
            
            fmedium.setSelected(true);
        }
                
        if(tick3 == 1)
        {
            
            flarge.setSelected(true);
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
        jLabel1 = new javax.swing.JLabel();
        fsmall = new javax.swing.JCheckBox();
        fmedium = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        flarge = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MainMenuFruitBasket = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pick your fruit basket:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 310, 220, 22);

        fsmall.setBackground(new java.awt.Color(255, 204, 153));
        fsmall.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        fsmall.setText("Add to Wishlist");
        jPanel1.add(fsmall);
        fsmall.setBounds(90, 700, 150, 29);

        fmedium.setBackground(new java.awt.Color(255, 204, 153));
        fmedium.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        fmedium.setText("Add to Wishlist");
        jPanel1.add(fmedium);
        fmedium.setBounds(440, 700, 150, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("SMALL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 640, 80, 22);

        flarge.setBackground(new java.awt.Color(255, 204, 153));
        flarge.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        flarge.setText("Add to Wishlist");
        jPanel1.add(flarge);
        flarge.setBounds(760, 700, 150, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("MEDIUM");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(440, 640, 90, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LARGE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(760, 640, 100, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("RM 50.00");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 670, 90, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("RM 70.00");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(760, 670, 90, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("RM 65.00");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 670, 100, 22);

        MainMenuFruitBasket.setText("Continue Shopping");
        MainMenuFruitBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuFruitBasketActionPerformed(evt);
            }
        });
        jPanel1.add(MainMenuFruitBasket);
        MainMenuFruitBasket.setBounds(900, 890, 170, 29);

        jLabel8.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        jLabel8.setText("Love is a fruit in season at all times, and within reach of every hand.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(270, 230, 600, 30);

        jLabel9.setFont(new java.awt.Font("Goudy Old Style", 0, 24)); // NOI18N
        jLabel9.setText("We provide you variety of delicious and crumptious fruits. ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 270, 489, 30);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/medium copy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(440, 350, 220, 280);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/small_fruit_basket copy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(90, 350, 240, 280);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/large copy.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(760, 350, 270, 280);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Floral Header.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 1100, 230);

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel17.setText("*ALL PRICES ARE INCLUSIVE OF 6% GST");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(100, 810, 310, 20);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/flower copy.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(820, 690, 280, 240);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1122, 1036));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuFruitBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuFruitBasketActionPerformed
        // TODO add your handling code here:
        tick1=0;
        tick2=0;
        tick3=0;
        
         if(FruitBasket.fsmall.isSelected())
        {
           fcount++;    
           tick1 = 1;
        }
           
        if(FruitBasket.fmedium.isSelected())
        {
            fcount++;
            tick2 = 1;
        }
        if(FruitBasket.flarge.isSelected())
        {
            fcount++;
            tick3 = 1;
        }
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuFruitBasketActionPerformed

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
            java.util.logging.Logger.getLogger(FruitBasket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FruitBasket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FruitBasket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FruitBasket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitBasket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenuFruitBasket;
    public static javax.swing.JCheckBox flarge;
    public static javax.swing.JCheckBox fmedium;
    public static javax.swing.JCheckBox fsmall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
