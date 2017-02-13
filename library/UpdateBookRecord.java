package library;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class UpdateBookRecord extends javax.swing.JInternalFrame {

    public UpdateBookRecord() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SnoLB = new javax.swing.JLabel();
        BnameLB = new javax.swing.JLabel();
        AuthorLB = new javax.swing.JLabel();
        PublisherLB = new javax.swing.JLabel();
        QuantityLB = new javax.swing.JLabel();
        SnoTF = new javax.swing.JTextField();
        BnameTF = new javax.swing.JTextField();
        AuthorTF = new javax.swing.JTextField();
        PublisherTF = new javax.swing.JTextField();
        QuantityTF = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        AddToList = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setTitle("LibSoft System Ver 1.4");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Book Detail"));

        SnoLB.setText("Serial Number");

        BnameLB.setText("Book Name");

        AuthorLB.setText("Author Name");

        PublisherLB.setText("Publisher Name");

        QuantityLB.setText("Quantity");

        SnoTF.setEditable(false);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(QuantityLB)
                            .addComponent(PublisherLB)
                            .addComponent(AuthorLB)
                            .addComponent(BnameLB)
                            .addComponent(SnoLB))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PublisherTF)
                                .addComponent(SnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BnameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(AuthorTF))
                            .addComponent(QuantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(UpdateBtn)
                        .addGap(31, 31, 31)
                        .addComponent(RefreshBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(ExitBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SnoLB)
                    .addComponent(SnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BnameLB)
                    .addComponent(BnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AuthorLB)
                    .addComponent(AuthorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PublisherLB)
                    .addComponent(PublisherTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantityLB)
                    .addComponent(QuantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn)
                    .addComponent(RefreshBtn)
                    .addComponent(ExitBtn))
                .addGap(27, 27, 27))
        );

        AddToList.setText("Add Books to List");
        AddToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToListActionPerformed(evt);
            }
        });

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(AddToList, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddToList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            
            String nsno = SnoTF.getText();
            String nbname = BnameTF.getText();
            String nauthor = AuthorTF.getText();
            String npublisher = PublisherTF.getText();
            String nquantity = QuantityTF.getText();

            String strSQL = "update books set bname='"+(nbname)+"',author='"+(nauthor)+"',publisher='"+(npublisher)+"',quantity="+(nquantity)+" where sno="+(nsno)+";";
            int re = con.createStatement().executeUpdate(strSQL);
            if(re==0)
                JOptionPane.showMessageDialog(this,"record doesn't exist");
            else
                JOptionPane.showMessageDialog(this,"record updated");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void AddToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToListActionPerformed
        DefaultListModel dModel=(DefaultListModel)jList1.getModel();
        dModel.clear();
        SnoTF.enableInputMethods(false);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("Select * from books");
            while (rs.next()) {
                String nSno=rs.getString("Sno");
                dModel.addElement(nSno);
            }
            jList1.setModel(dModel);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_AddToListActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String MTno=(String)jList1.getSelectedValue();
        SnoTF.setText(MTno);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            ResultSet rs = con.createStatement().executeQuery("Select * from books where Sno=" + MTno);

            while (rs.next())
            {
                String nbname=rs.getString("bname");
                String nAuthor=rs.getString("author");
                String nPublisher=rs.getString("publisher");
                String nQty=rs.getString("quantity");

                BnameTF.setText(nbname);
                AuthorTF.setText(nAuthor);
                PublisherTF.setText(nPublisher);
                QuantityTF.setText(nQty);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        DefaultListModel dModel=(DefaultListModel)jList1.getModel();
        dModel.clear();
        jList1.setModel(dModel);
        SnoTF.setText("");
        BnameTF.setText("");
        AuthorTF.setText("");
        PublisherTF.setText("");
        QuantityTF.setText("");
    }//GEN-LAST:event_RefreshBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToList;
    private javax.swing.JLabel AuthorLB;
    private javax.swing.JTextField AuthorTF;
    private javax.swing.JLabel BnameLB;
    private javax.swing.JTextField BnameTF;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel PublisherLB;
    private javax.swing.JTextField PublisherTF;
    private javax.swing.JLabel QuantityLB;
    private javax.swing.JTextField QuantityTF;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JLabel SnoLB;
    private javax.swing.JTextField SnoTF;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
