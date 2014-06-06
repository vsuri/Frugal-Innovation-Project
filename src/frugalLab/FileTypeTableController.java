package frugalLab;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


/**
* 
* @author Hinsen Chan
*/
public class FileTypeTableController implements ListSelectionListener, TableModelListener{
    private FileTypeTableModel fileTypeTableModel;
    private FileTypePanel fileTypePanel;
    private boolean jTableRowSelected = false; // monitors if row is selected in jTable
    private int firstIndex;
	
    public FileTypeTableController(FileTypePanel fileTypePanel) {
        this.fileTypePanel = fileTypePanel;   
        // create the tableModel using the data in the cachedRowSet
	fileTypeTableModel = new FileTypeTableModel(); 
	fileTypeTableModel.addTableModelListener(this);
    }	
	
    // new code
    public TableModel getTableModel() {
        return fileTypeTableModel;
    }
	
    public void valueChanged(ListSelectionEvent e) {        
        jTableRowSelected = true; // row is selected in jTable
        ListSelectionModel selectModel = (ListSelectionModel) e.getSource();
	firstIndex = selectModel.getMinSelectionIndex();                
		
	// read the data in each column using getValueAt and display it on corresponding textfield
	fileTypePanel.setFileTypeTextField( (String)fileTypeTableModel.getValueAt(firstIndex, 1));
    }
	
    public void tableChanged(TableModelEvent e)
    {
        try {
            // get the index of the inserted row
	    firstIndex =  e.getFirstRow();
            System.out.println();
	    	
	    // create a new table model with the new data
	    fileTypeTableModel = new FileTypeTableModel(fileTypeTableModel.getList(), fileTypeTableModel.getEntityManager());
	    fileTypeTableModel.addTableModelListener(this);
	    // update the JTable with the data
	    fileTypePanel.updateTable();
	    
	    // read the data in each column using getValueAt and display it on corresponding textfield
            fileTypePanel.setFileTypeTextField( (String) fileTypeTableModel.getValueAt(firstIndex, 1));            
	} catch(Exception exp) {
            exp.getMessage();
            exp.printStackTrace();
	}
    }

    public void addRow(String[] array) {   
        try {
            if (!locate(array[0])) {
                fileTypeTableModel.addRow(array); // add row to database
                tableChanged(new TableModelEvent(getTableModel()));                
            }
            else {
                JOptionPane.showMessageDialog(fileTypePanel, "This file type already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            jTableRowSelected = false; // row is deselected in jTable
        }
    }
    
    public void updateRow(String[] array) {
        try {
            if (jTableRowSelected == true) {
                fileTypeTableModel.updateRow(firstIndex, array);
                tableChanged(new TableModelEvent(getTableModel()));
            }
            else {
                JOptionPane.showMessageDialog(fileTypePanel, "Please select a file type to delete.", 
                    "Error", JOptionPane.ERROR_MESSAGE);  
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            jTableRowSelected = false; // row is deselected in jTable
        }
    }

    public void deleteRow(int[] index) {
        try {            
            List<Integer> list = new ArrayList<Integer>();
            
            for (int data: index) {
                list.add(data);
            }
            
            Collections.sort(list,Collections.reverseOrder());

            
            if (jTableRowSelected == true) {
                for (int data : list) {
                    fileTypeTableModel.deleteRow(data); // delete row from jTable                
                }
                
                tableChanged(new TableModelEvent(getTableModel()));                
                fileTypePanel.setFileTypeTextField("");
            }
            else {
                JOptionPane.showMessageDialog(fileTypePanel, "Please select a file type to delete.", 
            	    "Error", JOptionPane.ERROR_MESSAGE);  
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            jTableRowSelected = false; // row is deselected in jTable
        }
    }
    
    public void clearRow() {
        fileTypePanel.setFileTypeTextField("");
    }
    
    public boolean locate(String fileType) {
        return fileTypeTableModel.locate(fileType);
    }
}