package com.mycompany.zoo_animals.view;

import com.mycompany.zoo_animals.service.IHabitatService;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUIDeleteHabitat extends JFrame {

    private IHabitatService habitatService;

    public GUIDeleteHabitat(IHabitatService habitatService) {
        this();
        this.habitatService = habitatService;
    }

    public GUIDeleteHabitat() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Hábitat");
        setResizable(false);

    jPanel1.setLayout(null);
    jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

    nameLabel.setText("Nombre:");
    nameLabel.setBounds(20, 20, 80, 25);
        jPanel1.add(nameLabel);
    nameInput.setBounds(120, 20, 210, 25);
        jPanel1.add(nameInput);

        closeBtn.setText("Cerrar");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
    closeBtn.setBounds(20, 70, 100, 30);
        jPanel1.add(closeBtn);

        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
    deleteBtn.setBounds(230, 70, 100, 30);
        jPanel1.add(deleteBtn);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    setSize(380, 170);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(ActionEvent evt) {
        if (habitatService == null) {
            JOptionPane.showMessageDialog(this, "Servicio no inicializado (modo diseño).", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String name = nameInput.getText().trim();
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar el hábitat " + name + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            habitatService.deleteByName(name);
            JOptionPane.showMessageDialog(this, "Hábitat eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            nameInput.setText("");
        }
    }

    private void closeBtnActionPerformed(ActionEvent evt) {
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
