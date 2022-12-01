package clinic.view.med;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import clinic.controller.*;

public class Add extends JFrame {
    private JLabel tableLabel;
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JLabel quantityLabel;
    private JLabel idLabel;
    private JLabel noteLabel;

    private JTextField idField;
    private JTextField nameField;
    private JTextField priceField;
    private JTextField quantityField;

    private JButton backButton;
    private JButton okButton;
    private JButton cancelButton;

    private String id;
    private String name;
    private double price;
    private int quantity;
    
    private MedController medCtrl = new MedController();

    public Add() {
        initComponents();
    }

    private void initComponents() {
        tableLabel = new JLabel();
        nameLabel = new JLabel();
        priceLabel = new JLabel();
        quantityLabel = new JLabel();
        idLabel = new JLabel();
        noteLabel = new JLabel();

        idField = new JTextField();
        nameField = new JTextField();
        priceField = new JTextField();
        quantityField = new JTextField();

        backButton = new JButton();
        okButton = new JButton();
        cancelButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        backButton.setBackground(new Color(243, 243, 243));
        backButton.setIcon(new ImageIcon(getClass().getResource("../icon/back-button.png")));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            }
        });

        tableLabel.setFont(new Font("Segoe UI", 0, 28));
        tableLabel.setText("Med table ");

        idLabel.setFont(new Font("Segoe UI", 0, 28));
        idLabel.setText("Med ID");

        nameLabel.setFont(new Font("Segoe UI", 0, 28));
        nameLabel.setText("Name");

        priceLabel.setFont(new Font("Segoe UI", 0, 28));
        priceLabel.setText("Price");

        quantityLabel.setFont(new Font("Segoe UI", 0, 28));
        quantityLabel.setText("Quantity");

        noteLabel.setForeground(new Color(102, 102, 102));
        noteLabel.setText("*Add three med information");

        idField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                id = idField.getText();
            }
        });

        nameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                name = nameField.getText();
            }
        });

        priceField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                price = Double.parseDouble(priceField.getText());
            }
        });

        quantityField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                quantity = Integer.parseInt(quantityField.getText());
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                medCtrl.insertRecord(id, name, price, quantity);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantityLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(noteLabel, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(idField, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                                    .addComponent(nameField)
                                    .addComponent(priceField)
                                    .addComponent(quantityField)))))
                    .addComponent(tableLabel))
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(tableLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(idLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addComponent(priceField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                            .addComponent(priceLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(quantityField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(quantityLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(noteLabel)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }
}
