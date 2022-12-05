package clinic.view.doctor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import clinic.controller.DoctorController;

public class Add extends JFrame {
  private JLabel tableLabel;
  private JLabel idLabel;
  private JLabel firstNameLabel;
  private JLabel lastNameLabel;
  private JLabel positionLabel;

  private JTextField idField;
  private JTextField firstNameField;
  private JTextField lastNameField;
  private JTextField positionField;

  private JButton addButton;
  private JButton cancelButton;
  private JButton homeButton;

  private DoctorController doctorCtrl = new DoctorController();

  private Font labelFont;
  private Font fieldFont;
  private Font buttonFont;

  public Add() {
    initComponents();
  }

  private void initComponents() {
    tableLabel = new JLabel();
    idLabel = new JLabel();
    firstNameLabel = new JLabel();
    lastNameLabel = new JLabel();
    positionLabel = new JLabel();

    idField = new JTextField();
    firstNameField = new JTextField();
    lastNameField = new JTextField();
    positionField = new JTextField();

    addButton = new JButton();
    cancelButton = new JButton();
    homeButton = new JButton();

    labelFont = new Font("Titillium Web", 0, 28);
    fieldFont = new Font("Titillium Web", 0, 20);
    buttonFont = new Font("Titillium Web", 0, 16);

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    tableLabel.setFont(labelFont);
    tableLabel.setText("Doctor table ");

    idLabel.setFont(labelFont);
    idLabel.setText("Doctor ID");

    firstNameLabel.setFont(labelFont);
    firstNameLabel.setText("First Name");

    lastNameLabel.setFont(labelFont);
    lastNameLabel.setText("Last Name");

    positionLabel.setFont(labelFont);
    positionLabel.setText("Position");

    idField.setFont(fieldFont);
    firstNameField.setFont(fieldFont);
    lastNameField.setFont(fieldFont);
    positionField.setFont(fieldFont);

    addButton.setFont(buttonFont);
    addButton.setText("Add");
    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        if (idField.getText().equals("") || firstNameField.getText().equals("")
            || lastNameField.getText().equals("") || positionField.getText().equals("")) {
          JOptionPane.showMessageDialog(null, "Please enter all data!");
        } else {
          String id = idField.getText();
          String firstName = firstNameField.getText();
          String lastName = lastNameField.getText();
          String position = positionField.getText();
          
          try {
            doctorCtrl.insertRecord(id, firstName, lastName, position);
            JOptionPane.showMessageDialog(null, "Add data successfully!");
          } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Something went wrong!");
          }
        }
      }
    });

    cancelButton.setFont(buttonFont);
    cancelButton.setText("Cancel");
    cancelButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {}
    });

    homeButton.setBackground(new Color(243, 243, 243));
    homeButton.setIcon(new ImageIcon(getClass().getResource("../icon/home.png")));
    homeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {}
    });

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(30, 30, 30)
            .addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNameLabel, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(idLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(lastNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(positionLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup()
                            .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 100,
                                GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30).addComponent(cancelButton,
                                GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(positionField, GroupLayout.DEFAULT_SIZE, 542,
                                Short.MAX_VALUE)
                            .addComponent(lastNameField).addComponent(firstNameField)
                            .addComponent(idField)))))
                .addComponent(tableLabel))
            .addGap(140, 140, 140)));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addContainerGap()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(tableLabel, GroupLayout.PREFERRED_SIZE, 37,
                    GroupLayout.PREFERRED_SIZE)
                .addComponent(homeButton))
            .addGap(49, 49, 49)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addComponent(idLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                .addComponent(idField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(77, 77, 77)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(firstNameLabel, GroupLayout.PREFERRED_SIZE, 53,
                                    GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstNameField, GroupLayout.PREFERRED_SIZE, 53,
                                    GroupLayout.PREFERRED_SIZE))
                            .addGap(77, 77, 77).addComponent(lastNameField,
                                GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                        .addComponent(lastNameLabel, GroupLayout.PREFERRED_SIZE, 53,
                            GroupLayout.PREFERRED_SIZE))
                    .addGap(77, 77, 77).addComponent(positionField, GroupLayout.PREFERRED_SIZE, 53,
                        GroupLayout.PREFERRED_SIZE))
                .addGroup(GroupLayout.Alignment.TRAILING,
                    layout.createSequentialGroup().addGap(40, 40, 40).addComponent(positionLabel,
                        GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
            .addGap(54, 54, 54)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(addButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 49,
                    GroupLayout.PREFERRED_SIZE))
            .addContainerGap(58, Short.MAX_VALUE)));

    pack();
  }
}
