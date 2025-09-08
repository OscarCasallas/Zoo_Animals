package com.mycompany.zoo_animals.view;

import com.mycompany.zoo_animals.model.Habitat;
import com.mycompany.zoo_animals.service.IHabitatService;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.List;

public class GUIGetHabitat extends JFrame {

    private IHabitatService habitatService;

    public GUIGetHabitat(IHabitatService habitatService) {
        this();
        this.habitatService = habitatService;
    }

    public GUIGetHabitat() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        habitatTable = new javax.swing.JTable();
        closeBtn = new javax.swing.JButton();
        listBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Hábitats");
        setResizable(false);

    jPanel1.setLayout(null);
    jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));

        habitatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Área (m2)", "Clima"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane.setViewportView(habitatTable);

    scrollPane.setBounds(20, 20, 350, 180);
    jPanel1.add(scrollPane);

        closeBtn.setText("Cerrar");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
    closeBtn.setBounds(20, 220, 100, 30);
    jPanel1.add(closeBtn);

        listBtn.setText("Listar");
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });
    listBtn.setBounds(270, 220, 100, 30);
    jPanel1.add(listBtn);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    setSize(400, 320);
    }// </editor-fold>//GEN-END:initComponents
    // </editor-fold>

    private void listBtnActionPerformed(ActionEvent evt) {
        if (habitatService == null) {
            return;
        }
        List<Habitat> habitats = habitatService.getAll();
        DefaultTableModel model = (DefaultTableModel) habitatTable.getModel();
        model.setRowCount(0);
        for (Habitat h : habitats) {
            model.addRow(new Object[]{h.getName(), h.getAreaM2(), h.getClimate()});
        }
    }

    private void closeBtnActionPerformed(ActionEvent evt) {
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JTable habitatTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listBtn;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
