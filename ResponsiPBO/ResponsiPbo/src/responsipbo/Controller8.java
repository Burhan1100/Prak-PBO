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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller8 {
    
    Model8 Model9;
    View8 View9;
    
    public Controller8(View8 View8, Model8 Model8) {
        this.Model9 = Model8;
        this.View9 = View8;
        
        if (Model9.getBanyakData()!=0) {
            String data11[][] = Model9.readdata();
            View9.tabel.setModel((new JTable(data11, View9.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
          View8.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {    
                String IdPemesan = View9.getIdPemesan();
                String NamaP = View9.getNamaP();
                String Alamat =View9.getAlamatP();
                Model9.insertData(IdPemesan,NamaP,Alamat);
         
                String data11[][] = Model9.readdata();
                View9.tabel.setModel((new JTable(data11, View9.namaKolom)).getModel());
            }
        });
          
            View8.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {    
                String IdPemesan = View9.getIdPemesan();
                String NamaP = View9.getNamaP();
                String Alamat =View9.getAlamatP();
                Model9.Edit(IdPemesan,NamaP,Alamat);
         
                String data11[][] = Model9.readdata();
                View9.tabel.setModel((new JTable(data11, View9.namaKolom)).getModel());
            }
        });
    }
}


