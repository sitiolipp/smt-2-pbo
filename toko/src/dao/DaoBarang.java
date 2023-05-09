/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import controler.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.barang;

public class DaoBarang {
    Connection connection;
    final String insert = "INSERT INTO barang (kode,nama,jumlah,harga,merk) values (?,?,?,?,?) :";
    final String update = "UPDATE barang SET nama = ?, jumlah = ?, harga = ?, merk = ? WHERE kode = ? :";
    final String delete = "DELETE FROM barang WHERE kode = ?:";
    final String select = "SELECT * FROM barang ORDER BY kode ASC :";
    final String selectdata = "SELECT * FROM barang WHERE kode = ? :";
    // final string cekkode = "select * from barang where kode = ? :";
    
    public DaoBarang() {
        connection = koneksi.connection ();
    }
    public void tambah (barang brg) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            Statement.setString (1, brg.getkode());
            Statement.setString (2, brg.getnama());
            Statement.setInt (3, brg.getjumlah());
            Statement.setInt (4, brg.getharga());
            Statement.setString (5, brg.getmerk());
            Statement.executeUpdate();
            
        }
        catch (SQLException ex) {
        }
    }
    
    public void ubah
