package inventory.gui;
import inventory.code.Products;
import inventory.code.Desktop;
import inventory.code.Laptop;
import inventory.code.Smartphone;
import inventory.code.Tablet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;
/**
 *
 * @author Muhamad Ashraff
 */
public class frmAdd extends javax.swing.JFrame {
      //CREATE AND INIT COMPONENTS
        //COMPUTER COMPONENTS
        JLabel lblcompName =    new JLabel("Computer Name : ");
        JLabel lblcompSerial =  new JLabel("Serial : ");
        JLabel lblcompProc =    new JLabel("Processor : ");
        JLabel lblcompRam =     new JLabel("RAM : ");
        JLabel lblcompStorage = new JLabel("Storage : ");
        
        JTextField txtcompName = new JTextField(15);
        JTextField txtcompSerial = new JTextField(15);
        JTextField txtcompProc = new JTextField(15);
        JTextField txtcompRam = new JTextField(15);
        JTextField txtcompStorage = new JTextField(15);
        
        //DESKTOP COMPONENT
        JLabel lblcomCategory = new JLabel("Desktop Category : ");
        JTextField txtcompCategory = new JTextField(15);
        
        //LAPTOP COMPONENT
        JLabel lbllapCategory = new JLabel("Laptop Category : ");
        JTextField txtlapCategory = new JTextField(15);
        
        JLabel lbllapWeight = new JLabel("Laptop Weight : ");
        JTextField txtlapWeight = new JTextField(15);
        
        //MOBILE DEVICE COMPONENTS
        JLabel lbldevName     = new JLabel("Device Name : ");
        JLabel lbldevImei     = new JLabel("IMEI No : ");
        JLabel lbldevRam      = new JLabel("RAM : ");
        JLabel lbldevStorage  = new JLabel("Storage : ");
        JLabel lbldevWeight   = new JLabel("Weight : ");
        
        JTextField txtdevName = new JTextField(15);
        JTextField txtdevImei = new JTextField(15);
        JTextField txtdevRam = new JTextField(15);
        JTextField txtdevStorage = new JTextField(15);
        JTextField txtdevWeight = new JTextField(15);
        
        //SMARTPHONE COMPONENTS
        JLabel lblspCategory   = new JLabel("Smartphone Category : ");
        JTextField txtspCategory = new JTextField(15);
        
        //TABLET CATEGORY
        JLabel lbltbCategory   = new JLabel("Tablet Category : ");
        JTextField txttbCategory = new JTextField(15);
    /**
     * Creates new form addFrm
     */
    Timer timer;
    int i = 0;
    frmaddLoad addLoad = new frmaddLoad();
        
    public frmAdd() {
        initComponents();
        jcbCategorySelect();
        
        //CHECK IF TXT FILE IS EXIST
          //IF NOT, CREATE NEW
          //DEFAULT PATH IS AT C:/
        checkFile cf = new checkFile();
        System.out.println(cf);
        
        //GET LINE NUMBER FOR AUTO INCREMENT PRODUCT ID
        txtProdID.setText(Integer.toString(getLine()));
    }//DEFAULT CONSTRUCTOR
    
