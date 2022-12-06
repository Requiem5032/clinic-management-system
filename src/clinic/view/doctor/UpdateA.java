package clinic.view.doctor;

import clinic.view.MainPage;
import javax.swing.JOptionPane;
import clinic.controller.DoctorController;

public class UpdateA extends javax.swing.JFrame {
  public UpdateA() {
    initComponents();
  }

  private void initComponents() {
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    searchTextField = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    confirmButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    homeButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Titilium Web", 0, 28));
    jLabel1.setText("Doctor update");

    jLabel2.setFont(new java.awt.Font("Titilium Web", 0, 28));
    jLabel2.setText("*Search ID to update");

    jLabel3.setFont(new java.awt.Font("Titilium Web", 0, 20));
    jLabel3.setText("(6 digits)");

    confirmButton.setText("OK");
    confirmButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        confirmButtonActionPerformed(evt);
      }
    });

    backButton.setText("Cancel");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    jLabel4.setForeground(new java.awt.Color(102, 102, 102));
    jLabel4.setText("You can find ID in full list ");

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
            .addGap(220, 220, 220).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                180, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup().addGap(285, 285, 285)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup().addGap(15, 15, 15).addComponent(jLabel4,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                    javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(13, 13, 13)
            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup().addGap(708, 708, 708)
            .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30).addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                100, javax.swing.GroupLayout.PREFERRED_SIZE)));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(6, 6, 6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeButton).addComponent(jLabel1))
            .addGap(45, 45, 45)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(5, 5, 5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup().addGap(46, 46, 46).addComponent(
                            jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                            javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createSequentialGroup().addGap(4, 4, 4).addComponent(
                    searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(196, 196, 196)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(295, Short.MAX_VALUE)));

    pack();
  }

  private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {

    if (searchTextField.getText().equals((""))) {
      JOptionPane.showMessageDialog(this, "Please enter data to search!");
    } else {
      try {
        data = searchTextField.getText();
        docCtrl.getRecord(data);
        UpdateB ok = new UpdateB();
        ok.setVisible(true);
        this.dispose();
      } catch (Exception e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(this, "Invalid ID!");
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
      java.util.logging.Logger.getLogger(UpdateA.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(UpdateA.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(UpdateA.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(UpdateA.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new UpdateA().setVisible(true);
      }
    });
  }

  private javax.swing.JButton backButton;
  private javax.swing.JButton confirmButton;
  private javax.swing.JButton homeButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField searchTextField;
  private DoctorController docCtrl = new DoctorController();
  static String data;
}
