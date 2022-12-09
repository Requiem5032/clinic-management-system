package clinic.view.nurse;

import clinic.view.MainPage;

public class HomePage extends javax.swing.JFrame {
  public HomePage() {
    initComponents();
  }

  private void initComponents() {

    showInfoFrameButton = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    deleteFrameButton = new javax.swing.JButton();
    updateFrameButton = new javax.swing.JButton();
    fullListFrameButton = new javax.swing.JButton();
    addFrameButton = new javax.swing.JButton();
    jScrollBar1 = new javax.swing.JScrollBar();
    jScrollPane2 = new javax.swing.JScrollPane();
    showCashTextPane = new javax.swing.JTextPane();
    homeButton2 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    showInfoFrameButton.setFont(new java.awt.Font("Titillium Web", 0, 20));
    showInfoFrameButton.setText("Show Info");
    showInfoFrameButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        showInfoFrameButtonActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Nurse table");

    deleteFrameButton.setFont(new java.awt.Font("Titillium Web", 0, 20));
    deleteFrameButton.setText("Delete");
    deleteFrameButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteFrameButtonActionPerformed(evt);
      }
    });

    updateFrameButton.setFont(new java.awt.Font("Titillium Web", 0, 20));
    updateFrameButton.setText("Update");
    updateFrameButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateFrameButtonActionPerformed(evt);
      }
    });

    fullListFrameButton.setFont(new java.awt.Font("Titillium Web", 0, 20));
    fullListFrameButton.setText("Full List");
    fullListFrameButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fullListFrameButtonActionPerformed(evt);
      }
    });

    addFrameButton.setFont(new java.awt.Font("Titillium Web", 0, 20));
    addFrameButton.setText("Add");
    addFrameButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        addFrameButtonActionPerformed(evt);
      }
    });

    jScrollPane2.setViewportView(showCashTextPane);

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
        .addGroup(layout.createSequentialGroup().addContainerGap(30, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deleteFrameButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showInfoFrameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140,
                        Short.MAX_VALUE)
                    .addComponent(updateFrameButton, javax.swing.GroupLayout.Alignment.LEADING,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(fullListFrameButton, javax.swing.GroupLayout.Alignment.LEADING,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(addFrameButton, javax.swing.GroupLayout.Alignment.LEADING,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE))
                .addComponent(homeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                    javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57,
                Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup().addGap(845, 845, 845).addComponent(
                    jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                    layout.createSequentialGroup().addGap(1, 1, 1).addComponent(jScrollPane2,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 854,
                        javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(34, 34, 34)));
    layout
        .setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1).addComponent(homeButton2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showInfoFrameButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(addFrameButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(deleteFrameButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(updateFrameButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40).addComponent(fullListFrameButton,
                                    javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    pack();
  }

  private void deleteFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
    Delete del = new Delete();
    del.setVisible(true);
    this.dispose();
  }

  private void updateFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
    UpdateA update = new UpdateA();
    update.setVisible(true);
    this.dispose();
  }

  private void fullListFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
    ShowList full = new ShowList(true);
    full.setVisible(true);
    this.dispose();
  }

  private void addFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
    Add add = new Add();
    add.setVisible(true);
    this.dispose();
  }

  private void showInfoFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {
    ShowRecord show = new ShowRecord();
    show.setVisible(true);
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
      java.util.logging.Logger.getLogger(HomePage.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(HomePage.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(HomePage.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(HomePage.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new HomePage().setVisible(true);
      }
    });
  }

  private javax.swing.JButton addFrameButton;
  private javax.swing.JButton deleteFrameButton;
  private javax.swing.JButton fullListFrameButton;
  private javax.swing.JButton homeButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollBar jScrollBar1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTextPane showCashTextPane;
  private javax.swing.JButton showInfoFrameButton;
  private javax.swing.JButton updateFrameButton;

}
