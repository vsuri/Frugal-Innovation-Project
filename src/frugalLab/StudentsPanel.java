/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package frugalLab;

import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Hinsen Chan
 */
public class StudentsPanel extends javax.swing.JPanel {
    private FrugalController frugalController;
    private StudentsTableController studentsTableController; // controller for the students panel
    private long projectID;
    private long studentID;
    
    /**
     * Creates new form MediaPanel2
     */
    public StudentsPanel(FrugalController frugalController) {
        initComponents();
        this.frugalController = frugalController;
        this.studentsTableController = new StudentsTableController(this);
        jTable.setModel(studentsTableController.getTableModel()); // set the table model using the controller
        jTable.getSelectionModel().addListSelectionListener(studentsTableController); // add a listener to the table model
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
        propertyLayoutPanel = new javax.swing.JPanel();
        studentNameLabel = new javax.swing.JLabel();
        studentNameTextField = new javax.swing.JTextField();
        buttonPanel = new javax.swing.JPanel();
        buttonLayoutPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        tabelPanel = new javax.swing.JPanel();
        tableLayoutPanel = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(143, 19, 21));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        propertyPanel.setBackground(new java.awt.Color(143, 19, 21));

        propertyLayoutPanel.setBackground(new java.awt.Color(143, 19, 21));
        propertyLayoutPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 35, 100));

        studentNameLabel.setBackground(new java.awt.Color(143, 19, 21));
        studentNameLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        studentNameLabel.setForeground(java.awt.Color.white);
        studentNameLabel.setText("Student Name:");
        studentNameLabel.setOpaque(true);
        propertyLayoutPanel.add(studentNameLabel);

        studentNameTextField.setPreferredSize(new java.awt.Dimension(180, 27));
        propertyLayoutPanel.add(studentNameTextField);

        javax.swing.GroupLayout propertyPanelLayout = new javax.swing.GroupLayout(propertyPanel);
        propertyPanel.setLayout(propertyPanelLayout);
        propertyPanelLayout.setHorizontalGroup(
            propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(propertyLayoutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        propertyPanelLayout.setVerticalGroup(
            propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
            .addGroup(propertyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(propertyPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(propertyLayoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addContainerGap()))
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

        tabelPanel.setBackground(new java.awt.Color(143, 19, 21));
        tabelPanel.setPreferredSize(new java.awt.Dimension(1000, 376));

        tableLayoutPanel.setBackground(new java.awt.Color(143, 19, 21));

        tableScrollPane.setPreferredSize(new java.awt.Dimension(452, 200));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(jTable);

        tableLayoutPanel.add(tableScrollPane);

        javax.swing.GroupLayout tabelPanelLayout = new javax.swing.GroupLayout(tabelPanel);
        tabelPanel.setLayout(tabelPanelLayout);
        tabelPanelLayout.setHorizontalGroup(
            tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tableLayoutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabelPanelLayout.setVerticalGroup(
            tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
            .addGroup(tabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tableLayoutPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(propertyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(propertyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name = getStudentNameTextField();
        
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }        
        else {
            String[] studentsArray = {name};
            studentsTableController.addRow(studentsArray);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String name = getStudentNameTextField();
        
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a name.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
        }        
        else {                
            int[] index = jTable.getSelectedRows();

            if (index.length > 1) {
                JOptionPane.showMessageDialog(this, "Please update 1 file type at a time.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else {
                String[] projectArray = {String.valueOf(studentID), name};
                studentsTableController.setSelectedIndex(jTable.getSelectedRow());
                studentsTableController.updateRow(projectArray);
            }
        }         
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] index = jTable.getSelectedRows();
        studentsTableController.deleteRow(index);
        jTable.clearSelection();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        studentsTableController.clearRow();
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
    private javax.swing.JPanel propertyLayoutPanel;
    private javax.swing.JPanel propertyPanel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JPanel tabelPanel;
    private javax.swing.JPanel tableLayoutPanel;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    // updates the table model using the controller
    public void updateTable() {
    	jTable.setModel(studentsTableController.getTableModel());
    }

    /**
     * @return the studentNameTextField
     */
    public String getStudentNameTextField() {
        return studentNameTextField.getText();
    }

    /**
     * @param studentNameTextField the studentNameTextField to set
     */
    public void setStudentNameTextField(String studentNameTextField) {
        this.studentNameTextField.setText(studentNameTextField);
    }

    /**
     * @return the projectID
     */
    public long getProjectID() {
        return projectID;
    }

    /**
     * @param projectID the projectID to set
     */
    public void setProjectID(long projectID) {
        this.projectID = projectID;
    }

    /**
     * @return the studentID
     */
    public long getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
    
    
}
