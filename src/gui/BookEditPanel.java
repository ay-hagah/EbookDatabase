package gui;

import database.Author;
import database.Book;
import database.Publisher;
import database.User;
import java.sql.*;

public class BookEditPanel extends javax.swing.JPanel {
    private static User user;
    public Connection conn;

    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    /**
     * Creates new form ListViewPanel
     */
    public BookEditPanel() {
        initComponents();

        setUser(new User("Guest", "guest"));

        if (!this.user.isAdmin()) {
            // Disable buttons that are only available for admin
            // like edit, add, etc...
            DeleteBookButton.setEnabled(false);
            editButton.setEnabled(false);
        }

    }

    public static void adminMode() {
        DeleteBookButton.setEnabled(true);
        editButton.setEnabled(true);
    }

    public static void setUser(User usr) {
        user = usr;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        bookTitle1 = new javax.swing.JTextField();
        bookType1 = new javax.swing.JTextField();
        bookPageCount1 = new javax.swing.JTextField();
        bookPrice1 = new javax.swing.JTextField();
        bookYear1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        authorFirstName1 = new javax.swing.JTextField();
        authorLastName1 = new javax.swing.JTextField();
        authorDateOfBirth1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        publisherName = new javax.swing.JTextField();
        publisherCity1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        publisherPhone1 = new javax.swing.JTextField();
        DeleteBookButton1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        targetBook1 = new javax.swing.JTextField();
        editButton1 = new javax.swing.JButton();
        codeField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        authorIDFIeld = new javax.swing.JTextField();
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
        jLabel14 = new javax.swing.JLabel();
        publisherCity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        publisherPhone = new javax.swing.JTextField();
        DeleteBookButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        targetBook = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        publisherNameField = new javax.swing.JTextField();
        publisherCode = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        authorIDField = new javax.swing.JTextField();

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Title");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel12.setText("Type");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel19.setText("Page count");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel20.setText("Price");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel21.setText("Year");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        jPanel2.add(bookTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 125, -1));
        jPanel2.add(bookType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 125, -1));
        jPanel2.add(bookPageCount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 125, -1));
        jPanel2.add(bookPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 125, -1));
        jPanel2.add(bookYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 125, -1));

        jLabel22.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel22.setText("Book");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 33));

        jLabel23.setText("First name");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel24.setText("Last name");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel25.setText("Date of birth");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        authorFirstName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFirstName1ActionPerformed(evt);
            }
        });
        jPanel2.add(authorFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 125, -1));
        jPanel2.add(authorLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 125, -1));
        jPanel2.add(authorDateOfBirth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 125, -1));

        jLabel26.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel26.setText("Author");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, 33));

        jLabel27.setText("Name");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        jLabel28.setText("City");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));
        jPanel2.add(publisherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 125, -1));
        jPanel2.add(publisherCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 125, -1));

        jLabel29.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel29.setText("Publisher");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, 33));

        jLabel30.setText("Date of birth");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabel31.setText("Phone");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        publisherPhone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherPhone1ActionPerformed(evt);
            }
        });
        jPanel2.add(publisherPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 125, -1));

        DeleteBookButton1.setText("Delete Book");
        DeleteBookButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBookButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBookButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 140, 60));

        jLabel32.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel32.setText("Edit book of ISBN");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, -1));

        targetBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetBook1ActionPerformed(evt);
            }
        });
        jPanel2.add(targetBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, 30));

        editButton1.setText("Edit Book");
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(editButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 60));
        jPanel2.add(codeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 125, -1));

        jLabel13.setText("Code");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel33.setText("ID");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        authorIDFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorIDFIeldActionPerformed(evt);
            }
        });
        jPanel2.add(authorIDFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 125, -1));

        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel2.setText("Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setText("Page count");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel6.setText("Year");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        jPanel1.add(bookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 125, -1));
        jPanel1.add(bookType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 125, -1));
        jPanel1.add(bookPageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 125, -1));
        jPanel1.add(bookPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 125, -1));
        jPanel1.add(bookYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 125, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setText("Book");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 33));

        jLabel9.setText("First name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel10.setText("Last name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel11.setText("Date of birth");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        authorFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(authorFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 125, -1));
        jPanel1.add(authorLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 125, -1));
        jPanel1.add(authorDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 125, -1));

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel15.setText("Author");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, 33));

        jLabel14.setText("City");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));
        jPanel1.add(publisherCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 125, -1));

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel16.setText("Publisher");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, 33));

        jLabel17.setText("Date of birth");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabel18.setText("Phone");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        publisherPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(publisherPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 125, -1));

        DeleteBookButton.setText("Delete Book");
        DeleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 140, 60));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Edit book of ISBN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, -1));

        targetBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetBookActionPerformed(evt);
            }
        });
        jPanel1.add(targetBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, 30));

        editButton.setText("Edit Book");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 60));

        jLabel34.setText("Code");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jLabel35.setText("Name");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        publisherNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherNameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(publisherNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 125, -1));
        jPanel1.add(publisherCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 125, -1));

        jLabel36.setText("ID");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        authorIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(authorIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 125, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void targetBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetBookActionPerformed

    private void DeleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBookButtonActionPerformed
        Book b = new Book(targetBook.getText());
        b.DeleteBook(conn);
    }//GEN-LAST:event_DeleteBookButtonActionPerformed

    private void authorFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorFirstNameActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String target = targetBook.getText();
        Book b = new Book(target);
        Author author = new Author(
                authorIDFIeld.getText(),
                authorFirstName.getText(),
                authorLastName.getText(),
                authorDateOfBirth.getText());
        Publisher publisher = new Publisher(publisherCode.getText(),
                publisherNameField.getText(),
                publisherCity.getText(),
               publisherPhone.getText());
        Book toEdit = new Book(target,
                bookTitle.getText(),
                bookType.getText(),
                Integer.parseInt(bookPageCount.getText()),
                Integer.parseInt(bookPrice.getText()),
                bookYear.getText(),
                publisher,
                author
        );

        b.UpdateBook(conn, toEdit);

    }//GEN-LAST:event_editButtonActionPerformed

    private void publisherPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherPhoneActionPerformed

    private void authorFirstName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFirstName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorFirstName1ActionPerformed

    private void publisherPhone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherPhone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherPhone1ActionPerformed

    private void DeleteBookButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBookButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBookButton1ActionPerformed

    private void targetBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_targetBook1ActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButton1ActionPerformed

    private void authorIDFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorIDFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorIDFIeldActionPerformed

    private void publisherNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherNameFieldActionPerformed

    private void authorIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorIDFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JButton DeleteBookButton;
    static javax.swing.JButton DeleteBookButton1;
    private javax.swing.JTextField authorDateOfBirth;
    private javax.swing.JTextField authorDateOfBirth1;
    private javax.swing.JTextField authorFirstName;
    private javax.swing.JTextField authorFirstName1;
    private javax.swing.JTextField authorIDFIeld;
    private javax.swing.JTextField authorIDField;
    private javax.swing.JTextField authorLastName;
    private javax.swing.JTextField authorLastName1;
    private javax.swing.JTextField bookPageCount;
    private javax.swing.JTextField bookPageCount1;
    private javax.swing.JTextField bookPrice;
    private javax.swing.JTextField bookPrice1;
    private javax.swing.JTextField bookTitle;
    private javax.swing.JTextField bookTitle1;
    private javax.swing.JTextField bookType;
    private javax.swing.JTextField bookType1;
    private javax.swing.JTextField bookYear;
    private javax.swing.JTextField bookYear1;
    private javax.swing.JTextField codeField;
    static javax.swing.JButton editButton;
    static javax.swing.JButton editButton1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField publisherCity;
    private javax.swing.JTextField publisherCity1;
    private javax.swing.JTextField publisherCode;
    private javax.swing.JTextField publisherName;
    private javax.swing.JTextField publisherNameField;
    private javax.swing.JTextField publisherPhone;
    private javax.swing.JTextField publisherPhone1;
    private javax.swing.JTextField targetBook;
    private javax.swing.JTextField targetBook1;
    // End of variables declaration//GEN-END:variables
}