    //METHOD TO CALCULATE CURRENT LINE NO IN TEXT FILE
      //FOR AUTO INCREMENT PURPORSES
    public static int getLine(){
        String strPath = "C:/Products.txt"; //SET TXT PATH VALUE
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(strPath))) {
          while (reader.readLine() != null) lines++;
        } catch (IOException e) {
          e.printStackTrace();
        }//END TRY CATCH
        return lines+1;
    }//END METHOD
    
    //METHOD TO SELECT AND SHOW CATEGORY OF A PRODUCT
    public void jcbCategorySelect(){
         //USING IF ELSE STRUCTURE TO DETERMINE SELECTED ITEM TYPE
        if (jcbCategory.getSelectedIndex() == 0){ //IF COMPUTER IS SELECTED
            jcbType.removeAllItems();
            jcbType.addItem("Desktop");
            jcbType.addItem("Laptop");
        }else
        if (jcbCategory.getSelectedIndex() == 1){ //IF MOBILE DEVICES IS SELECTED
            jcbType.removeAllItems();
            jcbType.addItem("Smartphone");
            jcbType.addItem("Tablet");
        }//END IF
    }//END METHOD
    
    //METHOD TO SELECT TYPE OF PRODUCT AND CREATE A CUSTOM JPANEL
    public void jcbTypeSelect(){
        //USING IF ELSE STRUCTURE TO SELECT ITEM TYPE
        if (jcbCategory.getSelectedIndex() == 0){ //IF COMPUTER IS SELECTED
            
            if (jcbType.getSelectedIndex() == 0){ //IF DESKTOP IS SELECTED
                makeDesktopPanel();
            }else
            if (jcbType.getSelectedIndex() == 1){ //IF LAPTOP IS SELECTED
                makeLaptopPanel();
            }//END NESTED IF    
        }else
        if (jcbCategory.getSelectedIndex() == 1){ //IF MOBILE DEVICES IS SELECTED
            if (jcbType.getSelectedIndex() == 0){ //IF SMARTPHONE IS SELECTED
                makeSmartphonePanel();
            }else
            if (jcbType.getSelectedIndex() == 1){ //IF IF TABLET IS SELECTED
                makeTabletPanel();
            }//END NESTED IF    
        }//END IF
        
    }//END METHOD
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbType = new javax.swing.JComboBox<>();
        jcbCategory = new javax.swing.JComboBox<>();
        jbSave = new javax.swing.JButton();
        mkPanel = new javax.swing.JPanel();
        lblProdID = new javax.swing.JLabel();
        txtProdID = new javax.swing.JTextField();
        lblProdName = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        lblBrand = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        jbClear = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Product");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel2.setBackground(new java.awt.Color(181, 79, 119));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add32.png"))); // NOI18N
        jLabel2.setText("Add Product");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Add Product Here  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(181, 79, 119))); // NOI18N

        jLabel1.setText("Category :");

        jLabel3.setText("Type :");

        jcbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type 1" }));
        jcbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTypeActionPerformed(evt);
            }
        });

        jcbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer", "Mobile Devices" }));
        jcbCategory.setToolTipText("");
        jcbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoryActionPerformed(evt);
            }
        });

        jbSave.setText("Save");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        mkPanel.setBackground(new java.awt.Color(255, 255, 255));
        mkPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblProdID.setText("Product ID :");

        txtProdID.setEditable(false);
        txtProdID.setBackground(new java.awt.Color(255, 255, 255));
        txtProdID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtProdID.setForeground(new java.awt.Color(0, 204, 204));
        txtProdID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProdIDMousePressed(evt);
            }
        });

        lblProdName.setText("Product Name :");

        lblQty.setText("Quantity :");

        lblPrice.setText("Price :");

        lblBrand.setText("Brand :");

        lblModel.setText("Model :");

        jbClear.setText("Clear");
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProdID)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(lblProdName)
                            .addComponent(lblQty)
                            .addComponent(lblPrice)
                            .addComponent(lblBrand)
                            .addComponent(lblModel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcbType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbCategory, 0, 205, Short.MAX_VALUE)
                            .addComponent(txtProdID)
                            .addComponent(txtQty)
                            .addComponent(txtProdName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice)
                            .addComponent(txtBrand)
                            .addComponent(txtModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(mkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jcbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdID)
                            .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProdName)
                            .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQty)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBrand))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModel)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSave)
                    .addComponent(jbClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbClose.setBackground(new java.awt.Color(255, 153, 153));
        jbClose.setText("Close");
        jbClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbClose)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoryActionPerformed
        jcbCategorySelect(); //CALL OUT METHOD CATEGORY SELECTION
    }//GEN-LAST:event_jcbCategoryActionPerformed

    private void jcbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTypeActionPerformed
        jcbTypeSelect(); // CALL OUT METHOD PRODUCT TYPE SELECTION
    }//GEN-LAST:event_jcbTypeActionPerformed

    //METHOD TO CLEAR ALL TEXTFIELD IN THE CURRENT FRAME
    private void clearTextField(){
        JTextField temp=null;
        for(Component clr:jPanel3.getComponents()){ //CLEAR ALL TEXTFIELD IN JPANEL3
            if(clr.getClass().toString().contains("javax.swing.JTextField")){
            temp=(JTextField)clr;
            temp.setText("");
            }//END IF
        }//END FOR
        
        for(Component clr:mkPanel.getComponents()){ //CLEAR ALL TEXTFIELD IN MKPANEL
            if(clr.getClass().toString().contains("javax.swing.JTextField")){
            temp=(JTextField)clr;
            temp.setText("");
            }//END IF
        }//END FOR
        
        txtProdID.setText(Integer.toString(getLine())); //UPDATE LINE NO TO MAINTAIN PRODUCT ID VALUE
    }//END METHOD CLEARTEXTFIELD
    
    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        //BUTTON TO CLEAR/RESET ALL TEXTFIELD
        clearTextField(); //CALL OUT METHOD TO CLEAR TEXTFIELD
    }//GEN-LAST:event_jbClearActionPerformed

    private void jbCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloseActionPerformed
        dispose();
    }//GEN-LAST:event_jbCloseActionPerformed
     
    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        
        saveProducts(); //CALL METHOD SAVEPRODUCTS
       
    }//GEN-LAST:event_jbSaveActionPerformed

    private void txtProdIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProdIDMousePressed
        playExclamation();
        new msgBox("Product ID cannot be modified.\nIt is an auto generated by the program !","WARNING").showwarningMsg();
    }//GEN-LAST:event_txtProdIDMousePressed
    
    //METHOD TO SAVE PRODUCTS FOR EACH CATEGORY BY FETCHING VALUE IN TEXTFIELD
    public void saveProducts(){
        
        //USING TRY CATCH
        try {
        
        //DECLARE VARIABLE TO FETCH VALUE FROM TEXTFIELD
        int prodID = Integer.parseInt(txtProdID.getText());
        String prodName = txtProdName.getText();
        int qty = Integer.parseInt(txtQty.getText());
        double price = Double.parseDouble(txtPrice.getText());
        String brand = txtBrand.getText();
        String model = txtModel.getText();
                
        //USING IF TO DETERMINE PRODUCT
          //MATCH STRING ITEM VALUE FROM COMBOBOX
        if (jcbType.getSelectedItem() == "Desktop") {
            
            //FOR COMPUTER
            String compName = txtcompName.getText();
            int compSerial = Integer.parseInt(txtcompSerial.getText());
            String compProc = txtcompProc.getText();
            int compRam = Integer.parseInt(txtcompRam.getText());
            int compStorage = Integer.parseInt(txtcompStorage.getText());
            
            //DECLARE BOOLEAN VARIABLE TO SET COMPUTER TYPE
            boolean isDesktop = true;
            boolean isLaptop = false;
            
            //FETCH DESKTOP CATEGORY VALUE
            String dsktpCategory = txtcompCategory.getText();
            
            //CREATE NEW OBJECT TO ADD DESKTOP PRODUCT(S)
            Desktop addDsktp = new Desktop();
            
            //INVOKE METHOD WITH PARAMETER
            addDsktp.setProductId(prodID);
            addDsktp.setProductName(prodName);
            addDsktp.setProductQty(qty);
            addDsktp.setProductPrice(price);
            addDsktp.setProductBrand(brand);
            addDsktp.setProductModel(model);
            addDsktp.setComputerName(compName);
            addDsktp.setComputerSerial(compSerial);
            addDsktp.setComputerProcessor(compProc);
            addDsktp.setComputerRam(compRam);
            addDsktp.setComputerStorage(compStorage);
            addDsktp.setIsDesktop(isDesktop);
            addDsktp.setIsLaptop(isLaptop);
            addDsktp.setComputerCategory(dsktpCategory);
            
            System.out.println(addDsktp);
                    
            timer = new Timer(80, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   i++;
                     if(i==1){
                         dispose();//CLOSE FRAME
                         addLoad.setVisible(true);
                         addLoad.lbladdLoad.setText("Preparing to append data . . .");
                     }//END IF

                     if(i==15){
                         addLoad.lbladdLoad.setText("Writing data . . . ");       
                     }//END IF
                     
                    if(i==18){
                         addLoad.lbladdLoad.setText("Writing data | Product ID : " + prodID + " . . .");       
                    }//END IF
                    
                    if(i==21){
                         addLoad.lbladdLoad.setText("Writing data | Product Name : " + prodName + " . . .");       
                    }//END IF
                    
                    if(i==24){
                         addLoad.lbladdLoad.setText("Writing data | Quantity : " + qty + " . . .");       
                    }//END IF
                    
                    if(i==27){
                         addLoad.lbladdLoad.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==30){
                         addLoad.lbladdLoad.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==33){
                         addLoad.lbladdLoad.setText("Writing data | Brand : " + brand + " . . .");       
                    }//END IF                    

                    if(i==36){
                         addLoad.lbladdLoad.setText("Writing data | Model : " + model + " . . .");       
                    }//END IF 
                    
                    if(i==39){
                         addLoad.lbladdLoad.setText("Finalizing . . .");       
                    }//END IF 
                        
                    if(i==59){
                    addLoad.setVisible(false);
                    addDsktp.appenddataDsktp(); //CHECK IF TXT FILE IS EXISTS AND ADD PRODUCT TO TXT FILE
                    playExclamation();
                    dispose();
                    savecallMsgBox(prodID, prodName); //CALL THIS METHOD TO SAVE AND DISPLAY MSGBOX
                     }//END IF
                    
                     if(i>60){
                         timer.stop();
                         i=0;
                     }//END IF
                }//END PUBLIC VOID
                });
            timer.start();

     
        }
        else
        if (jcbType.getSelectedItem() == "Laptop") {
            //FOR COMPUTER
            String compName = txtcompName.getText();
            int compSerial = Integer.parseInt(txtcompSerial.getText());
            String compProc = txtcompProc.getText();
            int compRam = Integer.parseInt(txtcompRam.getText());
            int compStorage = Integer.parseInt(txtcompStorage.getText());
            
            //DECLARE BOOLEAN VARIABLE TO SET COMPUTER TYPE
            boolean isDesktop = false;
            boolean isLaptop = true;
            
            //FETCH LAPTOP CATEGORY VALUE
            String lptpCategory = txtlapCategory.getText();
            double lptpWeight = Double.parseDouble(txtlapWeight.getText());
            
            //CREATE NEW OBJECT TO ADD LAPTOP PRODUCT(S)
            Laptop addLptp = new Laptop();
            
            //INVOKE METHOD WITH PARAMETER
            addLptp.setProductId(prodID);
            addLptp.setProductName(prodName);
            addLptp.setProductQty(qty);
            addLptp.setProductPrice(price);
            addLptp.setProductBrand(brand);
            addLptp.setProductModel(model);
            addLptp.setComputerName(compName);
            addLptp.setComputerSerial(compSerial);
            addLptp.setComputerProcessor(compProc);
            addLptp.setComputerRam(compRam);
            addLptp.setComputerStorage(compStorage);
            addLptp.setIsDesktop(isDesktop);
            addLptp.setIsLaptop(isLaptop);
            addLptp.setLaptopCategory(lptpCategory);
            addLptp.setLaptopWeight(lptpWeight);
            
            System.out.println(addLptp);
             timer = new Timer(80, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   i++;
                     if(i==1){
                         dispose();//CLOSE FRAME
                         addLoad.setVisible(true);
                         addLoad.lbladdLoad.setText("Preparing to append data . . .");
                     }//END IF

                     if(i==15){
                         addLoad.lbladdLoad.setText("Writing data . . . ");       
                     }//END IF
                     
                    if(i==18){
                         addLoad.lbladdLoad.setText("Writing data | Product ID : " + prodID + " . . .");       
                    }//END IF
                    
                    if(i==21){
                         addLoad.lbladdLoad.setText("Writing data | Product Name : " + prodName + " . . .");       
                    }//END IF
                    
                    if(i==24){
                         addLoad.lbladdLoad.setText("Writing data | Quantity : " + qty + " . . .");       
                    }//END IF
                    
                    if(i==27){
                         addLoad.lbladdLoad.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==30){
                         addLoad.lbladdLoad.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==33){
                         addLoad.lbladdLoad.setText("Writing data | Brand : " + brand + " . . .");       
                    }//END IF                    

                    if(i==36){
                         addLoad.lbladdLoad.setText("Writing data | Model : " + model + " . . .");       
                    }//END IF 
                    
                    if(i==59){
                         addLoad.lbladdLoad.setText("Finalizing . . .");       
                    }//END IF 
                        
                    if(i==60){
                    addLoad.setVisible(false);
                    addLptp.appenddataLptp(); //CHECK IF TXT FILE IS EXISTS AND ADD PRODUCT TO TXT FILE
                    playExclamation();
                    dispose();
                    savecallMsgBox(prodID, prodName); //CALL THIS METHOD TO SAVE AND DISPLAY MSGBOX
                     }//END IF
                    
                     if(i>51){
                         timer.stop();
                         i=0;
                     }//END IF
                }//END PUBLIC VOID
                });
            timer.start();

        }
        else
        if (jcbType.getSelectedItem() == "Smartphone") {
        
            //FOR MOBILE DEVICE
            String devName = txtdevName.getText();
            int devImei = Integer.parseInt(txtdevImei.getText());
            int devRam = Integer.parseInt(txtdevRam.getText());
            int devStorage = Integer.parseInt(txtdevStorage.getText());
            double devWeight = Double.parseDouble(txtdevWeight.getText());            
            
            //DECLARE BOOLEAN VARIABLE TO SET MOBILE DEVICE TYPE
            boolean isSmartphone = true;
            boolean isTablet = false;
            
            //FETCH SMARTPHONE CATEGORY VALUE
            String spCategory = txtspCategory.getText();
            
            //CREATE NEW OBJECT TO ADD SMARTPHONE PRODUCT(S)
            Smartphone addSmrtphne = new Smartphone();
            
            //INVOKE METHOD WITH PARAMETER
            addSmrtphne.setProductId(prodID);
            addSmrtphne.setProductName(prodName);
            addSmrtphne.setProductQty(qty);
            addSmrtphne.setProductPrice(price);
            addSmrtphne.setProductBrand(brand);
            addSmrtphne.setProductModel(model);
            addSmrtphne.setDeviceName(devName);
            addSmrtphne.setDeviceImei(devImei);
            addSmrtphne.setDeviceRam(devRam);
            addSmrtphne.setDeviceStorage(devStorage);
            addSmrtphne.setDeviceWeight(devWeight);
            addSmrtphne.setIsSmartphone(isSmartphone);
            addSmrtphne.setIsTablet(isTablet);
            addSmrtphne.setSmartphoneCategory(spCategory);
            
            System.out.println(addSmrtphne);
             timer = new Timer(80, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   i++;
                     if(i==1){
                         dispose();//CLOSE FRAME
                         addLoad.setVisible(true);
                         addLoad.lbladdLoad.setText("Preparing to append data . . .");
                     }//END IF

                     if(i==15){
                         addLoad.lbladdLoad.setText("Writing data . . . ");       
                     }//END IF
                     
                    if(i==18){
                         addLoad.lbladdLoad.setText("Writing data | Product ID : " + prodID + " . . .");       
                    }//END IF
                    
                    if(i==21){
                         addLoad.lbladdLoad.setText("Writing data | Product Name : " + prodName + " . . .");       
                    }//END IF
                    
                    if(i==24){
                         addLoad.lbladdLoad.setText("Writing data | Quantity : " + qty + " . . .");       
                    }//END IF
                    
                    if(i==27){
                         addLoad.lbladdLoad.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==30){
                         addLoad.lbladdLoad.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==33){
                         addLoad.lbladdLoad.setText("Writing data | Brand : " + brand + " . . .");       
                    }//END IF                    

                    if(i==36){
                         addLoad.lbladdLoad.setText("Writing data | Model : " + model + " . . .");       
                    }//END IF 
                    
                    if(i==59){
                         addLoad.lbladdLoad.setText("Finalizing . . .");       
                    }//END IF 
                        
                    if(i==60){
                    addLoad.setVisible(false);
                    addSmrtphne.appenddataSmartphone(); //CHECK IF TXT FILE IS EXISTS AND ADD PRODUCT TO TXT FILE
                    playExclamation();
                    dispose();
                    savecallMsgBox(prodID, prodName); //CALL THIS METHOD TO SAVE AND DISPLAY MSGBOX
                     }//END IF
                    
                     if(i>51){
                         timer.stop();
                         i=0;
                     }//END IF
                }//END PUBLIC VOID
                });
            timer.start();
            
        }
        else
        if (jcbType.getSelectedItem() == "Tablet") {
            //FOR MOBILE DEVICE
            String devName = txtdevName.getText();
            int devImei = Integer.parseInt(txtdevImei.getText());
            int devRam = Integer.parseInt(txtdevRam.getText());
            int devStorage = Integer.parseInt(txtdevStorage.getText());
            double devWeight = Double.parseDouble(txtdevWeight.getText());            
                
            //DECLARE BOOLEAN VARIABLE TO SET MOBILE DEVICE TYPE
            boolean isSmartphone = false;
            boolean isTablet = true;
            
            //FETCH TABLET CATEGORY VALUE
            String tbCategory = txttbCategory.getText();
            
            //CREATE NEW OBJECT TO ADD TABLET PRODUCT(S)
            Tablet addTab = new Tablet();
            
            //INOKE METHOD WITH PARAMETER
            addTab.setProductId(prodID);
            addTab.setProductName(prodName);
            addTab.setProductQty(qty);
            addTab.setProductPrice(price);
            addTab.setProductBrand(brand);
            addTab.setProductModel(model);
            addTab.setDeviceName(devName);
            addTab.setDeviceImei(devImei);
            addTab.setDeviceRam(devRam);
            addTab.setDeviceStorage(devStorage);
            addTab.setDeviceWeight(devWeight);
            addTab.setIsSmartphone(isSmartphone);
            addTab.setIsTablet(isTablet);
            addTab.setTabletCategory(tbCategory);
            
            System.out.println(addTab);
            
             timer = new Timer(80, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   i++;
                     if(i==1){
                         dispose();//CLOSE FRAME
                         addLoad.setVisible(true);
                         addLoad.lbladdLoad.setText("Preparing to append data . . .");
                     }//END IF

                     if(i==15){
                         addLoad.lbladdLoad.setText("Writing data . . . ");       
                     }//END IF
                     
                    if(i==18){
                         addLoad.lbladdLoad.setText("Writing data | Product ID : " + prodID + " . . .");       
                    }//END IF
                    
                    if(i==21){
                         addLoad.lbladdLoad.setText("Writing data | Product Name : " + prodName + " . . .");       
                    }//END IF
                    
                    if(i==24){
                         addLoad.lbladdLoad.setText("Writing data | Quantity : " + qty + " . . .");       
                    }//END IF
                    
                    if(i==27){
                         addLoad.lbladdLoad.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==30){
                         addLoad.lbladdLoad.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==33){
                         addLoad.lbladdLoad.setText("Writing data | Brand : " + brand + " . . .");       
                    }//END IF                    

                    if(i==36){
                         addLoad.lbladdLoad.setText("Writing data | Model : " + model + " . . .");       
                    }//END IF 
                    
                    if(i==59){
                         addLoad.lbladdLoad.setText("Finalizing . . .");       
                    }//END IF 
                        
                    if(i==60){
                    addLoad.setVisible(false);
                    addTab.appenddataTablet(); //CHECK IF TXT FILE IS EXISTS AND ADD PRODUCT TO TXT FILE
                    playExclamation();
                    dispose();
                    savecallMsgBox(prodID, prodName); //CALL THIS METHOD TO SAVE AND DISPLAY MSGBOX
                     }//END IF
                    
                     if(i>51){
                         timer.stop();
                         i=0;
                     }//END IF
                }//END PUBLIC VOID
                });
            timer.start();

        }//END IF
        } catch (InputMismatchException e){
            new msgBox("Some value in textfield cannot be left empty or nulled.\nPlease try again !","ERROR").showerrorMsg();
        } catch (NumberFormatException e) {
            new msgBox("Some value in textfield required number format only.\nPlease try again !","ERROR").showerrorMsg();
        }//END TRY CATCH
        
         txtProdID.setText(Integer.toString(getLine())); //UPDATE LINE NO TO MAINTAIN PRODUCT ID VALUE
         
    }//END METHOD SAVEPRODUCTS
    
    
    private void savecallMsgBox(int prodID, String prodName){
            String message = "A product has been added."
                             + " \n  Product ID   : " + prodID
                             + " \n  Product Name : " + prodName
                             + " \n  Product Type : " + jcbType.getSelectedItem() +"\n";
            new msgBox(message,"PRODUCT ADDED !").showinfoMsg();
            clearTextField();
            txtProdID.setText(Integer.toString(getLine())); //UPDATE LINE NO AND PRODUCT ID    
    }//END METHOD
    
    //METHOD TO PLAY EXCLAMATION SOUND FOR MSGBOX
    private void playExclamation(){
        final Runnable runnable =
        (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.asterisk");
        if (runnable != null) runnable.run();
    }//END METHOD
 
    //PANEL TO SHOW TEXTFIELD FOR PRODUCT DESKTOP
     private void makeDesktopPanel(){
        mkPanel.removeAll();
        mkPanel.setLayout(new GridBagLayout());
        mkPanel.setBorder(BorderFactory.createTitledBorder("Desktop"));
        
        GridBagConstraints c = new GridBagConstraints();  
        
        //Y-AXIS = 0 | FOR comName
        //GRID (0,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 0;  
        mkPanel.add(lblcompName,c);
        
        //GRID (1,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 0;  
        mkPanel.add(txtcompName,c);
        
        //Y-AXIS = 1 | FOR compSerial
        //GRID (0,1)
        c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 1;  
        mkPanel.add(lblcompSerial,c);
        
        //GRID (1,1)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 1;  
        mkPanel.add(txtcompSerial,c);
        
        //Y-AXIS = 2 | FOR compProc
        //GRID (0,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 2; 
        mkPanel.add(lblcompProc,c);
        
        //GRID (1,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 2;
        mkPanel.add(txtcompProc,c);
        
        //Y-AXIS = 3 | FOR compRam
        //GRID (0,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 3;
        mkPanel.add(lblcompRam,c);
        
        //GRID (1,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 3;
        mkPanel.add(txtcompRam,c);
        
        //Y-AXIS = 4 | FOR comStorage
        //GRID (0,4)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 4;
        mkPanel.add(lblcompStorage,c);
        
        //GRID (1,4)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 4;
        mkPanel.add(txtcompStorage,c);
        
        //Y-AXIS = 5 | FOR comCategory
        //GRID (0,5)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 5;
        mkPanel.add(lblcomCategory,c);
        
        //GRID (1,5)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 5;
        mkPanel.add(txtcompCategory,c);
        
        //REFRESH PANEL
        mkPanel.revalidate();
        mkPanel.repaint();
 }//END METHOD DESKTOP PANEL
 
    //PANEL TO SHOW TEXTFIELD FOR PRODUCT LAPTOP
    private void makeLaptopPanel(){
     mkPanel.removeAll();
     mkPanel.setLayout(new GridBagLayout());
     mkPanel.setBorder(BorderFactory.createTitledBorder("Laptop"));
     
    GridBagConstraints c = new GridBagConstraints();
    
        //Y-AXIS = 0 | FOR compName
        //GRID (0,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 0;  
        mkPanel.add(lblcompName,c);
        
        //GRID (1,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 0;  
        mkPanel.add(txtcompName,c);
        
        //Y-AXIS = 1 | FOR compSerial
        //GRID (0,1)
        c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 1;  
        mkPanel.add(lblcompSerial,c);

        //GRID (1,1)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 1;  
        mkPanel.add(txtcompSerial,c);
        
        //Y-AXIS = 2 | FOR compProc
        //GRID (0,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 2; 
        mkPanel.add(lblcompProc,c);
        
        //GRID (1,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 2;
        mkPanel.add(txtcompProc,c);
        
        //Y-AXIS = 3 | FOR compRam
        //GRID (0,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 3;
        mkPanel.add(lblcompRam,c);
        
        //GRID (1,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 3;
        mkPanel.add(txtcompRam,c);
        
        //Y-AXIS = 4 | FOR compStorage
        //GRID (0,4)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 4;
        mkPanel.add(lblcompStorage,c);
        
        //GRID (1,4)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 4;
        mkPanel.add(txtcompStorage,c);  
        
        //Y-AXIS = 5 | FOR lapCategory
        //GRID (0,5)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 5;
        mkPanel.add(lbllapCategory,c);
        
        //GRID (1,5)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 5;
        mkPanel.add(txtlapCategory,c);
        
        //Y-AXIS = 6 | FOR lapWeight
        //GRID (0,6)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 6;
        mkPanel.add(lbllapWeight,c);
        
        //GRID (1,6)        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 6;
        mkPanel.add(txtlapWeight,c);
        
        //UPDATE PANEL
        mkPanel.revalidate();
        mkPanel.repaint();
        
 }//END METHOD LAPTOP PANEL
 
    //PANEL TO SHOW TEXTFIELD FOR PRODUCT SMARTPHONE
    private void makeSmartphonePanel(){
     mkPanel.removeAll();
     mkPanel.setLayout(new GridBagLayout());
     mkPanel.setBorder(BorderFactory.createTitledBorder("Smartphone"));
     
      GridBagConstraints c = new GridBagConstraints();  

      //Y-AXIS = 0 | FOR devName
      //GRID (0,0)      
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 0;  
      mkPanel.add(lbldevName,c);
      
      //GRID (1,0)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 0;
      mkPanel.add(txtdevName,c);
      
      //Y-AXIS = 1 | FOR devImei
      //GRID (0,1)
      c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 1;
      mkPanel.add(lbldevImei,c);
      
      //GRID (1,1)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 1;
      mkPanel.add(txtdevImei,c);
      
      //Y-AXIS = 2 | FOR devRam
      //GRID (0,2)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 2;
      mkPanel.add(lbldevRam,c);
      
      //GRID (1,2)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 2;
      mkPanel.add(txtdevRam,c);
      
      //Y-AXIS = 3 | FOR devStorage
      //GRID (0,3)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 3;
      mkPanel.add(lbldevStorage,c);
      
      //GRID (1,3)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 3;
      mkPanel.add(txtdevStorage,c);
      
      //Y-AXIS = 4 | FOR devWeight
      //GRID (0,4)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 4;
      mkPanel.add(lbldevWeight,c);
      
      //GRID (1,4)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 4;
      mkPanel.add(txtdevWeight,c);
      
      //Y-AXIS = 5 | FOR spCategory
      //GRID (0,5)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 5;
      mkPanel.add(lblspCategory,c);
      
      //GRID (1,5)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 5;
      mkPanel.add(txtspCategory,c);
      
      //UPDATE PANEL
      mkPanel.revalidate();
      mkPanel.repaint();
 }//END METHOD SMARTPHONE PANEL
    
    //PANEL TO SHOW TEXTFIELD FOR PRODUCT TABLET
    private void makeTabletPanel(){
     mkPanel.removeAll();
     mkPanel.setLayout(new GridBagLayout());
     mkPanel.setBorder(BorderFactory.createTitledBorder("Tablet"));

      //Y-AXIS = 0 | FOR devName
      //GRID (0,0)     
      GridBagConstraints c = new GridBagConstraints();  
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 0;  
      mkPanel.add(lbldevName,c);
      
      //GRID (1,0)  
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 0;
      mkPanel.add(txtdevName,c);
      
      //Y-AXIS = 1 | FOR devImei
      //GRID (0,0)   
      c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 1;
      mkPanel.add(lbldevImei,c);
      
      //GRID (1,1)  
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 1;
      mkPanel.add(txtdevImei,c);
      
      //Y-AXIS = 2 | FOR devRam
      //GRID (0,2)      
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 2;
      mkPanel.add(lbldevRam,c);
      
      //GRID (1,2) 
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 2;
      mkPanel.add(txtdevRam,c);
      
      //Y-AXIS = 3 | FOR devStorage
      //GRID (0,3)           
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 3;
      mkPanel.add(lbldevStorage,c);
      
      //GRID (1,3) 
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 3;
      mkPanel.add(txtdevStorage,c);
      
      //Y-AXIS = 4 | FOR devWeight
      //GRID (0,4)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 4;
      mkPanel.add(lbldevWeight,c);
      
      //GRID (1,4)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 4;
      mkPanel.add(txtdevWeight,c);

      //Y-AXIS = 5 | FOR tbCategory
      //GRID (0,5)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 0;  
      c.gridy = 5;
      mkPanel.add(lbltbCategory,c);
      
      //GRID (1,5)
      c.fill = GridBagConstraints.HORIZONTAL;
      c.gridx = 1;  
      c.gridy = 5;
      mkPanel.add(txttbCategory,c);
      
      //UPDATE PANEL
      mkPanel.revalidate();
      mkPanel.repaint();
 }//END METHOD TABLET PANEL
    
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
            java.util.logging.Logger.getLogger(frmAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdd().setVisible(true);
                
            }//END METHOD
        });
    }//END MAIN

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbSave;
    private javax.swing.JComboBox<String> jcbCategory;
    private javax.swing.JComboBox<String> jcbType;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProdID;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblQty;
    private javax.swing.JPanel mkPanel;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdID;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
