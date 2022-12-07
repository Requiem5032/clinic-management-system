package clinic.view.patient;

import clinic.view.MainPage;
import javax.swing.JOptionPane;
import clinic.controller.PatientController;

public class Add extends javax.swing.JFrame {
  public Add() {
    initComponents();
  }

  private void initComponents() {
    homeButton = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jScrollBar1 = new javax.swing.JScrollBar();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    NIDtextField = new javax.swing.JTextField();
    firstNameTextField = new javax.swing.JTextField();
    lastNameTextField = new javax.swing.JTextField();
    ageTextField = new javax.swing.JTextField();
    PIDtextField = new javax.swing.JTextField();
    addressTextField = new javax.swing.JTextField();
    genderTextField = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    backButton = new javax.swing.JButton();
    addButton = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setFocusable(false);
    setFocusableWindowState(false);
    setResizable(false);

    homeButton.setBackground(new java.awt.Color(243, 243, 243));
    homeButton
        .setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic/view/icon/home.png")));
    homeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeButtonActionPerformed(evt);
      }
    });

    homeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeButtonActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Patient table ");

    jLabel2.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel2.setText("NID");

    jLabel3.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel3.setText("First Name");

    jLabel4.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel4.setText("Last Name");

    jLabel6.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel6.setText("Age");

    jLabel8.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel8.setText("Gender");

    jLabel9.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel9.setText("PID");

    backButton.setText("Cancel");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    addButton.setText("Add");
    addButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addButtonActionPerformed(evt);
      }
    });

    jLabel10.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel10.setText("Address");

    jLabel5.setFont(new java.awt.Font("Titillium Web", 0, 20));
    jLabel5.setText("(6 digits)");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162,
                Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30).addComponent(backButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PIDtextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    540, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(
                                    addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(
                                    genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout
                                .createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NIDtextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    540, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                layout.createSequentialGroup().addComponent(jLabel3).addGap(18, 18,
                                    18).addComponent(firstNameTextField,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                layout.createSequentialGroup().addGroup(layout
                                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4).addComponent(
                                        jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(21, 21, 21)
                                    .addGroup(layout
                                        .createParallelGroup(
                                            javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lastNameTextField,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ageTextField,
                                            javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                                            javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(173, 173, 173).addComponent(
                            jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(jLabel1)))
            .addGap(34, 34, 34)));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1).addComponent(homeButton))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PIDtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27).addComponent(addressTextField,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(42, 42, 42)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(18, Short.MAX_VALUE)));
    pack();
  }

  private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (PIDtextField.getText().equals("") || NIDtextField.getText().equals("")
        || firstNameTextField.getText().equals("") || lastNameTextField.getText().equals("")
        || genderTextField.getText().equals("") || ageTextField.getText().equals("")
        || addressTextField.getText().equals("")) {
      JOptionPane.showMessageDialog(this, "Please enter all data!");
    } else {
      try {
        patCtrl.insertRecord(PIDtextField.getText(), NIDtextField.getText(),
            firstNameTextField.getText(), lastNameTextField.getText(),
            Integer.parseInt(ageTextField.getText()),
            Boolean.parseBoolean(genderTextField.getText()), addressTextField.getText());
        JOptionPane.showMessageDialog(this, "Add data sucessefully!");
      } catch (Exception e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(this, "Something went wrong!");
      }
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    HomePage cancel = new HomePage();
    cancel.setVisible(true);
    this.dispose();
  }

  private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {
    MainPage home = new MainPage();
    home.setVisible(true);
    this.dispose();
  }

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
          .getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE,
          null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE,
          null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE,
          null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE,
          null, ex);
    }
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Add().setVisible(true);
      }
    });
  }

  private javax.swing.JTextField NIDtextField;
  private javax.swing.JTextField PIDtextField;
  private javax.swing.JButton addButton;
  private javax.swing.JTextField addressTextField;
  private javax.swing.JTextField ageTextField;
  private javax.swing.JButton backButton;
  private javax.swing.JTextField firstNameTextField;
  private javax.swing.JTextField genderTextField;
  private javax.swing.JButton homeButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollBar jScrollBar1;
  private javax.swing.JTextField lastNameTextField;
  private PatientController patCtrl = new PatientController();
}
