/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import database.Book;
import java.sql.*;

/**
 *
 * @author m1cr0xf7
 */
public class BookViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListViewPanel
     */
    Connection conn;

    public BookViewPanel() {
        initComponents();
        conn = null;
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }

// dont remove    
    public void View(Book book) {
        System.out.println(book.publisher.city);
        System.out.println(book.publisher.code);
        System.out.println(book.publisher.name);

        publisherCity.setText(book.publisher.city);
        publisherCode.setText(book.publisher.code);
        publisherName.setText(book.publisher.name);
        publisherPhone.setText(book.publisher.phone);
        System.out.println(book.author.dateofbirth);
        System.out.println(book.author.firstname);
        System.out.println(book.author.lastname);
        authorDateOfBirth.setText(book.author.dateofbirth);
        authorFirstName.setText(book.author.firstname);
        authorLastName.setText(book.author.lastname);
        authorIDField.setText(book.author.id);
        bookISBN.setText(book.isbn);
        bookPageCount.setText(Integer.toString(book.pagecount));
        bookPrice.setText(Integer.toString(book.price));
        bookTitle.setText(book.title);
        bookType.setText(book.type);
        bookYear.setText(book.year);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bookTitle = new javax.swing.JTextField();
        bookType = new javax.swing.JTextField();
        bookPageCount = new javax.swing.JTextField();
        bookPrice = new javax.swing.JTextField();
        bookYear = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        authorFirstName = new javax.swing.JTextField();
        authorLastName = new javax.swing.JTextField();
        authorDateOfBirth = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        publisherCode = new javax.swing.JTextField();
        publisherName = new javax.swing.JTextField();
        publisherCity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        publisherPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bookISBN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        isbnToSearch = new javax.swing.JTextField();
        javax.swing.JButton ViewBookButton = new javax.swing.JButton();
        authorIDField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel2.setText("Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setText("Page count");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel6.setText("Year");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        bookTitle.setEditable(false);
        jPanel1.add(bookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 125, -1));

        bookType.setEditable(false);
        jPanel1.add(bookType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 125, -1));

        bookPageCount.setEditable(false);
        jPanel1.add(bookPageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 125, -1));

        bookPrice.setEditable(false);
        jPanel1.add(bookPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 125, -1));

        bookYear.setEditable(false);
        jPanel1.add(bookYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 125, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setText("Book");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 33));

        jLabel9.setText("First name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel10.setText("Last name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabel11.setText("Date of birth");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        authorFirstName.setEditable(false);
        authorFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(authorFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 125, -1));

        authorLastName.setEditable(false);
        jPanel1.add(authorLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 125, -1));

        authorDateOfBirth.setEditable(false);
        jPanel1.add(authorDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 125, -1));

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel15.setText("Author");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 33));

        jLabel12.setText("Code");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        jLabel13.setText("Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jLabel14.setText("City");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        publisherCode.setEditable(false);
        publisherCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherCodeActionPerformed(evt);
            }
        });
        jPanel1.add(publisherCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 125, -1));

        publisherName.setEditable(false);
        jPanel1.add(publisherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 125, -1));

        publisherCity.setEditable(false);
        jPanel1.add(publisherCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 125, -1));

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel16.setText("Publisher");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, 33));

        jLabel18.setText("Phone");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        publisherPhone.setEditable(false);
        jPanel1.add(publisherPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 125, -1));

        jLabel3.setText("ISBN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        bookISBN.setEditable(false);
        jPanel1.add(bookISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 125, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setText("ISBN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        isbnToSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnToSearchActionPerformed(evt);
            }
        });
        jPanel1.add(isbnToSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 180, 30));

        ViewBookButton.setText("View");
        ViewBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ViewBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, 30));

        authorIDField.setEditable(false);
        authorIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(authorIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 125, -1));

        jLabel17.setText("ID");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void authorFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorFirstNameActionPerformed

    private void publisherCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherCodeActionPerformed

    private void isbnToSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnToSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbnToSearchActionPerformed

    private void ViewBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBookButtonActionPerformed
        // TODO add your handling code here:
        String isbn = isbnToSearch.getText();

        Book book = Book.GetBook(conn, isbn);

        View(book);

    }//GEN-LAST:event_ViewBookButtonActionPerformed

    private void authorIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorIDFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField authorDateOfBirth;
    public static javax.swing.JTextField authorFirstName;
    public static javax.swing.JTextField authorIDField;
    public static javax.swing.JTextField authorLastName;
    public static javax.swing.JTextField bookISBN;
    public static javax.swing.JTextField bookPageCount;
    public static javax.swing.JTextField bookPrice;
    public static javax.swing.JTextField bookTitle;
    public static javax.swing.JTextField bookType;
    public static javax.swing.JTextField bookYear;
    private javax.swing.JTextField isbnToSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField publisherCity;
    public static javax.swing.JTextField publisherCode;
    public static javax.swing.JTextField publisherName;
    public static javax.swing.JTextField publisherPhone;
    // End of variables declaration//GEN-END:variables
}
