package clinic.view.patient;

import clinic.view.MainPage;
import javax.swing.JOptionPane;
import clinic.controller.PatientController;

public class ShowRecord extends javax.swing.JFrame {
  public ShowRecord() {
    initComponents();
  }

  private void initComponents() {
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    searchTextField = new javax.swing.JTextField();
    confirmButton = new javax.swing.JButton();
    BackButton = new javax.swing.JButton();
    homeButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Patient table");

    jLabel2.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel2.setText("Search name");

    confirmButton.setText("OK");
    confirmButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        confirmButtonActionPerformed(evt);
      }
    });

    BackButton.setText("Cancel");
    BackButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    homeButton2.setBackground(new java.awt.Color(243, 243, 243));
    homeButton2
        .setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic/view/icon/home.png")));
    homeButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(31, 31, 31)
            .addComponent(homeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(219, 219, 219).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                210, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup().addGap(285, 285, 285)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18))
        .addGroup(layout.createSequentialGroup().addGap(700, 700, 700)
            .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30).addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                100, javax.swing.GroupLayout.PREFERRED_SIZE)));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(6, 6, 6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeButton2).addComponent(jLabel1))
            .addGap(45, 45, 45)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(5, 5, 5).addComponent(jLabel2,
                    javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup().addGap(4, 4, 4).addComponent(
                    searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(340, 340, 340)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(164, Short.MAX_VALUE)));
    pack();
  }

  private String confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (searchTextField.getText().equals((""))) {
      JOptionPane.showMessageDialog(this, "Please enter data to search!");
      return null;
    } else {
      try {
        data = searchTextField.getText();
        ctrl.getRecord(data);
        ShowList confirm = new ShowList(false);
        confirm.setVisible(true);
        this.dispose();
        return data;
      } catch (Exception e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(this, "Invalid ID!");
        return null;
      }
    }
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    HomePage back = new HomePage();
    back.setVisible(true);
    this.dispose();
  }

  private void homeButton2ActionPerformed(java.awt.event.ActionEvent evt) {
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
      java.util.logging.Logger.getLogger(ShowRecord.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ShowRecord.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ShowRecord.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ShowRecord.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ShowRecord().setVisible(true);
      }
    });
  }

  private javax.swing.JButton BackButton;
  private javax.swing.JButton confirmButton;
  private javax.swing.JButton homeButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JTextField searchTextField;
  static String data;
  private PatientController ctrl = new PatientController();
}
