package clinic.view.doctor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import clinic.controller.DoctorController;

public class ShowList extends JFrame {
  private JButton jButton1;
  private JButton jButton7;
  private JLabel jLabel1;
  private JScrollBar jScrollBar1;
  private JScrollPane jScrollPane1;
  private DoctorController doctorCtrl = new DoctorController();

  public ShowList() throws SQLException {
    initComponents();
  }

  private void initComponents() throws SQLException {

    jButton1 = new JButton();
    jScrollPane1 = new JScrollPane();
    jLabel1 = new JLabel();
    jScrollBar1 = new JScrollBar();
    jButton7 = new JButton();
    String[] col = {"ID", "First name", "Last name", "Position"};

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    jButton1.setBackground(new Color(243, 243, 243));
    jButton1.setIcon(new ImageIcon(getClass().getResource("../icon/back-button.png"))); // NOI18N
    jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {}
    });

    java.util.ArrayList<java.util.ArrayList<String>> objectList;

    objectList = doctorCtrl.getList();

    DefaultTableModel tableModel = new DefaultTableModel(col, 0);
    JTable jTable1 = new JTable(tableModel);

    for (int i = 0; i < objectList.size(); i++) {
      String id = objectList.get(i).get(0);
      String firstName = objectList.get(i).get(1);
      String lastName = objectList.get(i).get(2);
      String position = objectList.get(i).get(3);
      Object[] data = {id, firstName, lastName, position};
      tableModel.addRow(data);
    }

    jTable1.setPreferredSize(new Dimension(1050, 550));
    jScrollPane1.setViewportView(jTable1);

    jLabel1.setFont(new Font("Segoe UI", 0, 28)); // NOI18N
    jLabel1.setText("Doctor table ");

    jButton7.setText("OK");
    jButton7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {}
    });

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addComponent(jButton1)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 100,
                            GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 839,
                            GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE)))
            .addGap(34, 34, 34)));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(172, 172, 172).addComponent(
                    jScrollBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 520,
                        GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40).addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 50,
                        GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(34, Short.MAX_VALUE)));

    pack();
  }
}
