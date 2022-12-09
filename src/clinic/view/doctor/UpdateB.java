package clinic.view.doctor;

import clinic.view.MainPage;
import javax.swing.JOptionPane;
import clinic.controller.DoctorController;

public class UpdateB extends javax.swing.JFrame {
  public UpdateB() {
    initComponents();
  }

  private void initComponents() {
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    updateButton = new javax.swing.JButton();
    firstNameTextField = new javax.swing.JTextField();
    positionTextField = new javax.swing.JTextField();
    lastNameTextField = new javax.swing.JTextField();
    backButton = new javax.swing.JButton();
    homeButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Doctor table");

    jLabel2.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel2.setText("First Name");

    jLabel3.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel3.setText("Last Name");

    jLabel4.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel4.setText("Position");

    updateButton.setText("Update");
    updateButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateButtonActionPerformed(evt);
      }
    });

    backButton.setText("Back");
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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(223, 223, 223)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGroup(layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup().addGap(0, 508, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29).addComponent(backButton,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE,
                                544, Short.MAX_VALUE)
                            .addComponent(positionTextField).addComponent(firstNameTextField,
                                javax.swing.GroupLayout.Alignment.LEADING))))
                    .addContainerGap(66, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup().addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1).addComponent(homeButton))
            .addGap(142, 142, 142)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(77, 77, 77)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(77, 77, 77)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(positionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(80, 80, 80)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(64, Short.MAX_VALUE)));

    pack();
  }

  private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (firstNameTextField.getText().equals("") || lastNameTextField.getText().equals("")
        || positionTextField.getText().equals("")) {
      JOptionPane.showMessageDialog(this, "Please enter data!");
    } else {
      try {
        ctrl.updateRecord(UpdateA.data, firstNameTextField.getText(),
            lastNameTextField.getText(), positionTextField.getText());
        JOptionPane.showMessageDialog(this, "Update data sucessefully!");
      } catch (Exception e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(this, "Update failed!");
      }
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UpdateA back = new UpdateA();
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

  private javax.swing.JButton backButton;
  private javax.swing.JTextField firstNameTextField;
  private javax.swing.JButton homeButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField lastNameTextField;
  private javax.swing.JTextField positionTextField;
  private javax.swing.JButton updateButton;
  private DoctorController ctrl = new DoctorController();
}
