package clinic.view.med;

import clinic.view.MainPage;
import javax.swing.JOptionPane;
import clinic.controller.MedController;

public class ShowList extends javax.swing.JFrame {

  public ShowList() {
    initComponents();
  }

  private void initComponents() {
    tableModel = new javax.swing.table.DefaultTableModel(col, 0);
    jScrollPane1 = new javax.swing.JScrollPane();
    fullTable = new javax.swing.JTable(tableModel);
    jLabel1 = new javax.swing.JLabel();
    jScrollBar1 = new javax.swing.JScrollBar();
    backButton = new javax.swing.JButton();
    homeButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    try {
      java.util.List<java.util.List<String>> objectList = medCtrl.getRecord();
      for (int i = 0; i < objectList.size(); i++) {
        String id = objectList.get(i).get(0);
        String firstName = objectList.get(i).get(1);
        String lastName = objectList.get(i).get(2);
        String position = objectList.get(i).get(3);
        Object[] data = {id, firstName, lastName, position};
        tableModel.addRow(data);
      }
    } catch (Exception e) {
      System.out.println(e);
      JOptionPane.showMessageDialog(this, "Something went wrong!");
    }

    fullTable.setPreferredSize(new java.awt.Dimension(1050, 550));
    jScrollPane1.setViewportView(fullTable);
    jLabel1.setFont(new java.awt.Font("Titillium Web", 0, 28));
    jLabel1.setText("Medicine table");
    backButton.setText("OK");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        backButtonActionPerformed(evt);
      }
    });

    homeButton1.setBackground(new java.awt.Color(243, 243, 243));
    homeButton1
        .setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinic/view/icon/home.png")));
    homeButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
            .addComponent(homeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162,
                Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(34, 34, 34)));
    layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeButton1).addComponent(jLabel1))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(172, 172, 172).addComponent(
                    jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40).addComponent(backButton,
                        javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                        javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(34, Short.MAX_VALUE)));
    pack();
  }

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    HomePage back = new HomePage();
    back.setVisible(true);
    this.dispose();
  }

  private void homeButton1ActionPerformed(java.awt.event.ActionEvent evt) {
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
      java.util.logging.Logger.getLogger(ShowList.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(ShowList.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(ShowList.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(ShowList.class.getName())
          .log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ShowList().setVisible(true);
      }
    });
  }

  private javax.swing.JButton backButton;
  private javax.swing.JTable fullTable;
  private javax.swing.JButton homeButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollBar jScrollBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.table.DefaultTableModel tableModel;
  private String[] col = {"ID", "Name", "Price", "Quantity"};
  private MedController medCtrl = new MedController();
}
