package com.mycompany.zoo_animals.view;

import com.mycompany.zoo_animals.model.Aquatic;
import com.mycompany.zoo_animals.service.IAquaticService;

public class GUIEditAquatic extends javax.swing.JFrame {
    
    private IAquaticService aquaticService;

    public GUIEditAquatic(IAquaticService aquaticService) {
        this.aquaticService = aquaticService;
        initComponents();
        setLocationRelativeTo(null);
        setFieldsEditable(false);
        
        inputSearch.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
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
    
    private void setFieldsEditable(boolean editable) {
        nameInput.setEditable(editable);
        nameInput.setFocusable(editable);

        weightInput.setEditable(editable);
        weightInput.setFocusable(editable);

        birthDateInput.setEditable(editable);
        birthDateInput.setFocusable(editable);

        preferredFoodInput.setEditable(editable);
        preferredFoodInput.setFocusable(editable);

        swimSpeedInput.setEditable(editable);
        swimSpeedInput.setFocusable(editable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        idInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        weightInput = new javax.swing.JTextField();
        birthDateInput = new javax.swing.JTextField();
        preferredFoodInput = new javax.swing.JTextField();
        swimSpeedInput = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar animal acuatico");

        inputSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        idLabel.setText("Identificador");

        jLabel1.setText("Nombre");

        jLabel2.setText("Peso");

        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setText("Alimentación preferida");

        jLabel5.setText("Velocidad de nado (km/h)");

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        idInput.setEditable(false);

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });

        swimSpeedInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swimSpeedInputActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.setToolTipText("");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addGap(38, 38, 38)
                        .addComponent(idInput, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(nameInput))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(81, 81, 81)
                        .addComponent(weightInput))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthDateInput))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(swimSpeedInput)
                            .addComponent(preferredFoodInput))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(weightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(birthDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(preferredFoodInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(swimSpeedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnEdit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearchActionPerformed

    }//GEN-LAST:event_inputSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String id = inputSearch.getText().trim();

            if (id.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Por favor ingrese un ID.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            aquaticService.getById(id).ifPresentOrElse(aquatic -> {
                idInput.setText(aquatic.getId());
                nameInput.setText(aquatic.getName());
                weightInput.setText(String.valueOf(aquatic.getWeightKg()));
                birthDateInput.setText(aquatic.getBirthDate().toString());
                preferredFoodInput.setText(aquatic.getPreferredFood());
                swimSpeedInput.setText(String.valueOf(aquatic.getSwimSpeedKmh()));
                
                setFieldsEditable(true);

                javax.swing.JOptionPane.showMessageDialog(this,
                    "Animal encontrado y campos poblados.",
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
                "Error de búsqueda",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void swimSpeedInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swimSpeedInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swimSpeedInputActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         try {
            Aquatic aquatic = new Aquatic(
                idInput.getText().trim(),
                nameInput.getText().trim(),
                Double.parseDouble(weightInput.getText().trim()),
                java.time.LocalDate.parse(birthDateInput.getText().trim()),
                preferredFoodInput.getText().trim(),
                Double.parseDouble(swimSpeedInput.getText().trim())
            );

            aquaticService.update(aquatic);

            javax.swing.JOptionPane.showMessageDialog(this,
                "Animal actualizado correctamente.",
                "Éxito",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Error al actualizar: " + e.getMessage(),
                "Error",
                javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditActionPerformed
    private void clearFields() {
        idInput.setText("");
        nameInput.setText("");
        weightInput.setText("");
        birthDateInput.setText("");
        preferredFoodInput.setText("");
        swimSpeedInput.setText("");

        setFieldsEditable(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField birthDateInput;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField preferredFoodInput;
    private javax.swing.JTextField swimSpeedInput;
    private javax.swing.JTextField weightInput;
    // End of variables declaration//GEN-END:variables
}
