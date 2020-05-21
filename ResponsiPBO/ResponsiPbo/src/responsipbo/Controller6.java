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

public class Controller6 {
    
    Model6 Model7;
    View6 View7;
    
    public Controller6(View6 View6, Model6 Model6) {
        this.Model7 = Model6;
        this.View7 = View6;
        
        if (Model7.getBanyakData()!=0) {
            String data11[][] = Model7.readdata();
            View7.tabel.setModel((new JTable(data11, View7.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        View6.btnBayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String IdPesanan = View7.getIdPesanan();
                String Bayar = View7.getBayar();
                
                Model7.updatedata(IdPesanan, Bayar);
                
                
                String data11[][] = Model7.readdata();
                
                View7.tabel.setModel((new JTable(data11, View7.namaKolom)).getModel());
                
            }
        });
    }
}


