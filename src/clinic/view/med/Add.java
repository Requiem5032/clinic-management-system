package clinic.view.med;

import clinic.view.MainPage;
import javax.swing.JOptionPane;
import clinic.controller.MedController;

public class Add extends javax.swing.JFrame {
  public Add() {
    initComponents();
  }

  private void initComponents() {
    jLabel6 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    nameField = new javax.swing.JTextField();
    priceField = new javax.swing.JTextField();
    quantityField = new javax.swing.JTextField();
    idField = new javax.swing.JTextField();
    addButton = new javax.swing.JButton();
    backButton = new javax.swing.JButton();
    homeButton = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();

    jLabel6.setFont(new java.awt.Font("Titillium Web", 0, 20));
    jLabel6.setText("(6 digits)");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Medicine table");

    jLabel2.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel2.setText("Name");

    jLabel3.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel3.setText("Price");

    jLabel4.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel4.setText("Quantity");

    jLabel5.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel5.setText("Med ID");

    addButton.setText("Add");
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

    jLabel7.setFont(new java.awt.Font("Titillium Web", 0, 20));
    jLabel7.setText("(6 digits)");
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169,
                Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                    layout.createSequentialGroup().addComponent(jLabel1).addGap(140, 140, 140))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 177,
                                Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                            layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                    100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30).addComponent(backButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantityField, javax.swing.GroupLayout.DEFAULT_SIZE,
                                    542, Short.MAX_VALUE)
                                .addComponent(priceField).addComponent(nameField)
                                .addComponent(idField))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(homeButton))
            .addGap(45, 45, 45)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                        javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(77, 77, 77)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(77, 77, 77).addComponent(priceField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(77, 77, 77).addComponent(quantityField,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                    layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jLabel4,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                        javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(54, 54, 54)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(58, Short.MAX_VALUE)));
    pack();
  }

  private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (idField.getText().equals("") || nameField.getText().equals("")
        || priceField.getText().equals("") || quantityField.getText().equals("")) {
      JOptionPane.showMessageDialog(null, "Please enter all data!");
    } else {
      String id = idField.getText();
      String name = nameField.getText();
      String price = priceField.getText();
      String quantity = quantityField.getText();

      try {
        medCtrl.insertRecord(id, name, Double.parseDouble(price), Integer.parseInt(quantity));
        JOptionPane.showMessageDialog(null, "Add data successfully!");
      } catch (Exception e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(null, "Something went wrong!");
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

  private javax.swing.JTextField idField;
  private javax.swing.JButton addButton;
  private javax.swing.JButton backButton;
  private javax.swing.JTextField nameField;
  private javax.swing.JButton homeButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JTextField priceField;
  private javax.swing.JTextField quantityField;
  private MedController medCtrl = new MedController();
}
