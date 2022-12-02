package clinic.view.doctor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import clinic.controller.DoctorController;

public class ShowList extends JFrame {
  private DefaultTableModel tableModel;
  private JTable dataTable;

  private JLabel tableLabel;

  private JScrollBar scrollBar;
  private JScrollPane scrollPane;

  private JButton okButton;
  private JButton homeButton;

  private String[] col = {"ID", "First name", "Last name", "Position"};
  private DoctorController doctorCtrl = new DoctorController();

  private Font labelFont;
  private Font buttonFont;
  private Font tableFont;

  public ShowList() {
    initComponents();
  }

  private void refreshTable() {
    try {
      java.util.ArrayList<java.util.ArrayList<String>> objectList = doctorCtrl.getRecord();
      tableModel.setRowCount(0);

      for (int i = 0; i < objectList.size(); i++) {
        String id = objectList.get(i).get(0);
        String firstName = objectList.get(i).get(1);
        String lastName = objectList.get(i).get(2);
        String position = objectList.get(i).get(3);
        Object[] data = {id, firstName, lastName, position};
        tableModel.addRow(data);
      }
    } catch (SQLException e) {
      System.out.println(e);
    }
  }

  private void initComponents() {
    tableModel = new DefaultTableModel(col, 0);
    dataTable = new JTable(tableModel);

    tableLabel = new JLabel();

    scrollBar = new JScrollBar();
    scrollPane = new JScrollPane();

    okButton = new JButton();
    homeButton = new JButton();

    labelFont = new Font("Titillium Web", 0, 28);
    buttonFont = new Font("Titillium Web", 0, 16);
    tableFont = new Font("Titillium Web", 0, 16);

    try {
      java.util.ArrayList<java.util.ArrayList<String>> objectList = doctorCtrl.getRecord();

      for (int i = 0; i < objectList.size(); i++) {
        String id = objectList.get(i).get(0);
        String firstName = objectList.get(i).get(1);
        String lastName = objectList.get(i).get(2);
        String position = objectList.get(i).get(3);
        Object[] data = {id, firstName, lastName, position};
        tableModel.addRow(data);
      }
    } catch (SQLException e) {
      System.out.println(e);
    }

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    dataTable.setFont(tableFont);
    dataTable.setPreferredSize(new Dimension(1050, 550));
    dataTable.setRowHeight(24);

    scrollPane.setViewportView(dataTable);

    tableLabel.setFont(labelFont);
    tableLabel.setText("Doctor table ");

    okButton.setFont(buttonFont);
    okButton.setText("OK");
    okButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        refreshTable();
      }
    });

    homeButton.setBackground(new Color(243, 243, 243));
    homeButton.setIcon(new ImageIcon(getClass().getResource("../icon/home.png")));
    homeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) dataTable.getModel();
        int selectedRow = dataTable.getSelectedRow();

        if (selectedRow == -1) {
          JOptionPane.showMessageDialog(null, "Please select a row!");
        } else {
          String id = model.getValueAt(selectedRow, 0).toString();
          try {
            doctorCtrl.deleteRecord(id);
            refreshTable();
            JOptionPane.showMessageDialog(null, "Record removed!");
          } catch (SQLException e) {
            System.out.println(e);
          }
        }
      }
    });

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
            .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(
                    layout.createSequentialGroup().addGap(58, 58, 58).addComponent(tableLabel))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 100,
                            GroupLayout.PREFERRED_SIZE)
                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 839,
                            GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(scrollBar,
                        GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE)))
            .addGap(34, 34, 34)));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(homeButton).addComponent(tableLabel))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(172, 172, 172).addComponent(
                    scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                    GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 520,
                        GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40).addComponent(okButton, GroupLayout.PREFERRED_SIZE, 50,
                        GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(34, Short.MAX_VALUE)));

    pack();
  }
}
