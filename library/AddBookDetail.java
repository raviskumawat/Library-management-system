package library;

import java.sql.*;
import javax.swing.JOptionPane;

public class AddBookDetail extends javax.swing.JInternalFrame {
    int nsno;
    
    public AddBookDetail() {
        initComponents();
        sno();
    }

    private void sno(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");
            String SQL = "Select * from books";
            ResultSet rs = con.createStatement().executeQuery(SQL);
            while(rs.next()){
               nsno = Integer.parseInt(rs.getString("sno"));
            }
            nsno=nsno+1;
            SnoTF.setText(""+nsno);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void refresh(){
        BookTF.setText("");
        AuthorTF.setText("");
        PublisherTF.setText("");
        QTF.setText("");
        sno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ExitBtn = new javax.swing.JButton();
        RefreshBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        QTF = new javax.swing.JTextField();
        QLB = new javax.swing.JLabel();
        PublisherTF = new javax.swing.JTextField();
        PublisherLB = new javax.swing.JLabel();
        AuthorTF = new javax.swing.JTextField();
        AuthorLB = new javax.swing.JLabel();
        BookTF = new javax.swing.JTextField();
        BookLB = new javax.swing.JLabel();
        SnoTF = new javax.swing.JTextField();
        SnoLB = new javax.swing.JLabel();

        setTitle("LibSoft System Ver 1.4");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Book Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        QLB.setText("Quantities");

        PublisherLB.setText("Publisher Name");

        AuthorLB.setText("Author Name");

        BookLB.setText("Book Name");

        SnoTF.setEditable(false);

        SnoLB.setText("Serial No.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SubmitBtn)
                .addGap(45, 45, 45)
                .addComponent(RefreshBtn)
                .addGap(48, 48, 48)
                .addComponent(ExitBtn)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SnoLB)
                        .addComponent(BookLB)
                        .addComponent(AuthorLB)
                        .addComponent(PublisherLB)
                        .addComponent(QLB))
                    .addGap(54, 54, 54)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(QTF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PublisherTF)
                            .addComponent(SnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AuthorTF)
                            .addComponent(BookTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(21, 21, 21)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitBtn)
                    .addComponent(ExitBtn)
                    .addComponent(RefreshBtn))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SnoLB)
                        .addComponent(SnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BookLB)
                        .addComponent(BookTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AuthorLB)
                        .addComponent(AuthorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PublisherLB)
                        .addComponent(PublisherTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QLB)
                        .addComponent(QTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(70, Short.MAX_VALUE)))
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

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        refresh();
}//GEN-LAST:event_RefreshBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        String nquantity;
        if(Integer.parseInt(QTF.getText())>=0){
            nquantity = QTF.getText();

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "dps123");

                String nbname = BookTF.getText();
                String nauthor = AuthorTF.getText();
                String npublisher = PublisherTF.getText();

                String strSQL = "insert into books(sno,bname,author,publisher,quantity) values("+(nsno)+",'" + (nbname) + "','" + (nauthor) + "','" + (npublisher) + "',"+(nquantity)+")";
                con.createStatement().execute(strSQL);
                JOptionPane.showMessageDialog(this,"Record Added");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
        else
            JOptionPane.showMessageDialog(null,"Enter a valid value for quantity of books");
        refresh();
}//GEN-LAST:event_SubmitBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_ExitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorLB;
    private javax.swing.JTextField AuthorTF;
    private javax.swing.JLabel BookLB;
    private javax.swing.JTextField BookTF;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel PublisherLB;
    private javax.swing.JTextField PublisherTF;
    private javax.swing.JLabel QLB;
    private javax.swing.JTextField QTF;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JLabel SnoLB;
    private javax.swing.JTextField SnoTF;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
