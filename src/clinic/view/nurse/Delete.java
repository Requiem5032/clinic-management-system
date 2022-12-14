package clinic.view.nurse;

import clinic.view.MainPage;
import javax.swing.JOptionPane;
import clinic.controller.NurseController;

public class Delete extends javax.swing.JFrame {
  public Delete() {
    initComponents();
  }

  private void initComponents() {
    jLabel1 = new javax.swing.JLabel();
    deteleButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    deleteTextField = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    homeButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Nurse table");

    deteleButton.setText("Delete");
    deteleButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deteleButtonActionPerformed(evt);
      }
    });

    backButton.setText("Cancel");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    jLabel2.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel2.setText("Search ID");

    jLabel4.setForeground(new java.awt.Color(102, 102, 102));
    jLabel4.setText("You can find ID in full list ");

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
        .addGroup(layout.createSequentialGroup().addGap(294, 294, 294).addComponent(jLabel4,
            javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
            .addComponent(homeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(215, 215, 215)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(deteleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30).addComponent(backButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(16, 16, 16).addComponent(deleteTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 370,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGap(45, 45, 45)));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeButton2).addComponent(jLabel1))
            .addGap(54, 54, 54)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(12, 12, 12).addComponent(jLabel2))
                .addComponent(deleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(6, 6, 6)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(74, 74, 74)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117,
                Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(deteleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(235, 235, 235)));
    pack();
  }

  private void deteleButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (deleteTextField.getText().equals("")) {
      JOptionPane.showMessageDialog(this, "Please enter data to delete!");
    } else {
      try {
        String data = deleteTextField.getText();
        int result = ctrl.deleteRecord(data);
        if (result != 0) {
          JOptionPane.showMessageDialog(this, "Delete data sucessefully!");
        } else {
          JOptionPane.showMessageDialog(this, "Invalid ID!");
        }
      } catch (Exception e) {
        System.out.println(e);
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
      java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE,
          null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE,
          null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE,
          null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE,
          null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Delete().setVisible(true);
      }
    });
  }

  private javax.swing.JButton backButton;
  private javax.swing.JTextField deleteTextField;
  private javax.swing.JButton deteleButton;
  private javax.swing.JButton homeButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private NurseController ctrl = new NurseController();
}
