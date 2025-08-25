package com.mycompany.zoo_animals.view;

import com.mycompany.zoo_animals.model.Habitat;
import com.mycompany.zoo_animals.service.IHabitatService;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Optional;

public class GUIGetHabitatById extends JFrame {
    private IHabitatService habitatService; 
    public GUIGetHabitatById(IHabitatService habitatService) {
        this();
        this.habitatService = habitatService;
    }

    public GUIGetHabitatById() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        areaLabel = new javax.swing.JLabel();
        areaInput = new javax.swing.JTextField();
        climateLabel = new javax.swing.JLabel();
        climateInput = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Hábitat por Nombre");
        setResizable(false);

    jPanel1.setLayout(null);
    jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

        searchLabel.setText("Nombre a buscar:");
    searchLabel.setBounds(20, 20, 120, 25);
    jPanel1.add(searchLabel);
    searchInput.setBounds(150, 20, 150, 25);
    jPanel1.add(searchInput);

        searchBtn.setText("Buscar");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
    searchBtn.setBounds(150, 60, 100, 30);
    jPanel1.add(searchBtn);

        nameLabel.setText("Nombre:");
    nameLabel.setBounds(20, 110, 80, 25);
    jPanel1.add(nameLabel);

        nameInput.setEditable(false);
    nameInput.setBounds(120, 110, 180, 25);
    jPanel1.add(nameInput);

        areaLabel.setText("Área (m2):");
    areaLabel.setBounds(20, 140, 80, 25);
    jPanel1.add(areaLabel);

        areaInput.setEditable(false);
    areaInput.setBounds(120, 140, 180, 25);
    jPanel1.add(areaInput);

        climateLabel.setText("Clima:");
    climateLabel.setBounds(20, 170, 80, 25);
    jPanel1.add(climateLabel);

        climateInput.setEditable(false);
    climateInput.setBounds(120, 170, 180, 25);
    jPanel1.add(climateInput);

        closeBtn.setText("Cerrar");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
    closeBtn.setBounds(20, 220, 100, 30);
    jPanel1.add(closeBtn);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    setSize(370, 320);
    }// </editor-fold>//GEN-END:initComponents
    // </editor-fold>

    private void searchBtnActionPerformed(ActionEvent evt) {
        if (habitatService == null) return; 
        String name = searchInput.getText().trim();
        Optional<Habitat> habitatOpt = habitatService.getByName(name);
        if (habitatOpt.isPresent()) {
            Habitat habitat = habitatOpt.get();
            nameInput.setText(habitat.getName());
            areaInput.setText(String.valueOf(habitat.getAreaM2()));
            climateInput.setText(habitat.getClimate());
            JOptionPane.showMessageDialog(this, "Hábitat encontrado.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            nameInput.setText("");
            areaInput.setText("");
            climateInput.setText("");
            JOptionPane.showMessageDialog(this, "No se encontró el hábitat.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void closeBtnActionPerformed(ActionEvent evt) {
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaInput;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField climateInput;
    private javax.swing.JLabel climateLabel;
    private javax.swing.JButton closeBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
