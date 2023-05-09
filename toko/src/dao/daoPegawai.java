//notenya tidak buat daobaru, tp daologin jadi satu disini

package dao;

import controller.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pegawai;
import model.barang;

/**
 *
 * @author USER
 */
public class daoPegawai {
    List<Pegawai> Listpeg;
    Connection connection;
    Pegawai peg = new Pegawai();
    
    final String insert = "INSERT into pegawai(nik, nama, alamat, jabatan, jenkel, username, password) VALUES (?,?,?,?,?,?,?);";
    final String update = "UPDATE pegawai SET namapeg=?, alamat=?, jabatan=?, jenkel=?, username=?, password=? WHERE nik=?;";
    final String updatePass = "UPDATE pegawai set password=? WHERE username=?";
    final String delete = "DELETE * FROM pegawai WHERE nik=?;";
    final String select = "SELECT * FROM pegawai ORDER BY nik ASC;";
    final String selectnik = "SELECT COUNT (nik)*1 AS urut FROM pegawai;";
    final String selectData = "SELECT * FROM pegawai where nik=?;";
    final String cekuser = "SELECT * FROM pegawai WHERE username=?;";
    final String cekuserpass = "SELECT * FROM pegawai WHERE username=? AND password=?;";
    final String cari = "SELECT * FROM pegawai WHERE namapeg LIKE ?";
    
    public daoPegawai(){
        connection = koneksi.connection();
    }
    
    public int ceknik () {
        PreparedStatement statement = null;
        int noUrut = 0;
        try {
            statement = connection.prepareStatement(selectnik);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                noUrut = rs.getInt("urut");
            }
        } catch (SQLException ex) {
        } return + noUrut;
    }
    
    public void tambah(Pegawai peg) {
            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(insert);
                statement.setString(1, peg.getNik());
                statement.setString(2, peg.getNama());
                statement.setString(3, peg.getAlamat());
                statement.setString(4, peg.getJabatan());
                statement.setString(5, peg.getJenkel());
                statement.setString(6, peg.getUsername());
                statement.setString(7, peg.getPassword());
                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    
        public void ubah(Pegawai peg) {
            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(update);
                statement.setString(1, peg.getNik());
                statement.setString(2, peg.getNama());
                statement.setString(3, peg.getAlamat());
                statement.setString(4, peg.getJabatan());
                statement.setString(5, peg.getJenkel());
                statement.setString(6, peg.getUsername());
                statement.setString(7, peg.getPassword());
                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        
        public void hapus(Pegawai pegawai) {
            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(delete);
                statement.setString(1, pegawai.getNik());
                statement.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        
        public int cekUser(String user) {
            PreparedStatement statement = null;
            int ketemu = 0;
            try {
                statement = connection.prepareStatement(cekuser);
                statement.setString(1, user);
                ResultSet rs = statement.executeQuery();
                while(rs.next()) {
                    ketemu++;
                }
            } catch(SQLException ex) {
            } return ketemu;
        }
        
        public Pegawai cekuserpass (String user, String pass) {
            PreparedStatement statement = null;
            Pegawai peg = new Pegawai();
            try {
                statement = connection.prepareStatement(cekuserpass);
                statement.setString(1, user);
                statement.setString(2, pass);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    peg.setNik(rs.getString("nik"));
                    peg.setNama(rs.getString("namapeg"));
                }
            } catch (SQLException ex) {
            } return peg;
        }
        
        public void tampil(Pegawai pegawai) {
            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(selectData);
                statement.setString(1, pegawai.getNik());
                statement.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            } finally {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
        
        public void ubahpass (Pegawai peg) {
            PreparedStatement statement = null;
            try {
                statement = connection.prepareStatement(updatePass);
                statement.setString(1, peg.getPassword());
                statement.setString(2, peg.getUsername());
                statement.executeUpdate();            
        } catch (SQLException ex) {
        } 
}

        public List<Pegawai> cariPeg (String namapeg) {
            PreparedStatement statement = null;
            List<Pegawai> listPeg = null;
            try {
                listPeg = new ArrayList<>();
                statement.setString(1, "%" + namapeg + "%");
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    Pegawai peg = new Pegawai();
                    peg.setNik(rs.getString("nik"));
                    peg.setNama(rs.getString("namapeg"));
                    peg.setAlamat(rs.getString("alamat"));
                    peg.setJenkel(rs.getString("jenkel"));
                    peg.setJabatan(rs.getString("jabatan"));
                    peg.setUsername(rs.getString("username"));
                    peg.setPassword(rs.getString("password"));
                    listPeg.add(peg);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            } return listPeg;
        }
        
        public List<Pegawai> getData() {
                List<Pegawai> listPegawai = null;
                try {
                    listPegawai = new ArrayList<>();
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery(select);
                    while (rs.next()) {
                        Pegawai pegawai = new Pegawai();
                        pegawai.setNik(rs.getString("nik"));
                        pegawai.setNama(rs.getString("nama"));
                        pegawai.setAlamat(rs.getString("alamat"));
                        pegawai.setJabatan(rs.getString("jabatan"));
                        pegawai.setJenkel(rs.getString("jenkel"));
                        pegawai.setUsername(rs.getString("username"));
                        pegawai.setPassword(rs.getString("password"));
                        listPegawai.add(pegawai);
                    }
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, ex);
                }
                return listPegawai;
            }
            
        public int cekNik(String nik) {
                PreparedStatement statement = null;
                int ketemu = 0;
                try {
                    statement = connection.prepareStatement(selectData);
                    statement.setString(1, nik);
                    ResultSet rs = statement.executeQuery();
                    while(rs.next()) {
                        ketemu++;
                    }
                } catch (SQLException ex) {
                    System.out.print(ex.getMessage());
                }
                return ketemu;
            }

    
}
