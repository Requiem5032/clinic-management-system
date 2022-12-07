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
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    addressTextField = new javax.swing.JTextField();
    addButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();
    homeButton = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    lastNameTextField = new javax.swing.JTextField();
    firstNameTextField = new javax.swing.JTextField();
    ageTextField = new javax.swing.JTextField();
    genderTextField = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Patient table ");

    jLabel2.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel2.setText("First Name");

    jLabel3.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel3.setText("Last Name");

    jLabel5.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel5.setText("Address");

    addButton.setText("Update");
    addButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addButtonActionPerformed(evt);
      }
    });

    backButton.setText("Cancel");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    homeButton.setBackground(new java.awt.Color(243, 243, 243));
    homeButton
        .setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic/view/icon/home.png")));
    homeButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeButtonActionPerformed(evt);
      }
    });

    jLabel10.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel10.setText("Age");

    jLabel11.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel11.setText("Gender");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(762, 762, 762)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30).addComponent(
                        backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(210, 210, 210)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52).addComponent(addressTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 542,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup().addGroup(layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(
                                    genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 542,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(
                                    firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 542,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup().addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameTextField,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 542,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52).addComponent(ageTextField,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 542,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
            .addContainerGap(8, Short.MAX_VALUE)));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(6, 6, 6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homeButton).addComponent(jLabel1,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(114, 114, 114)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(
                            layout.createSequentialGroup().addComponent(jLabel3).addGap(73, 73, 73))
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup().addGroup(layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33).addComponent(firstNameTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10).addComponent(ageTextField,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(40, 40, 40).addComponent(jLabel11))
                .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(38, 38, 38)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel5).addComponent(addressTextField,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(66, 66, 66)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(125, 125, 125)));
    pack();
  }

  private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (firstNameTextField.getText().equals("") || lastNameTextField.getText().equals("")
        || ageTextField.getText().equals("") || genderTextField.getText().equals("")
        || addressTextField.getText().equals("")) {
      JOptionPane.showMessageDialog(this, "Please enter all data!");
    } else {
      try {
        patCtrl.updateRecord(UpdateA.data, firstNameTextField.getText(),
            lastNameTextField.getText(), Integer.parseInt(ageTextField.getText()),
            Boolean.parseBoolean(genderTextField.getText()), addressTextField.getText());
        JOptionPane.showMessageDialog(this, "Update successfully!");
      } catch (Exception e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(this, "Update failed!");
      }
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    HomePage back = new HomePage();
    back.setVisible(true);
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

  private javax.swing.JButton addButton;
  private javax.swing.JTextField addressTextField;
  private javax.swing.JTextField ageTextField;
  private javax.swing.JButton backButton;
  private javax.swing.JTextField firstNameTextField;
  private javax.swing.JTextField genderTextField;
  private javax.swing.JButton homeButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JTextField lastNameTextField;
  private PatientController patCtrl = new PatientController();
}
