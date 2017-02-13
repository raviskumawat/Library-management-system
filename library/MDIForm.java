package library;

public class MDIForm extends javax.swing.JFrame {

    public MDIForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        AddRecord = new javax.swing.JMenu();
        StudentRecord = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        BookRecord = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        IssueRecord = new javax.swing.JMenuItem();
        UpdateRecord = new javax.swing.JMenu();
        EditStudentRecord = new javax.swing.JMenuItem();
        RemoveStudentRecord = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        EditBookRecord = new javax.swing.JMenuItem();
        RemoveBookRecord = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JSeparator();
        EditIssueRecord = new javax.swing.JMenuItem();
        RemoveIssueRecord = new javax.swing.JMenuItem();
        ViewRecord = new javax.swing.JMenu();
        studentRecord = new javax.swing.JMenuItem();
        bookRecord = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        IssueDetails = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        Contents = new javax.swing.JMenuItem();
        AboutUs = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Library");

        desktopPane.setBackground(new java.awt.Color(204, 204, 204));

        AddRecord.setText("Add ");

        StudentRecord.setText("Student Record");
        StudentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentRecordActionPerformed(evt);
            }
        });
        AddRecord.add(StudentRecord);
        AddRecord.add(jSeparator5);

        BookRecord.setText("Book Record");
        BookRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookRecordActionPerformed(evt);
            }
        });
        AddRecord.add(BookRecord);
        AddRecord.add(jSeparator2);

        IssueRecord.setText("Issue Record");
        IssueRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueRecordActionPerformed(evt);
            }
        });
        AddRecord.add(IssueRecord);

        menuBar.add(AddRecord);

        UpdateRecord.setText("Update");

        EditStudentRecord.setText("Edit Student Record ");
        EditStudentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStudentRecordActionPerformed(evt);
            }
        });
        UpdateRecord.add(EditStudentRecord);

        RemoveStudentRecord.setText("Remove Student Record");
        RemoveStudentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStudentRecordActionPerformed(evt);
            }
        });
        UpdateRecord.add(RemoveStudentRecord);
        UpdateRecord.add(jSeparator3);

        EditBookRecord.setText("Edit Book Record");
        EditBookRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBookRecordActionPerformed(evt);
            }
        });
        UpdateRecord.add(EditBookRecord);

        RemoveBookRecord.setText("Remove Book Record");
        RemoveBookRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBookRecordActionPerformed(evt);
            }
        });
        UpdateRecord.add(RemoveBookRecord);
        UpdateRecord.add(jSeparator4);

        EditIssueRecord.setText("Edit Issue Record");
        EditIssueRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditIssueRecordActionPerformed(evt);
            }
        });
        UpdateRecord.add(EditIssueRecord);

        RemoveIssueRecord.setText("Remove Issue Record");
        RemoveIssueRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveIssueRecordActionPerformed(evt);
            }
        });
        UpdateRecord.add(RemoveIssueRecord);

        menuBar.add(UpdateRecord);

        ViewRecord.setText("View");
        ViewRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRecordActionPerformed(evt);
            }
        });

        studentRecord.setText("Student Details");
        studentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRecordActionPerformed(evt);
            }
        });
        ViewRecord.add(studentRecord);

        bookRecord.setText("Book Details");
        bookRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRecordActionPerformed(evt);
            }
        });
        ViewRecord.add(bookRecord);
        ViewRecord.add(jSeparator1);

        IssueDetails.setText("Issue Details");
        IssueDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueDetailsActionPerformed(evt);
            }
        });
        ViewRecord.add(IssueDetails);

        menuBar.add(ViewRecord);

        helpMenu.setText("Help");

        Contents.setText("Contents");
        Contents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContentsActionPerformed(evt);
            }
        });
        helpMenu.add(Contents);

        AboutUs.setText("About Us");
        AboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutUsActionPerformed(evt);
            }
        });
        helpMenu.add(AboutUs);

        menuBar.add(helpMenu);

        Exit.setText("Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        menuBar.add(Exit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentRecordActionPerformed
        AddStudentDetail s1=new AddStudentDetail();
        desktopPane.add(s1);
        s1.setVisible(true);
}//GEN-LAST:event_StudentRecordActionPerformed

    private void BookRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookRecordActionPerformed
        AddBookDetail s1=new AddBookDetail();
        desktopPane.add(s1);
        s1.setVisible(true);
    }//GEN-LAST:event_BookRecordActionPerformed

    private void ViewRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRecordActionPerformed
        ViewStudentRecords s1=new ViewStudentRecords();
        desktopPane.add(s1);
        s1.setVisible(true);
}//GEN-LAST:event_ViewRecordActionPerformed

    private void bookRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRecordActionPerformed
        ViewBookRecords s1=new ViewBookRecords();
        desktopPane.add(s1);
        s1.setVisible(true);
}//GEN-LAST:event_bookRecordActionPerformed

    private void EditStudentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStudentRecordActionPerformed
        UpdateStudentRecord s1=new UpdateStudentRecord();
        desktopPane.add(s1);
        s1.setVisible(true);
}//GEN-LAST:event_EditStudentRecordActionPerformed

    private void studentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRecordActionPerformed
        ViewStudentRecords s1=new ViewStudentRecords();
        desktopPane.add(s1);
        s1.setVisible(true);
}//GEN-LAST:event_studentRecordActionPerformed

    private void RemoveStudentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStudentRecordActionPerformed
        RemoveStudentRecord s1=new RemoveStudentRecord();
        desktopPane.add(s1);
        s1.setVisible(true);
    }//GEN-LAST:event_RemoveStudentRecordActionPerformed

    private void IssueRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueRecordActionPerformed
        AddIssueDetail s1=new AddIssueDetail();
        desktopPane.add(s1);
        s1.setVisible(true);
    }//GEN-LAST:event_IssueRecordActionPerformed

    private void EditBookRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBookRecordActionPerformed
        UpdateBookRecord s1=new UpdateBookRecord();
        desktopPane.add(s1);
        s1.setVisible(true);
    }//GEN-LAST:event_EditBookRecordActionPerformed

    private void RemoveBookRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBookRecordActionPerformed
        RemoveBookRecord s1=new RemoveBookRecord();
        desktopPane.add(s1);
        s1.setVisible(true);
    }//GEN-LAST:event_RemoveBookRecordActionPerformed

    private void IssueDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueDetailsActionPerformed
        ViewIssueRecords s1=new ViewIssueRecords();
        desktopPane.add(s1);
        s1.setVisible(true);
}//GEN-LAST:event_IssueDetailsActionPerformed

    private void AboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutUsActionPerformed
        AboutUs s1=new AboutUs();
        desktopPane.add(s1);
        s1.setVisible(true);
    }//GEN-LAST:event_AboutUsActionPerformed

    private void ContentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContentsActionPerformed
        Contents s1=new Contents();
        desktopPane.add(s1);
        s1.setVisible(true);
}//GEN-LAST:event_ContentsActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void EditIssueRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditIssueRecordActionPerformed
        UpdateIssueRecord s1=new UpdateIssueRecord();
        desktopPane.add(s1);
        s1.setVisible(true);
}//GEN-LAST:event_EditIssueRecordActionPerformed

    private void RemoveIssueRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveIssueRecordActionPerformed
        RemoveIssueRecord s1=new RemoveIssueRecord();
        desktopPane.add(s1);
        s1.setVisible(true);
    }//GEN-LAST:event_RemoveIssueRecordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDIForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutUs;
    private javax.swing.JMenu AddRecord;
    private javax.swing.JMenuItem BookRecord;
    private javax.swing.JMenuItem Contents;
    private javax.swing.JMenuItem EditBookRecord;
    private javax.swing.JMenuItem EditIssueRecord;
    private javax.swing.JMenuItem EditStudentRecord;
    private javax.swing.JMenu Exit;
    private javax.swing.JMenuItem IssueDetails;
    private javax.swing.JMenuItem IssueRecord;
    private javax.swing.JMenuItem RemoveBookRecord;
    private javax.swing.JMenuItem RemoveIssueRecord;
    private javax.swing.JMenuItem RemoveStudentRecord;
    private javax.swing.JMenuItem StudentRecord;
    private javax.swing.JMenu UpdateRecord;
    private javax.swing.JMenu ViewRecord;
    private javax.swing.JMenuItem bookRecord;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem studentRecord;
    // End of variables declaration//GEN-END:variables

}
