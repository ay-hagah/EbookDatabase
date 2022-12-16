/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import database.Book;
import database.User;
import javax.swing.table.DefaultTableModel;

import java.sql.*;

/**
 *
 * @author m1cr0xf7
 */
public class ListViewPanel extends javax.swing.JPanel {

    private static User user;
    public DefaultTableModel model;    
    
    public Connection conn;
    
    public Book books[];
    
    public void setConnection(Connection conn) {
        this.conn = conn;
    }
    
    public static final int ROWS = 7; // 8-1
    
    public ListViewPanel() {
        initComponents();
        
        setUser(new User("Guest", "guest"));
        
        if (!this.user.isAdmin()) {
            // Disable buttons that are only available for admin
            // like edit, add, etc...
            bookEditorButton.setEnabled(false);
            DeleteButton.setEnabled(false);
        }
        model = (DefaultTableModel)listViewTable.getModel();
    }
    
    public void refreshBooks() {
        this.books = Book.GetAllBooks(conn);
        if (books == null) return;
        
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].pagecount == 0) break;
            setCell(books[i].isbn, i, 0);
            setCell(books[i].title, i, 1);
            setCell(books[i].type, i, 2); 
            setCell(books[i].pagecount, i, 3);
            setCell(books[i].price, i, 4);
            setCell(books[i].year, i, 5);
            setCell(books[i].publisher, i, 6);
        }
    }

    public String getValueAtColumn(int column) {
        int row = listViewTable.getSelectedRow();
        String value = listViewTable.getModel().getValueAt(row, column).toString();
        return value;
    }

    public void setCell(String value, int row, int col)
    {
        model.setValueAt(value, row, col);
    }
    
    public void setCell(int value, int row, int col)
    {
        model.setValueAt(value, row, col);
    }
    
    
    public static void adminMode() {
        bookEditorButton.setEnabled(true);
        DeleteButton.setEnabled(true);
        
    }
    
    public static void setUser(User usr) {
        user = usr;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listViewTable = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        bookEditorButton = new javax.swing.JButton();
        bookViewerButton = new javax.swing.JButton();
        RefreshTableButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 500));

        listViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "title", "type", "pages", "price", "year", "publisher"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listViewTable.setCellSelectionEnabled(true);
        listViewTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listViewTable);
        listViewTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        DeleteButton.setText("Delete Book");

        bookEditorButton.setText("Send book to book editor");
        bookEditorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookEditorButtonActionPerformed(evt);
            }
        });

        bookViewerButton.setText("Send book to book viewer");
        bookViewerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookViewerButtonActionPerformed(evt);
            }
        });

        RefreshTableButton.setText("Refresh Table");
        RefreshTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshTableButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bookViewerButton)
                .addGap(18, 18, 18)
                .addComponent(bookEditorButton)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton)
                .addGap(18, 18, 18)
                .addComponent(RefreshTableButton)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookEditorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookViewerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RefreshTableButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookEditorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookEditorButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookEditorButtonActionPerformed

    private void bookViewerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookViewerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookViewerButtonActionPerformed

    private void RefreshTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshTableButtonActionPerformed
        // TODO add your handling code here:
        refreshBooks();
    }//GEN-LAST:event_RefreshTableButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton DeleteButton;
    private javax.swing.JButton RefreshTableButton;
    public static javax.swing.JButton bookEditorButton;
    private javax.swing.JButton bookViewerButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listViewTable;
    // End of variables declaration//GEN-END:variables
}
