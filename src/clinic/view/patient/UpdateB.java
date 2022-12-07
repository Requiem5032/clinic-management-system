package clinic.view.patient;

import clinic.view.MainPage;
import javax.swing.JOptionPane;
import clinic.controller.PatientController;

public class UpdateB extends javax.swing.JFrame {
  public UpdateB() {
    initComponents();
  }

  private void initComponents() {
    jLabel1 = new javax.swing.JLabel();
    jScrollBar1 = new javax.swing.JScrollBar();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    firstNameTextField = new javax.swing.JTextField();
    lastNameTextField = new javax.swing.JTextField();
    ageTextField = new javax.swing.JTextField();
    addressTextField = new javax.swing.JTextField();
    genderTextField = new javax.swing.JTextField();
    backButton = new javax.swing.JButton();
    updateButton = new javax.swing.JButton();
    homeButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setFocusable(false);
    setFocusableWindowState(false);
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Patient table ");

    jLabel3.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel3.setText("First Name");

    jLabel4.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel4.setText("Last Name");

    jLabel6.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel6.setText("Age");

    jLabel7.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel7.setText("Address");

    jLabel8.setFont(new java.awt.Font("Titillium Web", 0, 24));
    jLabel8.setText("Gender");

    backButton.setText("Cancel");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    updateButton.setText("Update");
    updateButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateButtonActionPerformed(evt);
      }
    });

    homeButton.setBackground(new java.awt.Color(243, 243, 243));
    homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png")));
    homeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(219, 219, 219).addComponent(jLabel1,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(210, 210, 210)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35).addComponent(firstNameTextField,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(210, 210, 210)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38).addComponent(lastNameTextField,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(210, 210, 210)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(57, 57, 57).addComponent(ageTextField,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(210, 210, 210)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(57, 57, 57)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 540,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createSequentialGroup().addGap(689, 689, 689)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(1072, 1072, 1072).addComponent(
                    jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(34, 34, 34)));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(6, 6, 6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeButton).addComponent(jLabel1))
            .addGap(83, 83, 83)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(13, 13, 13)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(47, 47, 47).addComponent(jLabel4,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(57, 57, 57).addComponent(
                    lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                    javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(37, 37, 37)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(50, 50, 50)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(83, 83, 83)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(6, 6, 6).addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
    pack();
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    HomePage back = new HomePage();
    back.setVisible(true);
    this.dispose();
  }

  private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (firstNameTextField.getText().equals("") || lastNameTextField.getText().equals("")
        || genderTextField.getText().equals("") || ageTextField.getText().equals("")
        || addressTextField.getText().equals("")) {
      JOptionPane.showMessageDialog(this, "Please enter data to search!");
    } else {
      try {
      JOptionPane.showMessageDialog(this, "Update data sucessefully!");
      } catch (Exception e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(this, "Update failed!");
      }
    }
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
      java.util.logging.Logger.getLogger(UpdateB.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(UpdateB.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(UpdateB.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(UpdateB.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new UpdateB().setVisible(true);
      }
    });
  }

  private javax.swing.JTextField addressTextField;
  private javax.swing.JTextField ageTextField;
  private javax.swing.JButton backButton;
  private javax.swing.JTextField firstNameTextField;
  private javax.swing.JTextField genderTextField;
  private javax.swing.JButton homeButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JScrollBar jScrollBar1;
  private javax.swing.JTextField lastNameTextField;
  private javax.swing.JButton updateButton;
  private PatientController patCtrl = new PatientController();
}
