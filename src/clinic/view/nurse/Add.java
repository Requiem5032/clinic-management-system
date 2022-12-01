package clinic.view.nurse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import clinic.controller.*;

public class Add extends JFrame {
    private JLabel tableLabel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel positionLabel;
    private JLabel idLabel;
    private JLabel noteLabel;

    private JTextField idField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField positionField;

    private JButton backButton;
    private JButton okButton;
    private JButton cancelButton;

    private String id;
    private String firstName;
    private String lastName;
    private String position;
    
    private NurseController nurseCtrl = new NurseController();

    public Add() {
        initComponents();
    }

    private void initComponents() {
        tableLabel = new JLabel();
        idLabel = new JLabel();
        firstNameLabel = new JLabel();
        lastNameLabel = new JLabel();
        positionLabel = new JLabel();
        noteLabel = new JLabel();

        idField = new JTextField();
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        positionField = new JTextField();

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
        tableLabel.setText("Nurse table ");

        idLabel.setFont(new Font("Segoe UI", 0, 28));
        idLabel.setText("Nurse ID");

        firstNameLabel.setFont(new Font("Segoe UI", 0, 28));
        firstNameLabel.setText("First Name");

        lastNameLabel.setFont(new Font("Segoe UI", 0, 28));
        lastNameLabel.setText("Last Name");

        positionLabel.setFont(new Font("Segoe UI", 0, 28));
        positionLabel.setText("Position");

        noteLabel.setForeground(new Color(102, 102, 102));
        noteLabel.setText("*Add three nurse information");

        idField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                id = idField.getText();
            }
        });

        firstNameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                firstName = firstNameField.getText();
            }
        });

        lastNameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                lastName = lastNameField.getText();
            }
        });

        positionField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                position = positionField.getText();
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                nurseCtrl.insertRecord(id, firstName, lastName, position);
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
                            .addComponent(firstNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(positionLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(firstNameField)
                                    .addComponent(lastNameField)
                                    .addComponent(positionField)))))
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
                                    .addComponent(firstNameLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addComponent(lastNameField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                            .addComponent(lastNameLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(positionField, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(positionLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
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
