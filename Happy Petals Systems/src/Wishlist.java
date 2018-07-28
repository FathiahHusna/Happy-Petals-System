/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Wishlist extends javax.swing.JFrame {

    /**
     * Creates new form Wishlist
     */
    private MainMenu b = new MainMenu();
    public static int bcount = 0;
    static int btick1;
    static int btick2;
    static int btick3;
    static int btick4;
    static int btick5;
    
    public static int pcount = 0;
    static int ptick1;
    static int ptick2;
    static int ptick3;
    static int ptick4;
    static int ptick5;
    
    public static int bkcount = 0;
    static int bktick1;
    static int bktick2;
    static int bktick3;
    static int bktick4;
    static int bktick5;
    
    public static int fcount = 0;
    static int ftick1;
    static int ftick2;
    static int ftick3;
    
    public void printBouquet(){
        
        if(Bouquet.fblossom.isSelected()== true)
           labelBqtBlossom.setText(b.bouquet[0].name + "   " + b.bouquet[0].price);
        
        if(Bouquet.fhydrangea.isSelected()== true)
            labelBqtHydrangea.setText(b.bouquet[1].name + "   " + b.bouquet[1].price);
        
        if(Bouquet.frose.isSelected()== true)
            labelBqtRoses.setText(b.bouquet[2].name + "   " + b.bouquet[2].price);
        
        if(Bouquet.fsunflower.isSelected()== true)
            labelBqtSunflower.setText(b.bouquet[3].name + "   " + b.bouquet[3].price);
        
        if(Bouquet.fbabybreath.isSelected()== true)
            labelBqtBabybreath.setText(b.bouquet[4].name + "   " + b.bouquet[4].price);
       
    }
    public void printPackage(){
        
        if(Package.fforeverlove.isSelected()== true)
           labelPkgFL.setText(b.pakej[0].name + "   " + b.pakej[0].price);
        
        if(Package.fcongratulations.isSelected()== true)
            labelPkgCongrates.setText(b.pakej[1].name + "   " + b.pakej[1].price);
       
        if(Package.fgetwellsoon.isSelected()== true)
            labelPkgGWS.setText(b.pakej[2].name + "   " + b.pakej[2].price);
        
        if(Package.fcondolescence.isSelected()== true)
            labelPkgCondolescence.setText(b.pakej[3].name + "   " + b.pakej[3].price);
        
        if(Package.fhappybirthday.isSelected()== true)
            labelPkgHB.setText(b.pakej[4].name + "   " + b.pakej[4].price);
        
    }
    
    public void printBulk(){
        if(Bulk.faster.isSelected()== true)
           labelBulkAster.setText(b.bulk[0].name + "   " + b.bulk[0].price);
        
        if(Bulk.fdahlia.isSelected()== true)
           labelBulkDahlia.setText(b.bulk[1].name + "   " + b.bulk[1].price);
        
        if(Bulk.frose.isSelected()== true)
           labelBulkRose.setText(b.bulk[2].name + "   " + b.bulk[2].price);
        
        if(Bulk.fdaisy.isSelected()== true)
           labelBulkDaisy.setText(b.bulk[3].name + "   " + b.bulk[3].price);
        
        if(Bulk.fsunflower.isSelected()== true)
           labelBulkSunflower.setText(b.bulk[4].name + "   " + b.bulk[4].price);
        
        
    }
    
    public void printFruitBasket(){
        
        if(FruitBasket.fsmall.isSelected()== true)
           labelFBSmall.setText(b.fruitbasket[0].name + "   " + b.fruitbasket[0].price);
        
        if(FruitBasket.fmedium.isSelected()== true)
           labelFBMedium.setText(b.fruitbasket[1].name + "   " + b.fruitbasket[1].price);
        
        if(FruitBasket.flarge.isSelected()== true)
           labelFBLarge.setText(b.fruitbasket[2].name + "   " + b.fruitbasket[2].price);
    }
    
    
    
    public Wishlist() {
        initComponents();
        
      if(Bouquet.bcount>0) 
          printBouquet();
        
      if(Package.pcount>0)
          printPackage();
      
      if(Bulk.bkcount>0)
          printBulk();
      
      if(FruitBasket.fcount>0)
          printFruitBasket();
      
      //BOUQUET CART RADIO BUTTON
         if(btick1 == 1)
        {
            
            cartBqtBlossom.setSelected(true);
        }
        
        if(btick2 == 1)
        {
            
            cartBqtHydrangea.setSelected(true);
        }
                
        if(btick3 == 1)
        {
            
            cartBqtRose.setSelected(true);
        }  
        
        if(btick4 == 1)
        {
            
            cartBqtSunflower.setSelected(true);
        } 
        
        if(btick5 == 1)
        {
            
            cartBqtBabybreath.setSelected(true);
        } 
        
        //PACKAGE CART RADIO BUTTON
         if(ptick1 == 1)
        {
            
            cartPkgFL.setSelected(true);
        }
        
        if(ptick2 == 1)
        {
            
            cartPkgCongrates.setSelected(true);
        }
                
        if(ptick3 == 1)
        {
            
            cartPkgGWS.setSelected(true);
        }  
        
        if(ptick4 == 1)
        {
            
            cartPkgCondolescence.setSelected(true);
        } 
        
        if(ptick5 == 1)
        {
            
            cartPkgHB.setSelected(true);
        } 
        
        //BULK CART RADIO BUTTON
         if(bktick1 == 1)
        {
            
            cartBulkAster.setSelected(true);
        }
        
        if(bktick2 == 1)
        {
            
            cartBulkDahlia.setSelected(true);
        }
                
        if(bktick3 == 1)
        {
            
            cartBulkRose.setSelected(true);
        }  
        
        if(bktick4 == 1)
        {
            
            cartBulkDaisy.setSelected(true);
        } 
        
        if(bktick5 == 1)
        {
            
            cartBulkSunflower.setSelected(true);
        } 
        
        
      //FRUIT BASKET CART RADIO BUTTON
         if(ftick1 == 1)
        {
            
            cartFBSmall.setSelected(true);
        }
        
        if(ftick2 == 1)
        {
            
            cartFBMedium.setSelected(true);
        }
                
        if(ftick3 == 1)
        {
            
            cartFBLarge.setSelected(true);
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
        MainMenu = new javax.swing.JButton();
        panelPackage = new javax.swing.JPanel();
        labelPkgFL = new javax.swing.JLabel();
        labelPkgGWS = new javax.swing.JLabel();
        labelPkgCondolescence = new javax.swing.JLabel();
        labelPkgHB = new javax.swing.JLabel();
        labelPkgCongrates = new javax.swing.JLabel();
        cartPkgFL = new javax.swing.JRadioButton();
        cartPkgGWS = new javax.swing.JRadioButton();
        cartPkgCondolescence = new javax.swing.JRadioButton();
        cartPkgHB = new javax.swing.JRadioButton();
        cartPkgCongrates = new javax.swing.JRadioButton();
        panelBouquet = new javax.swing.JPanel();
        labelBqtBlossom = new javax.swing.JLabel();
        labelBqtRoses = new javax.swing.JLabel();
        labelBqtSunflower = new javax.swing.JLabel();
        labelBqtBabybreath = new javax.swing.JLabel();
        labelBqtHydrangea = new javax.swing.JLabel();
        cartBqtBlossom = new javax.swing.JRadioButton();
        cartBqtRose = new javax.swing.JRadioButton();
        cartBqtSunflower = new javax.swing.JRadioButton();
        cartBqtBabybreath = new javax.swing.JRadioButton();
        cartBqtHydrangea = new javax.swing.JRadioButton();
        panelBulk = new javax.swing.JPanel();
        labelBulkAster = new javax.swing.JLabel();
        labelBulkRose = new javax.swing.JLabel();
        labelBulkDaisy = new javax.swing.JLabel();
        labelBulkSunflower = new javax.swing.JLabel();
        labelBulkDahlia = new javax.swing.JLabel();
        cartBulkAster = new javax.swing.JRadioButton();
        cartBulkRose = new javax.swing.JRadioButton();
        cartBulkDaisy = new javax.swing.JRadioButton();
        cartBulkSunflower = new javax.swing.JRadioButton();
        cartBulkDahlia = new javax.swing.JRadioButton();
        panelPackage1 = new javax.swing.JPanel();
        labelFBSmall = new javax.swing.JLabel();
        labelFBLarge = new javax.swing.JLabel();
        labelFBMedium = new javax.swing.JLabel();
        cartFBSmall = new javax.swing.JRadioButton();
        cartFBLarge = new javax.swing.JRadioButton();
        cartFBMedium = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        MainMenu.setText("Continue Shopping");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(MainMenu);
        MainMenu.setBounds(899, 930, 170, 29);

        panelPackage.setBackground(new java.awt.Color(255, 204, 255));
        panelPackage.setForeground(new java.awt.Color(255, 255, 204));
        panelPackage.setLayout(null);
        panelPackage.add(labelPkgFL);
        labelPkgFL.setBounds(36, 16, 321, 37);
        panelPackage.add(labelPkgGWS);
        labelPkgGWS.setBounds(36, 123, 321, 37);
        panelPackage.add(labelPkgCondolescence);
        labelPkgCondolescence.setBounds(36, 180, 321, 37);
        panelPackage.add(labelPkgHB);
        labelPkgHB.setBounds(36, 235, 321, 37);
        panelPackage.add(labelPkgCongrates);
        labelPkgCongrates.setBounds(36, 71, 321, 37);

        cartPkgFL.setText("Add to cart");
        cartPkgFL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartPkgFLActionPerformed(evt);
            }
        });
        panelPackage.add(cartPkgFL);
        cartPkgFL.setBounds(383, 16, 122, 37);

        cartPkgGWS.setText("Add to cart");
        cartPkgGWS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartPkgGWSActionPerformed(evt);
            }
        });
        panelPackage.add(cartPkgGWS);
        cartPkgGWS.setBounds(383, 123, 122, 37);

        cartPkgCondolescence.setText("Add to cart");
        cartPkgCondolescence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartPkgCondolescenceActionPerformed(evt);
            }
        });
        panelPackage.add(cartPkgCondolescence);
        cartPkgCondolescence.setBounds(383, 186, 122, 31);

        cartPkgHB.setText("Add to cart");
        cartPkgHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartPkgHBActionPerformed(evt);
            }
        });
        panelPackage.add(cartPkgHB);
        cartPkgHB.setBounds(383, 236, 122, 37);

        cartPkgCongrates.setText("Add to cart");
        cartPkgCongrates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartPkgCongratesActionPerformed(evt);
            }
        });
        panelPackage.add(cartPkgCongrates);
        cartPkgCongrates.setBounds(383, 71, 122, 37);

        jPanel1.add(panelPackage);
        panelPackage.setBounds(20, 570, 530, 320);

        panelBouquet.setBackground(new java.awt.Color(255, 255, 204));
        panelBouquet.setForeground(new java.awt.Color(255, 255, 204));
        panelBouquet.setLayout(null);
        panelBouquet.add(labelBqtBlossom);
        labelBqtBlossom.setBounds(36, 16, 321, 37);
        panelBouquet.add(labelBqtRoses);
        labelBqtRoses.setBounds(36, 123, 321, 37);
        panelBouquet.add(labelBqtSunflower);
        labelBqtSunflower.setBounds(36, 180, 321, 37);
        panelBouquet.add(labelBqtBabybreath);
        labelBqtBabybreath.setBounds(36, 235, 321, 37);
        panelBouquet.add(labelBqtHydrangea);
        labelBqtHydrangea.setBounds(36, 71, 321, 37);

        cartBqtBlossom.setText("Add to cart");
        cartBqtBlossom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBqtBlossomActionPerformed(evt);
            }
        });
        panelBouquet.add(cartBqtBlossom);
        cartBqtBlossom.setBounds(383, 16, 122, 37);

        cartBqtRose.setText("Add to cart");
        cartBqtRose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBqtRoseActionPerformed(evt);
            }
        });
        panelBouquet.add(cartBqtRose);
        cartBqtRose.setBounds(383, 123, 122, 37);

        cartBqtSunflower.setText("Add to cart");
        cartBqtSunflower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBqtSunflowerActionPerformed(evt);
            }
        });
        panelBouquet.add(cartBqtSunflower);
        cartBqtSunflower.setBounds(383, 186, 122, 31);

        cartBqtBabybreath.setText("Add to cart");
        cartBqtBabybreath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBqtBabybreathActionPerformed(evt);
            }
        });
        panelBouquet.add(cartBqtBabybreath);
        cartBqtBabybreath.setBounds(383, 236, 122, 37);

        cartBqtHydrangea.setText("Add to cart");
        cartBqtHydrangea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBqtHydrangeaActionPerformed(evt);
            }
        });
        panelBouquet.add(cartBqtHydrangea);
        cartBqtHydrangea.setBounds(383, 71, 122, 37);

        jPanel1.add(panelBouquet);
        panelBouquet.setBounds(20, 120, 530, 320);

        panelBulk.setBackground(new java.awt.Color(204, 255, 204));
        panelBulk.setForeground(new java.awt.Color(255, 255, 204));
        panelBulk.setLayout(null);
        panelBulk.add(labelBulkAster);
        labelBulkAster.setBounds(36, 16, 321, 37);
        panelBulk.add(labelBulkRose);
        labelBulkRose.setBounds(36, 123, 321, 37);
        panelBulk.add(labelBulkDaisy);
        labelBulkDaisy.setBounds(36, 180, 321, 37);
        panelBulk.add(labelBulkSunflower);
        labelBulkSunflower.setBounds(36, 235, 321, 37);
        panelBulk.add(labelBulkDahlia);
        labelBulkDahlia.setBounds(36, 71, 321, 37);

        cartBulkAster.setText("Add to cart");
        cartBulkAster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBulkAsterActionPerformed(evt);
            }
        });
        panelBulk.add(cartBulkAster);
        cartBulkAster.setBounds(383, 16, 122, 37);

        cartBulkRose.setText("Add to cart");
        cartBulkRose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBulkRoseActionPerformed(evt);
            }
        });
        panelBulk.add(cartBulkRose);
        cartBulkRose.setBounds(383, 123, 122, 37);

        cartBulkDaisy.setText("Add to cart");
        cartBulkDaisy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBulkDaisyActionPerformed(evt);
            }
        });
        panelBulk.add(cartBulkDaisy);
        cartBulkDaisy.setBounds(383, 186, 122, 31);

        cartBulkSunflower.setText("Add to cart");
        cartBulkSunflower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBulkSunflowerActionPerformed(evt);
            }
        });
        panelBulk.add(cartBulkSunflower);
        cartBulkSunflower.setBounds(383, 236, 122, 37);

        cartBulkDahlia.setText("Add to cart");
        cartBulkDahlia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBulkDahliaActionPerformed(evt);
            }
        });
        panelBulk.add(cartBulkDahlia);
        cartBulkDahlia.setBounds(383, 71, 122, 37);

        jPanel1.add(panelBulk);
        panelBulk.setBounds(550, 120, 530, 320);

        panelPackage1.setBackground(new java.awt.Color(255, 204, 153));
        panelPackage1.setForeground(new java.awt.Color(255, 255, 204));
        panelPackage1.setLayout(null);
        panelPackage1.add(labelFBSmall);
        labelFBSmall.setBounds(36, 16, 321, 37);
        panelPackage1.add(labelFBLarge);
        labelFBLarge.setBounds(36, 123, 321, 37);
        panelPackage1.add(labelFBMedium);
        labelFBMedium.setBounds(36, 71, 321, 37);

        cartFBSmall.setText("Add to cart");
        cartFBSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartFBSmallActionPerformed(evt);
            }
        });
        panelPackage1.add(cartFBSmall);
        cartFBSmall.setBounds(383, 16, 122, 37);

        cartFBLarge.setText("Add to cart");
        cartFBLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartFBLargeActionPerformed(evt);
            }
        });
        panelPackage1.add(cartFBLarge);
        cartFBLarge.setBounds(383, 123, 122, 37);

        cartFBMedium.setText("Add to cart");
        cartFBMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartFBMediumActionPerformed(evt);
            }
        });
        panelPackage1.add(cartFBMedium);
        cartFBMedium.setBounds(383, 71, 122, 37);

        jPanel1.add(panelPackage1);
        panelPackage1.setBounds(550, 570, 530, 320);

        jButton1.setText("Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(790, 930, 61, 29);

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel3.setText("Bulk");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(780, 30, 80, 60);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel1.setText("Package");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 470, 130, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/header 4 copy.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 440, 390, 130);

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel4.setText("Fruit Basket");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(750, 480, 160, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/header 4 copy.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 440, 350, 130);

        jLabel2.setFont(new java.awt.Font("Goudy Old Style", 0, 36)); // NOI18N
        jLabel2.setText("Bouquet");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 30, 150, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/header 3 copy.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(630, -10, 360, 140);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/header 3 copy.png"))); // NOI18N
        jLabel8.setText("jLabel7");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, -10, 360, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1122, 1036));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        btick1=0;
        btick2=0;
        btick3=0;
        btick4=0;
        btick5=0;
        
        ptick1=0;
        ptick2=0;
        ptick3=0;
        ptick4=0;
        ptick5=0;
        
        bktick1=0;
        bktick2=0;
        bktick3=0;
        bktick4=0;
        bktick5=0;
        
        ftick1=0;
        ftick2=0;
        ftick3=0;
        
        //COUNTER FOR BOUQUET CART RADIO BUTTON
        if(Wishlist.cartBqtBlossom.isSelected())
        {
           bcount++;    
           btick1 = 1;
        }
           
        if(Wishlist.cartBqtHydrangea.isSelected())
        {
            bcount++;
            btick2 = 1;
        }
        
        if(Wishlist.cartBqtRose.isSelected())
        {
            bcount++;
            btick3 = 1;
        }
        
        if(Wishlist.cartBqtSunflower.isSelected())
        {
            bcount++;
            btick4 = 1;
        }
        
        if(Wishlist.cartBqtBabybreath.isSelected())
        {
            bcount++;
            btick5 = 1;
        }
        
        //COUNTER FOR PACKAGE CART RADIO BUTTON
        if(Wishlist.cartPkgFL.isSelected())
        {
           pcount++;    
           ptick1 = 1;
        }
           
        if(Wishlist.cartPkgCongrates.isSelected())
        {
            pcount++;
            ptick2 = 1;
        }
        
        if(Wishlist.cartPkgGWS.isSelected())
        {
            pcount++;
            ptick3 = 1;
        }
        
        if(Wishlist.cartPkgCondolescence.isSelected())
        {
            pcount++;
            ptick4 = 1;
        }
        
        if(Wishlist.cartPkgHB.isSelected())
        {
            pcount++;
            ptick5 = 1;
        }
        
        //COUNTER FOR BULK CART RADIO BUTTON
        if(Wishlist.cartBulkAster.isSelected())
        {
           bkcount++;    
           bktick1 = 1;
        }
           
        if(Wishlist.cartBulkDahlia.isSelected())
        {
            bkcount++;
            bktick2 = 1;
        }
        
        if(Wishlist.cartBulkRose.isSelected())
        {
            bkcount++;
            bktick3 = 1;
        }
        
        if(Wishlist.cartBulkDaisy.isSelected())
        {
            bkcount++;
            bktick4 = 1;
        }
        
        if(Wishlist.cartBulkSunflower.isSelected())
        {
            bkcount++;
            bktick5 = 1;
        }
        
        //COUNTER FOR FRUIT BASKET CART RADIO BUTTON
        if(Wishlist.cartFBSmall.isSelected())
        {
           fcount++;    
           ftick1 = 1;
        }
           
        if(Wishlist.cartFBMedium.isSelected())
        {
            fcount++;
            ftick2 = 1;
        }
        
        if(Wishlist.cartFBLarge.isSelected())
        {
            fcount++;
            ftick3 = 1;
        }
        
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MainMenuActionPerformed

    private void cartPkgFLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartPkgFLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartPkgFLActionPerformed

    private void cartPkgGWSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartPkgGWSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartPkgGWSActionPerformed

    private void cartPkgCondolescenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartPkgCondolescenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartPkgCondolescenceActionPerformed

    private void cartPkgHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartPkgHBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartPkgHBActionPerformed

    private void cartPkgCongratesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartPkgCongratesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartPkgCongratesActionPerformed

    private void cartBqtBlossomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBqtBlossomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBqtBlossomActionPerformed

    private void cartBqtRoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBqtRoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBqtRoseActionPerformed

    private void cartBqtSunflowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBqtSunflowerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBqtSunflowerActionPerformed

    private void cartBqtBabybreathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBqtBabybreathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBqtBabybreathActionPerformed

    private void cartBqtHydrangeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBqtHydrangeaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBqtHydrangeaActionPerformed

    private void cartBulkAsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBulkAsterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBulkAsterActionPerformed

    private void cartBulkRoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBulkRoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBulkRoseActionPerformed

    private void cartBulkDaisyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBulkDaisyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBulkDaisyActionPerformed

    private void cartBulkSunflowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBulkSunflowerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBulkSunflowerActionPerformed

    private void cartBulkDahliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBulkDahliaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartBulkDahliaActionPerformed

    private void cartFBSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartFBSmallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartFBSmallActionPerformed

    private void cartFBLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartFBLargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartFBLargeActionPerformed

    private void cartFBMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartFBMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartFBMediumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Cart().setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Wishlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wishlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wishlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wishlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wishlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenu;
    public static javax.swing.JRadioButton cartBqtBabybreath;
    public static javax.swing.JRadioButton cartBqtBlossom;
    public static javax.swing.JRadioButton cartBqtHydrangea;
    public static javax.swing.JRadioButton cartBqtRose;
    public static javax.swing.JRadioButton cartBqtSunflower;
    public static javax.swing.JRadioButton cartBulkAster;
    public static javax.swing.JRadioButton cartBulkDahlia;
    public static javax.swing.JRadioButton cartBulkDaisy;
    public static javax.swing.JRadioButton cartBulkRose;
    public static javax.swing.JRadioButton cartBulkSunflower;
    public static javax.swing.JRadioButton cartFBLarge;
    public static javax.swing.JRadioButton cartFBMedium;
    public static javax.swing.JRadioButton cartFBSmall;
    public static javax.swing.JRadioButton cartPkgCondolescence;
    public static javax.swing.JRadioButton cartPkgCongrates;
    public static javax.swing.JRadioButton cartPkgFL;
    public static javax.swing.JRadioButton cartPkgGWS;
    public static javax.swing.JRadioButton cartPkgHB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBqtBabybreath;
    private javax.swing.JLabel labelBqtBlossom;
    private javax.swing.JLabel labelBqtHydrangea;
    private javax.swing.JLabel labelBqtRoses;
    private javax.swing.JLabel labelBqtSunflower;
    private javax.swing.JLabel labelBulkAster;
    private javax.swing.JLabel labelBulkDahlia;
    private javax.swing.JLabel labelBulkDaisy;
    private javax.swing.JLabel labelBulkRose;
    private javax.swing.JLabel labelBulkSunflower;
    private javax.swing.JLabel labelFBLarge;
    private javax.swing.JLabel labelFBMedium;
    private javax.swing.JLabel labelFBSmall;
    private javax.swing.JLabel labelPkgCondolescence;
    private javax.swing.JLabel labelPkgCongrates;
    private javax.swing.JLabel labelPkgFL;
    private javax.swing.JLabel labelPkgGWS;
    private javax.swing.JLabel labelPkgHB;
    private javax.swing.JPanel panelBouquet;
    private javax.swing.JPanel panelBulk;
    private javax.swing.JPanel panelPackage;
    private javax.swing.JPanel panelPackage1;
    // End of variables declaration//GEN-END:variables
}
