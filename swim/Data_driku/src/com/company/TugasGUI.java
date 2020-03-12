package com.company;

import javax.swing.*;


public class TugasGUI {
    public static void main (String[]args) {
        GUI g = new GUI ();
    }
}
class GUI extends JFrame  {
    JLabel judul = new JLabel("Data Diri");
    final JTextField fnama= new JTextField(10);
    JLabel lnama = new JLabel("Nama Lengkap ");

    final JTextField fnim= new JTextField(13);
    JLabel lnim = new JLabel("NIM ");

    JLabel ljurusan = new JLabel("Jurusan Teknik ");
    String [] jurus = {"Informatika","Sistem Informasi","Industri"};
    JComboBox jmjurus= new JComboBox(jurus);

    JLabel ljeniskelamin = new JLabel("Jenis Kelamin  ");
    JRadioButton rblaki = new JRadioButton("Laki-Laki");
    JRadioButton rbperempuan = new JRadioButton("Perempuan");

    final JTextField fnohp = new JTextField(13);
    JLabel lnohp = new JLabel("No HP");

    final JTextArea talamat = new JTextArea(10,3);
    JLabel alamat = new JLabel("Alamat");

    JLabel lagama = new JLabel("Agama ");
    String [] namaAgama = {"Islam","Kristen","Hindu","Katolik","Budha"};
    JComboBox jmbagama = new JComboBox(namaAgama);
    JLabel lhoby = new JLabel("Hobby ");
    JCheckBox sepak_bola = new JCheckBox("Sepak Bola");
    JCheckBox voli = new JCheckBox("Voli");
    JCheckBox basket = new JCheckBox("Basket Ball");
    JCheckBox badminton = new JCheckBox("Badminton");
    JLabel tgl = new JLabel("Tanggal Lahir");
    final JTextField tgll= new JTextField(13);
     JButton btnsave = new JButton("OK");

     public GUI () {
         setTitle("Data Diri ");
         setDefaultCloseOperation(3);
         setSize(350,200);

         ButtonGroup group = new ButtonGroup();
         group.add(rblaki);
         group.add(rbperempuan);

         setLayout(null);
         add(judul);
         add(lnama);
         add(fnama);
         add(lnim);
         add(fnim);
         add(ljurusan);
         add(jmjurus);
         add(ljeniskelamin);
         add(alamat);
         add(talamat);
         add(rblaki);
         add(rbperempuan);
         add(lagama);
         add(jmbagama);
         add(lhoby);
         add(voli);
         add(basket);
         add(sepak_bola);
         add(badminton);
         add(lnohp);
         add(fnohp);
         add(tgl);
         add(tgll);
         add(btnsave);

         judul.setBounds(70,10,120,40);
         lnama.setBounds(10,50,120,20);
         fnama.setBounds(130,50, 170,20);
         ljeniskelamin.setBounds(10,85, 120 ,20);
         rblaki.setBounds(130, 85,100,20);
         rbperempuan.setBounds(230, 85,100,20);
         lnim.setBounds(10,120,120 , 20);
         fnim.setBounds(130,120,170,20);
         ljurusan.setBounds(10,150,120,20);
         jmjurus.setBounds(130,150,170,20);
         lnohp.setBounds(10,180,120,20);
         fnohp.setBounds(130,180,170,20);
         lagama.setBounds(10,210,170,20);
         jmbagama.setBounds(130, 210,170,20);
         lhoby.setBounds(10, 255, 120, 20);
         voli.setBounds(130,240,100,20);
         sepak_bola.setBounds(230,240,100,20);
         basket.setBounds(130,265,100,20);
         badminton.setBounds(230,265,100,20);
         tgl.setBounds(10,290,120,20);
         tgll.setBounds(130, 290,170,20);
         alamat.setBounds(10,320, 170,20);
         talamat.setBounds(130,320 , 180,50);
         btnsave.setBounds(130,380,120,20);
         setVisible(true);
     }

}