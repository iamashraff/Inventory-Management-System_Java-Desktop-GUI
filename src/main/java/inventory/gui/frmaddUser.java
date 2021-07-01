/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory.gui;

import inventory.code.Staff;
import static inventory.gui.frmAdd.getLine;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTextField;

/**
 *
 * @author Muhamad Ashraff
 */
public class frmaddUser extends javax.swing.JFrame {

    /**
     * Creates new form addUser
     */
    public frmaddUser() {
        initComponents();
        lblpassChecker.setText("");
        lblpostcodeChecker.setText("");
        txtStaffID.setText(Integer.toString(getLine()));
        jbCreateAcc.setEnabled(false);
    }//DEFAULT CONSTRUCTOR
    

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelAccountdetails = new javax.swing.JPanel();
        lblStaffID = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPassConfirm = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtPassConfirm = new javax.swing.JPasswordField();
        lblpassChecker = new javax.swing.JLabel();
        jcbStaffRole = new javax.swing.JComboBox<>();
        lblStaffRole = new javax.swing.JLabel();
        panelStaffdetails = new javax.swing.JPanel();
        lblFname = new javax.swing.JLabel();
        lblMname = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblHouseno = new javax.swing.JLabel();
        lblBuilding = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblPostcode = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtFname = new javax.swing.JTextField();
        txtMname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtHouseno = new javax.swing.JTextField();
        txtBuilding = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lblpostcodeChecker = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jbCreateAcc = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Account");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(181, 79, 119));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Staff Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(477, Short.MAX_VALUE))
        );

        panelAccountdetails.setBackground(new java.awt.Color(255, 255, 255));
        panelAccountdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblStaffID.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblStaffID.setText("Staff ID :");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPassword.setText("Password :");

        lblPassConfirm.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPassConfirm.setText("Confirm Password :");

        jPanel4.setBackground(new java.awt.Color(48, 213, 200));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account Credentials");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        txtStaffID.setEditable(false);
        txtStaffID.setBackground(new java.awt.Color(255, 255, 255));
        txtStaffID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtStaffID.setForeground(new java.awt.Color(0, 204, 204));
        txtStaffID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtStaffIDMousePressed(evt);
            }
        });

        txtPassConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassConfirmKeyReleased(evt);
            }
        });

        lblpassChecker.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblpassChecker.setForeground(new java.awt.Color(255, 0, 102));
        lblpassChecker.setText("notifypassnotmatch");

        jcbStaffRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Staff" }));

        lblStaffRole.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblStaffRole.setText("Role :");

        javax.swing.GroupLayout panelAccountdetailsLayout = new javax.swing.GroupLayout(panelAccountdetails);
        panelAccountdetails.setLayout(panelAccountdetailsLayout);
        panelAccountdetailsLayout.setHorizontalGroup(
            panelAccountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelAccountdetailsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelAccountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStaffID)
                    .addComponent(lblPassword)
                    .addComponent(lblPassConfirm)
                    .addComponent(lblStaffRole))
                .addGap(18, 18, 18)
                .addGroup(panelAccountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpassChecker)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(txtStaffID)
                    .addComponent(txtPassConfirm, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbStaffRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAccountdetailsLayout.setVerticalGroup(
            panelAccountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAccountdetailsLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panelAccountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStaffID)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAccountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbStaffRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStaffRole))
                .addGap(18, 18, 18)
                .addGroup(panelAccountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAccountdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassConfirm)
                    .addComponent(txtPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblpassChecker)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelStaffdetails.setBackground(new java.awt.Color(255, 255, 255));
        panelStaffdetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblFname.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblFname.setText("First Name :");

        lblMname.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMname.setText("Middle Name :");

        lblLname.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblLname.setText("Last Name :");

        jPanel6.setBackground(new java.awt.Color(48, 213, 200));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Staff Details");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHouseno.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblHouseno.setText("House No :");

        lblBuilding.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblBuilding.setText("Building :");

        lblStreet.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblStreet.setText("Street :");

        lblPostcode.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblPostcode.setText("Postcode :");

        lblCity.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblCity.setText("City :");

        lblState.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblState.setText("State :");

        txtPostcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPostcodeKeyReleased(evt);
            }
        });

        lblpostcodeChecker.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblpostcodeChecker.setForeground(new java.awt.Color(255, 0, 102));
        lblpostcodeChecker.setText("notifypostcodenotint");

        javax.swing.GroupLayout panelStaffdetailsLayout = new javax.swing.GroupLayout(panelStaffdetails);
        panelStaffdetails.setLayout(panelStaffdetailsLayout);
        panelStaffdetailsLayout.setHorizontalGroup(
            panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStaffdetailsLayout.createSequentialGroup()
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelStaffdetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(panelStaffdetailsLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFname)
                            .addComponent(lblMname)
                            .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHouseno)
                                    .addComponent(lblBuilding)
                                    .addComponent(lblStreet)
                                    .addComponent(lblPostcode)
                                    .addComponent(lblCity)
                                    .addComponent(lblState))
                                .addComponent(lblLname)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpostcodeChecker)
                            .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHouseno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBuilding, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPostcode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );
        panelStaffdetailsLayout.setVerticalGroup(
            panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStaffdetailsLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFname)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMname)
                    .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLname)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseno)
                    .addComponent(txtHouseno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuilding)
                    .addComponent(txtBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPostcode)
                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelStaffdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblpostcodeChecker, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(181, 79, 119));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create new account");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jbCreateAcc.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jbCreateAcc.setText("Create account");
        jbCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCreateAccActionPerformed(evt);
            }
        });

        jbClear.setText("Clear");
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelStaffdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelAccountdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(panelAccountdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelStaffdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCreateAcc)
                    .addComponent(jbClear))
                .addGap(0, 11, Short.MAX_VALUE))
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
    
    //METHOD TO VALIDATE STAFF ROLE
    public void validateUser(int n){
        //VARIABLE DECLARATION AND ASSIGNMENT  
      String strPath = "C:/Staff.txt";
      n = n-1;
      String line;
      
      //USING TRY CATCH BLOCKS
      try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
          
           //USING FOR LOOP
          for (int i = 0; i < n; i++)
              br.readLine();
          line = br.readLine();
          String[] staffDetails = line.split(","); //SPLIT COMMA IN A LINE
          String staffRoles = staffDetails[11];
          
          if (!staffRoles.equals("Administrator")){
              playExclamation();
              dispose();
              new msgBox("Your account doesn't have\npermission to create a new staff account.\nPlease contact your system administrator !","Access Denied !").showwarningMsg();
              
          }//END IF
          
      }
      catch(IOException e){
        System.out.println(e);
      }catch (IndexOutOfBoundsException e){
        new msgBox("Data Not Found !","ERROR").showinfoMsg();
      }//END TRY CATCH
      
    }//END METHOD
    
    
    //METHOD TO GET VALUE OF STAFF ID
       //FOR AUTO INCREMENT
    public static int getLine(){
        String strPath = "C:/Staff.txt"; //SET TXT PATH VALUE
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(strPath))) {
          while (reader.readLine() != null) lines++;
        } catch (IOException e) {
          e.printStackTrace();
        }//END TRY CATCH
        return lines+1;
    }//END METHOD
    
    
    //METHOD TO FETCH VALUE FROM JTEXTFIELD AND CREATE NEW STAFF ACCOUNT
    private void addnewStaff(){
        //ASSIGN VALUE FROM JTEXTFIELD INTO VARIABLE DECLARED
        int staffId = Integer.parseInt(txtStaffID.getText());
        String staffRole = jcbStaffRole.getSelectedItem().toString();
        String staffPass = String.valueOf(txtPassConfirm.getPassword());
        String fName = txtFname.getText();
        String mName = txtMname.getText();
        String lName = txtLname.getText();
        String houseNo = txtHouseno.getText();
        String building = txtBuilding.getText();
        String street = txtStreet.getText();
        int postcode = Integer.parseInt(txtPostcode.getText());
        String city = txtCity.getText();
        String state = txtState.getText();
        
        //CREATE OBJECT STAFF AND INVOKE WITH PARAMETER
        Staff addStaff = new Staff(staffId, staffPass,fName,mName,lName,houseNo,building,street,postcode,city,state,staffRole);
        System.out.println(addStaff);
        playExclamation();
        dispose();
        //SHOW SUCCESS MSGBOX
        String message = "A new staff account has been successfully created !\n "
                         +"Staff ID : " + staffId + "\n"
                         +"Staff Name : " + fName + " " + mName + " " + lName + "\n";                
        new msgBox(message,"New staff account").showinfoMsg();
        frmviewUser viewUser = new frmviewUser();
        viewUser.setVisible(true);
        
    }//END METHOD
    
    //METHOD TO PLAY EXCLAMATION SOUND FOR MSGBOX
    private void playExclamation(){
        final Runnable runnable =
        (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.asterisk");
        if (runnable != null) runnable.run();
    }//END METHOD
    
    private void jbCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCreateAccActionPerformed
        addnewStaff();
    }//GEN-LAST:event_jbCreateAccActionPerformed

    private void txtPassConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassConfirmKeyReleased
       //TEST PASSWORD CONFIRMATION
       String passTxt =  String.valueOf(txtPassword.getPassword());
       String passConfTxt = String.valueOf(txtPassConfirm.getPassword());
       
       if (passTxt.equals(passConfTxt)){
           lblpassChecker.setText("");
           jbCreateAcc.setEnabled(true);
       }
       else
       {
           lblpassChecker.setText("Password does not match.Please input again !");
           jbCreateAcc.setEnabled(false);
       }//END IF
    }//GEN-LAST:event_txtPassConfirmKeyReleased

    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        JTextField temp=null;
       txtPassword.setText("");
       txtPassConfirm.setText("");
        
         for(Component clr:panelStaffdetails.getComponents()){ //CLEAR ALL TEXTFIELD IN JPANEL3
            if(clr.getClass().toString().contains("javax.swing.JTextField")){
            temp=(JTextField)clr;
            temp.setText("");
            }//END IF
        }//END FOR
 
    }//GEN-LAST:event_jbClearActionPerformed

    private void txtPostcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPostcodeKeyReleased
        //USING TRY CATCH TO DETERMINE IF USER INPUT OF POSTCODE IS AN INTEGER FORMAT
        try {
        Integer.parseInt(txtPostcode.getText());
        lblpostcodeChecker.setText("");
        jbCreateAcc.setEnabled(true);
        }
        catch (NumberFormatException e) {
            lblpostcodeChecker.setText("Warning : Postcode must be numberic value only");
            jbCreateAcc.setEnabled(false);
        }//END TRY CATCH
    }//GEN-LAST:event_txtPostcodeKeyReleased

    private void txtStaffIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStaffIDMousePressed
        playExclamtion();
        new msgBox("Staff ID cannot be modified.\nIt is a unique identifier that been autogenerated by the program !","WARNING").showwarningMsg();
    }//GEN-LAST:event_txtStaffIDMousePressed

    //METHOD TO PLAY EXCLAMATION SOUND FOR MSGBOX
    private void playExclamtion(){
        final Runnable runnable =
        (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.asterisk");
        if (runnable != null) runnable.run();
    }//END METHOD
   
    
    
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
            java.util.logging.Logger.getLogger(frmaddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmaddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmaddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmaddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmaddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbCreateAcc;
    private javax.swing.JComboBox<String> jcbStaffRole;
    private javax.swing.JLabel lblBuilding;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblHouseno;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblMname;
    private javax.swing.JLabel lblPassConfirm;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPostcode;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JLabel lblStaffRole;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblpassChecker;
    private javax.swing.JLabel lblpostcodeChecker;
    private javax.swing.JPanel panelAccountdetails;
    private javax.swing.JPanel panelStaffdetails;
    private javax.swing.JTextField txtBuilding;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHouseno;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMname;
    private javax.swing.JPasswordField txtPassConfirm;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
