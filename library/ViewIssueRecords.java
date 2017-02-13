package library;

import javax.swing.table.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class ViewIssueRecords extends javax.swing.JInternalFrame {

    public ViewIssueRecords() {
        initComponents();
        try {
            String nStatus;
            int nIssue_ID,nFine=0,nDDate=0,nCDate,day;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("select Issue_ID,fine,DueDate+0 DDate,Status from IssueRecords");
            
            while(rs.next()){
                nIssue_ID=Integer.parseInt(rs.getString("Issue_ID"));
                nFine=Integer.parseInt(rs.getString("Fine"));
                nStatus=rs.getString("Status");
                nDDate=Integer.parseInt(rs.getString("DDate"));
                System.out.println(nIssue_ID+","+nFine+","+nDDate);
                ResultSet re = con.createStatement().executeQuery("select curdate()+0 CDate");
                while(re.next()){
                    nCDate=Integer.parseInt(re.getString("CDate"));
                    day=nCDate-nDDate;
                    if(day>0){
                        nFine=nFine+day*10;
                        con.createStatement().execute("update IssueRecords set Fine = "+nFine+",Status='due'"+" where Issue_ID = "+nIssue_ID+";");
                    }
                }
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setTitle("LibSoft System Ver 1.4");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Issue Record", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Issue_ID", "Student Name", "Book Name ", "Issue Date", "Due Date ", "Status", "Fine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Display");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jButton2)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        int rows=model.getRowCount();
        if(rows>0){
            for(int i=0;i<rows;i++){
                model.removeRow(0);
            }
        }

        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","dps123");
            ResultSet rs = con.createStatement().executeQuery("Select * from IssueRecords");
            while (rs.next()){
                String nIssue_ID=rs.getString("Issue_ID");
                String nSname=rs.getString("Sname");
                String nBname=rs.getString("Bname");
                String nIDate=rs.getString("IssueDate");
                String nDDate=rs.getString("DueDate");
                String nStatus=rs.getString("Status");
                String nFine=rs.getString("Fine");
                model.addRow(new Object[] {nIssue_ID,nSname,nBname,nIDate,nDDate,nStatus,nFine});
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
