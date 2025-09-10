package com.mycompany.zoo_animals.view;

import com.mycompany.zoo_animals.service.IAquaticService;
import java.awt.Color;
import java.awt.Font;

public class GUIDeleteAquatic extends javax.swing.JFrame {

    private IAquaticService aquaticService;

    public GUIDeleteAquatic(IAquaticService aquaticService) {
        this.aquaticService = aquaticService;
        initComponents();
        setLocationRelativeTo(null);
        styleComponents();

        searchInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                clearFields();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                clearFields();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                clearFields();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchInput = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        weightInput = new javax.swing.JTextField();
        birthDateInput = new javax.swing.JTextField();
        preferredFoodInput = new javax.swing.JTextField();
        swimSpeedInput = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar animal acuatico");

        searchInput.setColumns(35);
        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Velocidad de nado (km/h)");

        jLabel4.setText("Alimentación preferida");

        idInput.setEditable(false);
        idInput.setColumns(30);

        nameInput.setEditable(false);
        nameInput.setColumns(30);
        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        weightInput.setEditable(false);
        weightInput.setColumns(30);

        birthDateInput.setEditable(false);
        birthDateInput.setColumns(20);

        preferredFoodInput.setEditable(false);
        preferredFoodInput.setColumns(30);

        swimSpeedInput.setEditable(false);
        swimSpeedInput.setColumns(30);
        swimSpeedInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swimSpeedInputActionPerformed(evt);
            }
        });

        idLabel.setText("Identificador");

        jLabel1.setText("Nombre");

        jLabel2.setText("Peso");

        jLabel3.setText("Fecha de nacimiento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(swimSpeedInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                            .addComponent(preferredFoodInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                            .addComponent(birthDateInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(weightInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameInput, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idInput, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(birthDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preferredFoodInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(swimSpeedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed

    }//GEN-LAST:event_searchInputActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String id = searchInput.getText().trim();

            if (id.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Por favor ingresa un ID.",
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            var optionalAquatic = aquaticService.getById(id);

            optionalAquatic.ifPresentOrElse(aquatic -> {
                idInput.setText(aquatic.getId());
                nameInput.setText(aquatic.getName());
                weightInput.setText(String.valueOf(aquatic.getWeightKg()));
                birthDateInput.setText(aquatic.getBirthDate().toString());
                preferredFoodInput.setText(aquatic.getPreferredFood());
                swimSpeedInput.setText(String.valueOf(aquatic.getSwimSpeedKmh()));

                javax.swing.JOptionPane.showMessageDialog(this,
                        "Animal encontrado.",
                        "Éxito",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);

            }, () -> {
                clearFields();
                javax.swing.JOptionPane.showMessageDialog(this,
                        "No se encontró un animal con ID " + id,
                        "Error de búsqueda",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            });
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    e.getMessage(),
                    "Animal no encontrado",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    private void clearFields() {
        idInput.setText("");
        nameInput.setText("");
        weightInput.setText("");
        birthDateInput.setText("");
        preferredFoodInput.setText("");
        swimSpeedInput.setText("");
    }
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String id = idInput.getText().trim();

            if (id.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Primero busca un animal antes de eliminar.",
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                    "¿Estás seguro de eliminar el animal con ID " + id + "?",
                    "Confirmar eliminación",
                    javax.swing.JOptionPane.YES_NO_OPTION);

            if (confirm == javax.swing.JOptionPane.YES_OPTION) {
                aquaticService.deleteById(id);

                javax.swing.JOptionPane.showMessageDialog(this,
                        "Animal eliminado correctamente.",
                        "Éxito",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);

                clearFields();
                searchInput.setText("");
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Error al eliminar: " + e.getMessage(),
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void swimSpeedInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swimSpeedInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swimSpeedInputActionPerformed

    private void styleComponents() {
        Font base = idLabel.getFont();
        Font bold = base.deriveFont(Font.BOLD);
        idLabel.setFont(bold);
        jLabel2.setFont(bold);
        jLabel3.setFont(bold);
        jLabel4.setFont(bold);
        jLabel5.setFont(bold);

        javax.swing.JTextField[] readOnly = {
            idInput, nameInput, weightInput, birthDateInput, preferredFoodInput, swimSpeedInput
        };
        for (javax.swing.JTextField f : readOnly) {
            f.setEnabled(true);
            f.setEditable(false);
            f.setBackground(Color.WHITE);
            f.setDisabledTextColor(Color.BLACK);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthDateInput;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField preferredFoodInput;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTextField swimSpeedInput;
    private javax.swing.JTextField weightInput;
    // End of variables declaration//GEN-END:variables
}
