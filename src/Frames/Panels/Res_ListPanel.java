/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames.Panels;

import vaccinationsystem.VaccinationSystem;
import vaccinationsystem.ReservOfficer;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class Res_ListPanel extends javax.swing.JPanel {

    /**
     * Creates new form Doc_ListPanel
     */
    public Res_ListPanel() {
        initComponents();
        addRowsTojTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Age", "First Name", "Last Name", "User Name", "Password", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

  public void addRowsTojTable() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        Object rowData[] = new Object[7];

        ReservOfficer e = new ReservOfficer();
        ArrayList<ReservOfficer> ReservOfficers = new ArrayList<ReservOfficer>();

        ReservOfficers = e.ListAllReservOfficers();
        
            for (ReservOfficer x : ReservOfficers) {
                rowData[0] = x.getPId();
                rowData[1] = x.getPAge();
                rowData[2] = x.getPFirstName();
                rowData[3] = x.getPLastName();
                rowData[4] = x.getUserName();
                rowData[5] = x.getPassword();
                rowData[6] = x.getSalary();
                model.addRow(rowData);
            }
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
