/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frugalLab;

import javax.swing.JOptionPane;

/**
 *
 * @author Hinsen Chan
 */
public class OtherDataPanel extends javax.swing.JPanel {
    private FrugalController frugalController;
    private OtherDataTableController otherDataTableController;
    private String projectID;
    private String otherDataID;

    /**
     * Creates new form TagPanel
     */
    public OtherDataPanel(FrugalController frugalController) {
        initComponents();
        this.frugalController = frugalController;
        projectID = frugalController.getPid();
        this.otherDataTableController = new OtherDataTableController(this);
        jTable.setModel(otherDataTableController.getTableModel()); // set the table model using the controller
        jTable.getSelectionModel().addListSelectionListener(otherDataTableController); // add a listener to the table model        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        propertyPanel = new javax.swing.JPanel();
        otherDataTypeLabel = new javax.swing.JLabel();
        otherDataValueLabel = new javax.swing.JLabel();
        otherDataTypeTextField = new javax.swing.JTextField();
        otherDataValueTextField = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        buttonLayoutPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(143, 19, 21));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        propertyPanel.setBackground(new java.awt.Color(143, 19, 21));

        otherDataTypeLabel.setBackground(new java.awt.Color(143, 19, 21));
        otherDataTypeLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        otherDataTypeLabel.setForeground(java.awt.Color.white);
        otherDataTypeLabel.setText("Other Data Type:");
        otherDataTypeLabel.setOpaque(true);

        otherDataValueLabel.setBackground(new java.awt.Color(143, 19, 21));
        otherDataValueLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        otherDataValueLabel.setForeground(java.awt.Color.white);
        otherDataValueLabel.setText("Other Data Value:");
        otherDataValueLabel.setOpaque(true);

        otherDataTypeTextField.setPreferredSize(new java.awt.Dimension(240, 27));

        otherDataValueTextField.setPreferredSize(new java.awt.Dimension(240, 27));

        javax.swing.GroupLayout propertyPanelLayout = new javax.swing.GroupLayout(propertyPanel);
        propertyPanel.setLayout(propertyPanelLayout);
        propertyPanelLayout.setHorizontalGroup(
            propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(propertyPanelLayout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addGroup(propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(otherDataTypeLabel)
                    .addComponent(otherDataValueLabel))
                .addGap(18, 18, 18)
                .addGroup(propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherDataValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherDataTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        propertyPanelLayout.setVerticalGroup(
            propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, propertyPanelLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherDataTypeLabel)
                    .addComponent(otherDataTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(otherDataValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otherDataValueLabel))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        buttonPanel.setBackground(new java.awt.Color(143, 19, 21));

        buttonLayoutPanel.setBackground(new java.awt.Color(143, 19, 21));
        buttonLayoutPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 35));

        addButton.setText("Add");
        addButton.setPreferredSize(new java.awt.Dimension(100, 29));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        buttonLayoutPanel.add(addButton);

        updateButton.setText("Update");
        updateButton.setPreferredSize(new java.awt.Dimension(100, 29));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        buttonLayoutPanel.add(updateButton);

        deleteButton.setText("Delete");
        deleteButton.setPreferredSize(new java.awt.Dimension(100, 29));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        buttonLayoutPanel.add(deleteButton);

        clearButton.setText("Clear");
        clearButton.setPreferredSize(new java.awt.Dimension(100, 29));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        buttonLayoutPanel.add(clearButton);

        doneButton.setText("Done");
        doneButton.setPreferredSize(new java.awt.Dimension(100, 29));
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });
        buttonLayoutPanel.add(doneButton);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttonPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(buttonLayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
            .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(buttonPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(buttonLayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        tablePanel.setBackground(new java.awt.Color(143, 19, 21));
        tablePanel.setPreferredSize(new java.awt.Dimension(1000, 376));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Other Data Type", "Other Data Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(jTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(propertyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String otherDataType = getOtherDataTypeTextField();
        String otherDataValue = getOtherDataValueTextField();
        
        if (otherDataType.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a data type.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }        
        else if (otherDataValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a data value.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }                
        else {
            String[] otherDataArray = {otherDataType, otherDataValue};
            otherDataTableController.addRow(otherDataArray);
            jTable.clearSelection();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String otherDataType = getOtherDataTypeTextField();
        String otherDataValue = getOtherDataValueTextField();
        
        if (otherDataType.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a data type.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }        
        else if (otherDataValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a data value.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }        
        else {                
            int[] index = jTable.getSelectedRows();

            if (index.length > 1) {
                JOptionPane.showMessageDialog(this, "Please update 1 data type at a time.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                String[] otherDataArray = {getOtherDataID(), otherDataType, otherDataValue};
                otherDataTableController.setSelectedIndex(jTable.getSelectedRow());
                otherDataTableController.updateRow(otherDataArray);
                jTable.clearSelection();
            }
        } 
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] index = jTable.getSelectedRows();
        otherDataTableController.deleteRow(index);
        jTable.clearSelection();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        otherDataTableController.clearRow();
        jTable.clearSelection();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        frugalController.launchProjectPanel();
    }//GEN-LAST:event_doneButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel buttonLayoutPanel;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JTable jTable;
    private javax.swing.JLabel otherDataTypeLabel;
    private javax.swing.JTextField otherDataTypeTextField;
    private javax.swing.JLabel otherDataValueLabel;
    private javax.swing.JTextField otherDataValueTextField;
    private javax.swing.JPanel propertyPanel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    // updates the table model using the controller
    public void updateTable() {
    	jTable.setModel(otherDataTableController.getTableModel());
    }
    
    /**
     * @return the projectID
     */
    public String getProjectID() {
        return projectID;
    }

    /**
     * @param projectID the projectID to set
     */
    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    /**
     * @return the otherDataID
     */
    public String getOtherDataID() {
        return otherDataID;
    }

    /**
     * @param otherDataID the otherDataID to set
     */
    public void setOtherDataID(String otherDataID) {
        this.otherDataID = otherDataID;
    }

    /**
     * @return the otherDataTypeTextField
     */
    public String getOtherDataTypeTextField() {
        return otherDataTypeTextField.getText();
    }

    /**
     * @param otherDataTypeTextField the otherDataTypeTextField to set
     */
    public void setOtherDataTypeTextField(String otherDataTypeTextField) {
        this.otherDataTypeTextField.setText(otherDataTypeTextField);
    }

    /**
     * @return the otherDataValueTextField
     */
    public String getOtherDataValueTextField() {
        return otherDataValueTextField.getText();
    }

    /**
     * @param otherDataValueTextField the otherDataValueTextField to set
     */
    public void setOtherDataValueTextField(String otherDataValueTextField) {
        this.otherDataValueTextField.setText(otherDataValueTextField);
    }
}
