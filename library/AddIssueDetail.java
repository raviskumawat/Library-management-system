package library;

import java.sql.*;
import javax.swing.JOptionPane;

public class AddIssueDetail extends javax.swing.JInternalFrame {
    int nIssue_ID;
    String nIDate,nDDate;

    public AddIssueDetail() {
        initComponents();
        Issue_ID();
        Sname();
        Bname();
        date();
    }
    private void Issue_ID(){//to get Issu_ID
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("Select * from IssueRecords");

            while(rs.next()){
            nIssue_ID=Integer.parseInt(rs.getString("Issue_ID"));
            }
            nIssue_ID=nIssue_ID+1;
            Issue_IDTF.setText(""+nIssue_ID);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
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
    private void date(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("select curdate() IDate,curdate() + 7 DDate");
            while (rs.next()) {
                nIDate=rs.getString("IDate");
                String date=rs.getString("DDate");
                nDDate=date.substring(0,4)+"-"+date.substring(4,6)+"-"+date.substring(6,8);
                IDateTF.setText(nIDate);
                DDateTF.setText(nDDate);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void refresh(){
        SnameCB.removeAllItems();
        BnameCB.removeAllItems();
        Issue_ID();
        Sname();
        Bname();
        date();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        SnoLB = new javax.swing.JLabel();
        DDateTF = new javax.swing.JTextField();
        ToLB = new javax.swing.JLabel();
        IDateTF = new javax.swing.JTextField();
        DateLB = new javax.swing.JLabel();
        SnameLB = new javax.swing.JLabel();
        RefreshBtn = new javax.swing.JButton();
        Issue_IDLB = new javax.swing.JLabel();
        Issue_IDTF = new javax.swing.JTextField();
        SnameCB = new javax.swing.JComboBox();
        BnameCB = new javax.swing.JComboBox();
        StatusLB = new javax.swing.JLabel();
        StatusTF = new javax.swing.JTextField();
        AdmnoLB = new javax.swing.JLabel();
        AdmnoTF = new javax.swing.JTextField();
        QtyLB = new javax.swing.JLabel();
        QtyTF = new javax.swing.JTextField();

        setTitle("LibSoft System Ver 1.4");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Issue Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        SnoLB.setText("Book Name");

        DDateTF.setEditable(false);

        ToLB.setText("To");

        IDateTF.setEditable(false);

        DateLB.setText("Date of Issue");

        SnameLB.setText("Student Name");

        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        Issue_IDLB.setText("Issue_ID");

        Issue_IDTF.setEditable(false);

        SnameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameCBActionPerformed(evt);
            }
        });

        BnameCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnameCBActionPerformed(evt);
            }
        });

        StatusLB.setText("Status");

        StatusTF.setEditable(false);
        StatusTF.setText("Issued");

        AdmnoLB.setText("Admision no.");

        QtyLB.setText("Quantity");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(SubmitBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DateLB)
                            .addComponent(SnameLB)
                            .addComponent(Issue_IDLB)
                            .addComponent(SnoLB)
                            .addComponent(StatusLB))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Issue_IDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BnameCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SnameCB, javax.swing.GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdmnoLB)
                                    .addComponent(QtyLB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QtyTF, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                    .addComponent(AdmnoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RefreshBtn)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(IDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ToLB))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(StatusTF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(DDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(ExitBtn)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Issue_IDLB)
                    .addComponent(Issue_IDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SnameLB)
                    .addComponent(SnameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdmnoLB)
                    .addComponent(AdmnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SnoLB)
                    .addComponent(BnameCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QtyLB)
                    .addComponent(QtyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLB)
                    .addComponent(IDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ToLB)
                    .addComponent(DDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StatusLB)
                            .addComponent(StatusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubmitBtn)
                            .addComponent(RefreshBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(ExitBtn))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        refresh();
}//GEN-LAST:event_RefreshBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_ExitBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
                      
            String nSname =(String) SnameCB.getSelectedItem();
            String nBname =(String) BnameCB.getSelectedItem();
            String nStatus=StatusTF.getText();
            
            String strSQL = "insert into IssueRecords(Issue_Id,Sname,Bname,IssueDate,DueDate,Status,Fine) values("+nIssue_ID+",'"+nSname+"','" + nBname + "','" + nIDate + "','" + nDDate +"','"+nStatus+ "',0)";
            System.out.println(nIssue_ID+"|"+nSname+"|"+nBname+"|"+nIDate+"|"+nDDate);
            System.out.print("Insert new record :");
            int re = con.createStatement().executeUpdate(strSQL);
            System.out.println(re + " rows effected");
            JOptionPane.showMessageDialog(this,"Record Added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        //Updating Qty
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            int nqty=Integer.parseInt(QtyTF.getText());
            con.createStatement().execute("update books set quantity="+(nqty-1));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        refresh();
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void SnameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameCBActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            String nsname=(String)SnameCB.getSelectedItem();
            ResultSet rs = con.createStatement().executeQuery("select * from student where sname='" + nsname + "'");
            while(rs.next()){
                String nadmno=rs.getString("admno");
                AdmnoTF.setText(nadmno);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_SnameCBActionPerformed

    private void BnameCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnameCBActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            String nbname=(String)BnameCB.getSelectedItem();
            ResultSet rs = con.createStatement().executeQuery("select * from books where bname='" + nbname + "'");
            while(rs.next()){
                String nqty=rs.getString("quantity");
                QtyTF.setText(nqty);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_BnameCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdmnoLB;
    private javax.swing.JTextField AdmnoTF;
    private javax.swing.JComboBox BnameCB;
    private javax.swing.JTextField DDateTF;
    private javax.swing.JLabel DateLB;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JTextField IDateTF;
    private javax.swing.JLabel Issue_IDLB;
    private javax.swing.JTextField Issue_IDTF;
    private javax.swing.JLabel QtyLB;
    private javax.swing.JTextField QtyTF;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JComboBox SnameCB;
    private javax.swing.JLabel SnameLB;
    private javax.swing.JLabel SnoLB;
    private javax.swing.JLabel StatusLB;
    private javax.swing.JTextField StatusTF;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel ToLB;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
