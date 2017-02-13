package library;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class UpdateIssueRecord extends javax.swing.JInternalFrame {

    public UpdateIssueRecord() {
        initComponents();
    }
 private void Sname(){//To get Student Name
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("Select * from student");
            while (rs.next()) {
                String nsname=rs.getString("Sname");
                SnameCB.addItem(nsname);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void Bname(){//To get Book Name
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("Select * from books");
            while (rs.next()) {
                String nbname=rs.getString("Bname");
                BnameCB.addItem(nbname);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddRecordBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        SnameLB = new javax.swing.JLabel();
        BnameLB = new javax.swing.JLabel();
        IDateLB = new javax.swing.JLabel();
        IssueDateTF = new javax.swing.JTextField();
        DDateLB = new javax.swing.JLabel();
        DueDateTF = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        Issue_IDLB = new javax.swing.JLabel();
        Issue_IDTF = new javax.swing.JTextField();
        SnameCB = new javax.swing.JComboBox();
        BnameCB = new javax.swing.JComboBox();
        StatusLB = new javax.swing.JLabel();
        StatusTF = new javax.swing.JTextField();

        AddRecordBtn.setText("Add Issue Record to List");
        AddRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRecordBtnActionPerformed(evt);
            }
        });

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Issue Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        SnameLB.setText("Student Name");

        BnameLB.setText("Book Name.");

        IDateLB.setText(" Issue Date");

        IssueDateTF.setEditable(false);

        DDateLB.setText("Due Date");

        DueDateTF.setEditable(false);

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        Issue_IDLB.setText("Issue_Id");

        Issue_IDTF.setEditable(false);

        StatusLB.setText("Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DDateLB)
                            .addComponent(IDateLB)
                            .addComponent(BnameLB)
                            .addComponent(SnameLB)
                            .addComponent(Issue_IDLB)
                            .addComponent(StatusLB))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SnameCB, 0, 165, Short.MAX_VALUE)
                            .addComponent(Issue_IDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DueDateTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IssueDateTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                            .addComponent(BnameCB, 0, 165, Short.MAX_VALUE)
                            .addComponent(StatusTF, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(UpdateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(RefreshBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ExitBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Issue_IDLB)
                    .addComponent(Issue_IDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SnameLB)
                    .addComponent(SnameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BnameLB)
                    .addComponent(BnameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDateLB)
                    .addComponent(IssueDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DDateLB)
                    .addComponent(DueDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusLB)
                    .addComponent(StatusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn)
                    .addComponent(RefreshBtn)
                    .addComponent(ExitBtn))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                    .addComponent(AddRecordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddRecordBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_ExitBtnActionPerformed

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        DefaultListModel dModel=(DefaultListModel)jList1.getModel();
        dModel.clear();
        jList1.setModel(dModel);
        Issue_IDTF.setText("");
        IssueDateTF.setText("");
        DueDateTF.setText("");
        SnameCB.removeAllItems();
        BnameCB.removeAllItems();
        StatusTF.setText("");
}//GEN-LAST:event_RefreshBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            
            String nIssue_ID = Issue_IDTF.getText();
            String nSname = (String)SnameCB.getSelectedItem();
            String nBname = (String)BnameCB.getSelectedItem();
            String nStatus=StatusTF.getText();

            String strSQL = "update IssueRecords set sname='"+nSname+"',Bname='"+nBname+"',Status='"+nStatus+"'where Issue_ID="+(nIssue_ID)+";";
            int re = con.createStatement().executeUpdate(strSQL);
            if(re==0)
                JOptionPane.showMessageDialog(this,"record doesn't exist");
            else
                JOptionPane.showMessageDialog(this,"record updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_UpdateBtnActionPerformed

    private void AddRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRecordBtnActionPerformed
        DefaultListModel dModel=(DefaultListModel)jList1.getModel();
        dModel.clear();
        Issue_IDTF.enableInputMethods(false);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("Select * from IssueRecords");
            while (rs.next()) {
                String nIssue_ID=rs.getString("Issue_ID");
                dModel.addElement(nIssue_ID);
            }
            jList1.setModel(dModel);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_AddRecordBtnActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String MTno=(String)jList1.getSelectedValue();
        Issue_IDTF.setText(MTno);
        Sname();
        Bname();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("Select * from IssueRecords where Issue_ID=" + MTno);

            while (rs.next()) {
                String nSname=rs.getString("Sname");
                String nBname=rs.getString("Bname");
                String nIDate=rs.getString("IssueDate");
                String nDDate=rs.getString("DueDate");
                String nStatus=rs.getString("Status");

                SnameCB.setSelectedItem(nSname);
                BnameCB.setSelectedItem(nBname);
                IssueDateTF.setText(nIDate);
                DueDateTF.setText(nDDate);
                StatusTF.setText(nStatus);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jList1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRecordBtn;
    private javax.swing.JComboBox BnameCB;
    private javax.swing.JLabel BnameLB;
    private javax.swing.JLabel DDateLB;
    private javax.swing.JTextField DueDateTF;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel IDateLB;
    private javax.swing.JTextField IssueDateTF;
    private javax.swing.JLabel Issue_IDLB;
    private javax.swing.JTextField Issue_IDTF;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JComboBox SnameCB;
    private javax.swing.JLabel SnameLB;
    private javax.swing.JLabel StatusLB;
    private javax.swing.JTextField StatusTF;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
