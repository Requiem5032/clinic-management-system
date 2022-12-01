package clinic.view.med;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import clinic.controller.MedController;

public class ShowList extends JFrame {
  private JButton backButton;
  private JButton okButton;

  private JLabel tableLabel;

  private JScrollBar scrollBar;
  private JScrollPane scrollPanel;

  private MedController medCtrl = new MedController();

  public ShowList() throws SQLException {
    initComponents();
  }

  private void initComponents() throws SQLException {
    backButton = new JButton();
    okButton = new JButton();

    tableLabel = new JLabel();
    
    scrollBar = new JScrollBar();
    scrollPanel = new JScrollPane();

    String[] col = {"ID", "Name", "Price", "Quantity"};

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    backButton.setBackground(new Color(243, 243, 243));
    backButton.setIcon(new ImageIcon(getClass().getResource("../icon/back-button.png")));
    backButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        System.exit(0);
      }
    });

    java.util.ArrayList<java.util.ArrayList<String>> objectList;

    objectList = medCtrl.getList();

    DefaultTableModel tableModel = new DefaultTableModel(col, 0);
    JTable jTable1 = new JTable(tableModel);

    for (int i = 0; i < objectList.size(); i++) {
      String id = objectList.get(i).get(0);
      String name = objectList.get(i).get(1);
      String price = objectList.get(i).get(2);
      String quantity = objectList.get(i).get(3);
      Object[] data = {id, name, price, quantity};
      tableModel.addRow(data);
    }

    jTable1.setPreferredSize(new Dimension(1050, 550));
    scrollPanel.setViewportView(jTable1);

    tableLabel.setFont(new Font("Segoe UI", 0, 28));
    tableLabel.setText("Med table ");

    okButton.setText("OK");
    okButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        java.util.ArrayList<java.util.ArrayList<String>> newObjectList;

        try {
          tableModel.setRowCount(0);
          newObjectList = medCtrl.getList();

          for (int i = 0; i < newObjectList.size(); i++) {
            String id = newObjectList.get(i).get(0);
            String name = newObjectList.get(i).get(1);
            String price = newObjectList.get(i).get(2);
            String quantity = newObjectList.get(i).get(3);
            Object[] data = {id, name, price, quantity};
            tableModel.addRow(data);
          }
        } catch (SQLException e) {
          System.out.println(e);
        }
      }
    });

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addComponent(backButton)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(58, 58, 58).addComponent(tableLabel))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 100,
                            GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPanel, GroupLayout.PREFERRED_SIZE, 839,
                            GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE)))
            .addGap(34, 34, 34)));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addComponent(backButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addComponent(tableLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(172, 172, 172).addComponent(
                    scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPanel, GroupLayout.PREFERRED_SIZE, 520,
                        GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40).addComponent(okButton, GroupLayout.PREFERRED_SIZE, 50,
                        GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(34, Short.MAX_VALUE)));

    pack();
  }
}
