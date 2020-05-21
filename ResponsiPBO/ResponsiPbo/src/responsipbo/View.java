/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsipbo;

/**
 *
 * @author Burhan
 */

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class View extends JFrame{
    JLabel lJudul = new JLabel("Pembelian Tiket");
    JLabel lIdPesanan = new JLabel("ID Pesanan");
    JLabel lIdPemesan = new JLabel("ID Pemesan");
    JLabel lIdKereta = new JLabel("Id Kereta");
    JLabel lNoKursi = new JLabel("No Kursi");
    JLabel lKelas = new JLabel("Kelas");
    JLabel lTgl = new JLabel("Tanggal Pesan");
    
    JTextField tfIdPesanan = new JTextField();
    JTextField tfIdPemesan = new JTextField();
    JTextField tfIdKereta = new JTextField();
    JTextField tfNoKursi = new JTextField();
    JTextField tfKelas = new JTextField();
    JTextField tfTgl = new JTextField();
    
    JButton btnTambah = new JButton("Simpan");
    JButton btnUpdate = new JButton("Update");
    JButton btnHapus = new JButton("Hapus");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Id Pesanan", "Id Pemesan", "Nama Pemesan","IdKereta","Nama Kereta","Harga","Tujuan", "No Kursi", "Kelas", "tanggal","Status"};

    public View() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        tabel.setBackground (Color.WHITE);
  
        
        setTitle("Data Transaksi");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(900,400);
        getContentPane().setBackground(Color.green);
        
        add(lJudul);
        lJudul.setBounds(50, 20, 200, 20);
        
        add(scrollPane);
        scrollPane.setBounds(20, 50, 780, 350);
        
        add(lIdPesanan);
        lIdPesanan.setBounds(810, 40, 190, 20);
        add(tfIdPesanan);
        tfIdPesanan.setBounds(810, 70, 190, 20);
        
        add(lIdPemesan);
        lIdPemesan.setBounds(810, 100, 190, 20);
        add(tfIdPemesan);
        tfIdPemesan.setBounds(810, 130, 190, 20);
        
        add(lIdKereta);
        lIdKereta.setBounds(810, 160, 190, 20);
        add(tfIdKereta);
        tfIdKereta.setBounds(810, 190, 190, 20);
         
        add(lNoKursi);
        lNoKursi.setBounds(810, 220, 190, 20);
        add(tfNoKursi);
        tfNoKursi.setBounds(810, 250, 190, 20);
        
        add(lKelas);
        lKelas.setBounds(810, 280, 90, 20);
        add(tfKelas);
        tfKelas.setBounds(810, 310, 190, 20);
        
        add(lTgl);
        lTgl.setBounds(810, 340, 190, 20);
        add(tfTgl);
        tfTgl.setBounds(810, 370, 190, 20);
      
        add(btnTambah);
        btnTambah.setBounds(810, 400, 190, 20);
        
        add(btnUpdate);
        btnUpdate.setBounds(810, 430, 190, 20);
        
        add(btnHapus);
        btnHapus.setBounds(810, 460, 190, 20);
        
    }
    
    public String getIdPesanan(){
        return tfIdPesanan.getText();
    }
    public String getIdPemesan(){
        return tfIdPemesan.getText();
    }
    public String getIdKereta(){
        return tfIdKereta.getText();
    }
  
    public String getNoKursi(){
        return tfNoKursi.getText();
    }
     public String getKelas(){
        return tfKelas.getText();
    }

    public String getTgl(){
        return tfTgl.getText();
    }
    public String getStatus(){
        return "Belum Lunas";
    }
    public String getBayar(){
        return "0";
    }
    
}

