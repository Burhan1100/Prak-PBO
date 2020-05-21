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

public class Controller3 {
    
    Model3 Model5;
    View3 View5;
    
    public Controller3(View3 View3, Model3 Model3) {
        this.Model5 = Model3;
        this.View5 = View3;
        
        if (Model5.getBanyakData()!=0) {
            String data11[][] = Model5.readata();
            
            View5.tabel.setModel((new JTable(data11, View5.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
    }
}


