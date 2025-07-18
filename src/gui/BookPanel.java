/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

import database.Author;
import database.Book;
import database.Publisher;
import database.User;
import java.sql.Connection;

/**
 *
 * @author m1cr0xf7
 */
public class BookPanel extends javax.swing.JPanel {

    private static User user;

    public Connection conn;

    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    /**
     * Creates new form ListViewPanel
     */
    public BookPanel() {
        initComponents();

        setUser(new User("Guest", "guest"));

        if (!this.user.isAdmin()) {
            // Disable buttons that are only available for admin
            // like edit, add, etc...
            addButton.setEnabled(false);
        }

    }

    public static void adminMode() {
        addButton.setEnabled(true);
    }

    public static void setUser(User usr) {
        user = usr;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel11 = new javax.swing.JLabel();
        authorFullName = new javax.swing.JTextField();
        authorDateOfBirth = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        publisherName = new javax.swing.JTextField();
        publisherCity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        publisherPhone = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        StatusMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bookISBN = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setText("Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setText("Page count");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setText("Year");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(bookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 125, -1));
        jPanel1.add(bookType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 125, -1));
        jPanel1.add(bookPageCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 125, -1));
        jPanel1.add(bookPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 125, -1));
        jPanel1.add(bookYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 125, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel8.setText("Book");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 6, -1, 33));

        jLabel9.setText("Full name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jLabel11.setText("Date of birth");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        authorFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorFullNameActionPerformed(evt);
            }
        });
        jPanel1.add(authorFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 125, -1));
        jPanel1.add(authorDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 125, -1));

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel15.setText("Author");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 33));

        jLabel13.setText("Name");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel14.setText("City");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));
        jPanel1.add(publisherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 125, -1));
        jPanel1.add(publisherCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 125, -1));

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel16.setText("Publisher");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 33));

        jLabel18.setText("Phone");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));
        jPanel1.add(publisherPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 125, -1));

        addButton.setText("Add Book");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 140, 60));
        jPanel1.add(StatusMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 330, 160));

        jLabel3.setText("ISBN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        jPanel1.add(bookISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 125, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void authorFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorFullNameActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // hahahhahahahahahah
        Book b;
        Author author = new Author();
        author.SetFirstNameAndLastNameByExtractingFullName(authorFullName.getText());
        author.setDateOfBirth(authorDateOfBirth.getText());
        Publisher publisher = new Publisher(
                publisherName.getText(),
                publisherCity.getText(),
                publisherPhone.getText());
        b = new Book(bookISBN.getText(),
                bookTitle.getText(),
                bookType.getText(),
                Integer.parseInt(bookPageCount.getText()),
                Integer.parseInt(bookPrice.getText()),
                bookYear.getText(),
                publisher,
                author);
        b.AddBook(conn);
    }//GEN-LAST:event_addButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StatusMessage;
    public static javax.swing.JButton addButton;
    private javax.swing.JTextField authorDateOfBirth;
    private javax.swing.JTextField authorFullName;
    private javax.swing.JTextField bookISBN;
    private javax.swing.JTextField bookPageCount;
    private javax.swing.JTextField bookPrice;
    private javax.swing.JTextField bookTitle;
    private javax.swing.JTextField bookType;
    private javax.swing.JTextField bookYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField publisherCity;
    private javax.swing.JTextField publisherName;
    private javax.swing.JTextField publisherPhone;
    // End of variables declaration//GEN-END:variables
}
