package clinic.view.med;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import clinic.controller.MedController;

public class Add extends JFrame {
  private JLabel tableLabel;
  private JLabel idLabel;
  private JLabel nameLabel;
  private JLabel priceLabel;
  private JLabel quantityLabel;

  private JTextField idField;
  private JTextField nameField;
  private JTextField priceField;
  private JTextField quantityField;

  private JButton addButton;
  private JButton cancelButton;
  private JButton homeButton;

  private MedController medCtrl = new MedController();

  private Font labelFont;
  private Font fieldFont;
  private Font buttonFont;

  public Add() {
    initComponents();
  }

  private void initComponents() {
    tableLabel = new JLabel();
    idLabel = new JLabel();
    nameLabel = new JLabel();
    priceLabel = new JLabel();
    quantityLabel = new JLabel();

    idField = new JTextField();
    nameField = new JTextField();
    priceField = new JTextField();
    quantityField = new JTextField();

    addButton = new JButton();
    cancelButton = new JButton();
    homeButton = new JButton();

    labelFont = new Font("Titillium Web", 0, 28);
    fieldFont = new Font("Titillium Web", 0, 20);
    buttonFont = new Font("Titillium Web", 0, 16);

    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    tableLabel.setFont(labelFont);
    tableLabel.setText("Med table ");

    idLabel.setFont(labelFont);
    idLabel.setText("Med ID");

    nameLabel.setFont(labelFont);
    nameLabel.setText("Name");

    priceLabel.setFont(labelFont);
    priceLabel.setText("Price");

    quantityLabel.setFont(labelFont);
    quantityLabel.setText("Quantity");

    idField.setFont(fieldFont);
    nameField.setFont(fieldFont);
    priceField.setFont(fieldFont);
    quantityField.setFont(fieldFont);

    addButton.setFont(buttonFont);
    addButton.setText("Add");
    addButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        if (idField.getText().equals("") || nameField.getText().equals("")
            || priceField.getText().equals("") || quantityField.getText().equals("")) {
          JOptionPane.showMessageDialog(null, "Please enter all data!");
        } else {
          try {
            String id = idField.getText();
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            int quantity = Integer.parseInt(quantityField.getText());

            try {
              medCtrl.insertRecord(id, name, price, quantity);
              JOptionPane.showMessageDialog(null, "Add data successfully!");
            } catch (SQLException e) {
              System.out.println(e);
              JOptionPane.showMessageDialog(null, "Duplicated entry!");
            }
          } catch (NumberFormatException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Wrong data type!");
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
                    .addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(idLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(priceLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(quantityLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
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
                            .addComponent(quantityField, GroupLayout.DEFAULT_SIZE, 542,
                                Short.MAX_VALUE)
                            .addComponent(priceField).addComponent(nameField)
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
                                .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 53,
                                    GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 53,
                                    GroupLayout.PREFERRED_SIZE))
                            .addGap(77, 77, 77).addComponent(priceField,
                                GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                        .addComponent(priceLabel, GroupLayout.PREFERRED_SIZE, 53,
                            GroupLayout.PREFERRED_SIZE))
                    .addGap(77, 77, 77).addComponent(quantityField, GroupLayout.PREFERRED_SIZE, 53,
                        GroupLayout.PREFERRED_SIZE))
                .addGroup(GroupLayout.Alignment.TRAILING,
                    layout.createSequentialGroup().addGap(40, 40, 40).addComponent(quantityLabel,
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
