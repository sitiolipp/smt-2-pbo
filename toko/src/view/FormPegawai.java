/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.mysql.jdbc.Connection;
import com.sun.jdi.connect.spi.Connection;
import controller.koneksi;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.koneksi;

/**
 *
 * @author USER
 */
public class FormPegawai extends javax.swing.JFrame {
    String sql;
    Statement st;
    Connection Con;
    ResultSet rs;

    /**
     * Creates new form FormPegawai
     */
    public FormPegawai() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jkel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnik = new javax.swing.JTextField();
        txtnm = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtjabat = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        rdLaki = new javax.swing.JRadioButton();
        rdPerempuan = new javax.swing.JRadioButton();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnbersih = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        btncek = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPegawai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("FORM PEGAWAI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(169, 169, 169))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 51));

        jLabel2.setText("NIK");

        jLabel3.setText("NAMA");

        jLabel4.setText("ALAMAT");

        jLabel5.setText("JABATAN");

        jkel.setText("JKEL");

        jLabel7.setText("USERNAME");

        jLabel8.setText("PASSWORD");

        rdLaki.setText("COWO");
        rdLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdLakiActionPerformed(evt);
            }
        });

        rdPerempuan.setText("CEWE");
        rdPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPerempuanActionPerformed(evt);
            }
        });

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnbersih.setText("BERSIH");
        btnbersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbersihActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        btncek.setText("CEK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jkel)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtjabat, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdLaki)
                        .addGap(33, 33, 33)
                        .addComponent(rdPerempuan)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsimpan)
                            .addComponent(btnubah)
                            .addComponent(btnbersih)
                            .addComponent(btnhapus)
                            .addComponent(btnkeluar))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btncek)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsimpan))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnubah))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbersih))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtjabat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jkel)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnkeluar))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncek))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tabelPegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelPegawai);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNikpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNikpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNikpActionPerformed

    private void txtNikpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNikpKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            tampilData();
            txtnik.requestFocus();
        }
    }//GEN-LAST:event_txtNikpKeyPressed

    private void txtNamapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamapActionPerformed

    private void txtNamapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamapKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtalamat.requestFocus();
        }
    }//GEN-LAST:event_txtNamapKeyPressed

    private void areaAlamatpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaAlamatpKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            rdLakiKeyPressed(evt);
        }
    }//GEN-LAST:event_areaAlamatpKeyPressed

    private void txtJabatanpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJabatanpKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtusername.requestFocus();
        }
    }//GEN-LAST:event_txtJabatanpKeyPressed

    private void rdLakiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdLakiKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtjabat.requestFocus();
        }
    }//GEN-LAST:event_rdLakiKeyPressed

    private void rdPerempuanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdPerempuanKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtjabat.requestFocus();
        }
    }//GEN-LAST:event_rdPerempuanKeyPressed

    private void txtUsernamepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernamepKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            btncek.requestFocus();
        }
    }//GEN-LAST:event_txtUsernamepKeyPressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        // TODO add your handling code here:
        Con = koneksi.getCon;
        try {
            sql="select * from pegawai where username='"+ txtusername.getText() +"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Username sudah digunakan");
                txtusername.requestFocus();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Pesan Kesalahan cek Data", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCekActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        hapusData();
        bersihForm();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbersih;
    private javax.swing.JButton btncek;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jkel;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tabelPegawai;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtjabat;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txtnm;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    private void tampilData() {
         Connection = koneksi.connection();
        try {
            sql = "SELECT * from pegawai where nik='"+ txtnik.getText() +"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txtnm.setText(rs.getString(2));
                txtalamat.setText(rs.getString(3));
                if (rs.getString("jkel").equals("L")) {
                    rdLaki.setSelected(true){
                } else {
                    rdPerempuan.setSelected(false);
                }
                txtjabat.setText(rs.getString("jabatan"));
                txtusername.setText(rs.getString("username"));
                txtpassword.setText(rs.getString("password"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Pesan Kesalahan Tampil Data", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    private void ubahData() {
        String jkel = (rdLaki.isSelected() ? "L" : "P");
        con = koneksi.connection();
        try {
            sql="UPDATE pegawai set nama='"+ txtnm.getText() +"'"
                    +",alamat='"+ txtalamat.getText() +"'"
                    +",jkel='"+ jkel +"',jabatan='"+ txtjabat.getText() +"'"
                    +",username='"+ txtusername.getText() +"',password='" +txtpassword.getText() +"'"
                    +"where nik='"+ txtnik.getText() +"'";
            st = con.createStatement();
            st.execute(sql);
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Pesan Kesalahan Ubah Data", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

    private void bersihForm() {
        txtnik.setText("");
        txtnm.setText("");
        txtalamat.setText("");
        rdLaki.setSelected(true);
        txtusername.setText("");
        txtpassword.setText("");
    }

    private void tampilTabel() {
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("Nik");
        tb.addColumn("Nama");
        tb.addColumn("Alamat");
        tb.addColumn("Jabatan");
        tb.addColumn("J. Kelamin");
        tb.addColumn("Username");
        
        try {
            con = koneksi.connection();
            sql = "select * from pegawai";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            tb.setRowCount(0);
            int i = 1;
            while (rs.next()) {
                Object[] data = new Object[6];
                data[0] = rs.getString("nik");
                data[1] = rs.getString("namaPeg");
                data[2] = rs.getString("alamat");
                data[3] = rs.getString("jabatan");
                data[4] = (rs.getString("jkel").equals("L")) ? "Laki-Laki" : "Perempuan";
                data[5] = rs.getString("username");
                tb.addRow(data);
                i++;     
            }
            tabelPegawai.setModel(tb);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan dalam pengambilan data");
        }
    }

    private void hapusData() {
        con = koneksi.connection();
        try {
            sql="DELETE from pegawai where nik='"+ txtnik.getText() +"'";
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Pesan Kesalahan Hapus Data", JOptionPane.ERROR_MESSAGE);
        }
    }
}