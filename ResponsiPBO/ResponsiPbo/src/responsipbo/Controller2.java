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

public class Controller2 {
    
    Model2 Model4;
    View2 View4;
    
    public Controller2(View2 View2, Model2 Model2) {
        this.Model4 = Model2;
        this.View4 = View2;
        
        if (Model4.getBanyakData()!=0) {
            String data11[][] = Model4.readata();
            View4.tabel.setModel((new JTable(data11, View4.namaKolom)).getModel());
        }
        else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
    }
}

