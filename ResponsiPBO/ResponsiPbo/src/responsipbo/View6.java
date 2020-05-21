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


public class View6 extends JFrame{
    JLabel lJudul = new JLabel("Pembayaran Tiket");
    JLabel lIdPesanan = new JLabel("ID Pesanan");
    JLabel lBayar = new JLabel("Bayar");
    
    
    JTextField tfIdPesanan = new JTextField();
    JTextField tfBayar = new JTextField();
            
    JButton btnBayar = new JButton("Bayar");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Id Pesanan", "Id Pemesan", "Nama Pemesan","IdKereta","Nama Kereta","Harga","Tujuan", "No Kursi", "Kelas", "tanggal","Status"};

    public View6() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        tabel.setBackground (Color.WHITE);
  
        
        setTitle("Data Bayar Tiket");
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
        lIdPesanan.setBounds(810, 80, 190, 20);
        add(tfIdPesanan);
        tfIdPesanan.setBounds(810, 101, 190, 20);
        
        add(lBayar);
        lBayar.setBounds(810, 130, 190, 20);
        add(tfBayar);
        tfBayar.setBounds(810, 151, 190, 20);
     
        add(btnBayar);
        btnBayar.setBounds(810, 180, 190, 20);
        
    }
    
    public String getIdPesanan(){
        return tfIdPesanan.getText();
    }
    
    public String getBayar(){
       return tfBayar.getText();
    } 
    
}

