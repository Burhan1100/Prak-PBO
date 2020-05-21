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


public class View8 extends JFrame{
    JLabel lJudul = new JLabel("Pembayaran Tiket");
    JLabel lIdPemesan = new JLabel("ID Pemesan");
    JLabel lNamaP = new JLabel("Nama Pemesan");
    JLabel lAlamat = new JLabel("Alamat");
    
    
    JTextField tfIdPemesan = new JTextField();
    JTextField tfNamaP = new JTextField();
    JTextField tfAlamatP = new JTextField();
            
    JButton btnTambah = new JButton("Tambah Data");
     JButton btnEdit = new JButton("Edit Data");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Id Pemesan", "Nama Pemesan","Alamat"};

    public View8() {
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
        
        add(lIdPemesan);
        lIdPemesan.setBounds(810, 80, 190, 20);
        add(tfIdPemesan);
        tfIdPemesan.setBounds(810, 101, 190, 20);
        
        add(lNamaP);
        lNamaP.setBounds(810, 130, 190, 20);
        add(tfNamaP);
        tfNamaP.setBounds(810, 161, 190, 20);
        
        add(lAlamat);
        lAlamat.setBounds(810, 190, 190, 20);
        add(tfAlamatP);
        tfAlamatP.setBounds(810, 221, 190, 20);
     
        add(btnTambah);
        btnTambah.setBounds(810, 255, 180, 20);
        add(btnEdit);
        btnEdit.setBounds(810, 285, 180, 20);
        
    }
    
    public String getIdPemesan(){
        return tfIdPemesan.getText();
    }
    
    public String getNamaP(){
       return tfNamaP.getText();
    } 
    
    public String getAlamatP(){
       return tfAlamatP.getText();
    }
    
}

