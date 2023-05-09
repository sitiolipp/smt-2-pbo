/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoPegawai;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pegawai;
import view.formlogin;

public class controllerlogin {
    formlogin frame;
    List<Pegawai> listPeg;
    daoPegawai daoPeg = new daoPegawai();
    Formlupa lupa = new Formlupa();
    Menuutama menu = new Menuutama();
    Formpembelian fbeli = new  Formpembelian;
    Pegawai tambahPeg = new Pegawai();
    
    public controllerlogin(formlogin frame) {
        this.frame = Frame;
        listPeg = daoPeg.getData();
    }
    
    public void cekdata() {
       if ((frame.gettxtusrnm().getText().equals("")) || (frame.gettxtpw().getText().equals(""))) {
           JOptionPane.showMessageDialog(frame, "usrnm atau pw belum diisi");
       } else {
           Pegawai peg = daoPeg.cekuserpass(frame.gettxtusrnm().getText(), frame.gettxtpw().getText());
           if (peg.getNik() !=null) {
               menu.setVisible(true);
               menu.setLblnik(peg.getNik());
               menu.setLblnamapeg(peg.getNama());
               fbeli.settxtpegawai(peg.getNama());
               batal();
               frame.setVisible(false);
           } else {
               JOptionPane.showMessageDialog(frame, "usrnm atau pw salah";
               batal();
           }
       }
    }
    
    public void lupapass () {
        frame.dispose();
        lupa.setVisible(true);
}
    
    public void batal () {
        frame.settxtusrnm("");
        frame.settxtpw("");
    }
    
    public void keluar () {
        frame.dispose();
    }
}