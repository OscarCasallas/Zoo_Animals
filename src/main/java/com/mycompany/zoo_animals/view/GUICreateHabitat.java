package com.mycompany.zoo_animals.view;

import com.mycompany.zoo_animals.model.Habitat;
import com.mycompany.zoo_animals.service.IHabitatService;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUICreateHabitat extends JFrame {
    private IHabitatService habitatService; 

    public GUICreateHabitat(IHabitatService habitatService) {
        this(); 
        this.habitatService = habitatService;
    }

    public GUICreateHabitat() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        areaLabel = new javax.swing.JLabel();
        areaInput = new javax.swing.JTextField();
        climateLabel = new javax.swing.JLabel();
        climateInput = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Hábitat");
        setResizable(false);

        jPanel1.setLayout(null);

        nameLabel.setText("Nombre:");
        nameLabel.setBounds(20, 20, 80, 25);
        jPanel1.add(nameLabel);
        nameInput.setBounds(120, 20, 180, 25);
        jPanel1.add(nameInput);

        areaLabel.setText("Área (m2):");
        areaLabel.setBounds(20, 60, 80, 25);
        jPanel1.add(areaLabel);
        areaInput.setBounds(120, 60, 180, 25);
        jPanel1.add(areaInput);

        climateLabel.setText("Clima:");
        climateLabel.setBounds(20, 100, 80, 25);
        jPanel1.add(climateLabel);
        climateInput.setBounds(120, 100, 180, 25);
        jPanel1.add(climateInput);

        closeBtn.setText("Cerrar");
        closeBtn.setBounds(20, 150, 100, 30);
        closeBtn.addActionListener(this::closeBtnActionPerformed);
        jPanel1.add(closeBtn);

        addBtn.setText("Guardar");
        addBtn.setBounds(200, 150, 100, 30);
        addBtn.addActionListener(this::addBtnActionPerformed);
        jPanel1.add(addBtn);

        getContentPane().setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        setSize(340, 240);
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

    private void addBtnActionPerformed(ActionEvent evt) {
        if (habitatService == null) {
            JOptionPane.showMessageDialog(this, "Servicio no inicializado (modo diseño).", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            String name = nameInput.getText().trim();
            double area = Double.parseDouble(areaInput.getText().trim());
            String climate = climateInput.getText().trim();
            Habitat habitat = new Habitat(name, area, climate);
            habitatService.add(habitat);
            JOptionPane.showMessageDialog(this, "Hábitat agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            nameInput.setText("");
            areaInput.setText("");
            climateInput.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void closeBtnActionPerformed(ActionEvent evt) {
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField areaInput;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField climateInput;
    private javax.swing.JLabel climateLabel;
    private javax.swing.JButton closeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
