package com.mycompany.zoo_animals.view;

import com.mycompany.zoo_animals.model.Aquatic;
import com.mycompany.zoo_animals.service.IAquaticService;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class GUICreateAquatic extends javax.swing.JFrame {
    
    private IAquaticService aquaticService;

    public GUICreateAquatic(IAquaticService aquaticService) {
        this.aquaticService = aquaticService;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        weightInput = new javax.swing.JTextField();
        birthDateInput = new javax.swing.JTextField();
        preferredFoodInput = new javax.swing.JTextField();
        swimSpeedInput = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar animal acuatico");

        idLabel.setText("Identificador");

        jLabel1.setText("Nombre");

        jLabel2.setText("Peso");

        jLabel3.setText("Fecha de nacimiento");

        jLabel4.setText("Alimentación preferida");

        jLabel5.setText("Velocidad de nado (km/h)");

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

        closeBtn.setText("Cerrar");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Guardar");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addGap(103, 103, 103)
                        .addComponent(weightInput))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthDateInput)
                            .addComponent(preferredFoodInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(idLabel))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idInput)
                            .addComponent(nameInput)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(swimSpeedInput, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(weightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(birthDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(preferredFoodInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(swimSpeedInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeBtn)
                    .addComponent(addBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameInputActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
 try {
            String id = idInput.getText().trim();
            String name = nameInput.getText().trim();
            double weight;
            LocalDate birthDate;
            String finType;
            double swimSpeed;
            Aquatic aquatic;

            if (id.isEmpty() || name.isEmpty() || weightInput.getText().trim().isEmpty() ||
                birthDateInput.getText().trim().isEmpty() || preferredFoodInput.getText().trim().isEmpty() ||
                swimSpeedInput.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            weight = Double.parseDouble(weightInput.getText().trim());
            birthDate = LocalDate.parse(birthDateInput.getText().trim());  // formato esperado: YYYY-MM-DD
            finType = preferredFoodInput.getText().trim();
            swimSpeed = Double.parseDouble(swimSpeedInput.getText().trim());

            aquatic = new Aquatic(id, name, weight, birthDate, finType, swimSpeed);

            aquaticService.add(aquatic);

            JOptionPane.showMessageDialog(this, "Animal acuático agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // Limpiar campos
            idInput.setText("");
            nameInput.setText("");
            weightInput.setText("");
            birthDateInput.setText("");
            preferredFoodInput.setText("");
            swimSpeedInput.setText("");

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Error en formato numérico. Verifica peso y velocidad de nado.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (java.time.format.DateTimeParseException dte) {
            JOptionPane.showMessageDialog(this, "Error en formato de fecha. Usa el formato YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void swimSpeedInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swimSpeedInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_swimSpeedInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField birthDateInput;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel idLabel;
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
